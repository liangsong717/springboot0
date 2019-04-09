package com.fineway.springbootdemo.dao.cnzb2016.mapper;

import com.fineway.springbootdemo.dao.cnzb2016.pojo.ActionList;

public interface ActionListMapper {
    int insert(ActionList record);

    int insertSelective(ActionList record);
}