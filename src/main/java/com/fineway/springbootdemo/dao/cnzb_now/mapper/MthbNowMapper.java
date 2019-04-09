package com.fineway.springbootdemo.dao.cnzb_now.mapper;

import com.fineway.springbootdemo.dao.cnzb_now.pojo.MthbNow;

public interface MthbNowMapper {
    int deleteByPrimaryKey(String mthbid);

    int insert(MthbNow record);

    int insertSelective(MthbNow record);

    MthbNow selectByPrimaryKey(String mthbid);

    int updateByPrimaryKeySelective(MthbNow record);

    int updateByPrimaryKey(MthbNow record);
}