package com.nepalicoders.fragmentactionbar;

import android.app.Fragment;
import android.os.Bundle;
import android.view.*;
import android.widget.Toast;

/**
 * Created by IntelliJ IDEA.
 * User: Jim
 * Date: 6/13/12
 * Time: 3:55 PM
 * To change this template use File | Settings | File Templates.
 */
public class CourseIntentsFragment extends Fragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setHasOptionsMenu(true);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.course_intents_layout, container, false);
    }

    private void displayHandledMessage(MenuItem item) {
        Toast.makeText(getActivity(), "Handled by Fragment", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.intents_menu, menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        boolean handled = false;
        int itemId = item.getItemId();

        switch (itemId) {
            case R.id.menuIntentsOnlyOption:
                displayHandledMessage(item);
                handled = true;
                break;
            default:
                handled = super.onOptionsItemSelected(item);
        }

        return handled;
    }
}
