package com.fineway.springbootdemo.service;


public interface MyTestService {
    void getCiviDatas();
    void showCivi2017And2018();
    void compareProvs2016And2017();
    void moveCIVIDatas(String companyType,String reportType);
    void moveC_Y_H_2016(String companyType,String reportType);

    void recoverTCMKMC();

    void showErrorDatas();

    void getErrorCivis();

    void dualHistoryreportid();

    void gerMoveDatasSQL();

    void decodeStr();
}
