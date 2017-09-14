package com.nepalicoders.fragmenttypes;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;

/**
 * Created by Sulav on 8/19/17.
 */

public class MyAlertDialogFragment extends DialogFragment implements DialogInterface.OnClickListener {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        builder.setMessage("Do you wanna give it try!");
        builder.setPositiveButton("Go for it", this);
        builder.setNegativeButton("Stay safe", this);

        Dialog theDialog = builder.create();
        theDialog.setCanceledOnTouchOutside(false);

        return theDialog;
    }

    @Override
    public void onClick(DialogInterface dialog, int which) {
        switch (which) {
            case Dialog.BUTTON_POSITIVE:
                break;
            case Dialog.BUTTON_NEGATIVE:
                break;
        }
    }
}
