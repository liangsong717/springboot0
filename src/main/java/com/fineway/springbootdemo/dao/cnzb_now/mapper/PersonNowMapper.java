package com.fineway.springbootdemo.dao.cnzb_now.mapper;

import com.fineway.springbootdemo.dao.cnzb_now.pojo.PersonNow;

public interface PersonNowMapper {
    int deleteByPrimaryKey(String personid);

    int insert(PersonNow record);

    int insertSelective(PersonNow record);

    PersonNow selectByPrimaryKey(String personid);

    int updateByPrimaryKeySelective(PersonNow record);

    int updateByPrimaryKey(PersonNow record);
}