package com.fineway.springbootdemo.dao.cnzb_now.mapper;

import com.fineway.springbootdemo.dao.cnzb_now.pojo.GtcbNow;

public interface GtcbNowMapper {
    int deleteByPrimaryKey(String gtcbid);

    int insert(GtcbNow record);

    int insertSelective(GtcbNow record);

    GtcbNow selectByPrimaryKey(String gtcbid);

    int updateByPrimaryKeySelective(GtcbNow record);

    int updateByPrimaryKey(GtcbNow record);
}