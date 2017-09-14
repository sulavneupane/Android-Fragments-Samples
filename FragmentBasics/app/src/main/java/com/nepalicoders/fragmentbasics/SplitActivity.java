package com.nepalicoders.fragmentbasics;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

/**
 * Created by IntelliJ IDEA.
 * User: Jim
 * Date: 11/14/12
 * Time: 4:00 PM
 * To change this template use File | Settings | File Templates.
 */
public class SplitActivity extends Activity implements CourseFragmentCoordinator {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.split_activity);
    }

    @Override
    public void onSelectedCourseChanged(int index) {
        FragmentManager fragmentManager = getFragmentManager();
        CourseDescriptionFragment courseDescriptionFragment = (CourseDescriptionFragment) fragmentManager.findFragmentById(R.id.courseDescriptionFragment);

        courseDescriptionFragment.setDisplayedDescription(index);
    }
}