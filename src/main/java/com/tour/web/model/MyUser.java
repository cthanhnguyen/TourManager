package com.tour.web.model;

/**
 * Created by Administrator on 22/05/2015.
 */
public class MyUser {

    private String password;
    private String userName;

    public MyUser(String name, String pass) {
        this.userName = name;
        this.password = pass;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
