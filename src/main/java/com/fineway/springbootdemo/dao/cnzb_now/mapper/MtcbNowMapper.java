package com.fineway.springbootdemo.dao.cnzb_now.mapper;

import com.fineway.springbootdemo.dao.cnzb_now.pojo.MtcbNow;

public interface MtcbNowMapper {
    int deleteByPrimaryKey(String mtcbid);

    int insert(MtcbNow record);

    int insertSelective(MtcbNow record);

    MtcbNow selectByPrimaryKey(String mtcbid);

    int updateByPrimaryKeySelective(MtcbNow record);

    int updateByPrimaryKey(MtcbNow record);
}