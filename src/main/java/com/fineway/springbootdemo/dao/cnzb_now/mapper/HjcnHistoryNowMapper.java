package com.fineway.springbootdemo.dao.cnzb_now.mapper;

import com.fineway.springbootdemo.dao.cnzb_now.pojo.HjcnHistoryNow;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
@Mapper
public interface HjcnHistoryNowMapper {
    int deleteByPrimaryKey(String id);

    int insert(HjcnHistoryNow record);

    int insertSelective(HjcnHistoryNow record);

    HjcnHistoryNow selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(HjcnHistoryNow record);

    int updateByPrimaryKey(HjcnHistoryNow record);

    List<HjcnHistoryNow> selfDefinedSQL(@Param("sql") String sql);
    List<Map<String,Object>> selfDefinedSQL2(@Param("sql") String sql);
}