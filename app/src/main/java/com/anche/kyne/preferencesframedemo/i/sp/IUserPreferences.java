package com.anche.kyne.preferencesframedemo.i.sp;

/**
 * Created by Kyne on 2017/9/14.
 */

public interface IUserPreferences {

    String getAuthorization(String key);
    void saveAuthorization(String key, String value);
    String getIP(String key);
    void saveIP(String key, String value);
    String getPort(String key);
    void savePort(String key, String value);
    String getOrganization(String key);
    void saveOrganization(String key, String value);
    String getMachineNumber(String key);
    void saveMachineNumber(String key, String value);
    String getVersionNumber(String key);
    void saveVersionNumber(String key, String value);
}
