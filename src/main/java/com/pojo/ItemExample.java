package com.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ItemExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Integer value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Integer value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Integer value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Integer value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Integer value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Integer> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Integer> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Integer value1, Integer value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Integer value1, Integer value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andCidIsNull() {
            addCriterion("cid is null");
            return (Criteria) this;
        }

        public Criteria andCidIsNotNull() {
            addCriterion("cid is not null");
            return (Criteria) this;
        }

        public Criteria andCidEqualTo(Integer value) {
            addCriterion("cid =", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotEqualTo(Integer value) {
            addCriterion("cid <>", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThan(Integer value) {
            addCriterion("cid >", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cid >=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThan(Integer value) {
            addCriterion("cid <", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThanOrEqualTo(Integer value) {
            addCriterion("cid <=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidIn(List<Integer> values) {
            addCriterion("cid in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotIn(List<Integer> values) {
            addCriterion("cid not in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidBetween(Integer value1, Integer value2) {
            addCriterion("cid between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotBetween(Integer value1, Integer value2) {
            addCriterion("cid not between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andContactIsNull() {
            addCriterion("contact is null");
            return (Criteria) this;
        }

        public Criteria andContactIsNotNull() {
            addCriterion("contact is not null");
            return (Criteria) this;
        }

        public Criteria andContactEqualTo(String value) {
            addCriterion("contact =", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotEqualTo(String value) {
            addCriterion("contact <>", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactGreaterThan(String value) {
            addCriterion("contact >", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactGreaterThanOrEqualTo(String value) {
            addCriterion("contact >=", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLessThan(String value) {
            addCriterion("contact <", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLessThanOrEqualTo(String value) {
            addCriterion("contact <=", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLike(String value) {
            addCriterion("contact like", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotLike(String value) {
            addCriterion("contact not like", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactIn(List<String> values) {
            addCriterion("contact in", values, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotIn(List<String> values) {
            addCriterion("contact not in", values, "contact");
            return (Criteria) this;
        }

        public Criteria andContactBetween(String value1, String value2) {
            addCriterion("contact between", value1, value2, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotBetween(String value1, String value2) {
            addCriterion("contact not between", value1, value2, "contact");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNull() {
            addCriterion("createDate is null");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNotNull() {
            addCriterion("createDate is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedateEqualTo(Date value) {
            addCriterion("createDate =", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotEqualTo(Date value) {
            addCriterion("createDate <>", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThan(Date value) {
            addCriterion("createDate >", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("createDate >=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThan(Date value) {
            addCriterion("createDate <", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThanOrEqualTo(Date value) {
            addCriterion("createDate <=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateIn(List<Date> values) {
            addCriterion("createDate in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotIn(List<Date> values) {
            addCriterion("createDate not in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateBetween(Date value1, Date value2) {
            addCriterion("createDate between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotBetween(Date value1, Date value2) {
            addCriterion("createDate not between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andBasepaymentIsNull() {
            addCriterion("basePayment is null");
            return (Criteria) this;
        }

        public Criteria andBasepaymentIsNotNull() {
            addCriterion("basePayment is not null");
            return (Criteria) this;
        }

        public Criteria andBasepaymentEqualTo(Integer value) {
            addCriterion("basePayment =", value, "basepayment");
            return (Criteria) this;
        }

        public Criteria andBasepaymentNotEqualTo(Integer value) {
            addCriterion("basePayment <>", value, "basepayment");
            return (Criteria) this;
        }

        public Criteria andBasepaymentGreaterThan(Integer value) {
            addCriterion("basePayment >", value, "basepayment");
            return (Criteria) this;
        }

        public Criteria andBasepaymentGreaterThanOrEqualTo(Integer value) {
            addCriterion("basePayment >=", value, "basepayment");
            return (Criteria) this;
        }

        public Criteria andBasepaymentLessThan(Integer value) {
            addCriterion("basePayment <", value, "basepayment");
            return (Criteria) this;
        }

        public Criteria andBasepaymentLessThanOrEqualTo(Integer value) {
            addCriterion("basePayment <=", value, "basepayment");
            return (Criteria) this;
        }

        public Criteria andBasepaymentIn(List<Integer> values) {
            addCriterion("basePayment in", values, "basepayment");
            return (Criteria) this;
        }

        public Criteria andBasepaymentNotIn(List<Integer> values) {
            addCriterion("basePayment not in", values, "basepayment");
            return (Criteria) this;
        }

        public Criteria andBasepaymentBetween(Integer value1, Integer value2) {
            addCriterion("basePayment between", value1, value2, "basepayment");
            return (Criteria) this;
        }

        public Criteria andBasepaymentNotBetween(Integer value1, Integer value2) {
            addCriterion("basePayment not between", value1, value2, "basepayment");
            return (Criteria) this;
        }

        public Criteria andCounttypeIsNull() {
            addCriterion("countType is null");
            return (Criteria) this;
        }

        public Criteria andCounttypeIsNotNull() {
            addCriterion("countType is not null");
            return (Criteria) this;
        }

        public Criteria andCounttypeEqualTo(String value) {
            addCriterion("countType =", value, "counttype");
            return (Criteria) this;
        }

        public Criteria andCounttypeNotEqualTo(String value) {
            addCriterion("countType <>", value, "counttype");
            return (Criteria) this;
        }

        public Criteria andCounttypeGreaterThan(String value) {
            addCriterion("countType >", value, "counttype");
            return (Criteria) this;
        }

        public Criteria andCounttypeGreaterThanOrEqualTo(String value) {
            addCriterion("countType >=", value, "counttype");
            return (Criteria) this;
        }

        public Criteria andCounttypeLessThan(String value) {
            addCriterion("countType <", value, "counttype");
            return (Criteria) this;
        }

        public Criteria andCounttypeLessThanOrEqualTo(String value) {
            addCriterion("countType <=", value, "counttype");
            return (Criteria) this;
        }

        public Criteria andCounttypeLike(String value) {
            addCriterion("countType like", value, "counttype");
            return (Criteria) this;
        }

        public Criteria andCounttypeNotLike(String value) {
            addCriterion("countType not like", value, "counttype");
            return (Criteria) this;
        }

        public Criteria andCounttypeIn(List<String> values) {
            addCriterion("countType in", values, "counttype");
            return (Criteria) this;
        }

        public Criteria andCounttypeNotIn(List<String> values) {
            addCriterion("countType not in", values, "counttype");
            return (Criteria) this;
        }

        public Criteria andCounttypeBetween(String value1, String value2) {
            addCriterion("countType between", value1, value2, "counttype");
            return (Criteria) this;
        }

        public Criteria andCounttypeNotBetween(String value1, String value2) {
            addCriterion("countType not between", value1, value2, "counttype");
            return (Criteria) this;
        }

        public Criteria andMintimeIsNull() {
            addCriterion("minTime is null");
            return (Criteria) this;
        }

        public Criteria andMintimeIsNotNull() {
            addCriterion("minTime is not null");
            return (Criteria) this;
        }

        public Criteria andMintimeEqualTo(Integer value) {
            addCriterion("minTime =", value, "mintime");
            return (Criteria) this;
        }

        public Criteria andMintimeNotEqualTo(Integer value) {
            addCriterion("minTime <>", value, "mintime");
            return (Criteria) this;
        }

        public Criteria andMintimeGreaterThan(Integer value) {
            addCriterion("minTime >", value, "mintime");
            return (Criteria) this;
        }

        public Criteria andMintimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("minTime >=", value, "mintime");
            return (Criteria) this;
        }

        public Criteria andMintimeLessThan(Integer value) {
            addCriterion("minTime <", value, "mintime");
            return (Criteria) this;
        }

        public Criteria andMintimeLessThanOrEqualTo(Integer value) {
            addCriterion("minTime <=", value, "mintime");
            return (Criteria) this;
        }

        public Criteria andMintimeIn(List<Integer> values) {
            addCriterion("minTime in", values, "mintime");
            return (Criteria) this;
        }

        public Criteria andMintimeNotIn(List<Integer> values) {
            addCriterion("minTime not in", values, "mintime");
            return (Criteria) this;
        }

        public Criteria andMintimeBetween(Integer value1, Integer value2) {
            addCriterion("minTime between", value1, value2, "mintime");
            return (Criteria) this;
        }

        public Criteria andMintimeNotBetween(Integer value1, Integer value2) {
            addCriterion("minTime not between", value1, value2, "mintime");
            return (Criteria) this;
        }

        public Criteria andMaxtimeIsNull() {
            addCriterion("maxTime is null");
            return (Criteria) this;
        }

        public Criteria andMaxtimeIsNotNull() {
            addCriterion("maxTime is not null");
            return (Criteria) this;
        }

        public Criteria andMaxtimeEqualTo(Integer value) {
            addCriterion("maxTime =", value, "maxtime");
            return (Criteria) this;
        }

        public Criteria andMaxtimeNotEqualTo(Integer value) {
            addCriterion("maxTime <>", value, "maxtime");
            return (Criteria) this;
        }

        public Criteria andMaxtimeGreaterThan(Integer value) {
            addCriterion("maxTime >", value, "maxtime");
            return (Criteria) this;
        }

        public Criteria andMaxtimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("maxTime >=", value, "maxtime");
            return (Criteria) this;
        }

        public Criteria andMaxtimeLessThan(Integer value) {
            addCriterion("maxTime <", value, "maxtime");
            return (Criteria) this;
        }

        public Criteria andMaxtimeLessThanOrEqualTo(Integer value) {
            addCriterion("maxTime <=", value, "maxtime");
            return (Criteria) this;
        }

        public Criteria andMaxtimeIn(List<Integer> values) {
            addCriterion("maxTime in", values, "maxtime");
            return (Criteria) this;
        }

        public Criteria andMaxtimeNotIn(List<Integer> values) {
            addCriterion("maxTime not in", values, "maxtime");
            return (Criteria) this;
        }

        public Criteria andMaxtimeBetween(Integer value1, Integer value2) {
            addCriterion("maxTime between", value1, value2, "maxtime");
            return (Criteria) this;
        }

        public Criteria andMaxtimeNotBetween(Integer value1, Integer value2) {
            addCriterion("maxTime not between", value1, value2, "maxtime");
            return (Criteria) this;
        }

        public Criteria andOvertimemoneyIsNull() {
            addCriterion("overTimeMoney is null");
            return (Criteria) this;
        }

        public Criteria andOvertimemoneyIsNotNull() {
            addCriterion("overTimeMoney is not null");
            return (Criteria) this;
        }

        public Criteria andOvertimemoneyEqualTo(Integer value) {
            addCriterion("overTimeMoney =", value, "overtimemoney");
            return (Criteria) this;
        }

        public Criteria andOvertimemoneyNotEqualTo(Integer value) {
            addCriterion("overTimeMoney <>", value, "overtimemoney");
            return (Criteria) this;
        }

        public Criteria andOvertimemoneyGreaterThan(Integer value) {
            addCriterion("overTimeMoney >", value, "overtimemoney");
            return (Criteria) this;
        }

        public Criteria andOvertimemoneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("overTimeMoney >=", value, "overtimemoney");
            return (Criteria) this;
        }

        public Criteria andOvertimemoneyLessThan(Integer value) {
            addCriterion("overTimeMoney <", value, "overtimemoney");
            return (Criteria) this;
        }

        public Criteria andOvertimemoneyLessThanOrEqualTo(Integer value) {
            addCriterion("overTimeMoney <=", value, "overtimemoney");
            return (Criteria) this;
        }

        public Criteria andOvertimemoneyIn(List<Integer> values) {
            addCriterion("overTimeMoney in", values, "overtimemoney");
            return (Criteria) this;
        }

        public Criteria andOvertimemoneyNotIn(List<Integer> values) {
            addCriterion("overTimeMoney not in", values, "overtimemoney");
            return (Criteria) this;
        }

        public Criteria andOvertimemoneyBetween(Integer value1, Integer value2) {
            addCriterion("overTimeMoney between", value1, value2, "overtimemoney");
            return (Criteria) this;
        }

        public Criteria andOvertimemoneyNotBetween(Integer value1, Integer value2) {
            addCriterion("overTimeMoney not between", value1, value2, "overtimemoney");
            return (Criteria) this;
        }

        public Criteria andDepositIsNull() {
            addCriterion("deposit is null");
            return (Criteria) this;
        }

        public Criteria andDepositIsNotNull() {
            addCriterion("deposit is not null");
            return (Criteria) this;
        }

        public Criteria andDepositEqualTo(Integer value) {
            addCriterion("deposit =", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositNotEqualTo(Integer value) {
            addCriterion("deposit <>", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositGreaterThan(Integer value) {
            addCriterion("deposit >", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositGreaterThanOrEqualTo(Integer value) {
            addCriterion("deposit >=", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositLessThan(Integer value) {
            addCriterion("deposit <", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositLessThanOrEqualTo(Integer value) {
            addCriterion("deposit <=", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositIn(List<Integer> values) {
            addCriterion("deposit in", values, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositNotIn(List<Integer> values) {
            addCriterion("deposit not in", values, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositBetween(Integer value1, Integer value2) {
            addCriterion("deposit between", value1, value2, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositNotBetween(Integer value1, Integer value2) {
            addCriterion("deposit not between", value1, value2, "deposit");
            return (Criteria) this;
        }

        public Criteria andRenewableIsNull() {
            addCriterion("renewable is null");
            return (Criteria) this;
        }

        public Criteria andRenewableIsNotNull() {
            addCriterion("renewable is not null");
            return (Criteria) this;
        }

        public Criteria andRenewableEqualTo(Integer value) {
            addCriterion("renewable =", value, "renewable");
            return (Criteria) this;
        }

        public Criteria andRenewableNotEqualTo(Integer value) {
            addCriterion("renewable <>", value, "renewable");
            return (Criteria) this;
        }

        public Criteria andRenewableGreaterThan(Integer value) {
            addCriterion("renewable >", value, "renewable");
            return (Criteria) this;
        }

        public Criteria andRenewableGreaterThanOrEqualTo(Integer value) {
            addCriterion("renewable >=", value, "renewable");
            return (Criteria) this;
        }

        public Criteria andRenewableLessThan(Integer value) {
            addCriterion("renewable <", value, "renewable");
            return (Criteria) this;
        }

        public Criteria andRenewableLessThanOrEqualTo(Integer value) {
            addCriterion("renewable <=", value, "renewable");
            return (Criteria) this;
        }

        public Criteria andRenewableIn(List<Integer> values) {
            addCriterion("renewable in", values, "renewable");
            return (Criteria) this;
        }

        public Criteria andRenewableNotIn(List<Integer> values) {
            addCriterion("renewable not in", values, "renewable");
            return (Criteria) this;
        }

        public Criteria andRenewableBetween(Integer value1, Integer value2) {
            addCriterion("renewable between", value1, value2, "renewable");
            return (Criteria) this;
        }

        public Criteria andRenewableNotBetween(Integer value1, Integer value2) {
            addCriterion("renewable not between", value1, value2, "renewable");
            return (Criteria) this;
        }

        public Criteria andRentalstateIsNull() {
            addCriterion("rentalState is null");
            return (Criteria) this;
        }

        public Criteria andRentalstateIsNotNull() {
            addCriterion("rentalState is not null");
            return (Criteria) this;
        }

        public Criteria andRentalstateEqualTo(Integer value) {
            addCriterion("rentalState =", value, "rentalstate");
            return (Criteria) this;
        }

        public Criteria andRentalstateNotEqualTo(Integer value) {
            addCriterion("rentalState <>", value, "rentalstate");
            return (Criteria) this;
        }

        public Criteria andRentalstateGreaterThan(Integer value) {
            addCriterion("rentalState >", value, "rentalstate");
            return (Criteria) this;
        }

        public Criteria andRentalstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("rentalState >=", value, "rentalstate");
            return (Criteria) this;
        }

        public Criteria andRentalstateLessThan(Integer value) {
            addCriterion("rentalState <", value, "rentalstate");
            return (Criteria) this;
        }

        public Criteria andRentalstateLessThanOrEqualTo(Integer value) {
            addCriterion("rentalState <=", value, "rentalstate");
            return (Criteria) this;
        }

        public Criteria andRentalstateIn(List<Integer> values) {
            addCriterion("rentalState in", values, "rentalstate");
            return (Criteria) this;
        }

        public Criteria andRentalstateNotIn(List<Integer> values) {
            addCriterion("rentalState not in", values, "rentalstate");
            return (Criteria) this;
        }

        public Criteria andRentalstateBetween(Integer value1, Integer value2) {
            addCriterion("rentalState between", value1, value2, "rentalstate");
            return (Criteria) this;
        }

        public Criteria andRentalstateNotBetween(Integer value1, Integer value2) {
            addCriterion("rentalState not between", value1, value2, "rentalstate");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}