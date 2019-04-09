package com.fineway.springbootdemo.dao.cnzb_kingbase.mapper;

import com.fineway.springbootdemo.dao.cnzb_kingbase.pojo.MthbKB;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface MthbKBMapper {
    int deleteByPrimaryKey(String mthbid);

    int insert(MthbKB record);

    int insertSelective(MthbKB record);

    MthbKB selectByPrimaryKey(String mthbid);

    int updateByPrimaryKeySelective(MthbKB record);

    int updateByPrimaryKey(MthbKB record);

    List<MthbKB> searchDataNoTCMKMC();

    int updateTCMKMCByID(String id,String tcmkmc);
}