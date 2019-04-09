package com.fineway.springbootdemo.dao.cnzb2018.mapper;

import com.fineway.springbootdemo.dao.cnzb2018.pojo.Person2018;

public interface Person2018Mapper {
    int deleteByPrimaryKey(String personid);

    int insert(Person2018 record);

    int insertSelective(Person2018 record);

    Person2018 selectByPrimaryKey(String personid);

    int updateByPrimaryKeySelective(Person2018 record);

    int updateByPrimaryKey(Person2018 record);
}