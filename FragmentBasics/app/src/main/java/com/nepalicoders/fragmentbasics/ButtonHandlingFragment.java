package com.nepalicoders.fragmentbasics;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by IntelliJ IDEA.
 * User: Jim
 * Date: 11/14/12
 * Time: 6:51 PM
 * To change this template use File | Settings | File Templates.
 */
public class ButtonHandlingFragment extends Fragment implements View.OnClickListener {
    private int _clickCount = 0;
    private TextView _textViewClickCount = null;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View theView = inflater.inflate(R.layout.button_handling_fragment, container, false);

        _textViewClickCount = (TextView) theView.findViewById(R.id.textViewClickCount);

        Button theButton = (Button) theView.findViewById(R.id.buttonPushMe);
        theButton.setOnClickListener(this);

        return theView;
    }

    public void myButtonClickHandler(View view) {
        _clickCount++;
        StringBuilder clickMessage = new StringBuilder("Click count: ");
        clickMessage.append(_clickCount);

        _textViewClickCount.setText(clickMessage);
    }

    @Override
    public void onClick(View view) {
        myButtonClickHandler(view);
    }
}
