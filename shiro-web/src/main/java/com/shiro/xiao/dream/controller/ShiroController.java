package com.shiro.xiao.dream.controller;

import com.shiro.xiao.dream.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/")
public class ShiroController {

    @Autowired
    private UserService userService;

    @RequestMapping("/index")
    public String index(){
        return "login";
    }

    
    @RequestMapping("/succ")
    @ResponseBody
    public String succ(@PathVariable String userName, @PathVariable String password){
        if ("zhang".equals(userName) && "123".equals(password)){
            return "succ";
        }
        return "fail";
    }

    @RequestMapping("/register")
    public String register(HttpServletRequest request, HttpServletResponse response, String userName, String password){
        return "add";
    }
}
