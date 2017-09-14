package com.nepalicoders.fragmentbasics;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.Toast;

/**
 * Created by IntelliJ IDEA.
 * User: Jim
 * Date: 11/14/12
 * Time: 3:56 PM
 * To change this template use File | Settings | File Templates.
 */
public class CourseNamesFragment extends Fragment implements View.OnClickListener {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View theView = inflater.inflate(R.layout.course_names_fragment, container, false);

        setupClickListeners(theView);
        return theView;
    }

    private void setupClickListeners(View theView) {
        setupClickListener(theView, R.id.course4NewFeatures);
        setupClickListener(theView, R.id.courseIntro);
        setupClickListener(theView, R.id.courseIntents);
        setupClickListener(theView, R.id.courseActionBar);
        setupClickListener(theView, R.id.courseAsyncAndServices);
    }

    private void setupClickListener(View theView, int childViewId) {
        View childView = theView.findViewById(childViewId);
        childView.setOnClickListener(this);
    }

    int translateIdToIndex(int id) {
        int index = 0;
        switch (id) {
            case R.id.course4NewFeatures:
                index = 0;
                break;
            case R.id.courseIntro:
                index = 1;
                break;
            case R.id.courseIntents:
                index = 2;
                break;
            case R.id.courseActionBar:
                index = 3;
                break;
            case R.id.courseAsyncAndServices:
                index = 4;
                break;
        }

        return index;
    }

    public void onClick(View view) {
        int id = view.getId();
        RadioButton rb = (RadioButton) view;
        CharSequence courseText = rb.getText();

        int index = translateIdToIndex(id);

        Activity theActivity = getActivity();
        CourseFragmentCoordinator coordinator = (CourseFragmentCoordinator) theActivity;
        coordinator.onSelectedCourseChanged(index);
    }
}
