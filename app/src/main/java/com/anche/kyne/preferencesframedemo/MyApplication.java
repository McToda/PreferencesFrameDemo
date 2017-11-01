package com.anche.kyne.preferencesframedemo;

import android.app.Application;

import com.anche.kyne.preferencesframedemo.sp.PreferenceManager;

/**
 * Created by Kyne on 2017/9/14.
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        PreferenceManager.getInstance().initPreferences(this);
    }
}
