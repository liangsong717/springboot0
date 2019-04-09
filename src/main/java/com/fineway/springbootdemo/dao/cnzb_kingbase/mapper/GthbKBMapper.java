package com.fineway.springbootdemo.dao.cnzb_kingbase.mapper;

import com.fineway.springbootdemo.dao.cnzb_kingbase.pojo.GthbKB;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface GthbKBMapper {
    int deleteByPrimaryKey(String gthbid);

    int insert(GthbKB record);

    int insertSelective(GthbKB record);

    GthbKB selectByPrimaryKey(String gthbid);

    int updateByPrimaryKeySelective(GthbKB record);

    int updateByPrimaryKey(GthbKB record);
}