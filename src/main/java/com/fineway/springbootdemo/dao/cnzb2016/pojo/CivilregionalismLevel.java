package com.fineway.springbootdemo.dao.cnzb2016.pojo;

import java.math.BigDecimal;

public class CivilregionalismLevel {
    private String civilregionalismlevelid;

    private String civilregionalismlevelname;

    private BigDecimal civilregionalismlevelnumber;

    private String leveldescription;

    private BigDecimal ccivilregionalismlevelnumber;

    public String getCivilregionalismlevelid() {
        return civilregionalismlevelid;
    }

    public void setCivilregionalismlevelid(String civilregionalismlevelid) {
        this.civilregionalismlevelid = civilregionalismlevelid == null ? null : civilregionalismlevelid.trim();
    }

    public String getCivilregionalismlevelname() {
        return civilregionalismlevelname;
    }

    public void setCivilregionalismlevelname(String civilregionalismlevelname) {
        this.civilregionalismlevelname = civilregionalismlevelname == null ? null : civilregionalismlevelname.trim();
    }

    public BigDecimal getCivilregionalismlevelnumber() {
        return civilregionalismlevelnumber;
    }

    public void setCivilregionalismlevelnumber(BigDecimal civilregionalismlevelnumber) {
        this.civilregionalismlevelnumber = civilregionalismlevelnumber;
    }

    public String getLeveldescription() {
        return leveldescription;
    }

    public void setLeveldescription(String leveldescription) {
        this.leveldescription = leveldescription == null ? null : leveldescription.trim();
    }

    public BigDecimal getCcivilregionalismlevelnumber() {
        return ccivilregionalismlevelnumber;
    }

    public void setCcivilregionalismlevelnumber(BigDecimal ccivilregionalismlevelnumber) {
        this.ccivilregionalismlevelnumber = ccivilregionalismlevelnumber;
    }
}