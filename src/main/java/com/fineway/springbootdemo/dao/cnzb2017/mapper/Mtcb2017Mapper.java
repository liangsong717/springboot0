package com.fineway.springbootdemo.dao.cnzb2017.mapper;

import com.fineway.springbootdemo.dao.cnzb2017.pojo.Mtcb2017;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface Mtcb2017Mapper {
    int deleteByPrimaryKey(String mtcbid);

    int insert(Mtcb2017 record);

    int insertSelective(Mtcb2017 record);

    Mtcb2017 selectByPrimaryKey(String mtcbid);

    int updateByPrimaryKeySelective(Mtcb2017 record);

    int updateByPrimaryKey(Mtcb2017 record);

    List<Mtcb2017> selfDefinedSQL(@Param("sql") String sql);

    List<Mtcb2017> getMoveDatas();
}