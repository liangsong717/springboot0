package com.fineway.springbootdemo.dao.cnzb2018.mapper;

import com.fineway.springbootdemo.dao.cnzb2018.pojo.Drought;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface DroughtMapper {
    int deleteByPrimaryKey(String droughttempid);

    int insert(Drought record);

    int insertSelective(Drought record);

    Drought selectByPrimaryKey(String droughttempid);
    List<Drought> selectByPrimaryKeys(List<String> list);

    int updateByPrimaryKeySelective(Drought record);

    int updateByPrimaryKey(Drought record);

    //List<DroughtWithBase> searchByPage(GetEventListDto param);//页数+每页条数

    List<Drought> searchAll();

    String selectNameBeforeInsert(String name);

    Drought selectByPid(String pid);

    //int getSearchTotal(GetEventListDto param);

    void insertOrUpdate(Drought record);
}
