package com.fineway.springbootdemo.dao.cnzb2017.pojo;

public class CiviIdAndMkmc {

    private String civilregionalismid;

    private String qymc;

    private String tcmkmc;

    public String getQymc() {
        return qymc;
    }

    public void setQymc(String qymc) {
        this.qymc = qymc;
    }

    public String getCivilregionalismid() {
        return civilregionalismid;
    }

    public void setCivilregionalismid(String civilregionalismid) {
        this.civilregionalismid = civilregionalismid;
    }

    public String getTcmkmc() {
        return tcmkmc;
    }

    public void setTcmkmc(String tcmkmc) {
        this.tcmkmc = tcmkmc;
    }

    public CiviIdAndMkmc() {
    }

    public CiviIdAndMkmc(String civilregionalismid, String qymc, String tcmkmc) {
        this.civilregionalismid = civilregionalismid;
        this.qymc = qymc;
        this.tcmkmc = tcmkmc;
    }
}
