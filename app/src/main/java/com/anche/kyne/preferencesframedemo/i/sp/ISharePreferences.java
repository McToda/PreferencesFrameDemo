package com.anche.kyne.preferencesframedemo.i.sp;

import android.content.SharedPreferences;

import java.util.Map;
import java.util.Set;

/**
 * Created by Kyne on 2017/9/7.
 */

public interface ISharePreferences {

    SharedPreferences.Editor putString(String key, String value);

    SharedPreferences.Editor putStringSet(String key, Set<String> values);

    SharedPreferences.Editor putInt(String key, int value);

    SharedPreferences.Editor putLong(String key, long value);

    SharedPreferences.Editor putFloat(String key, float value);

    SharedPreferences.Editor putBoolean(String key, boolean value);

    SharedPreferences.Editor remove(String key);

    SharedPreferences.Editor clear();

    boolean commit();

    void apply();

    Map<String, ?> getAll();

    String getString(String key, String defValue);

    Set<String> getStringSet(String key, Set<String> defValues);

    int getInt(String key, int defValue);

    long getLong(String key, long defValue);

    float getFloat(String key, float defValue);

    boolean getBoolean(String key, boolean defValue);

    boolean contains(String key);

    void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener listener);

    void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener listener);

}
