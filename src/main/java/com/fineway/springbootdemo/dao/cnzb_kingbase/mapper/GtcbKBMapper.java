package com.fineway.springbootdemo.dao.cnzb_kingbase.mapper;

import com.fineway.springbootdemo.dao.cnzb_kingbase.pojo.GtcbKB;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface GtcbKBMapper {
    int deleteByPrimaryKey(String gtcbid);

    int insert(GtcbKB record);

    int insertSelective(GtcbKB record);

    GtcbKB selectByPrimaryKey(String gtcbid);

    int updateByPrimaryKeySelective(GtcbKB record);

    int updateByPrimaryKey(GtcbKB record);
}