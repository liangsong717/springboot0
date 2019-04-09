package com.fineway.springbootdemo.dao.cnzb2018.mapper;

import com.fineway.springbootdemo.dao.cnzb2018.pojo.Mthbjrqklx;

public interface MthbjrqklxMapper {
    int deleteByPrimaryKey(String mthbjrqklxid);

    int insert(Mthbjrqklx record);

    int insertSelective(Mthbjrqklx record);

    Mthbjrqklx selectByPrimaryKey(String mthbjrqklxid);

    int updateByPrimaryKeySelective(Mthbjrqklx record);

    int updateByPrimaryKey(Mthbjrqklx record);
}