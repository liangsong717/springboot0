package com.fineway.springbootdemo;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class MyTest {

    @Test
    public void ff1(){
        System.out.println("单元测试\n");
        String s = "2016年8月";
        s=s.replaceAll("[^0-9]","-");
        System.out.println(s);
    }

    @Test
    public void ff2(){
        List<String> list = new ArrayList<>();
        for (String s:list) {
            System.out.println("路过");
        }
        System.out.println("==");
    }

    @Test
    public void ff3(){
        String s = "0";
        String reg = "^[0-9]*$";
        System.out.println(!s.matches("^[0-9]*$"));
    }
}
