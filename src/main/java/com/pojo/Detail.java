package com.pojo;

public class Detail {
    private Integer uid;

    private String brief;

    private String realname;

    private Integer idnumber;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief == null ? null : brief.trim();
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    public Integer getIdnumber() {
        return idnumber;
    }

    public void setIdnumber(Integer idnumber) {
        this.idnumber = idnumber;
    }
}