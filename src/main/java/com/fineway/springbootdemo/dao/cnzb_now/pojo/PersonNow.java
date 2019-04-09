package com.fineway.springbootdemo.dao.cnzb_now.pojo;

import java.util.Date;

public class PersonNow {
    private String personid;

    private String personaddress;

    private Date personcreatetime;

    private String personcreateuser;

    private String personemail;

    private String personmobile;

    private String personname;

    private String persontel;

    private String civilregionalismid;

    public String getPersonid() {
        return personid;
    }

    public void setPersonid(String personid) {
        this.personid = personid == null ? null : personid.trim();
    }

    public String getPersonaddress() {
        return personaddress;
    }

    public void setPersonaddress(String personaddress) {
        this.personaddress = personaddress == null ? null : personaddress.trim();
    }

    public Date getPersoncreatetime() {
        return personcreatetime;
    }

    public void setPersoncreatetime(Date personcreatetime) {
        this.personcreatetime = personcreatetime;
    }

    public String getPersoncreateuser() {
        return personcreateuser;
    }

    public void setPersoncreateuser(String personcreateuser) {
        this.personcreateuser = personcreateuser == null ? null : personcreateuser.trim();
    }

    public String getPersonemail() {
        return personemail;
    }

    public void setPersonemail(String personemail) {
        this.personemail = personemail == null ? null : personemail.trim();
    }

    public String getPersonmobile() {
        return personmobile;
    }

    public void setPersonmobile(String personmobile) {
        this.personmobile = personmobile == null ? null : personmobile.trim();
    }

    public String getPersonname() {
        return personname;
    }

    public void setPersonname(String personname) {
        this.personname = personname == null ? null : personname.trim();
    }

    public String getPersontel() {
        return persontel;
    }

    public void setPersontel(String persontel) {
        this.persontel = persontel == null ? null : persontel.trim();
    }

    public String getCivilregionalismid() {
        return civilregionalismid;
    }

    public void setCivilregionalismid(String civilregionalismid) {
        this.civilregionalismid = civilregionalismid == null ? null : civilregionalismid.trim();
    }
}