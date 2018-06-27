package com.documendation.designpatterns.controller;

import com.documendation.designpatterns.entity.MyUser;
import com.documendation.designpatterns.service.MyUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @Autowired
    MyUserService myUserService;

    @RequestMapping("/hello")
    @ResponseBody
    public String getHello(){
        MyUser myUser =myUserService.selectByPrimaryKey(1);
        System.out.println("---->"+myUser.getUsername());
        return  "hello";
    }
}
