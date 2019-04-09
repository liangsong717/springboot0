package com.fineway.springbootdemo.dao.cnzb2016.pojo;

import java.math.BigDecimal;

public class IndexItem {
    private String indexitemid;

    private String indexitemcode;

    private String indexitemname;

    private BigDecimal indexitemordernumber;

    private String indexitemunit;

    private BigDecimal indexitemvalidity;

    private BigDecimal keyindexitem;

    private BigDecimal mainindexitem;

    private String relatingdisasterkindid;

    private String datatypeid;

    private String parentid;

    private String indextypeid;

    private String indexitemdescription;

    private BigDecimal countryindexitem;

    public String getIndexitemid() {
        return indexitemid;
    }

    public void setIndexitemid(String indexitemid) {
        this.indexitemid = indexitemid == null ? null : indexitemid.trim();
    }

    public String getIndexitemcode() {
        return indexitemcode;
    }

    public void setIndexitemcode(String indexitemcode) {
        this.indexitemcode = indexitemcode == null ? null : indexitemcode.trim();
    }

    public String getIndexitemname() {
        return indexitemname;
    }

    public void setIndexitemname(String indexitemname) {
        this.indexitemname = indexitemname == null ? null : indexitemname.trim();
    }

    public BigDecimal getIndexitemordernumber() {
        return indexitemordernumber;
    }

    public void setIndexitemordernumber(BigDecimal indexitemordernumber) {
        this.indexitemordernumber = indexitemordernumber;
    }

    public String getIndexitemunit() {
        return indexitemunit;
    }

    public void setIndexitemunit(String indexitemunit) {
        this.indexitemunit = indexitemunit == null ? null : indexitemunit.trim();
    }

    public BigDecimal getIndexitemvalidity() {
        return indexitemvalidity;
    }

    public void setIndexitemvalidity(BigDecimal indexitemvalidity) {
        this.indexitemvalidity = indexitemvalidity;
    }

    public BigDecimal getKeyindexitem() {
        return keyindexitem;
    }

    public void setKeyindexitem(BigDecimal keyindexitem) {
        this.keyindexitem = keyindexitem;
    }

    public BigDecimal getMainindexitem() {
        return mainindexitem;
    }

    public void setMainindexitem(BigDecimal mainindexitem) {
        this.mainindexitem = mainindexitem;
    }

    public String getRelatingdisasterkindid() {
        return relatingdisasterkindid;
    }

    public void setRelatingdisasterkindid(String relatingdisasterkindid) {
        this.relatingdisasterkindid = relatingdisasterkindid == null ? null : relatingdisasterkindid.trim();
    }

    public String getDatatypeid() {
        return datatypeid;
    }

    public void setDatatypeid(String datatypeid) {
        this.datatypeid = datatypeid == null ? null : datatypeid.trim();
    }

    public String getParentid() {
        return parentid;
    }

    public void setParentid(String parentid) {
        this.parentid = parentid == null ? null : parentid.trim();
    }

    public String getIndextypeid() {
        return indextypeid;
    }

    public void setIndextypeid(String indextypeid) {
        this.indextypeid = indextypeid == null ? null : indextypeid.trim();
    }

    public String getIndexitemdescription() {
        return indexitemdescription;
    }

    public void setIndexitemdescription(String indexitemdescription) {
        this.indexitemdescription = indexitemdescription == null ? null : indexitemdescription.trim();
    }

    public BigDecimal getCountryindexitem() {
        return countryindexitem;
    }

    public void setCountryindexitem(BigDecimal countryindexitem) {
        this.countryindexitem = countryindexitem;
    }
}