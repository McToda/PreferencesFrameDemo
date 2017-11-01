package com.anche.kyne.preferencesframedemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.anche.kyne.preferencesframedemo.i.sp.IUserPreferences;
import com.anche.kyne.preferencesframedemo.sp.PreferenceManager;

/**
 * 演示封装sharepreference的使用
 */
public class MainActivity extends AppCompatActivity {

    private IUserPreferences userPreferences;
    private String ip;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userPreferences = PreferenceManager.getInstance().getUserPreferences();
        ip = "110";
        saveData();
        getDate();
    }

    private void saveData() {
        userPreferences.saveIP("ip",ip);
    }

    private void getDate() {
        ip = userPreferences.getIP("ip");
    }
}
