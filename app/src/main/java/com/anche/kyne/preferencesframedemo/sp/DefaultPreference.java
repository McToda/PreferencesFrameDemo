package com.anche.kyne.preferencesframedemo.sp;

import android.content.Context;

import com.anche.kyne.preferencesframedemo.i.sp.IPreference;
import com.anche.kyne.preferencesframedemo.i.sp.ISharePreferences;

/**
 * Created by Kyne on 2017/9/7.
 */

public class DefaultPreference implements IPreference {

    private String TAG = "DefaultPreference";
    private ISharePreferences sharePreferences;

    public DefaultPreference(Context context){
        sharePreferences = new AnchePreference(context,getPrefenceName());
    }

    public String getPrefenceName() {
        return TAG;
    }

    @Override
    public ISharePreferences getPreferences() {
        return sharePreferences;
    }

    @Override
    public void commit() {
        getPreferences().commit();
    }
}
