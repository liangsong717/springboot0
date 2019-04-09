package com.fineway.springbootdemo.dao.cnzb2017.mapper;

import com.fineway.springbootdemo.dao.cnzb2017.pojo.Mthbjrqklx2017;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface Mthbjrqklx2017Mapper {
    int deleteByPrimaryKey(String mthbjrqklxid);

    int insert(Mthbjrqklx2017 record);

    int insertSelective(Mthbjrqklx2017 record);

    Mthbjrqklx2017 selectByPrimaryKey(String mthbjrqklxid);

    int updateByPrimaryKeySelective(Mthbjrqklx2017 record);

    int updateByPrimaryKey(Mthbjrqklx2017 record);

    List<Mthbjrqklx2017> getMoveDatas();
}