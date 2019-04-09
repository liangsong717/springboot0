package com.fineway.springbootdemo.dao.cnzb_now.mapper;

import com.fineway.springbootdemo.dao.cnzb_now.pojo.GtybNow;

public interface GtybNowMapper {
    int deleteByPrimaryKey(String gtybid);

    int insert(GtybNow record);

    int insertSelective(GtybNow record);

    GtybNow selectByPrimaryKey(String gtybid);

    int updateByPrimaryKeySelective(GtybNow record);

    int updateByPrimaryKey(GtybNow record);
}