package com.fineway.springbootdemo.dao.cnzb2018.mapper;

import com.fineway.springbootdemo.dao.cnzb2018.pojo.Gtyb;

public interface GtybMapper {
    int deleteByPrimaryKey(String gtybid);

    int insert(Gtyb record);

    int insertSelective(Gtyb record);

    Gtyb selectByPrimaryKey(String gtybid);

    int updateByPrimaryKeySelective(Gtyb record);

    int updateByPrimaryKey(Gtyb record);
}