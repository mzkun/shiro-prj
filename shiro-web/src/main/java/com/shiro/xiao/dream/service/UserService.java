package com.shiro.xiao.dream.service;

import com.shiro.xiao.dream.model.UserDo;

import java.util.List;

public interface UserService {
    public List<UserDo> queryUser();

    public UserDo selectByName(String userName);

    public UserDo login(String userName, String password);
}
