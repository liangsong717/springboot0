package com.fineway.springbootdemo.dao.cnzb2016.pojo;

import java.util.Date;

public class ReportDatas {
    private String civilregionalismid;

    private String reportid;

    private Date reporttime;

    private int count;

    private String codes;

    private String names;

    private String datas;

    public Date getReporttime() {
        return reporttime;
    }

    public void setReporttime(Date reporttime) {
        this.reporttime = reporttime;
    }

    public String getCodes() {
        return codes;
    }

    public void setCodes(String codes) {
        this.codes = codes;
    }

    public String getCivilregionalismid() {
        return civilregionalismid;
    }

    public void setCivilregionalismid(String civilregionalismid) {
        this.civilregionalismid = civilregionalismid;
    }

    public String getReportid() {
        return reportid;
    }

    public void setReportid(String reportid) {
        this.reportid = reportid;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getDatas() {
        return datas;
    }

    public void setDatas(String datas) {
        this.datas = datas;
    }

    public ReportDatas() {
    }

    public ReportDatas(String civilregionalismid, String reportid, Date reporttime, int count, String codes, String names, String datas) {
        this.civilregionalismid = civilregionalismid;
        this.reportid = reportid;
        this.reporttime = reporttime;
        this.count = count;
        this.codes = codes;
        this.names = names;
        this.datas = datas;
    }
}
