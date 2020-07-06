package com.mybatis.test.controller;

import com.mybatis.test.entity.User;
import com.mybatis.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private UserService userService;

    @RequestMapping("/get")
    public User get(){
        return userService.selectByPrimaryKey(1);
    }


}
