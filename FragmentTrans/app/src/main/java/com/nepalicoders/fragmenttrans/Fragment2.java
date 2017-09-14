package com.nepalicoders.fragmenttrans;


import android.app.Activity;
import android.os.Bundle;
import android.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment2 extends Fragment {

    final public String LOGTAG = "Fragment2";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.d(LOGTAG, "onCreateView");

        View theView = inflater.inflate(
                R.layout.fragment_fragment2, container, false);

        return theView;
    }

    @Override
    public void onAttach(Activity activity) {
        Log.d(LOGTAG, "onAttach");

        super.onAttach(activity);    //To change body of overridden methods use File | Settings | File Templates.
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        Log.d(LOGTAG, "onCreate");

        super.onCreate(savedInstanceState);    //To change body of overridden methods use File | Settings | File Templates.
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        Log.d(LOGTAG, "onActivityCreated");

        super.onActivityCreated(savedInstanceState);    //To change body of overridden methods use File | Settings | File Templates.
    }

    @Override
    public void onStart() {
        Log.d(LOGTAG, "onStart");

        super.onStart();    //To change body of overridden methods use File | Settings | File Templates.
    }

    @Override
    public void onStop() {
        Log.d(LOGTAG, "onStop");

        super.onStop();    //To change body of overridden methods use File | Settings | File Templates.
    }

    @Override
    public void onPause() {
        Log.d(LOGTAG, "onPause");

        super.onPause();    //To change body of overridden methods use File | Settings | File Templates.
    }

    @Override
    public void onResume() {
        Log.d(LOGTAG, "onResume");

        super.onResume();    //To change body of overridden methods use File | Settings | File Templates.
    }

    @Override
    public void onDestroyView() {
        Log.d(LOGTAG, "onDestroyView");

        super.onDestroyView();    //To change body of overridden methods use File | Settings | File Templates.
    }

    @Override
    public void onDestroy() {
        Log.d(LOGTAG, "onDestroy");

        super.onDestroy();    //To change body of overridden methods use File | Settings | File Templates.
    }

    @Override
    public void onDetach() {
        Log.d(LOGTAG, "onDetach");

        super.onDetach();    //To change body of overridden methods use File | Settings | File Templates.
    }

}
