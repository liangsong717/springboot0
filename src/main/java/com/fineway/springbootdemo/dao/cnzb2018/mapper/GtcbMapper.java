package com.fineway.springbootdemo.dao.cnzb2018.mapper;

import com.fineway.springbootdemo.dao.cnzb2018.pojo.Gtcb;

public interface GtcbMapper {
    int deleteByPrimaryKey(String gtcbid);

    int insert(Gtcb record);

    int insertSelective(Gtcb record);

    Gtcb selectByPrimaryKey(String gtcbid);

    int updateByPrimaryKeySelective(Gtcb record);

    int updateByPrimaryKey(Gtcb record);
}