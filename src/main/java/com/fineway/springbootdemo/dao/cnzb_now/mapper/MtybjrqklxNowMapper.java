package com.fineway.springbootdemo.dao.cnzb_now.mapper;

import com.fineway.springbootdemo.dao.cnzb_now.pojo.MtybjrqklxNow;

public interface MtybjrqklxNowMapper {
    int deleteByPrimaryKey(String mtybjrqklxid);

    int insert(MtybjrqklxNow record);

    int insertSelective(MtybjrqklxNow record);

    MtybjrqklxNow selectByPrimaryKey(String mtybjrqklxid);

    int updateByPrimaryKeySelective(MtybjrqklxNow record);

    int updateByPrimaryKey(MtybjrqklxNow record);
}