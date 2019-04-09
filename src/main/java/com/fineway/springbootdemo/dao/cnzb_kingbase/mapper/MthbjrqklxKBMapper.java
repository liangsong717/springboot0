package com.fineway.springbootdemo.dao.cnzb_kingbase.mapper;

import com.fineway.springbootdemo.dao.cnzb_kingbase.pojo.MthbjrqklxKB;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface MthbjrqklxKBMapper {
    int deleteByPrimaryKey(String mthbjrqklxid);

    int insert(MthbjrqklxKB record);

    int insertSelective(MthbjrqklxKB record);

    MthbjrqklxKB selectByPrimaryKey(String mthbjrqklxid);

    int updateByPrimaryKeySelective(MthbjrqklxKB record);

    int updateByPrimaryKey(MthbjrqklxKB record);
}