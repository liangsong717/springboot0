package com.fineway.springbootdemo.dao.cnzb2016.mapper;

import com.fineway.springbootdemo.dao.cnzb2016.pojo.IndexItem;

public interface IndexItemMapper {
    int insert(IndexItem record);

    int insertSelective(IndexItem record);
}