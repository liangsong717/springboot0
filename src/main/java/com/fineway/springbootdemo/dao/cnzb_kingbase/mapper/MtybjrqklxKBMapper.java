package com.fineway.springbootdemo.dao.cnzb_kingbase.mapper;

import com.fineway.springbootdemo.dao.cnzb_kingbase.pojo.MtybjrqklxKB;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface MtybjrqklxKBMapper {
    int deleteByPrimaryKey(String mtybjrqklxid);

    int insert(MtybjrqklxKB record);

    int insertSelective(MtybjrqklxKB record);

    MtybjrqklxKB selectByPrimaryKey(String mtybjrqklxid);

    int updateByPrimaryKeySelective(MtybjrqklxKB record);

    int updateByPrimaryKey(MtybjrqklxKB record);
}