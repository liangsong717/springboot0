package com.fineway.springbootdemo.dao.cnzb2018.mapper;

import com.fineway.springbootdemo.dao.cnzb2016.pojo.Civilregionalism2016;
import com.fineway.springbootdemo.dao.cnzb2018.pojo.Civilregionalism;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface CivilregionalismMapper {
    int deleteByPrimaryKey(String civilregionalismid);

    int insert(Civilregionalism record);

    int insertSelective(Civilregionalism record);

    Civilregionalism selectByPrimaryKey(String civilregionalismid);

    int updateByPrimaryKeySelective(Civilregionalism record);

    int updateByPrimaryKey(Civilregionalism record);

    List<Civilregionalism> testSearch();

    List<Civilregionalism> searchByPage(int start,int end);

    List<Civilregionalism> selectBy2016Datas(List<Civilregionalism2016> list);
}