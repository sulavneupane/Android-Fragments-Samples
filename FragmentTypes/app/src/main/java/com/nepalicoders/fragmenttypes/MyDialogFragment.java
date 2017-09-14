package com.nepalicoders.fragmenttypes;

import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Sulav on 8/19/17.
 */

public class MyDialogFragment extends DialogFragment implements View.OnClickListener {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View theView = inflater.inflate(R.layout.mydialogfragment, container, false);

        View yesButton = theView.findViewById(R.id.btnYes);
        yesButton.setOnClickListener(this);
        yesButton.requestFocus();

        View noButton = theView.findViewById(R.id.btnNo);
        noButton.setOnClickListener(this);

        Dialog theDialog = getDialog();
        if (theDialog != null) {
            theDialog.setTitle("This is Title");
            theDialog.setCanceledOnTouchOutside(false);
        }

        return theView;
    }

    @Override
    public void onClick(View v) {
        int viewId = v.getId();
        switch (viewId) {
            case R.id.btnYes:
                break;
            case R.id.btnNo:
                break;
        }

        dismiss();
    }
    
}
