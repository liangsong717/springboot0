package com.fineway.springbootdemo.dao.cnzb2016.mapper;

import com.fineway.springbootdemo.dao.cnzb2016.pojo.HistoryReportItemValue;
import com.fineway.springbootdemo.dao.cnzb2016.pojo.ReportDatas;
import com.fineway.springbootdemo.dao.cnzb2016.pojo.ReportMsg;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface HistoryReportItemValueMapper {
    int insert(HistoryReportItemValue record);

    int insertSelective(HistoryReportItemValue record);

    List<ReportMsg> searchReportMsg(String civiId,String reportType,String indexName);

    List<ReportDatas> searchReportDatas(String companyType,String civiId, String reportType);
}