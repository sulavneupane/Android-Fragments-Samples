package com.nepalicoders.fragmentactionbar;

import android.R;
import android.app.*;
import android.os.Bundle;
import android.widget.ArrayAdapter;

/**
 * Created by IntelliJ IDEA.
 * User: Jim
 * Date: 12/4/12
 * Time: 7:42 PM
 * To change this template use File | Settings | File Templates.
 */
public class ActivityListNavigation extends Activity implements ActionBar.OnNavigationListener {
    private final String _fragment0DisplayName = "Whats new in Android 4.0";
    private final String _fragment1DisplayName = "Android Intents";

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String[] listMembers = {_fragment0DisplayName, _fragment1DisplayName};

        ActionBar actionBar = getActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_LIST);

        ArrayAdapter<String> displayNameList = new ArrayAdapter<String>(this, R.layout.simple_spinner_dropdown_item, listMembers);
        actionBar.setListNavigationCallbacks(displayNameList, this);

    }

    @Override
    public boolean onNavigationItemSelected(int itemPosition, long itemId) {
        Fragment theFragment = null;
        switch (itemPosition) {
            case 0:
                theFragment = new CourseAndroid40Fragment();
                break;
            case 1:
                theFragment = new CourseIntentsFragment();
                break;
        }

        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();

        ft.replace(R.id.content, theFragment);

        ft.commit();

        return true;
    }
}