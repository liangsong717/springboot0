package com.fineway.springbootdemo.dao.cnzb_now.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface BaseMapper {
    List selfDefinedSQL(@Param("sql") String sql);
}
