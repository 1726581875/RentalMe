package com.pojo;

import java.util.Date;

public class Orders {
    private Integer id;

    private Integer ownid;

    private Integer uid;

    private Integer iid;

    private String ordercode;

    private Date createdate;

    private Date preloandate;

    private Date prereturndate;

    private Date prepaydate;

    private Integer prepaymoney;

    private Date loanconfirmdate;

    private Date returnconfirmdate;

    private Integer adjustment;

    private Integer realpaymoney;

    private String status;
    
//    数据库没有的字段
    private Item item;
    
    private User ownUser;
    
    private User buyUser;
    
    
    
    @Override
    public String toString() {
        return "Orders [id=" + id + ", ownid=" + ownid + ", uid=" + uid + ", iid=" + iid + ", ordercode=" + ordercode
                + ", createdate=" + createdate + ", preloandate=" + preloandate + ", prereturndate=" + prereturndate
                + ", prepaydate=" + prepaydate + ", prepaymoney=" + prepaymoney + ", loanconfirmdate=" + loanconfirmdate
                + ", returnconfirmdate=" + returnconfirmdate + ", adjustment=" + adjustment + ", realpaymoney="
                + realpaymoney + ", status=" + status + ", item=" + item + ", ownUser=" + ownUser + ", buyUser="
                + buyUser + "]";
    }

    public User getBuyUser() {
        return buyUser;
    }

    public void setBuyUser(User buyUser) {
        this.buyUser = buyUser;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public User getOwnUser() {
        return ownUser;
    }

    public void setOwnUser(User ownUser) {
        this.ownUser = ownUser;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOwnid() {
        return ownid;
    }

    public void setOwnid(Integer ownid) {
        this.ownid = ownid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getIid() {
        return iid;
    }

    public void setIid(Integer iid) {
        this.iid = iid;
    }

    public String getOrdercode() {
        return ordercode;
    }

    public void setOrdercode(String ordercode) {
        this.ordercode = ordercode == null ? null : ordercode.trim();
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Date getPreloandate() {
        return preloandate;
    }

    public void setPreloandate(Date preloandate) {
        this.preloandate = preloandate;
    }

    public Date getPrereturndate() {
        return prereturndate;
    }

    public void setPrereturndate(Date prereturndate) {
        this.prereturndate = prereturndate;
    }

    public Date getPrepaydate() {
        return prepaydate;
    }

    public void setPrepaydate(Date prepaydate) {
        this.prepaydate = prepaydate;
    }

    public Integer getPrepaymoney() {
        return prepaymoney;
    }

    public void setPrepaymoney(Integer prepaymoney) {
        this.prepaymoney = prepaymoney;
    }

    public Date getLoanconfirmdate() {
        return loanconfirmdate;
    }

    public void setLoanconfirmdate(Date loanconfirmdate) {
        this.loanconfirmdate = loanconfirmdate;
    }

    public Date getReturnconfirmdate() {
        return returnconfirmdate;
    }

    public void setReturnconfirmdate(Date returnconfirmdate) {
        this.returnconfirmdate = returnconfirmdate;
    }

    public Integer getAdjustment() {
        return adjustment;
    }

    public void setAdjustment(Integer adjustment) {
        this.adjustment = adjustment;
    }

    public Integer getRealpaymoney() {
        return realpaymoney;
    }

    public void setRealpaymoney(Integer realpaymoney) {
        this.realpaymoney = realpaymoney;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}