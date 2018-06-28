package com.documendation.designpatterns.service.impl;

import com.documendation.designpatterns.entity.MyUser;
import com.documendation.designpatterns.mapper.MyUserMapper;
import com.documendation.designpatterns.service.MyUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyUserServiceImpl implements MyUserService {
    @Autowired
    MyUserMapper myUserMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(MyUser record) {
        return myUserMapper.insert(record);
    }

    @Override
    public int insertSelective(MyUser record) {

        return myUserMapper.insertSelective(record);
    }

    @Override
    public MyUser selectByPrimaryKey(Integer id) {
        return myUserMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(MyUser record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(MyUser record) {
        return 0;
    }
}
