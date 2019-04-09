package com.fineway.springbootdemo.dao.cnzb2016.pojo;

import java.math.BigDecimal;

public class ReportStage {
    private String reportstageid;

    private String reportstagedescription;

    private String reportstagename;

    private BigDecimal reportstageordernumber;

    private String reportstagecode;

    public String getReportstageid() {
        return reportstageid;
    }

    public void setReportstageid(String reportstageid) {
        this.reportstageid = reportstageid == null ? null : reportstageid.trim();
    }

    public String getReportstagedescription() {
        return reportstagedescription;
    }

    public void setReportstagedescription(String reportstagedescription) {
        this.reportstagedescription = reportstagedescription == null ? null : reportstagedescription.trim();
    }

    public String getReportstagename() {
        return reportstagename;
    }

    public void setReportstagename(String reportstagename) {
        this.reportstagename = reportstagename == null ? null : reportstagename.trim();
    }

    public BigDecimal getReportstageordernumber() {
        return reportstageordernumber;
    }

    public void setReportstageordernumber(BigDecimal reportstageordernumber) {
        this.reportstageordernumber = reportstageordernumber;
    }

    public String getReportstagecode() {
        return reportstagecode;
    }

    public void setReportstagecode(String reportstagecode) {
        this.reportstagecode = reportstagecode == null ? null : reportstagecode.trim();
    }
}