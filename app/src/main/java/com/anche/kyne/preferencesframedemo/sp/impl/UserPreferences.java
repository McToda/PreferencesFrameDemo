package com.anche.kyne.preferencesframedemo.sp.impl;

import android.content.Context;

import com.anche.kyne.preferencesframedemo.i.sp.IUserPreferences;
import com.anche.kyne.preferencesframedemo.sp.DefaultPreference;

/**
 * Created by Kyne on 2017/9/14.
 */

public class UserPreferences extends DefaultPreference implements IUserPreferences {

    private static final String TAG ="UserPreferences";

    public UserPreferences(Context context) {
        super(context);
    }

    @Override
    public String getPrefenceName() {
        return TAG;
    }

    @Override
    public String getAuthorization(String key) {
        return getPreferences().getString(key,null);
    }

    @Override
    public void saveAuthorization(String key, String value) {
        getPreferences().putString(key,value).commit();
    }

    @Override
    public String getIP(String key) {
        return getPreferences().getString(key,null);
    }

    @Override
    public void saveIP(String key, String value) {
        getPreferences().putString(key,value).commit();
    }

    @Override
    public String getPort(String key) {
        return getPreferences().getString(key,null);
    }

    @Override
    public void savePort(String key, String value) {
        getPreferences().putString(key,value).commit();
    }

    @Override
    public String getOrganization(String key) {
        return getPreferences().getString(key,null);
    }

    @Override
    public void saveOrganization(String key, String value) {
        getPreferences().putString(key,value).commit();
    }

    @Override
    public String getMachineNumber(String key) {
        return getPreferences().getString(key,null);
    }

    @Override
    public void saveMachineNumber(String key, String value) {
        getPreferences().putString(key,value).commit();
    }

    @Override
    public String getVersionNumber(String key) {
        return getPreferences().getString(key,null);
    }

    @Override
    public void saveVersionNumber(String key, String value) {
        getPreferences().putString(key,value).commit();
    }
}
