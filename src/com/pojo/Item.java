package com.pojo;

import java.util.Date;
import java.util.List;

public class Item {
    private Integer id;

    private Integer uid;

    private Integer cid;

    private String title;

    private String contact;

    private Date createdate;

    private Integer basepayment;

    private String counttype;

    private Integer mintime;

    private Integer maxtime;

    private Integer overtimemoney;

    private Integer deposit;

    private Integer renewable;

    private Integer rentalstate;

//    数据库没有的字段
    private User ownUser;
    
    private Itemimage firstImage;
    
    private List<Itemimage> itemimages;
    
    
    public User getOwnUser() {
        return ownUser;
    }

    public void setOwnUser(User ownUser) {
        this.ownUser = ownUser;
    }

    public Itemimage getFirstImage() {
        return firstImage;
    }

    public void setFirstImage(Itemimage firstImage) {
        this.firstImage = firstImage;
    }

    public List<Itemimage> getItemimages() {
        return itemimages;
    }

    public void setItemimages(List<Itemimage> itemimages) {
        this.itemimages = itemimages;
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

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact == null ? null : contact.trim();
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Integer getBasepayment() {
        return basepayment;
    }

    public void setBasepayment(Integer basepayment) {
        this.basepayment = basepayment;
    }

    public String getCounttype() {
        return counttype;
    }

    public void setCounttype(String counttype) {
        this.counttype = counttype == null ? null : counttype.trim();
    }

    public Integer getMintime() {
        return mintime;
    }

    public void setMintime(Integer mintime) {
        this.mintime = mintime;
    }

    public Integer getMaxtime() {
        return maxtime;
    }

    public void setMaxtime(Integer maxtime) {
        this.maxtime = maxtime;
    }

    public Integer getOvertimemoney() {
        return overtimemoney;
    }

    public void setOvertimemoney(Integer overtimemoney) {
        this.overtimemoney = overtimemoney;
    }

    public Integer getDeposit() {
        return deposit;
    }

    public void setDeposit(Integer deposit) {
        this.deposit = deposit;
    }

    public Integer getRenewable() {
        return renewable;
    }

    public void setRenewable(Integer renewable) {
        this.renewable = renewable;
    }

    public Integer getRentalstate() {
        return rentalstate;
    }

    public void setRentalstate(Integer rentalstate) {
        this.rentalstate = rentalstate;
    }
}