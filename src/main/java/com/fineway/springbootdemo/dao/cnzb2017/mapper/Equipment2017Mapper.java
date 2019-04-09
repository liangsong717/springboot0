package com.fineway.springbootdemo.dao.cnzb2017.mapper;

import com.fineway.springbootdemo.dao.cnzb2017.pojo.Equipment2017;
import com.fineway.springbootdemo.dao.cnzb2017.pojo.EquipmentAndJsonPath;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface Equipment2017Mapper {
    int deleteByPrimaryKey(String equipmentid);

    int insert(Equipment2017 record);

    int insertSelective(Equipment2017 record);

    Equipment2017 selectByPrimaryKey(String equipmentid);

    int updateByPrimaryKeySelective(Equipment2017 record);

    int updateByPrimaryKey(Equipment2017 record);

    List<EquipmentAndJsonPath> getJsonPath();

    List<Equipment2017> getMoveData();
}