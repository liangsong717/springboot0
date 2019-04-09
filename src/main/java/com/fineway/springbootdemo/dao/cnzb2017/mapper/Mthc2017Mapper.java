package com.fineway.springbootdemo.dao.cnzb2017.mapper;

import com.fineway.springbootdemo.dao.cnzb2017.pojo.CiviIdAndMkmc;
import com.fineway.springbootdemo.dao.cnzb2017.pojo.Mthc2017;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface Mthc2017Mapper {
    int insert(Mthc2017 record);

    int insertSelective(Mthc2017 record);

    List<CiviIdAndMkmc> selectCiviIdAndMkmc(String civilregionalismid);
}