package com.fineway.springbootdemo.dao.cnzb2016.pojo;

import java.math.BigDecimal;

public class ActionList {
    private String actionlistid;

    private BigDecimal actionlistintegrant;

    private String reportstageid;

    private String reporttypeid;

    public String getActionlistid() {
        return actionlistid;
    }

    public void setActionlistid(String actionlistid) {
        this.actionlistid = actionlistid == null ? null : actionlistid.trim();
    }

    public BigDecimal getActionlistintegrant() {
        return actionlistintegrant;
    }

    public void setActionlistintegrant(BigDecimal actionlistintegrant) {
        this.actionlistintegrant = actionlistintegrant;
    }

    public String getReportstageid() {
        return reportstageid;
    }

    public void setReportstageid(String reportstageid) {
        this.reportstageid = reportstageid == null ? null : reportstageid.trim();
    }

    public String getReporttypeid() {
        return reporttypeid;
    }

    public void setReporttypeid(String reporttypeid) {
        this.reporttypeid = reporttypeid == null ? null : reporttypeid.trim();
    }
}