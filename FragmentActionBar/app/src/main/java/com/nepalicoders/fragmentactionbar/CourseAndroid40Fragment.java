package com.nepalicoders.fragmentactionbar;

import android.app.Fragment;
import android.os.Bundle;
import android.view.*;
import android.widget.Toast;

/**
 * Created by IntelliJ IDEA.
 * User: Jim
 * Date: 6/13/12
 * Time: 3:56 PM
 * To change this template use File | Settings | File Templates.
 */
public class CourseAndroid40Fragment extends Fragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setHasOptionsMenu(true);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.course_android40_layout, container, false);
    }

    private void displayHandledMessage(MenuItem item) {
        Toast.makeText(getActivity(), "Handled by Fragment", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.android40_menu, menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        boolean handled = false;
        int itemId = item.getItemId();

        switch (itemId) {
            case R.id.menuAndroid40Opt1:
                displayHandledMessage(item);
                handled = true;
                break;
            case R.id.menuAndroid40Opt2:
                displayHandledMessage(item);
                handled = true;
                break;
            default:
                handled = super.onOptionsItemSelected(item);
        }

        return handled;
    }
}
