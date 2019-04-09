package com.fineway.springbootdemo.dao.cnzb2016.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Disaster {
    private String disasterid;

    private String disasterdescription;

    private Date disasterendtime;

    private String disastername;

    private Date disasterstarttime;

    private String disasterstatmonth;

    private BigDecimal disastervalidity;

    private String creditionrelationid;

    private String disasterkindid;

    private String disasterstateid;

    public String getDisasterid() {
        return disasterid;
    }

    public void setDisasterid(String disasterid) {
        this.disasterid = disasterid == null ? null : disasterid.trim();
    }

    public String getDisasterdescription() {
        return disasterdescription;
    }

    public void setDisasterdescription(String disasterdescription) {
        this.disasterdescription = disasterdescription == null ? null : disasterdescription.trim();
    }

    public Date getDisasterendtime() {
        return disasterendtime;
    }

    public void setDisasterendtime(Date disasterendtime) {
        this.disasterendtime = disasterendtime;
    }

    public String getDisastername() {
        return disastername;
    }

    public void setDisastername(String disastername) {
        this.disastername = disastername == null ? null : disastername.trim();
    }

    public Date getDisasterstarttime() {
        return disasterstarttime;
    }

    public void setDisasterstarttime(Date disasterstarttime) {
        this.disasterstarttime = disasterstarttime;
    }

    public String getDisasterstatmonth() {
        return disasterstatmonth;
    }

    public void setDisasterstatmonth(String disasterstatmonth) {
        this.disasterstatmonth = disasterstatmonth == null ? null : disasterstatmonth.trim();
    }

    public BigDecimal getDisastervalidity() {
        return disastervalidity;
    }

    public void setDisastervalidity(BigDecimal disastervalidity) {
        this.disastervalidity = disastervalidity;
    }

    public String getCreditionrelationid() {
        return creditionrelationid;
    }

    public void setCreditionrelationid(String creditionrelationid) {
        this.creditionrelationid = creditionrelationid == null ? null : creditionrelationid.trim();
    }

    public String getDisasterkindid() {
        return disasterkindid;
    }

    public void setDisasterkindid(String disasterkindid) {
        this.disasterkindid = disasterkindid == null ? null : disasterkindid.trim();
    }

    public String getDisasterstateid() {
        return disasterstateid;
    }

    public void setDisasterstateid(String disasterstateid) {
        this.disasterstateid = disasterstateid == null ? null : disasterstateid.trim();
    }
}