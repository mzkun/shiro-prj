package com.shiro.xiao.dream.service.impl;

import com.shiro.xiao.dream.dao.UserDao;
import com.shiro.xiao.dream.model.UserDo;
import com.shiro.xiao.dream.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<UserDo> queryUser() {
        return userDao.queryUser();
    }

    @Override
    public UserDo selectByName(String userName) {
        return userDao.selectByName(userName);
    }

    @Override
    public UserDo login(String userName, String password) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("userName", userName);
        map.put("password", password);
        return userDao.login(map);
    }
}
