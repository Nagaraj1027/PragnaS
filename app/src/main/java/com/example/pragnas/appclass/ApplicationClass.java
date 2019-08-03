package com.example.pragnas.appclass;

import android.app.Application;
import android.content.SharedPreferences;
import android.util.Log;

public class ApplicationClass extends Application {

    static SharedPreferences sharedPreferences;
    static SharedPreferences.Editor editor;

    @Override
    public void onCreate() {
        super.onCreate();
        Log.e("onCreate Applicatncls", "onCreate ApplicationClass");
        sharedPreferences = getSharedPreferences("PragnaPreferences", MODE_PRIVATE);
        editor = sharedPreferences.edit();
    }

    public static void putUserNameIntoPreferences(String name) {
        editor.putString("USERNAME", name);
        editor.commit();
    }

    public static String getUserNameFromSharedPreferences() {
        String name = sharedPreferences.getString("USERNAME", null);
        return name;
    }

    public static void putPasswordIntoPreferences(String pasword) {
        editor.putString("PASSWORD", pasword);
        editor.commit();
    }

    public static String getPasswordFromSharedPreferences() {
        String name = sharedPreferences.getString("PASSWORD", null);
        return name;
    }

    public static void putLoginStatusIntoPreferences(Boolean lStatus) {
        editor.putBoolean("LOGINSTATUS", lStatus);
        editor.commit();
    }

    public static Boolean getLoginStatusFromSharedPreferences() {
        Boolean lStatus = sharedPreferences.getBoolean("LOGINSTATUS", false);
        return lStatus;
    }
}
