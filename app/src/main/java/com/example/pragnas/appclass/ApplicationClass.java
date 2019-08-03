package com.example.pragnas.appclass;

import android.app.Application;
import android.content.SharedPreferences;
import android.util.Log;

public class ApplicationClass extends Application {

    static SharedPreferences sharedPreferences;
    static SharedPreferences.Editor editor;
    static String name;
    static String password;

    @Override
    public void onCreate() {
        super.onCreate();
        Log.e("onCreate Applicatncls", "onCreate ApplicationClass");
        sharedPreferences = getSharedPreferences("PragnaPreferences", MODE_PRIVATE);
        editor = sharedPreferences.edit();
    }

   public  static void putUserNameIntoPreferences(String name) {
        editor.putString("USERNAME", name);
        editor.commit();
    }

    /*public static void putPasswordIntoPreferences(String password) {
        editor.putString("PASSWORD", password);
        editor.commit();
    }*/

   public static String getUserNameFromSharedPreferences() {
         name = sharedPreferences.getString("USERNAME", null);
        return name;
    }

    /*public static String getPasswordFromSharedPreferences() {
        password = sharedPreferences.getString("PASSWORD",null);
        return password;
    }*/

}
