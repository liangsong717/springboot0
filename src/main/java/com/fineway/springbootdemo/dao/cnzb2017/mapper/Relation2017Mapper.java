package com.fineway.springbootdemo.dao.cnzb2017.mapper;

import com.fineway.springbootdemo.dao.cnzb2017.pojo.Relation2017;
import com.fineway.springbootdemo.dao.cnzb2017.pojo.Relation2017Key;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface Relation2017Mapper {
    int deleteByPrimaryKey(Relation2017Key key);

    int insert(Relation2017 record);

    int insertSelective(Relation2017 record);

    Relation2017 selectByPrimaryKey(Relation2017Key key);

    int updateByPrimaryKeySelective(Relation2017 record);

    int updateByPrimaryKey(Relation2017 record);

    List<Relation2017> getMoveData();
}