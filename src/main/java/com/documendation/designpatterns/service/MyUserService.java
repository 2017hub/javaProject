package com.documendation.designpatterns.service;

import com.documendation.designpatterns.entity.MyUser;

public interface MyUserService {

    int deleteByPrimaryKey(Integer id);

    int insert(MyUser record);

    int insertSelective(MyUser record);

    MyUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MyUser record);

    int updateByPrimaryKey(MyUser record);
}
