package com.fineway.springbootdemo.dao.cnzb_now.mapper;

import com.fineway.springbootdemo.dao.cnzb_now.pojo.GthbNow;

public interface GthbNowMapper {
    int deleteByPrimaryKey(String gthbid);

    int insert(GthbNow record);

    int insertSelective(GthbNow record);

    GthbNow selectByPrimaryKey(String gthbid);

    int updateByPrimaryKeySelective(GthbNow record);

    int updateByPrimaryKey(GthbNow record);
}