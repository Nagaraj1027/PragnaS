package com.example.omniprojecttochaya.model;

import java.io.Serializable;

public class User implements Serializable {
    String Name;
    String DOB;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

}
