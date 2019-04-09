package com.fineway.springbootdemo;

import com.fineway.springbootdemo.service.CNZB2019Service;
import com.fineway.springbootdemo.service.MyTestService;
import com.fineway.springbootdemo.service.impl.MyTestServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootdemoApplication implements CommandLineRunner {

    @Autowired
    private MyTestService service;
    //private CNZB2019Service service;

    public static void main(String[] args) {
        System.out.println("hello SpringBoot");
        SpringApplication.run(SpringbootdemoApplication.class, args);

    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("=====================================================================================");
        //service.getCiviDatas();
        //service.showCivi2017And2018();
        //service.compareProvs2016And2017();

        //导出2016用户表SQL方法
        //service.moveCIVIDatas(null,"1");

        //导出2016初报月报核报方法
        //service.moveC_Y_H_2016(null,null);

        //kingbase 退出煤矿名称null 恢复
        //service.recoverTCMKMC();

        //2017 查询异常数据
        //service.showErrorDatas();

        //2017查询同一份报告存在多个可见状态的企业
        //service.getErrorCivis();

        //2017处理历史记录表与初月核表中 id不一致数据
        //service.dualHistoryreportid();

        //2017数据迁移
        service.gerMoveDatasSQL();

        //解析设备名称中文乱码
        //service.decodeStr();
        //-------------------------------------------------------------------------------------------------------

        //service.test1();

        System.out.println("=====================================================================================");
        System.exit(0);
    }
}
