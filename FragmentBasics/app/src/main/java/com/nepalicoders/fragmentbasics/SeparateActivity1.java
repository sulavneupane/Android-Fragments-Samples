package com.nepalicoders.fragmentbasics;

import android.app.Activity;
import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by IntelliJ IDEA.
 * User: Jim
 * Date: 11/14/12
 * Time: 4:38 PM
 * To change this template use File | Settings | File Templates.
 */
public class SeparateActivity1 extends Activity implements CourseFragmentCoordinator {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.separate_activity1);
    }

    @Override
    public void onSelectedCourseChanged(int index) {
        FragmentManager fragmentManager = getFragmentManager();
        CourseDescriptionFragment courseDescriptionFragment =
                (CourseDescriptionFragment) fragmentManager.findFragmentById(R.id.courseDescriptionFragment);

        if (courseDescriptionFragment != null && courseDescriptionFragment.isVisible()) {
            courseDescriptionFragment.setDisplayedDescription(index);

        } else {
            Intent intent = new Intent(this, SeparateActivity2.class);
            intent.putExtra("courseIndex", index);
            startActivity(intent);
        }

    }
}