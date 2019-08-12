package com.example.pragnas.listview.model;

import android.os.Parcelable;

import java.io.Serializable;

public class UserDetails implements Serializable {

    public String userName = "";
    public String userPhone = "";

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

}
