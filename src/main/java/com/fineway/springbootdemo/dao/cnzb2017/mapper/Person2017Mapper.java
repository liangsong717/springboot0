package com.fineway.springbootdemo.dao.cnzb2017.mapper;

import com.fineway.springbootdemo.dao.cnzb2017.pojo.Person2017;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface Person2017Mapper {
    int deleteByPrimaryKey(String personid);

    int insert(Person2017 record);

    int insertSelective(Person2017 record);

    Person2017 selectByPrimaryKey(String personid);

    int updateByPrimaryKeySelective(Person2017 record);

    int updateByPrimaryKey(Person2017 record);

    List<Person2017> getMoveDatas();
}