package com.fineway.springbootdemo.dao.cnzb_kingbase.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class CivilregionalismKB {
    private String civilregionalismid;

    private String civilregionalismcode;

    private Date civilregionalismcreatetime;

    private String civilregionalismcreateuser;

    private String civilregionalismlevelshortname;

    private String civilregionalismname;

    private BigDecimal civilregionalismordernumber;

    private String civilregionalismshortname;

    private BigDecimal regionalismordernumber;

    private String parentid;

    private String reportpid;

    private String civilregionalismlevelid;

    private String regionalismlevelshortnamecode;

    private String type;

    private String year;

    public String getCivilregionalismid() {
        return civilregionalismid;
    }

    public void setCivilregionalismid(String civilregionalismid) {
        this.civilregionalismid = civilregionalismid == null ? null : civilregionalismid.trim();
    }

    public String getCivilregionalismcode() {
        return civilregionalismcode;
    }

    public void setCivilregionalismcode(String civilregionalismcode) {
        this.civilregionalismcode = civilregionalismcode == null ? null : civilregionalismcode.trim();
    }

    public Date getCivilregionalismcreatetime() {
        return civilregionalismcreatetime;
    }

    public void setCivilregionalismcreatetime(Date civilregionalismcreatetime) {
        this.civilregionalismcreatetime = civilregionalismcreatetime;
    }

    public String getCivilregionalismcreateuser() {
        return civilregionalismcreateuser;
    }

    public void setCivilregionalismcreateuser(String civilregionalismcreateuser) {
        this.civilregionalismcreateuser = civilregionalismcreateuser == null ? null : civilregionalismcreateuser.trim();
    }

    public String getCivilregionalismlevelshortname() {
        return civilregionalismlevelshortname;
    }

    public void setCivilregionalismlevelshortname(String civilregionalismlevelshortname) {
        this.civilregionalismlevelshortname = civilregionalismlevelshortname == null ? null : civilregionalismlevelshortname.trim();
    }

    public String getCivilregionalismname() {
        return civilregionalismname;
    }

    public void setCivilregionalismname(String civilregionalismname) {
        this.civilregionalismname = civilregionalismname == null ? null : civilregionalismname.trim();
    }

    public BigDecimal getCivilregionalismordernumber() {
        return civilregionalismordernumber;
    }

    public void setCivilregionalismordernumber(BigDecimal civilregionalismordernumber) {
        this.civilregionalismordernumber = civilregionalismordernumber;
    }

    public String getCivilregionalismshortname() {
        return civilregionalismshortname;
    }

    public void setCivilregionalismshortname(String civilregionalismshortname) {
        this.civilregionalismshortname = civilregionalismshortname == null ? null : civilregionalismshortname.trim();
    }

    public BigDecimal getRegionalismordernumber() {
        return regionalismordernumber;
    }

    public void setRegionalismordernumber(BigDecimal regionalismordernumber) {
        this.regionalismordernumber = regionalismordernumber;
    }

    public String getParentid() {
        return parentid;
    }

    public void setParentid(String parentid) {
        this.parentid = parentid == null ? null : parentid.trim();
    }

    public String getReportpid() {
        return reportpid;
    }

    public void setReportpid(String reportpid) {
        this.reportpid = reportpid == null ? null : reportpid.trim();
    }

    public String getCivilregionalismlevelid() {
        return civilregionalismlevelid;
    }

    public void setCivilregionalismlevelid(String civilregionalismlevelid) {
        this.civilregionalismlevelid = civilregionalismlevelid == null ? null : civilregionalismlevelid.trim();
    }

    public String getRegionalismlevelshortnamecode() {
        return regionalismlevelshortnamecode;
    }

    public void setRegionalismlevelshortnamecode(String regionalismlevelshortnamecode) {
        this.regionalismlevelshortnamecode = regionalismlevelshortnamecode == null ? null : regionalismlevelshortnamecode.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year == null ? null : year.trim();
    }
}