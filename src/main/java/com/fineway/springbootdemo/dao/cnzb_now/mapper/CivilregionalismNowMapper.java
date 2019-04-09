package com.fineway.springbootdemo.dao.cnzb_now.mapper;

import com.fineway.springbootdemo.dao.cnzb_now.pojo.CivilregionalismNow;

public interface CivilregionalismNowMapper {
    int deleteByPrimaryKey(String civilregionalismid);

    int insert(CivilregionalismNow record);

    int insertSelective(CivilregionalismNow record);

    CivilregionalismNow selectByPrimaryKey(String civilregionalismid);

    int updateByPrimaryKeySelective(CivilregionalismNow record);

    int updateByPrimaryKey(CivilregionalismNow record);
}