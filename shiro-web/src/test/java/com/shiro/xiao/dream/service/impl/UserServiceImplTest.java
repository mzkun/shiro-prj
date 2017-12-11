package com.shiro.xiao.dream.service.impl;

import com.shiro.xiao.dream.BaseTest;
import com.shiro.xiao.dream.model.UserDo;
import com.shiro.xiao.dream.realm.ShiroToken;
import com.shiro.xiao.dream.service.UserService;
import junit.framework.Assert;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.Factory;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

public class UserServiceImplTest extends BaseTest {

    @Autowired
    UserService userService;

    @Test
    public void userTest(){
        List<UserDo> list = userService.queryUser();
        System.out.println(list.size());
    }

    @Test
    public void loginTest(){
        String userName = "zhang";
        String password = "123";

        Factory<SecurityManager> factory = new IniSecurityManagerFactory("classpath:config/user-shiro.ini");
        SecurityManager securityManager = factory.getInstance();
        SecurityUtils.setSecurityManager(securityManager);

        Subject subject = SecurityUtils.getSubject();

        UsernamePasswordToken token = new UsernamePasswordToken(userName, password);
//        ShiroToken token = new ShiroToken(userName, password);

        try {
            //4、登录，即身份验证
            subject.login(token);
        Assert.assertEquals(true, subject.isAuthenticated()); //断言用户已经登录
        } catch (AuthenticationException e) {
            //5、身份验证失败
            e.printStackTrace();
        }


    }

}