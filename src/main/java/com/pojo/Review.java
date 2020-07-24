package com.pojo;

import java.util.Date;

public class Review {
    private Integer id;

    private Integer uid;

    private Integer fromuid;

    private Date submitdate;

    private String content;

    private Integer review;

//    数据库没有的可选字段
    private User user;
    
    private User fromUser;
    
    
    
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public User getFromUser() {
        return fromUser;
    }

    public void setFromUser(User fromUser) {
        this.fromUser = fromUser;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getFromuid() {
        return fromuid;
    }

    public void setFromuid(Integer fromuid) {
        this.fromuid = fromuid;
    }

    public Date getSubmitdate() {
        return submitdate;
    }

    public void setSubmitdate(Date submitdate) {
        this.submitdate = submitdate;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Integer getReview() {
        return review;
    }

    public void setReview(Integer review) {
        this.review = review;
    }
}