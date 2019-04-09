package com.fineway.springbootdemo.dao.cnzb2017.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Equipment2017 {
    private String equipmentid;

    private String equipmentname;

    private BigDecimal sum;

    private Date createtime;

    private String type;

    public String getEquipmentid() {
        return equipmentid;
    }

    public void setEquipmentid(String equipmentid) {
        this.equipmentid = equipmentid == null ? null : equipmentid.trim();
    }

    public String getEquipmentname() {
        return equipmentname;
    }

    public void setEquipmentname(String equipmentname) {
        this.equipmentname = equipmentname == null ? null : equipmentname.trim();
    }

    public BigDecimal getSum() {
        return sum;
    }

    public void setSum(BigDecimal sum) {
        this.sum = sum;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Equipment2017() {
    }

    public Equipment2017(String equipmentid, String equipmentname, BigDecimal sum, Date createtime, String type) {
        this.equipmentid = equipmentid;
        this.equipmentname = equipmentname;
        this.sum = sum;
        this.createtime = createtime;
        this.type = type;
    }
}