package com.nepalicoders.fragmenttypes;

import android.app.ListFragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

/**
 * Created by Sulav on 8/19/17.
 */

public class MyListFragment extends ListFragment {

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

//        String[] courseTitles = getResources().getStringArray(R.array.courseTitles);
        String[] courseTitles = getResources().getStringArray(R.array.emptyList);
        ArrayAdapter<String> courseTitlesAdapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_activated_1, courseTitles);

        setListAdapter(courseTitlesAdapter);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.mycustomlistlayout, container, false);
    }
}
