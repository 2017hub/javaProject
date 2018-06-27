package com.documendation.designpatterns.mapper;

import com.documendation.designpatterns.entity.MyUser;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MyUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MyUser record);

    int insertSelective(MyUser record);

    MyUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MyUser record);

    int updateByPrimaryKey(MyUser record);
}