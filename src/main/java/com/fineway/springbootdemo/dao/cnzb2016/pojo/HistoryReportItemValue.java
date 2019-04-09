package com.fineway.springbootdemo.dao.cnzb2016.pojo;

import java.util.Date;

public class HistoryReportItemValue {
    private String reportitemvalueid;

    private String reportitemvalue;

    private String indexitemid;

    private String reportid;

    private Date insertdatetime;

    public String getReportitemvalueid() {
        return reportitemvalueid;
    }

    public void setReportitemvalueid(String reportitemvalueid) {
        this.reportitemvalueid = reportitemvalueid == null ? null : reportitemvalueid.trim();
    }

    public String getReportitemvalue() {
        return reportitemvalue;
    }

    public void setReportitemvalue(String reportitemvalue) {
        this.reportitemvalue = reportitemvalue == null ? null : reportitemvalue.trim();
    }

    public String getIndexitemid() {
        return indexitemid;
    }

    public void setIndexitemid(String indexitemid) {
        this.indexitemid = indexitemid == null ? null : indexitemid.trim();
    }

    public String getReportid() {
        return reportid;
    }

    public void setReportid(String reportid) {
        this.reportid = reportid == null ? null : reportid.trim();
    }

    public Date getInsertdatetime() {
        return insertdatetime;
    }

    public void setInsertdatetime(Date insertdatetime) {
        this.insertdatetime = insertdatetime;
    }
}