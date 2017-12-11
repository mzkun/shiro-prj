package com.shiro.xiao.dream.realm;

import com.shiro.xiao.dream.model.UserDo;
import com.shiro.xiao.dream.service.UserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.realm.AuthenticatingRealm;
import org.springframework.beans.factory.annotation.Autowired;

public class UserRealm extends AuthenticatingRealm {

    @Autowired
    private UserService userService;

    public UserRealm() {
        super();
    }

    @Override
    public String getName() {
        return "UserRealm";
    }

    @Override
    public boolean supports(AuthenticationToken token) {
        //仅支持 UsernamePasswordToken 类型的 Token
        return token instanceof UsernamePasswordToken;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        String username = (String)token.getPrincipal();  //得到用户名
        String password = new String((char[])token.getCredentials()); //得到密码

        UserDo userDo = userService.login(username, password);

        if(null == userDo){
            throw new AccountException("账号或密码不正确，请重新输入！！");
        }
        //如果身份认证验证成功，返回一个 AuthenticationInfo 实现；
        return new SimpleAuthenticationInfo(userDo.getUserName(), userDo.getPassword(), getName());
    }
}
