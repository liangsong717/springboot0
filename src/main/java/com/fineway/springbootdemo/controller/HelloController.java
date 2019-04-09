package com.fineway.springbootdemo.controller;

import com.alibaba.fastjson.JSON;
import com.fineway.springbootdemo.dao.cnzb2018.mapper.CivilregionalismMapper;
import com.fineway.springbootdemo.dao.cnzb2018.mapper.DroughtMapper;
import com.fineway.springbootdemo.dao.cnzb2018.pojo.Civilregionalism;
import com.fineway.springbootdemo.dao.cnzb2018.pojo.Drought;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {

    @Autowired
    private DroughtMapper mapper;
    @Autowired
    private CivilregionalismMapper civiMapper;
    @RequestMapping("/")
    public String home() {
        //a8c753db4b1a465d8c6ed374ec33beb8
//        Drought drought = mapper.selectByPrimaryKey("a8c753db4b1a465d8c6ed374ec33beb8");
//        Drought a8c753db4b1a465d8c6ed374ec33beb8 = mapper.selectByPrimaryKey("a8c753db4b1a465d8c6ed374ec33beb8");
//        System.out.println(drought.toString());
        List<Civilregionalism> datas = civiMapper.testSearch();
        return JSON.toJSONString(datas);
    }

}
