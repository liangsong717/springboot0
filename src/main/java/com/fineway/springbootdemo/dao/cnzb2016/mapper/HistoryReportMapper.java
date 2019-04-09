package com.fineway.springbootdemo.dao.cnzb2016.mapper;

import com.fineway.springbootdemo.dao.cnzb2016.pojo.HistoryReport;

public interface HistoryReportMapper {
    int insert(HistoryReport record);

    int insertSelective(HistoryReport record);
}