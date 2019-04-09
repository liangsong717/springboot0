package com.fineway.springbootdemo.dao.cnzb2016.pojo;

public class ReportMsg {

    private String civilregionalismid;
    private String civilregionalismname;
    private String reportid;
    private String parentindexcode;
    private String parentindexname;
    private String indexitemcode;
    private String indexitemname;
    private String reportitemvalue;

    public String getCivilregionalismid() {
        return civilregionalismid;
    }

    public void setCivilregionalismid(String civilregionalismid) {
        this.civilregionalismid = civilregionalismid;
    }

    public String getCivilregionalismname() {
        return civilregionalismname;
    }

    public void setCivilregionalismname(String civilregionalismname) {
        this.civilregionalismname = civilregionalismname;
    }

    public String getReportid() {
        return reportid;
    }

    public void setReportid(String reportid) {
        this.reportid = reportid;
    }

    public String getParentindexcode() {
        return parentindexcode;
    }

    public void setParentindexcode(String parentindexcode) {
        this.parentindexcode = parentindexcode;
    }

    public String getParentindexname() {
        return parentindexname;
    }

    public void setParentindexname(String parentindexname) {
        this.parentindexname = parentindexname;
    }

    public String getIndexitemcode() {
        return indexitemcode;
    }

    public void setIndexitemcode(String indexitemcode) {
        this.indexitemcode = indexitemcode;
    }

    public String getIndexitemname() {
        return indexitemname;
    }

    public void setIndexitemname(String indexitemname) {
        this.indexitemname = indexitemname;
    }

    public String getReportitemvalue() {
        return reportitemvalue;
    }

    public void setReportitemvalue(String reportitemvalue) {
        this.reportitemvalue = reportitemvalue;
    }

    public ReportMsg() {
    }

    public ReportMsg(String civilregionalismid, String civilregionalismname, String reportid, String parentindexcode,
                     String parentindexname, String indexitemcode, String indexitemname, String reportitemvalue) {
        this.civilregionalismid = civilregionalismid;
        this.civilregionalismname = civilregionalismname;
        this.reportid = reportid;
        this.parentindexcode = parentindexcode;
        this.parentindexname = parentindexname;
        this.indexitemcode = indexitemcode;
        this.indexitemname = indexitemname;
        this.reportitemvalue = reportitemvalue;
    }
}
