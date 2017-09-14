package com.nepalicoders.fragmenttrans;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MyActivity extends AppCompatActivity implements FragmentManager.OnBackStackChangedListener {

    final String _fragmentTag = "dynamicFragment";
    public static final String LOGTAG = "FragmentTrans";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        FragmentManager fm = getFragmentManager();
        fm.addOnBackStackChangedListener(this);

    }

    public void onClickBtnAdd(View theView) {
        Log.i(LOGTAG, "onClickBtnAdd");
        Fragment1 theFragment = new Fragment1();
        FragmentManager fm = getFragmentManager();

        FragmentTransaction ft = fm.beginTransaction();
        ft.add(R.id.group1, theFragment, _fragmentTag);
        ft.addToBackStack("Add");
        ft.commit();
    }

    public void onClickBtnRemove(View theView) {
        Log.i(LOGTAG, "onClickBtnRemove");

        FragmentManager fm = getFragmentManager();
        Fragment oldFragment = fm.findFragmentByTag(_fragmentTag);

        FragmentTransaction ft = fm.beginTransaction();
        if (oldFragment != null) {
            ft.remove(oldFragment);
        }
        Fragment2 newFragment = new Fragment2();
        ft.add(R.id.group1, newFragment, _fragmentTag);
        ft.addToBackStack("Remove");
        ft.commit();

    }

    public void onClickBtnReplace(View theView) {
        Log.i(LOGTAG, "onClickBtnReplace");

        FragmentManager fm = getFragmentManager();
        Fragment1 theFragment = new Fragment1();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.group1, theFragment, _fragmentTag);
        ft.addToBackStack("Replace");
        ft.commit();

    }

    public void onClickBtnAttach(View theView) {
        Log.i(LOGTAG, "onClickBtnAttach");

        FragmentManager fm = getFragmentManager();
        Fragment theFragment = fm.findFragmentByTag(_fragmentTag);

        if (theFragment != null) {
            FragmentTransaction ft = fm.beginTransaction();
            ft.attach(theFragment);
            ft.addToBackStack("Attach");
            ft.commit();
        }
    }

    public void onClickBtnDetach(View theView) {
        Log.i(LOGTAG, "onClickBtnDetach");

        FragmentManager fm = getFragmentManager();
        Fragment theFragment = fm.findFragmentByTag(_fragmentTag);

        if (theFragment != null) {
            FragmentTransaction ft = fm.beginTransaction();
            ft.detach(theFragment);
            ft.addToBackStack("Detach");
            ft.commit();
        }
    }

    public void onClickBtnPrevious(View theView) {
        Log.i(LOGTAG, "onClickBtnDetach");

        FragmentManager fm = getFragmentManager();
        fm.popBackStack();
    }

    public void showMsg(String msg) {
        Log.i(LOGTAG, msg);
        Toast t = Toast.makeText(this, msg, Toast.LENGTH_LONG);
        t.show();
    }

    public static void LogBackStackEntry(FragmentManager.BackStackEntry entry) {
        if (entry != null) {
            Log.d(LOGTAG, "BackStackEntry Name:" + entry.getName());
        } else {
            Log.d(LOGTAG, "BackStackEntry Name:<NULL>");
        }
    }

    @Override
    public void onBackStackChanged() {
        showMsg("Backstack changed");
        Log.d(LOGTAG, "Backstack contents starting with index 0");
        FragmentManager fm = getFragmentManager();
        int backStackEntryCount = fm.getBackStackEntryCount();
        for (int i = 0; i < backStackEntryCount; i++) {
            LogBackStackEntry(fm.getBackStackEntryAt(i));
        }
    }
}
