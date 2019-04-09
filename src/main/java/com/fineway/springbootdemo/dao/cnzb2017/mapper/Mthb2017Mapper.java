package com.fineway.springbootdemo.dao.cnzb2017.mapper;

import com.fineway.springbootdemo.dao.cnzb2017.pojo.Mthb2017;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface Mthb2017Mapper {
    int deleteByPrimaryKey(String mthbid);

    int insert(Mthb2017 record);

    int insertSelective(Mthb2017 record);

    Mthb2017 selectByPrimaryKey(String mthbid);

    int updateByPrimaryKeySelective(Mthb2017 record);

    int updateByPrimaryKey(Mthb2017 record);

    List<Mthb2017> selfDefinedSQL(@Param("sql") String sql);

    List<Mthb2017> getMoveDatas();
}