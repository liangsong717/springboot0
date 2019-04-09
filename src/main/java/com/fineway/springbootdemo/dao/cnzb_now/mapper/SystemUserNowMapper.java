package com.fineway.springbootdemo.dao.cnzb_now.mapper;

import com.fineway.springbootdemo.dao.cnzb_now.pojo.SystemUserNow;

public interface SystemUserNowMapper {
    int deleteByPrimaryKey(String systemuserid);

    int insert(SystemUserNow record);

    int insertSelective(SystemUserNow record);

    SystemUserNow selectByPrimaryKey(String systemuserid);

    int updateByPrimaryKeySelective(SystemUserNow record);

    int updateByPrimaryKey(SystemUserNow record);
}