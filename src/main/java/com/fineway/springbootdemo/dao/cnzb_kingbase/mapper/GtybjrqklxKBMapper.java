package com.fineway.springbootdemo.dao.cnzb_kingbase.mapper;

import com.fineway.springbootdemo.dao.cnzb_kingbase.pojo.GtybjrqklxKB;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface GtybjrqklxKBMapper {
    int insert(GtybjrqklxKB record);

    int insertSelective(GtybjrqklxKB record);
}