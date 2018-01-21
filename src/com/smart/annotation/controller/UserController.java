package com.smart.annotation.controller;

import com.smart.annotation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
    //创建关联关系
    @Autowired
    private UserService userService;
    public void execute(){
        System.out.println("UserController execute...");
        //创建关联关系
        userService.add();
    }
}
