package com.fineway.springbootdemo.dao.cnzb_now.mapper;

import com.fineway.springbootdemo.dao.cnzb_now.pojo.MthbjrqklxNow;

public interface MthbjrqklxNowMapper {
    int deleteByPrimaryKey(String mthbjrqklxid);

    int insert(MthbjrqklxNow record);

    int insertSelective(MthbjrqklxNow record);

    MthbjrqklxNow selectByPrimaryKey(String mthbjrqklxid);

    int updateByPrimaryKeySelective(MthbjrqklxNow record);

    int updateByPrimaryKey(MthbjrqklxNow record);
}