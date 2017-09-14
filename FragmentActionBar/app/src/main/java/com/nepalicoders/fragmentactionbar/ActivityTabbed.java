package com.nepalicoders.fragmentactionbar;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;

/**
 * Created by IntelliJ IDEA.
 * User: Jim
 * Date: 12/4/12
 * Time: 7:36 PM
 * To change this template use File | Settings | File Templates.
 */
public class ActivityTabbed extends Activity implements ActionBar.TabListener {
    private final String _tab1DisplayName = "Whats new in Android 4.0";
    private final String _tab2DisplayName = "Android Intents";

    Fragment _tab1Fragment;
    Fragment _tab2Fragment;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActionBar actionBar = getActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

        createTab(actionBar, _tab1DisplayName);
        createTab(actionBar, _tab2DisplayName);

    }

    private void createTab(ActionBar actionBar, String displayName) {
        ActionBar.Tab newTab = actionBar.newTab();
        newTab.setText(displayName);
        newTab.setTabListener(this);

        actionBar.addTab(newTab);
    }

    @Override
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft) {
        CharSequence displayName = tab.getText();

        if (displayName.equals(_tab1DisplayName)) {
            if (_tab1Fragment == null) {
                _tab1Fragment = new CourseAndroid40Fragment();
                ft.add(android.R.id.content, _tab1Fragment);
            } else {
                ft.attach(_tab1Fragment);
            }
        } else if (displayName.equals(_tab2DisplayName)) {
            if (_tab2Fragment == null) {
                _tab2Fragment = new CourseIntentsFragment();
                ft.add(android.R.id.content, _tab2Fragment);
            } else {
                ft.attach(_tab2Fragment);
            }
        }
    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction ft) {
        CharSequence displayName = tab.getText();

        if (displayName.equals(_tab1DisplayName)) {
            ft.detach(_tab1Fragment);
        } else if (displayName.equals(_tab2DisplayName)) {
            ft.detach(_tab2Fragment);
        }
    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction ft) {

    }
}