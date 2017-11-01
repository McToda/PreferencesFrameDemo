package com.anche.kyne.preferencesframedemo.i.sp;

/**
 * Created by Kyne on 2017/9/7.
 */

public interface IPreference {

    ISharePreferences getPreferences();

    void commit();
}
