package com.fineway.springbootdemo.dao.cnzb2017.pojo;

public class HjcnHistory2017 {
    private String id;

    private Long bblx;

    private String civilregionalismid;

    private String historyreportid;

    private String isvalide;

    private String path;

    private Long qylx;

    private String qymc;

    private String registerdate;

    private String rejetmessage;

    private String reportdate;

    private Long state;

    private String updatedate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Long getBblx() {
        return bblx;
    }

    public void setBblx(Long bblx) {
        this.bblx = bblx;
    }

    public String getCivilregionalismid() {
        return civilregionalismid;
    }

    public void setCivilregionalismid(String civilregionalismid) {
        this.civilregionalismid = civilregionalismid == null ? null : civilregionalismid.trim();
    }

    public String getHistoryreportid() {
        return historyreportid;
    }

    public void setHistoryreportid(String historyreportid) {
        this.historyreportid = historyreportid == null ? null : historyreportid.trim();
    }

    public String getIsvalide() {
        return isvalide;
    }

    public void setIsvalide(String isvalide) {
        this.isvalide = isvalide == null ? null : isvalide.trim();
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }

    public Long getQylx() {
        return qylx;
    }

    public void setQylx(Long qylx) {
        this.qylx = qylx;
    }

    public String getQymc() {
        return qymc;
    }

    public void setQymc(String qymc) {
        this.qymc = qymc == null ? null : qymc.trim();
    }

    public String getRegisterdate() {
        return registerdate;
    }

    public void setRegisterdate(String registerdate) {
        this.registerdate = registerdate == null ? null : registerdate.trim();
    }

    public String getRejetmessage() {
        return rejetmessage;
    }

    public void setRejetmessage(String rejetmessage) {
        this.rejetmessage = rejetmessage == null ? null : rejetmessage.trim();
    }

    public String getReportdate() {
        return reportdate;
    }

    public void setReportdate(String reportdate) {
        this.reportdate = reportdate == null ? null : reportdate.trim();
    }

    public Long getState() {
        return state;
    }

    public void setState(Long state) {
        this.state = state;
    }

    public String getUpdatedate() {
        return updatedate;
    }

    public void setUpdatedate(String updatedate) {
        this.updatedate = updatedate == null ? null : updatedate.trim();
    }
}