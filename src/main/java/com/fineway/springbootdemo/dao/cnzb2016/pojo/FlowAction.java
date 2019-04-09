package com.fineway.springbootdemo.dao.cnzb2016.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class FlowAction {
    private String flowactionid;

    private Date flowactionendtime;

    private BigDecimal flowactionordernumber;

    private Date flowactionstarttime;

    private String flowactionstatusid;

    public String getFlowactionid() {
        return flowactionid;
    }

    public void setFlowactionid(String flowactionid) {
        this.flowactionid = flowactionid == null ? null : flowactionid.trim();
    }

    public Date getFlowactionendtime() {
        return flowactionendtime;
    }

    public void setFlowactionendtime(Date flowactionendtime) {
        this.flowactionendtime = flowactionendtime;
    }

    public BigDecimal getFlowactionordernumber() {
        return flowactionordernumber;
    }

    public void setFlowactionordernumber(BigDecimal flowactionordernumber) {
        this.flowactionordernumber = flowactionordernumber;
    }

    public Date getFlowactionstarttime() {
        return flowactionstarttime;
    }

    public void setFlowactionstarttime(Date flowactionstarttime) {
        this.flowactionstarttime = flowactionstarttime;
    }

    public String getFlowactionstatusid() {
        return flowactionstatusid;
    }

    public void setFlowactionstatusid(String flowactionstatusid) {
        this.flowactionstatusid = flowactionstatusid == null ? null : flowactionstatusid.trim();
    }
}