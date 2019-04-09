package com.fineway.springbootdemo.dao.cnzb2016.pojo;

import java.math.BigDecimal;

public class CreditionRelation {
    private String creditionrelationid;

    private BigDecimal crforvillage;

    private String civilregionalismid;

    private String creditionid;

    private String evolvementmodeid;

    private String reditionrelationid;

    private String crdescription;

    public String getCreditionrelationid() {
        return creditionrelationid;
    }

    public void setCreditionrelationid(String creditionrelationid) {
        this.creditionrelationid = creditionrelationid == null ? null : creditionrelationid.trim();
    }

    public BigDecimal getCrforvillage() {
        return crforvillage;
    }

    public void setCrforvillage(BigDecimal crforvillage) {
        this.crforvillage = crforvillage;
    }

    public String getCivilregionalismid() {
        return civilregionalismid;
    }

    public void setCivilregionalismid(String civilregionalismid) {
        this.civilregionalismid = civilregionalismid == null ? null : civilregionalismid.trim();
    }

    public String getCreditionid() {
        return creditionid;
    }

    public void setCreditionid(String creditionid) {
        this.creditionid = creditionid == null ? null : creditionid.trim();
    }

    public String getEvolvementmodeid() {
        return evolvementmodeid;
    }

    public void setEvolvementmodeid(String evolvementmodeid) {
        this.evolvementmodeid = evolvementmodeid == null ? null : evolvementmodeid.trim();
    }

    public String getReditionrelationid() {
        return reditionrelationid;
    }

    public void setReditionrelationid(String reditionrelationid) {
        this.reditionrelationid = reditionrelationid == null ? null : reditionrelationid.trim();
    }

    public String getCrdescription() {
        return crdescription;
    }

    public void setCrdescription(String crdescription) {
        this.crdescription = crdescription == null ? null : crdescription.trim();
    }
}