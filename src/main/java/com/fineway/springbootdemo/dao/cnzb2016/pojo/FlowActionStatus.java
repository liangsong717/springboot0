package com.fineway.springbootdemo.dao.cnzb2016.pojo;

import java.math.BigDecimal;

public class FlowActionStatus {
    private String flowactionstatusid;

    private String flowactionstatusdescription;

    private String flowactionstatusname;

    private BigDecimal flowactionstatusnumber;

    private String flowactionstatuscode;

    public String getFlowactionstatusid() {
        return flowactionstatusid;
    }

    public void setFlowactionstatusid(String flowactionstatusid) {
        this.flowactionstatusid = flowactionstatusid == null ? null : flowactionstatusid.trim();
    }

    public String getFlowactionstatusdescription() {
        return flowactionstatusdescription;
    }

    public void setFlowactionstatusdescription(String flowactionstatusdescription) {
        this.flowactionstatusdescription = flowactionstatusdescription == null ? null : flowactionstatusdescription.trim();
    }

    public String getFlowactionstatusname() {
        return flowactionstatusname;
    }

    public void setFlowactionstatusname(String flowactionstatusname) {
        this.flowactionstatusname = flowactionstatusname == null ? null : flowactionstatusname.trim();
    }

    public BigDecimal getFlowactionstatusnumber() {
        return flowactionstatusnumber;
    }

    public void setFlowactionstatusnumber(BigDecimal flowactionstatusnumber) {
        this.flowactionstatusnumber = flowactionstatusnumber;
    }

    public String getFlowactionstatuscode() {
        return flowactionstatuscode;
    }

    public void setFlowactionstatuscode(String flowactionstatuscode) {
        this.flowactionstatuscode = flowactionstatuscode == null ? null : flowactionstatuscode.trim();
    }
}