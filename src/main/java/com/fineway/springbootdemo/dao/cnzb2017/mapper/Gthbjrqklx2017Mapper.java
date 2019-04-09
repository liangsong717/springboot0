package com.fineway.springbootdemo.dao.cnzb2017.mapper;

import com.fineway.springbootdemo.dao.cnzb2017.pojo.Gthbjrqklx2017;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface Gthbjrqklx2017Mapper {
    int insert(Gthbjrqklx2017 record);

    int insertSelective(Gthbjrqklx2017 record);

    List<Gthbjrqklx2017> getMoveDatas();
}