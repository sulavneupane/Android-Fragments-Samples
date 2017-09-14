package com.nepalicoders.fragmentbasics;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MyActivity extends Activity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater() ;
        inflater.inflate(R.menu.main_menu, menu) ;
        return true;
    }

    public void onMenuSplit(MenuItem item)
    {
        showActivityByClassType(SplitActivity.class);
    }

    public void onMenuSeparate(MenuItem item)
    {
        showActivityByClassType(SeparateActivity1.class);
    }

    public void onMenuButtonHanding(MenuItem item)
    {
        showActivityByClassType(ButtonHandlingActivity.class);
    }

    public void onMenuQuit(MenuItem item)
    {
        finish();
    }

    private void showActivityByClassType(Class<?> activityType)
    {
        Intent intent = new Intent(this, activityType);
        startActivity(intent);
    }

}
