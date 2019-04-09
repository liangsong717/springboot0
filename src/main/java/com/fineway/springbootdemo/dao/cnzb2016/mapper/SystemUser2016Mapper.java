package com.fineway.springbootdemo.dao.cnzb2016.mapper;

import com.fineway.springbootdemo.dao.cnzb2016.pojo.SystemUser2016;
import com.fineway.springbootdemo.dao.cnzb2018.pojo.SystemUser2018;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface SystemUser2016Mapper {
    int insert(SystemUser2016 record);

    int insertSelective(SystemUser2016 record);

    List<SystemUser2018> selectByChuBao4_LeftJoinCivi(String companyType, String reportType);
}