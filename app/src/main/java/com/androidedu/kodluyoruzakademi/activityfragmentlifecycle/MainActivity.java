package com.androidedu.kodluyoruzakademi.activityfragmentlifecycle;

import android.os.PersistableBundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import static com.androidedu.kodluyoruzakademi.activityfragmentlifecycle.R.id.linearLayout;

public class MainActivity extends AppCompatActivity {
    private final String MAIN_TAG="Main Activity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final LinearLayout linearLayout= (LinearLayout) findViewById(R.id.linearLayout);
        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction =fragmentManager.beginTransaction();
        Fragment thirdFragment=new ThirdFragment();

        fragmentTransaction.add(R.id.linearLayout,thirdFragment,"Third Fragment Done!!!");
        fragmentTransaction.commit();
        linearLayout.setWeightSum(100);

        Log.e(MAIN_TAG,"onCreate");
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.e(MAIN_TAG,"onStart");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.e(MAIN_TAG,"onRestoreInstanceState");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(MAIN_TAG,"onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(MAIN_TAG,"onPause");

    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.e(MAIN_TAG,"onSaveInstanceState");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(MAIN_TAG,"onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(MAIN_TAG,"onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(MAIN_TAG,"onRestart");
    }

    @Override
    public void onAttachFragment(Fragment fragment) {
        super.onAttachFragment(fragment);
        Log.e(MAIN_TAG,"onAttachFragment");
    }

}
