package com.shiro.xiao.dream.realm;

import org.apache.shiro.authc.UsernamePasswordToken;

import java.io.Serializable;

public class ShiroToken extends UsernamePasswordToken implements Serializable {

    private static final long serialVersionUID = 6971979579514750620L;

    private String pswd;

    public ShiroToken(String username, String pswd) {
        super(username, pswd);
        this.pswd = pswd;
    }

    public String getPswd() {
        return pswd;
    }

    public void setPswd(String pswd) {
        this.pswd = pswd;
    }
}
