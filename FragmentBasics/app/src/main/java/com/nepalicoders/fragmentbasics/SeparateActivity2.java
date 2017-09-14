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
public class SeparateActivity2 extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.separate_activity2);

        Intent startupIntent = getIntent();

        int courseIndex = startupIntent.getIntExtra("courseIndex", 0);

        FragmentManager fragmentManager = getFragmentManager();
        CourseDescriptionFragment courseDescriptionFragment =
                (CourseDescriptionFragment) fragmentManager.findFragmentById(R.id.courseDescriptionFragment);
        courseDescriptionFragment.setDisplayedDescription(courseIndex);
    }
}