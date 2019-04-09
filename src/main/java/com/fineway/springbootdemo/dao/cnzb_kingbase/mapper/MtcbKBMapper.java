package com.fineway.springbootdemo.dao.cnzb_kingbase.mapper;

import com.fineway.springbootdemo.dao.cnzb_kingbase.pojo.MtcbKB;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface MtcbKBMapper {
    int deleteByPrimaryKey(String mtcbid);

    int insert(MtcbKB record);

    int insertSelective(MtcbKB record);

    MtcbKB selectByPrimaryKey(String mtcbid);

    int updateByPrimaryKeySelective(MtcbKB record);

    int updateByPrimaryKey(MtcbKB record);

    List<MtcbKB> searchDataNoTCMKMC();

    int updateTCMKMCByID(String id,String tcmkmc);
}