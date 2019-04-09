package com.fineway.springbootdemo.dao.cnzb2017.mapper;

import com.fineway.springbootdemo.dao.cnzb2017.pojo.Mtybjrqklx2017;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface Mtybjrqklx2017Mapper {
    int deleteByPrimaryKey(String mtybjrqklxid);

    int insert(Mtybjrqklx2017 record);

    int insertSelective(Mtybjrqklx2017 record);

    Mtybjrqklx2017 selectByPrimaryKey(String mtybjrqklxid);

    int updateByPrimaryKeySelective(Mtybjrqklx2017 record);

    int updateByPrimaryKey(Mtybjrqklx2017 record);

    List<Mtybjrqklx2017> getMoveDatas();
}