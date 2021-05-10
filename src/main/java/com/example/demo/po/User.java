package com.example.demo.po;

public class User {
    public int getUserid() {
        return userid;
    }

    public User(int userid, String username) {
        this.userid = userid;
        this.username = username;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    private int userid;
    private String username;

}
