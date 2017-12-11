package com.shiro.xiao.dream.dao;

import com.shiro.xiao.dream.model.UserDo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

public interface UserDao {

    List<UserDo> queryUser();

    UserDo selectByName(@Param("userName") String userName);

    UserDo login(Map<String, Object> map);
}
