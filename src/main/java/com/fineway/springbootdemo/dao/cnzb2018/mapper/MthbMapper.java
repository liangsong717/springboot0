package com.fineway.springbootdemo.dao.cnzb2018.mapper;

import com.fineway.springbootdemo.dao.cnzb2018.pojo.Mthb;

public interface MthbMapper {
    int deleteByPrimaryKey(String mthbid);

    int insert(Mthb record);

    int insertSelective(Mthb record);

    Mthb selectByPrimaryKey(String mthbid);

    int updateByPrimaryKeySelective(Mthb record);

    int updateByPrimaryKey(Mthb record);
}