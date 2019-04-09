package com.fineway.springbootdemo.dao.cnzb2016.mapper;

import com.fineway.springbootdemo.dao.cnzb2016.pojo.Civilregionalism2016;
import com.fineway.springbootdemo.dao.cnzb2018.pojo.Civilregionalism;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface Civilregionalism2016Mapper {
    int deleteByPrimaryKey(String civilregionalismid);

    int insert(Civilregionalism2016 record);

    int insertSelective(Civilregionalism2016 record);

    Civilregionalism2016 selectByPrimaryKey(String civilregionalismid);

    int updateByPrimaryKeySelective(Civilregionalism2016 record);

    int updateByPrimaryKey(Civilregionalism2016 record);

    List<Civilregionalism2016> testSearch();

    List<Civilregionalism2016> searchByPage(int start, int end);

    List<Civilregionalism2016> selectProvs();

    /**
     * 通过初报（18年审核通过为状态4）获取CIVI表数据
     * @param companyType
     * @param reportType
     * @return
     */
    List<Civilregionalism> selectByChuBao4(String companyType, String reportType);
}