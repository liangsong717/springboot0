package com.fineway.springbootdemo.dao.cnzb2018.pojo;

import java.util.Date;

public class Drought {
    private String droughttempid;

    private Date dateStart;

    private Date dateStop;

    private String prov;

    private String droughtname;

    //private BaseEvent baseEvent;

    private int num;//分页使用

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getDroughttempid() {
        return droughttempid;
    }

    public void setDroughttempid(String droughttempid) {
        this.droughttempid = droughttempid;
    }

    public Date getDateStart() {
        return dateStart;
    }

    public void setDateStart(Date dateStart) {
        this.dateStart = dateStart;
    }

    public Date getDateStop() {
        return dateStop;
    }

    public void setDateStop(Date dateStop) {
        this.dateStop = dateStop;
    }

    public String getProv() {
        return prov;
    }

    public void setProv(String prov) {
        this.prov = prov;
    }

    public String getDroughtname() {
        return droughtname;
    }

    public void setDroughtname(String droughtname) {
        this.droughtname = droughtname;
    }

    @Override
    public String toString() {
        return "{droughttempid:" + this.droughttempid+
                ",dateStart:" + this.dateStart+
                ",dateStop:" + this.dateStop+
                ",prov:" + this.prov+
                ",droughtname:" + this.droughtname+"}";
    }

    public Drought() {

    }

    public Drought(String droughttempid, Date dateStart, Date dateStop, String prov, String droughtname) {
        super();
        this.droughttempid = droughttempid;
        this.dateStart = dateStart;
        this.dateStop = dateStop;
        this.prov = prov;
        this.droughtname = droughtname;
    }
}
