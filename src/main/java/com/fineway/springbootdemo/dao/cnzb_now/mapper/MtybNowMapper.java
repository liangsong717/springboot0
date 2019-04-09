package com.fineway.springbootdemo.dao.cnzb_now.mapper;

import com.fineway.springbootdemo.dao.cnzb_now.pojo.MtybNow;

public interface MtybNowMapper {
    int deleteByPrimaryKey(String mtybid);

    int insert(MtybNow record);

    int insertSelective(MtybNow record);

    MtybNow selectByPrimaryKey(String mtybid);

    int updateByPrimaryKeySelective(MtybNow record);

    int updateByPrimaryKey(MtybNow record);
}