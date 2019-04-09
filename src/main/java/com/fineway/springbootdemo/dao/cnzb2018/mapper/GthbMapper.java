package com.fineway.springbootdemo.dao.cnzb2018.mapper;

import com.fineway.springbootdemo.dao.cnzb2018.pojo.Gthb;

public interface GthbMapper {
    int deleteByPrimaryKey(String gthbid);

    int insert(Gthb record);

    int insertSelective(Gthb record);

    Gthb selectByPrimaryKey(String gthbid);

    int updateByPrimaryKeySelective(Gthb record);

    int updateByPrimaryKey(Gthb record);
}