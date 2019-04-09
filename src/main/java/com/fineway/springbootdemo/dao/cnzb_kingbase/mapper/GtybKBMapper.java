package com.fineway.springbootdemo.dao.cnzb_kingbase.mapper;

import com.fineway.springbootdemo.dao.cnzb_kingbase.pojo.GtybKB;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface GtybKBMapper {
    int deleteByPrimaryKey(String gtybid);

    int insert(GtybKB record);

    int insertSelective(GtybKB record);

    GtybKB selectByPrimaryKey(String gtybid);

    int updateByPrimaryKeySelective(GtybKB record);

    int updateByPrimaryKey(GtybKB record);
}