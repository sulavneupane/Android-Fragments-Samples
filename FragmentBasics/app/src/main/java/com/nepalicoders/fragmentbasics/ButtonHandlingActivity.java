package com.nepalicoders.fragmentbasics;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Bundle;
import android.view.View;

/**
 * Created by IntelliJ IDEA.
 * User: Jim
 * Date: 11/14/12
 * Time: 6:52 PM
 * To change this template use File | Settings | File Templates.
 */
public class ButtonHandlingActivity extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.button_handling_activity);
    }

//    public void myButtonClickHandler(View view) {
//        FragmentManager fm = getFragmentManager();
//        ButtonHandlingFragment fragment = (ButtonHandlingFragment) fm.findFragmentById(R.id.buttonHandlingFragment);
//        fragment.myButtonClickHandler(view);
//    }

}