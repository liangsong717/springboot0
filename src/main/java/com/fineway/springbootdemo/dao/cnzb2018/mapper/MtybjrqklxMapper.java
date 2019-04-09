package com.fineway.springbootdemo.dao.cnzb2018.mapper;

import com.fineway.springbootdemo.dao.cnzb2018.pojo.Mtybjrqklx;

public interface MtybjrqklxMapper {
    int deleteByPrimaryKey(String mtybjrqklxid);

    int insert(Mtybjrqklx record);

    int insertSelective(Mtybjrqklx record);

    Mtybjrqklx selectByPrimaryKey(String mtybjrqklxid);

    int updateByPrimaryKeySelective(Mtybjrqklx record);

    int updateByPrimaryKey(Mtybjrqklx record);
}