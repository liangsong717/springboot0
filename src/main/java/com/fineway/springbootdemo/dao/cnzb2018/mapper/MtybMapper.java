package com.fineway.springbootdemo.dao.cnzb2018.mapper;

import com.fineway.springbootdemo.dao.cnzb2018.pojo.Mtyb;

public interface MtybMapper {
    int deleteByPrimaryKey(String mtybid);

    int insert(Mtyb record);

    int insertSelective(Mtyb record);

    Mtyb selectByPrimaryKey(String mtybid);

    int updateByPrimaryKeySelective(Mtyb record);

    int updateByPrimaryKey(Mtyb record);
}