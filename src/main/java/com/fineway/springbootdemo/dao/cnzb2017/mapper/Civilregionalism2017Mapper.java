package com.fineway.springbootdemo.dao.cnzb2017.mapper;

import com.fineway.springbootdemo.dao.cnzb2016.pojo.Civilregionalism2016;
import com.fineway.springbootdemo.dao.cnzb2017.pojo.Civilregionalism2017;
import com.fineway.springbootdemo.dao.cnzb2018.pojo.Civilregionalism;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface Civilregionalism2017Mapper {
    int deleteByPrimaryKey(String civilregionalismid);

    int insert(Civilregionalism2017 record);

    int insertSelective(Civilregionalism2017 record);

    Civilregionalism2017 selectByPrimaryKey(String civilregionalismid);

    int updateByPrimaryKeySelective(Civilregionalism2017 record);

    int updateByPrimaryKey(Civilregionalism2017 record);

    List<Civilregionalism2017> testSearch();

    List<Civilregionalism2017> searchByPage(int start, int end);

    List<Civilregionalism2017> selectBy2016Datas(List<Civilregionalism2016> list);

    List<Civilregionalism> getMoveDatas();
}