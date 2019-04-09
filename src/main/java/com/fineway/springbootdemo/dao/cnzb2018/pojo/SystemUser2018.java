package com.fineway.springbootdemo.dao.cnzb2018.pojo;

import java.util.Date;

public class SystemUser2018 {
    private String systemuserid;

    private Date systemusercreatetime;

    private String systemusercreateuser;

    private String systemusername;

    private String systemuserpassword;

    private String personid;

    private String userroleid;

    private String corrigendacontactname;

    private String corrigendacontactphone;

    public String getSystemuserid() {
        return systemuserid;
    }

    public void setSystemuserid(String systemuserid) {
        this.systemuserid = systemuserid == null ? null : systemuserid.trim();
    }

    public Date getSystemusercreatetime() {
        return systemusercreatetime;
    }

    public void setSystemusercreatetime(Date systemusercreatetime) {
        this.systemusercreatetime = systemusercreatetime;
    }

    public String getSystemusercreateuser() {
        return systemusercreateuser;
    }

    public void setSystemusercreateuser(String systemusercreateuser) {
        this.systemusercreateuser = systemusercreateuser == null ? null : systemusercreateuser.trim();
    }

    public String getSystemusername() {
        return systemusername;
    }

    public void setSystemusername(String systemusername) {
        this.systemusername = systemusername == null ? null : systemusername.trim();
    }

    public String getSystemuserpassword() {
        return systemuserpassword;
    }

    public void setSystemuserpassword(String systemuserpassword) {
        this.systemuserpassword = systemuserpassword == null ? null : systemuserpassword.trim();
    }

    public String getPersonid() {
        return personid;
    }

    public void setPersonid(String personid) {
        this.personid = personid == null ? null : personid.trim();
    }

    public String getUserroleid() {
        return userroleid;
    }

    public void setUserroleid(String userroleid) {
        this.userroleid = userroleid == null ? null : userroleid.trim();
    }

    public String getCorrigendacontactname() {
        return corrigendacontactname;
    }

    public void setCorrigendacontactname(String corrigendacontactname) {
        this.corrigendacontactname = corrigendacontactname == null ? null : corrigendacontactname.trim();
    }

    public String getCorrigendacontactphone() {
        return corrigendacontactphone;
    }

    public void setCorrigendacontactphone(String corrigendacontactphone) {
        this.corrigendacontactphone = corrigendacontactphone == null ? null : corrigendacontactphone.trim();
    }
}