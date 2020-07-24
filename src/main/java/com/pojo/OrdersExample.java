package com.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrdersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrdersExample() {
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

        public Criteria andOwnidIsNull() {
            addCriterion("ownId is null");
            return (Criteria) this;
        }

        public Criteria andOwnidIsNotNull() {
            addCriterion("ownId is not null");
            return (Criteria) this;
        }

        public Criteria andOwnidEqualTo(Integer value) {
            addCriterion("ownId =", value, "ownid");
            return (Criteria) this;
        }

        public Criteria andOwnidNotEqualTo(Integer value) {
            addCriterion("ownId <>", value, "ownid");
            return (Criteria) this;
        }

        public Criteria andOwnidGreaterThan(Integer value) {
            addCriterion("ownId >", value, "ownid");
            return (Criteria) this;
        }

        public Criteria andOwnidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ownId >=", value, "ownid");
            return (Criteria) this;
        }

        public Criteria andOwnidLessThan(Integer value) {
            addCriterion("ownId <", value, "ownid");
            return (Criteria) this;
        }

        public Criteria andOwnidLessThanOrEqualTo(Integer value) {
            addCriterion("ownId <=", value, "ownid");
            return (Criteria) this;
        }

        public Criteria andOwnidIn(List<Integer> values) {
            addCriterion("ownId in", values, "ownid");
            return (Criteria) this;
        }

        public Criteria andOwnidNotIn(List<Integer> values) {
            addCriterion("ownId not in", values, "ownid");
            return (Criteria) this;
        }

        public Criteria andOwnidBetween(Integer value1, Integer value2) {
            addCriterion("ownId between", value1, value2, "ownid");
            return (Criteria) this;
        }

        public Criteria andOwnidNotBetween(Integer value1, Integer value2) {
            addCriterion("ownId not between", value1, value2, "ownid");
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

        public Criteria andIidIsNull() {
            addCriterion("iid is null");
            return (Criteria) this;
        }

        public Criteria andIidIsNotNull() {
            addCriterion("iid is not null");
            return (Criteria) this;
        }

        public Criteria andIidEqualTo(Integer value) {
            addCriterion("iid =", value, "iid");
            return (Criteria) this;
        }

        public Criteria andIidNotEqualTo(Integer value) {
            addCriterion("iid <>", value, "iid");
            return (Criteria) this;
        }

        public Criteria andIidGreaterThan(Integer value) {
            addCriterion("iid >", value, "iid");
            return (Criteria) this;
        }

        public Criteria andIidGreaterThanOrEqualTo(Integer value) {
            addCriterion("iid >=", value, "iid");
            return (Criteria) this;
        }

        public Criteria andIidLessThan(Integer value) {
            addCriterion("iid <", value, "iid");
            return (Criteria) this;
        }

        public Criteria andIidLessThanOrEqualTo(Integer value) {
            addCriterion("iid <=", value, "iid");
            return (Criteria) this;
        }

        public Criteria andIidIn(List<Integer> values) {
            addCriterion("iid in", values, "iid");
            return (Criteria) this;
        }

        public Criteria andIidNotIn(List<Integer> values) {
            addCriterion("iid not in", values, "iid");
            return (Criteria) this;
        }

        public Criteria andIidBetween(Integer value1, Integer value2) {
            addCriterion("iid between", value1, value2, "iid");
            return (Criteria) this;
        }

        public Criteria andIidNotBetween(Integer value1, Integer value2) {
            addCriterion("iid not between", value1, value2, "iid");
            return (Criteria) this;
        }

        public Criteria andOrdercodeIsNull() {
            addCriterion("orderCode is null");
            return (Criteria) this;
        }

        public Criteria andOrdercodeIsNotNull() {
            addCriterion("orderCode is not null");
            return (Criteria) this;
        }

        public Criteria andOrdercodeEqualTo(String value) {
            addCriterion("orderCode =", value, "ordercode");
            return (Criteria) this;
        }

        public Criteria andOrdercodeNotEqualTo(String value) {
            addCriterion("orderCode <>", value, "ordercode");
            return (Criteria) this;
        }

        public Criteria andOrdercodeGreaterThan(String value) {
            addCriterion("orderCode >", value, "ordercode");
            return (Criteria) this;
        }

        public Criteria andOrdercodeGreaterThanOrEqualTo(String value) {
            addCriterion("orderCode >=", value, "ordercode");
            return (Criteria) this;
        }

        public Criteria andOrdercodeLessThan(String value) {
            addCriterion("orderCode <", value, "ordercode");
            return (Criteria) this;
        }

        public Criteria andOrdercodeLessThanOrEqualTo(String value) {
            addCriterion("orderCode <=", value, "ordercode");
            return (Criteria) this;
        }

        public Criteria andOrdercodeLike(String value) {
            addCriterion("orderCode like", value, "ordercode");
            return (Criteria) this;
        }

        public Criteria andOrdercodeNotLike(String value) {
            addCriterion("orderCode not like", value, "ordercode");
            return (Criteria) this;
        }

        public Criteria andOrdercodeIn(List<String> values) {
            addCriterion("orderCode in", values, "ordercode");
            return (Criteria) this;
        }

        public Criteria andOrdercodeNotIn(List<String> values) {
            addCriterion("orderCode not in", values, "ordercode");
            return (Criteria) this;
        }

        public Criteria andOrdercodeBetween(String value1, String value2) {
            addCriterion("orderCode between", value1, value2, "ordercode");
            return (Criteria) this;
        }

        public Criteria andOrdercodeNotBetween(String value1, String value2) {
            addCriterion("orderCode not between", value1, value2, "ordercode");
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

        public Criteria andPreloandateIsNull() {
            addCriterion("preLoanDate is null");
            return (Criteria) this;
        }

        public Criteria andPreloandateIsNotNull() {
            addCriterion("preLoanDate is not null");
            return (Criteria) this;
        }

        public Criteria andPreloandateEqualTo(Date value) {
            addCriterion("preLoanDate =", value, "preloandate");
            return (Criteria) this;
        }

        public Criteria andPreloandateNotEqualTo(Date value) {
            addCriterion("preLoanDate <>", value, "preloandate");
            return (Criteria) this;
        }

        public Criteria andPreloandateGreaterThan(Date value) {
            addCriterion("preLoanDate >", value, "preloandate");
            return (Criteria) this;
        }

        public Criteria andPreloandateGreaterThanOrEqualTo(Date value) {
            addCriterion("preLoanDate >=", value, "preloandate");
            return (Criteria) this;
        }

        public Criteria andPreloandateLessThan(Date value) {
            addCriterion("preLoanDate <", value, "preloandate");
            return (Criteria) this;
        }

        public Criteria andPreloandateLessThanOrEqualTo(Date value) {
            addCriterion("preLoanDate <=", value, "preloandate");
            return (Criteria) this;
        }

        public Criteria andPreloandateIn(List<Date> values) {
            addCriterion("preLoanDate in", values, "preloandate");
            return (Criteria) this;
        }

        public Criteria andPreloandateNotIn(List<Date> values) {
            addCriterion("preLoanDate not in", values, "preloandate");
            return (Criteria) this;
        }

        public Criteria andPreloandateBetween(Date value1, Date value2) {
            addCriterion("preLoanDate between", value1, value2, "preloandate");
            return (Criteria) this;
        }

        public Criteria andPreloandateNotBetween(Date value1, Date value2) {
            addCriterion("preLoanDate not between", value1, value2, "preloandate");
            return (Criteria) this;
        }

        public Criteria andPrereturndateIsNull() {
            addCriterion("preReturnDate is null");
            return (Criteria) this;
        }

        public Criteria andPrereturndateIsNotNull() {
            addCriterion("preReturnDate is not null");
            return (Criteria) this;
        }

        public Criteria andPrereturndateEqualTo(Date value) {
            addCriterion("preReturnDate =", value, "prereturndate");
            return (Criteria) this;
        }

        public Criteria andPrereturndateNotEqualTo(Date value) {
            addCriterion("preReturnDate <>", value, "prereturndate");
            return (Criteria) this;
        }

        public Criteria andPrereturndateGreaterThan(Date value) {
            addCriterion("preReturnDate >", value, "prereturndate");
            return (Criteria) this;
        }

        public Criteria andPrereturndateGreaterThanOrEqualTo(Date value) {
            addCriterion("preReturnDate >=", value, "prereturndate");
            return (Criteria) this;
        }

        public Criteria andPrereturndateLessThan(Date value) {
            addCriterion("preReturnDate <", value, "prereturndate");
            return (Criteria) this;
        }

        public Criteria andPrereturndateLessThanOrEqualTo(Date value) {
            addCriterion("preReturnDate <=", value, "prereturndate");
            return (Criteria) this;
        }

        public Criteria andPrereturndateIn(List<Date> values) {
            addCriterion("preReturnDate in", values, "prereturndate");
            return (Criteria) this;
        }

        public Criteria andPrereturndateNotIn(List<Date> values) {
            addCriterion("preReturnDate not in", values, "prereturndate");
            return (Criteria) this;
        }

        public Criteria andPrereturndateBetween(Date value1, Date value2) {
            addCriterion("preReturnDate between", value1, value2, "prereturndate");
            return (Criteria) this;
        }

        public Criteria andPrereturndateNotBetween(Date value1, Date value2) {
            addCriterion("preReturnDate not between", value1, value2, "prereturndate");
            return (Criteria) this;
        }

        public Criteria andPrepaydateIsNull() {
            addCriterion("prePayDate is null");
            return (Criteria) this;
        }

        public Criteria andPrepaydateIsNotNull() {
            addCriterion("prePayDate is not null");
            return (Criteria) this;
        }

        public Criteria andPrepaydateEqualTo(Date value) {
            addCriterion("prePayDate =", value, "prepaydate");
            return (Criteria) this;
        }

        public Criteria andPrepaydateNotEqualTo(Date value) {
            addCriterion("prePayDate <>", value, "prepaydate");
            return (Criteria) this;
        }

        public Criteria andPrepaydateGreaterThan(Date value) {
            addCriterion("prePayDate >", value, "prepaydate");
            return (Criteria) this;
        }

        public Criteria andPrepaydateGreaterThanOrEqualTo(Date value) {
            addCriterion("prePayDate >=", value, "prepaydate");
            return (Criteria) this;
        }

        public Criteria andPrepaydateLessThan(Date value) {
            addCriterion("prePayDate <", value, "prepaydate");
            return (Criteria) this;
        }

        public Criteria andPrepaydateLessThanOrEqualTo(Date value) {
            addCriterion("prePayDate <=", value, "prepaydate");
            return (Criteria) this;
        }

        public Criteria andPrepaydateIn(List<Date> values) {
            addCriterion("prePayDate in", values, "prepaydate");
            return (Criteria) this;
        }

        public Criteria andPrepaydateNotIn(List<Date> values) {
            addCriterion("prePayDate not in", values, "prepaydate");
            return (Criteria) this;
        }

        public Criteria andPrepaydateBetween(Date value1, Date value2) {
            addCriterion("prePayDate between", value1, value2, "prepaydate");
            return (Criteria) this;
        }

        public Criteria andPrepaydateNotBetween(Date value1, Date value2) {
            addCriterion("prePayDate not between", value1, value2, "prepaydate");
            return (Criteria) this;
        }

        public Criteria andPrepaymoneyIsNull() {
            addCriterion("prePayMoney is null");
            return (Criteria) this;
        }

        public Criteria andPrepaymoneyIsNotNull() {
            addCriterion("prePayMoney is not null");
            return (Criteria) this;
        }

        public Criteria andPrepaymoneyEqualTo(Integer value) {
            addCriterion("prePayMoney =", value, "prepaymoney");
            return (Criteria) this;
        }

        public Criteria andPrepaymoneyNotEqualTo(Integer value) {
            addCriterion("prePayMoney <>", value, "prepaymoney");
            return (Criteria) this;
        }

        public Criteria andPrepaymoneyGreaterThan(Integer value) {
            addCriterion("prePayMoney >", value, "prepaymoney");
            return (Criteria) this;
        }

        public Criteria andPrepaymoneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("prePayMoney >=", value, "prepaymoney");
            return (Criteria) this;
        }

        public Criteria andPrepaymoneyLessThan(Integer value) {
            addCriterion("prePayMoney <", value, "prepaymoney");
            return (Criteria) this;
        }

        public Criteria andPrepaymoneyLessThanOrEqualTo(Integer value) {
            addCriterion("prePayMoney <=", value, "prepaymoney");
            return (Criteria) this;
        }

        public Criteria andPrepaymoneyIn(List<Integer> values) {
            addCriterion("prePayMoney in", values, "prepaymoney");
            return (Criteria) this;
        }

        public Criteria andPrepaymoneyNotIn(List<Integer> values) {
            addCriterion("prePayMoney not in", values, "prepaymoney");
            return (Criteria) this;
        }

        public Criteria andPrepaymoneyBetween(Integer value1, Integer value2) {
            addCriterion("prePayMoney between", value1, value2, "prepaymoney");
            return (Criteria) this;
        }

        public Criteria andPrepaymoneyNotBetween(Integer value1, Integer value2) {
            addCriterion("prePayMoney not between", value1, value2, "prepaymoney");
            return (Criteria) this;
        }

        public Criteria andLoanconfirmdateIsNull() {
            addCriterion("loanConfirmDate is null");
            return (Criteria) this;
        }

        public Criteria andLoanconfirmdateIsNotNull() {
            addCriterion("loanConfirmDate is not null");
            return (Criteria) this;
        }

        public Criteria andLoanconfirmdateEqualTo(Date value) {
            addCriterion("loanConfirmDate =", value, "loanconfirmdate");
            return (Criteria) this;
        }

        public Criteria andLoanconfirmdateNotEqualTo(Date value) {
            addCriterion("loanConfirmDate <>", value, "loanconfirmdate");
            return (Criteria) this;
        }

        public Criteria andLoanconfirmdateGreaterThan(Date value) {
            addCriterion("loanConfirmDate >", value, "loanconfirmdate");
            return (Criteria) this;
        }

        public Criteria andLoanconfirmdateGreaterThanOrEqualTo(Date value) {
            addCriterion("loanConfirmDate >=", value, "loanconfirmdate");
            return (Criteria) this;
        }

        public Criteria andLoanconfirmdateLessThan(Date value) {
            addCriterion("loanConfirmDate <", value, "loanconfirmdate");
            return (Criteria) this;
        }

        public Criteria andLoanconfirmdateLessThanOrEqualTo(Date value) {
            addCriterion("loanConfirmDate <=", value, "loanconfirmdate");
            return (Criteria) this;
        }

        public Criteria andLoanconfirmdateIn(List<Date> values) {
            addCriterion("loanConfirmDate in", values, "loanconfirmdate");
            return (Criteria) this;
        }

        public Criteria andLoanconfirmdateNotIn(List<Date> values) {
            addCriterion("loanConfirmDate not in", values, "loanconfirmdate");
            return (Criteria) this;
        }

        public Criteria andLoanconfirmdateBetween(Date value1, Date value2) {
            addCriterion("loanConfirmDate between", value1, value2, "loanconfirmdate");
            return (Criteria) this;
        }

        public Criteria andLoanconfirmdateNotBetween(Date value1, Date value2) {
            addCriterion("loanConfirmDate not between", value1, value2, "loanconfirmdate");
            return (Criteria) this;
        }

        public Criteria andReturnconfirmdateIsNull() {
            addCriterion("returnConfirmDate is null");
            return (Criteria) this;
        }

        public Criteria andReturnconfirmdateIsNotNull() {
            addCriterion("returnConfirmDate is not null");
            return (Criteria) this;
        }

        public Criteria andReturnconfirmdateEqualTo(Date value) {
            addCriterion("returnConfirmDate =", value, "returnconfirmdate");
            return (Criteria) this;
        }

        public Criteria andReturnconfirmdateNotEqualTo(Date value) {
            addCriterion("returnConfirmDate <>", value, "returnconfirmdate");
            return (Criteria) this;
        }

        public Criteria andReturnconfirmdateGreaterThan(Date value) {
            addCriterion("returnConfirmDate >", value, "returnconfirmdate");
            return (Criteria) this;
        }

        public Criteria andReturnconfirmdateGreaterThanOrEqualTo(Date value) {
            addCriterion("returnConfirmDate >=", value, "returnconfirmdate");
            return (Criteria) this;
        }

        public Criteria andReturnconfirmdateLessThan(Date value) {
            addCriterion("returnConfirmDate <", value, "returnconfirmdate");
            return (Criteria) this;
        }

        public Criteria andReturnconfirmdateLessThanOrEqualTo(Date value) {
            addCriterion("returnConfirmDate <=", value, "returnconfirmdate");
            return (Criteria) this;
        }

        public Criteria andReturnconfirmdateIn(List<Date> values) {
            addCriterion("returnConfirmDate in", values, "returnconfirmdate");
            return (Criteria) this;
        }

        public Criteria andReturnconfirmdateNotIn(List<Date> values) {
            addCriterion("returnConfirmDate not in", values, "returnconfirmdate");
            return (Criteria) this;
        }

        public Criteria andReturnconfirmdateBetween(Date value1, Date value2) {
            addCriterion("returnConfirmDate between", value1, value2, "returnconfirmdate");
            return (Criteria) this;
        }

        public Criteria andReturnconfirmdateNotBetween(Date value1, Date value2) {
            addCriterion("returnConfirmDate not between", value1, value2, "returnconfirmdate");
            return (Criteria) this;
        }

        public Criteria andAdjustmentIsNull() {
            addCriterion("adjustment is null");
            return (Criteria) this;
        }

        public Criteria andAdjustmentIsNotNull() {
            addCriterion("adjustment is not null");
            return (Criteria) this;
        }

        public Criteria andAdjustmentEqualTo(Integer value) {
            addCriterion("adjustment =", value, "adjustment");
            return (Criteria) this;
        }

        public Criteria andAdjustmentNotEqualTo(Integer value) {
            addCriterion("adjustment <>", value, "adjustment");
            return (Criteria) this;
        }

        public Criteria andAdjustmentGreaterThan(Integer value) {
            addCriterion("adjustment >", value, "adjustment");
            return (Criteria) this;
        }

        public Criteria andAdjustmentGreaterThanOrEqualTo(Integer value) {
            addCriterion("adjustment >=", value, "adjustment");
            return (Criteria) this;
        }

        public Criteria andAdjustmentLessThan(Integer value) {
            addCriterion("adjustment <", value, "adjustment");
            return (Criteria) this;
        }

        public Criteria andAdjustmentLessThanOrEqualTo(Integer value) {
            addCriterion("adjustment <=", value, "adjustment");
            return (Criteria) this;
        }

        public Criteria andAdjustmentIn(List<Integer> values) {
            addCriterion("adjustment in", values, "adjustment");
            return (Criteria) this;
        }

        public Criteria andAdjustmentNotIn(List<Integer> values) {
            addCriterion("adjustment not in", values, "adjustment");
            return (Criteria) this;
        }

        public Criteria andAdjustmentBetween(Integer value1, Integer value2) {
            addCriterion("adjustment between", value1, value2, "adjustment");
            return (Criteria) this;
        }

        public Criteria andAdjustmentNotBetween(Integer value1, Integer value2) {
            addCriterion("adjustment not between", value1, value2, "adjustment");
            return (Criteria) this;
        }

        public Criteria andRealpaymoneyIsNull() {
            addCriterion("realPayMoney is null");
            return (Criteria) this;
        }

        public Criteria andRealpaymoneyIsNotNull() {
            addCriterion("realPayMoney is not null");
            return (Criteria) this;
        }

        public Criteria andRealpaymoneyEqualTo(Integer value) {
            addCriterion("realPayMoney =", value, "realpaymoney");
            return (Criteria) this;
        }

        public Criteria andRealpaymoneyNotEqualTo(Integer value) {
            addCriterion("realPayMoney <>", value, "realpaymoney");
            return (Criteria) this;
        }

        public Criteria andRealpaymoneyGreaterThan(Integer value) {
            addCriterion("realPayMoney >", value, "realpaymoney");
            return (Criteria) this;
        }

        public Criteria andRealpaymoneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("realPayMoney >=", value, "realpaymoney");
            return (Criteria) this;
        }

        public Criteria andRealpaymoneyLessThan(Integer value) {
            addCriterion("realPayMoney <", value, "realpaymoney");
            return (Criteria) this;
        }

        public Criteria andRealpaymoneyLessThanOrEqualTo(Integer value) {
            addCriterion("realPayMoney <=", value, "realpaymoney");
            return (Criteria) this;
        }

        public Criteria andRealpaymoneyIn(List<Integer> values) {
            addCriterion("realPayMoney in", values, "realpaymoney");
            return (Criteria) this;
        }

        public Criteria andRealpaymoneyNotIn(List<Integer> values) {
            addCriterion("realPayMoney not in", values, "realpaymoney");
            return (Criteria) this;
        }

        public Criteria andRealpaymoneyBetween(Integer value1, Integer value2) {
            addCriterion("realPayMoney between", value1, value2, "realpaymoney");
            return (Criteria) this;
        }

        public Criteria andRealpaymoneyNotBetween(Integer value1, Integer value2) {
            addCriterion("realPayMoney not between", value1, value2, "realpaymoney");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
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