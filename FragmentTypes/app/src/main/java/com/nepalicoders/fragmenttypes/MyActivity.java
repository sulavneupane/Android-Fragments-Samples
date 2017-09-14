package com.nepalicoders.fragmenttypes;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MyActivity extends AppCompatActivity {

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }

    public void onMenuList(MenuItem item) {
        startActivity(new Intent(this, MyListActivity.class));

    }

    public void onMenuWeb(MenuItem item) {
        startActivity(new Intent(this, MyWebActivity.class));
    }

    public void onMenuDialog(MenuItem item) {
        FragmentManager fm = getFragmentManager();
        MyDialogFragment theFragment = new MyDialogFragment();

//        theFragment.show(fm, "MyDialog");

        FragmentTransaction ft = fm.beginTransaction();
        // Add some other fragments
        theFragment.show(ft, "MyDialog");

        // ** Do not call commit
    }

    public void onMenuDialogWrapped(MenuItem item) {

        FragmentManager fm = getFragmentManager();
        MyAlertDialogFragment theFragment = new MyAlertDialogFragment();

        theFragment.show(fm, "MyDialog");

    }

    public void onMenuDialogAdd(MenuItem item) {
        FragmentManager fm = getFragmentManager();
        MyDialogFragment theFragment = new MyDialogFragment();

        FragmentTransaction ft = fm.beginTransaction();
        ft.add(android.R.id.content, theFragment, "MyDialog");
        ft.addToBackStack("DialogAsARegularFragment");
        ft.commit();
    }

    public void onMenuQuit(MenuItem item) {
        finish();
    }

}
