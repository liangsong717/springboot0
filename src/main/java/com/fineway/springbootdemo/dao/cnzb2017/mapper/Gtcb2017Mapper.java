package com.fineway.springbootdemo.dao.cnzb2017.mapper;

import com.fineway.springbootdemo.dao.cnzb2017.pojo.Gtcb2017;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface Gtcb2017Mapper {
    int deleteByPrimaryKey(String gtcbid);

    int insert(Gtcb2017 record);

    int insertSelective(Gtcb2017 record);

    Gtcb2017 selectByPrimaryKey(String gtcbid);

    int updateByPrimaryKeySelective(Gtcb2017 record);

    int updateByPrimaryKey(Gtcb2017 record);

    List<Gtcb2017> selfDefinedSQL(@Param("sql") String sql);

    List<Gtcb2017> getMoveDatas();
}