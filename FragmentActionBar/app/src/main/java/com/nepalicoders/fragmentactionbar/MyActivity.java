package com.nepalicoders.fragmentactionbar;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.text.AndroidCharacter;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        boolean handled = false;
        int itemId = item.getItemId();
        switch (itemId) {
            case R.id.menuAndroid40CourseFragment:
                onAndroid40CourseFragmentClick(item);
                handled = true;
                break;
            case R.id.menuIntentsCourseFragment:
                onIntentsCourseFragmentClick(item);
                handled = true;
                break;
            case R.id.menuList:
                onListClick(item);
                handled = true;
                break;
            case R.id.menuTabbed:
                onTabbedClick(item);
                handled = true;
                break;
            case R.id.menuExit:
                onExitClick(item);
                handled = true;
                break;
            case R.id.menuAndroid40Opt1:
                displayHandledMessage(item);
                handled = true;
                break;
            case R.id.menuAndroid40Opt2:
                displayHandledMessage(item);
                handled = true;
                break;
            case R.id.menuIntentsOnlyOption:
                displayHandledMessage(item);
                handled = true;
                break;
            default:
                handled = super.onOptionsItemSelected(item);
        }
        return handled;
    }

    public void onAndroid40CourseFragmentClick(MenuItem menuItem) {
        CourseAndroid40Fragment theFragment = new CourseAndroid40Fragment();

        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();

        ft.replace(android.R.id.content, theFragment);

        ft.addToBackStack("CourseAndroid40");
        ft.commit();
    }

    public void onIntentsCourseFragmentClick(MenuItem menuItem) {
        CourseIntentsFragment theFragment = new CourseIntentsFragment();

        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();

        ft.replace(android.R.id.content, theFragment);

        ft.addToBackStack("CourseIntents");
        ft.commit();
    }

    public void onListClick(MenuItem menuItem) {
        Intent intent = new Intent(this, ActivityListNavigation.class);
        startActivity(intent);
    }

    public void onTabbedClick(MenuItem menuItem) {
        Intent intent = new Intent(this, ActivityTabbed.class);
        startActivity(intent);
    }

    public void onExitClick(MenuItem menuItem) {
        finish();
    }

    private void displayHandledMessage(MenuItem item) {
        Toast.makeText(this, "Handled by ACTIVITY", Toast.LENGTH_LONG).show();
    }
}
