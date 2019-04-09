package com.fineway.springbootdemo.dao.cnzb2016.mapper;

import com.fineway.springbootdemo.dao.cnzb2016.pojo.Disaster;

public interface DisasterMapper {
    int insert(Disaster record);

    int insertSelective(Disaster record);
}