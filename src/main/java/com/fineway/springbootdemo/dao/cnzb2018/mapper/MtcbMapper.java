package com.fineway.springbootdemo.dao.cnzb2018.mapper;

import com.fineway.springbootdemo.dao.cnzb2018.pojo.Mtcb;

public interface MtcbMapper {
    int deleteByPrimaryKey(String mtcbid);

    int insert(Mtcb record);

    int insertSelective(Mtcb record);

    Mtcb selectByPrimaryKey(String mtcbid);

    int updateByPrimaryKeySelective(Mtcb record);

    int updateByPrimaryKey(Mtcb record);
}