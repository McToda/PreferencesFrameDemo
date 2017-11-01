package com.anche.kyne.preferencesframedemo.sp;

import android.content.Context;

import com.anche.kyne.preferencesframedemo.i.sp.IUserPreferences;
import com.anche.kyne.preferencesframedemo.sp.impl.UserPreferences;
/**
 * Created by Kyne on 2017/9/14.
 */

public class PreferenceManager {

    private static volatile PreferenceManager instance;
    private IUserPreferences userPreferences;

    public static PreferenceManager getInstance() {
        if (instance == null) {
            synchronized (PreferenceManager.class) {
                if (instance == null) {
                    instance = new PreferenceManager();
                }
            }
        }
        return instance;
    }

    public IUserPreferences getUserPreferences() {
        return userPreferences;
    }

    public void setUserPreferences(IUserPreferences userPreferences) {
        this.userPreferences = userPreferences ;
    }


    public void initPreferences(Context context){
        PreferenceManager.getInstance().setUserPreferences(new UserPreferences(context));
    }
}
