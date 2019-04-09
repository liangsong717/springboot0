package com.fineway.springbootdemo.dao.cnzb_kingbase.mapper;

import com.fineway.springbootdemo.dao.cnzb_kingbase.pojo.MtybKB;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface MtybKBMapper {
    int deleteByPrimaryKey(String mtybid);

    int insert(MtybKB record);

    int insertSelective(MtybKB record);

    MtybKB selectByPrimaryKey(String mtybid);

    int updateByPrimaryKeySelective(MtybKB record);

    int updateByPrimaryKey(MtybKB record);

    List<MtybKB> searchDataNoTCMKMC();

    int updateTCMKMCByID(String id,String tcmkmc);
}