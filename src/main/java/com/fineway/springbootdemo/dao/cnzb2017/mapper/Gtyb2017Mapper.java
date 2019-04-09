package com.fineway.springbootdemo.dao.cnzb2017.mapper;

import com.fineway.springbootdemo.dao.cnzb2017.pojo.Gtyb2017;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface Gtyb2017Mapper {
    int deleteByPrimaryKey(String gtybid);

    int insert(Gtyb2017 record);

    int insertSelective(Gtyb2017 record);

    Gtyb2017 selectByPrimaryKey(String gtybid);

    int updateByPrimaryKeySelective(Gtyb2017 record);

    int updateByPrimaryKey(Gtyb2017 record);

    List<Gtyb2017> selfDefinedSQL(@Param("sql") String sql);

    List<Gtyb2017> getMoveDatas();
}