package com.fineway.springbootdemo.dao.cnzb2018.mapper;

import com.fineway.springbootdemo.dao.cnzb2018.pojo.SystemUser2018;

public interface SystemUser2018Mapper {
    int deleteByPrimaryKey(String systemuserid);

    int insert(SystemUser2018 record);

    int insertSelective(SystemUser2018 record);

    SystemUser2018 selectByPrimaryKey(String systemuserid);

    int updateByPrimaryKeySelective(SystemUser2018 record);

    int updateByPrimaryKey(SystemUser2018 record);
}