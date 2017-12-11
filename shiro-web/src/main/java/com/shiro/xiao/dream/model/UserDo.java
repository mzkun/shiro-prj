package com.shiro.xiao.dream.model;

import java.io.Serializable;

public class UserDo implements Serializable{

    private static final long serialVersionUID = 3287372357058794680L;

    private String id;
    private String userName;
    private String password;
    private String passwordSalt;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPasswordSalt() {
        return passwordSalt;
    }

    public void setPasswordSalt(String passwordSalt) {
        this.passwordSalt = passwordSalt;
    }
}
