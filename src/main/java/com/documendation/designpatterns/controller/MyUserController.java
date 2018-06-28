package com.documendation.designpatterns.controller;

import com.documendation.designpatterns.entity.MyUser;
import com.documendation.designpatterns.service.MyUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/myUser")
public class MyUserController {
    @Autowired
    MyUserService myUserService;

    /**
     * 根据id查询用户
     * @param id
     * @return
     */

    @RequestMapping("/selectUserById")
    @ResponseBody
    public Map<String,Object> selectMyUserById(int id){
        System.out.println("----->myuser");
        Map<String,Object> maps=new HashMap<>();
        MyUser myUser =myUserService.selectByPrimaryKey(id);
        maps.put("myUser",myUser);
        return maps;
    }
    @RequestMapping("/addUser")
    @ResponseBody
    public Boolean addMyUser(){
        Boolean flag=false;
        MyUser myUser1=new MyUser();
        myUser1.setId(3);
        myUser1.setUsername("李Wu");
        myUser1.setPwd("123456");
        myUser1.setPhone("1529887890");
        myUser1.setEmaile("123567@qq.com");
        String str="2019-07-08 11:09:00";
        Timestamp timestamp=Timestamp.valueOf(str);
        myUser1.setJoninTime(timestamp);
               int rows= myUserService.insert(myUser1);
        System.out.println("--->");
               if(rows>0){
                   flag=true;
                   System.out.println("添加成功！");
               }

        return flag;
    }

}
