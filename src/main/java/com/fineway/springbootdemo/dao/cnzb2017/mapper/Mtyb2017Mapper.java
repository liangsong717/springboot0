package com.fineway.springbootdemo.dao.cnzb2017.mapper;

import com.fineway.springbootdemo.dao.cnzb2017.pojo.Mtyb2017;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface Mtyb2017Mapper {
    int deleteByPrimaryKey(String mtybid);

    int insert(Mtyb2017 record);

    int insertSelective(Mtyb2017 record);

    Mtyb2017 selectByPrimaryKey(String mtybid);

    int updateByPrimaryKeySelective(Mtyb2017 record);

    int updateByPrimaryKey(Mtyb2017 record);
    List<Mtyb2017> selfDefinedSQL(@Param("sql") String sql);

    List<Mtyb2017> getMoveDatas();
}