package com.fineway.springbootdemo.dao.cnzb_kingbase.mapper;

import com.fineway.springbootdemo.dao.cnzb_kingbase.pojo.CivilregionalismKB;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface CivilregionalismKBMapper {
    int deleteByPrimaryKey(String civilregionalismid);

    int insert(CivilregionalismKB record);

    int insertSelective(CivilregionalismKB record);

    CivilregionalismKB selectByPrimaryKey(String civilregionalismid);

    int updateByPrimaryKeySelective(CivilregionalismKB record);

    int updateByPrimaryKey(CivilregionalismKB record);
}