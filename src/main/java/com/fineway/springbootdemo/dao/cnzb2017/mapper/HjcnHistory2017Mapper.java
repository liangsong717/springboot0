package com.fineway.springbootdemo.dao.cnzb2017.mapper;

import com.fineway.springbootdemo.dao.cnzb2017.pojo.HjcnHistory2017;
import com.fineway.springbootdemo.dao.cnzb2017.pojo.HjcnHistoryWithCiviName2017;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface HjcnHistory2017Mapper {
    int deleteByPrimaryKey(String id);

    int insert(HjcnHistory2017 record);

    int insertSelective(HjcnHistory2017 record);

    HjcnHistory2017 selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(HjcnHistory2017 record);

    int updateByPrimaryKey(HjcnHistory2017 record);

    List<HjcnHistory2017> showErrorDatas();

    List<HjcnHistory2017> getErrorCivis();

    List<HjcnHistory2017>  selectByCiviAndBblxAndReportdate(HjcnHistory2017 data);

    int multUpdateIsvalide(@Param("valide") String valide, @Param("list") List<String> list);

    List<HjcnHistory2017> selfDefinedSQL(@Param("sql") String sql);

    List<HjcnHistory2017> getMoveDatas();

    List<HjcnHistoryWithCiviName2017> getDatasWithNullQymc();
}