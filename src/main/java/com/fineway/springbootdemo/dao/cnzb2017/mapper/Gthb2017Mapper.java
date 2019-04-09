package com.fineway.springbootdemo.dao.cnzb2017.mapper;

import com.fineway.springbootdemo.dao.cnzb2017.pojo.Gthb2017;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface Gthb2017Mapper {
    int deleteByPrimaryKey(String gthbid);

    int insert(Gthb2017 record);

    int insertSelective(Gthb2017 record);

    Gthb2017 selectByPrimaryKey(String gthbid);

    int updateByPrimaryKeySelective(Gthb2017 record);

    int updateByPrimaryKey(Gthb2017 record);

    List<Gthb2017> selfDefinedSQL(@Param("sql") String sql);

    List<Gthb2017> getMoveDatas();
}