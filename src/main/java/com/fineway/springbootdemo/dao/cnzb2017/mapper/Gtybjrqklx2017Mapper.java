package com.fineway.springbootdemo.dao.cnzb2017.mapper;

import com.fineway.springbootdemo.dao.cnzb2017.pojo.Gtybjrqklx2017;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface Gtybjrqklx2017Mapper {
    int insert(Gtybjrqklx2017 record);

    int insertSelective(Gtybjrqklx2017 record);

    List<Gtybjrqklx2017> getMoveDatas();
}