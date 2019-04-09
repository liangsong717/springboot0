package com.fineway.springbootdemo.dao.cnzb2016.mapper;

import com.fineway.springbootdemo.dao.cnzb2016.pojo.Person2016;
import com.fineway.springbootdemo.dao.cnzb2018.pojo.Person2018;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface Person2016Mapper {
    int insert(Person2016 record);

    int insertSelective(Person2016 record);

    List<Person2018> selectByChuBao4_LeftJoinCivi(String companyType, String reportType);
}