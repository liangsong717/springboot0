package com.fineway.springbootdemo.dao.cnzb2017.mapper;

import com.fineway.springbootdemo.dao.cnzb2017.pojo.SystemUser2017;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface SystemUser2017Mapper {
    int deleteByPrimaryKey(String systemuserid);

    int insert(SystemUser2017 record);

    int insertSelective(SystemUser2017 record);

    SystemUser2017 selectByPrimaryKey(String systemuserid);

    int updateByPrimaryKeySelective(SystemUser2017 record);

    int updateByPrimaryKey(SystemUser2017 record);

    List<SystemUser2017> getMoveDatas();
}