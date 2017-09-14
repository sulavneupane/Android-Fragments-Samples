package com.nepalicoders.fragmentbasics;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by IntelliJ IDEA.
 * User: Jim
 * Date: 11/14/12
 * Time: 3:54 PM
 * To change this template use File | Settings | File Templates.
 */
public class CourseDescriptionFragment extends Fragment {
    final String _courseIndexStateKey = "courseIndex";
    final int _courseIndexDefaultValue = 0;

    TextView _descriptionView;
    String[] _courseDescriptions;
    int _courseIndex;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View fragmentView = inflater.inflate(R.layout.course_description_fragment, container, false);

        _descriptionView = (TextView) fragmentView.findViewById(R.id.courseDescription);
        _courseDescriptions = getResources().getStringArray(R.array.courseDescriptions);

        _courseIndex = savedInstanceState == null ? _courseIndexDefaultValue : savedInstanceState.getInt(_courseIndexStateKey, _courseIndexDefaultValue);

        setDisplayedDescription(_courseIndex);
        return fragmentView;
    }

    public void setDisplayedDescription(int courseIndex) {
        _courseIndex = courseIndex;
        _descriptionView.setText(_courseDescriptions[_courseIndex]);
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        outState.putInt(_courseIndexStateKey, _courseIndex);
    }
}
