package com.rent.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderExample() {
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

        public Criteria andOdIdIsNull() {
            addCriterion("od_Id is null");
            return (Criteria) this;
        }

        public Criteria andOdIdIsNotNull() {
            addCriterion("od_Id is not null");
            return (Criteria) this;
        }

        public Criteria andOdIdEqualTo(Integer value) {
            addCriterion("od_Id =", value, "odId");
            return (Criteria) this;
        }

        public Criteria andOdIdNotEqualTo(Integer value) {
            addCriterion("od_Id <>", value, "odId");
            return (Criteria) this;
        }

        public Criteria andOdIdGreaterThan(Integer value) {
            addCriterion("od_Id >", value, "odId");
            return (Criteria) this;
        }

        public Criteria andOdIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("od_Id >=", value, "odId");
            return (Criteria) this;
        }

        public Criteria andOdIdLessThan(Integer value) {
            addCriterion("od_Id <", value, "odId");
            return (Criteria) this;
        }

        public Criteria andOdIdLessThanOrEqualTo(Integer value) {
            addCriterion("od_Id <=", value, "odId");
            return (Criteria) this;
        }

        public Criteria andOdIdIn(List<Integer> values) {
            addCriterion("od_Id in", values, "odId");
            return (Criteria) this;
        }

        public Criteria andOdIdNotIn(List<Integer> values) {
            addCriterion("od_Id not in", values, "odId");
            return (Criteria) this;
        }

        public Criteria andOdIdBetween(Integer value1, Integer value2) {
            addCriterion("od_Id between", value1, value2, "odId");
            return (Criteria) this;
        }

        public Criteria andOdIdNotBetween(Integer value1, Integer value2) {
            addCriterion("od_Id not between", value1, value2, "odId");
            return (Criteria) this;
        }

        public Criteria andOdOrdertimeIsNull() {
            addCriterion("od_OrderTime is null");
            return (Criteria) this;
        }

        public Criteria andOdOrdertimeIsNotNull() {
            addCriterion("od_OrderTime is not null");
            return (Criteria) this;
        }

        public Criteria andOdOrdertimeEqualTo(Date value) {
            addCriterion("od_OrderTime =", value, "odOrdertime");
            return (Criteria) this;
        }

        public Criteria andOdOrdertimeNotEqualTo(Date value) {
            addCriterion("od_OrderTime <>", value, "odOrdertime");
            return (Criteria) this;
        }

        public Criteria andOdOrdertimeGreaterThan(Date value) {
            addCriterion("od_OrderTime >", value, "odOrdertime");
            return (Criteria) this;
        }

        public Criteria andOdOrdertimeGreaterThanOrEqualTo(Date value) {
            addCriterion("od_OrderTime >=", value, "odOrdertime");
            return (Criteria) this;
        }

        public Criteria andOdOrdertimeLessThan(Date value) {
            addCriterion("od_OrderTime <", value, "odOrdertime");
            return (Criteria) this;
        }

        public Criteria andOdOrdertimeLessThanOrEqualTo(Date value) {
            addCriterion("od_OrderTime <=", value, "odOrdertime");
            return (Criteria) this;
        }

        public Criteria andOdOrdertimeIn(List<Date> values) {
            addCriterion("od_OrderTime in", values, "odOrdertime");
            return (Criteria) this;
        }

        public Criteria andOdOrdertimeNotIn(List<Date> values) {
            addCriterion("od_OrderTime not in", values, "odOrdertime");
            return (Criteria) this;
        }

        public Criteria andOdOrdertimeBetween(Date value1, Date value2) {
            addCriterion("od_OrderTime between", value1, value2, "odOrdertime");
            return (Criteria) this;
        }

        public Criteria andOdOrdertimeNotBetween(Date value1, Date value2) {
            addCriterion("od_OrderTime not between", value1, value2, "odOrdertime");
            return (Criteria) this;
        }

        public Criteria andUifIdIsNull() {
            addCriterion("uif_Id is null");
            return (Criteria) this;
        }

        public Criteria andUifIdIsNotNull() {
            addCriterion("uif_Id is not null");
            return (Criteria) this;
        }

        public Criteria andUifIdEqualTo(Integer value) {
            addCriterion("uif_Id =", value, "uifId");
            return (Criteria) this;
        }

        public Criteria andUifIdNotEqualTo(Integer value) {
            addCriterion("uif_Id <>", value, "uifId");
            return (Criteria) this;
        }

        public Criteria andUifIdGreaterThan(Integer value) {
            addCriterion("uif_Id >", value, "uifId");
            return (Criteria) this;
        }

        public Criteria andUifIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("uif_Id >=", value, "uifId");
            return (Criteria) this;
        }

        public Criteria andUifIdLessThan(Integer value) {
            addCriterion("uif_Id <", value, "uifId");
            return (Criteria) this;
        }

        public Criteria andUifIdLessThanOrEqualTo(Integer value) {
            addCriterion("uif_Id <=", value, "uifId");
            return (Criteria) this;
        }

        public Criteria andUifIdIn(List<Integer> values) {
            addCriterion("uif_Id in", values, "uifId");
            return (Criteria) this;
        }

        public Criteria andUifIdNotIn(List<Integer> values) {
            addCriterion("uif_Id not in", values, "uifId");
            return (Criteria) this;
        }

        public Criteria andUifIdBetween(Integer value1, Integer value2) {
            addCriterion("uif_Id between", value1, value2, "uifId");
            return (Criteria) this;
        }

        public Criteria andUifIdNotBetween(Integer value1, Integer value2) {
            addCriterion("uif_Id not between", value1, value2, "uifId");
            return (Criteria) this;
        }

        public Criteria andHhifIdIsNull() {
            addCriterion("hhif_Id is null");
            return (Criteria) this;
        }

        public Criteria andHhifIdIsNotNull() {
            addCriterion("hhif_Id is not null");
            return (Criteria) this;
        }

        public Criteria andHhifIdEqualTo(Integer value) {
            addCriterion("hhif_Id =", value, "hhifId");
            return (Criteria) this;
        }

        public Criteria andHhifIdNotEqualTo(Integer value) {
            addCriterion("hhif_Id <>", value, "hhifId");
            return (Criteria) this;
        }

        public Criteria andHhifIdGreaterThan(Integer value) {
            addCriterion("hhif_Id >", value, "hhifId");
            return (Criteria) this;
        }

        public Criteria andHhifIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("hhif_Id >=", value, "hhifId");
            return (Criteria) this;
        }

        public Criteria andHhifIdLessThan(Integer value) {
            addCriterion("hhif_Id <", value, "hhifId");
            return (Criteria) this;
        }

        public Criteria andHhifIdLessThanOrEqualTo(Integer value) {
            addCriterion("hhif_Id <=", value, "hhifId");
            return (Criteria) this;
        }

        public Criteria andHhifIdIn(List<Integer> values) {
            addCriterion("hhif_Id in", values, "hhifId");
            return (Criteria) this;
        }

        public Criteria andHhifIdNotIn(List<Integer> values) {
            addCriterion("hhif_Id not in", values, "hhifId");
            return (Criteria) this;
        }

        public Criteria andHhifIdBetween(Integer value1, Integer value2) {
            addCriterion("hhif_Id between", value1, value2, "hhifId");
            return (Criteria) this;
        }

        public Criteria andHhifIdNotBetween(Integer value1, Integer value2) {
            addCriterion("hhif_Id not between", value1, value2, "hhifId");
            return (Criteria) this;
        }

        public Criteria andOdBooktimeIsNull() {
            addCriterion("od_BookTime is null");
            return (Criteria) this;
        }

        public Criteria andOdBooktimeIsNotNull() {
            addCriterion("od_BookTime is not null");
            return (Criteria) this;
        }

        public Criteria andOdBooktimeEqualTo(Date value) {
            addCriterion("od_BookTime =", value, "odBooktime");
            return (Criteria) this;
        }

        public Criteria andOdBooktimeNotEqualTo(Date value) {
            addCriterion("od_BookTime <>", value, "odBooktime");
            return (Criteria) this;
        }

        public Criteria andOdBooktimeGreaterThan(Date value) {
            addCriterion("od_BookTime >", value, "odBooktime");
            return (Criteria) this;
        }

        public Criteria andOdBooktimeGreaterThanOrEqualTo(Date value) {
            addCriterion("od_BookTime >=", value, "odBooktime");
            return (Criteria) this;
        }

        public Criteria andOdBooktimeLessThan(Date value) {
            addCriterion("od_BookTime <", value, "odBooktime");
            return (Criteria) this;
        }

        public Criteria andOdBooktimeLessThanOrEqualTo(Date value) {
            addCriterion("od_BookTime <=", value, "odBooktime");
            return (Criteria) this;
        }

        public Criteria andOdBooktimeIn(List<Date> values) {
            addCriterion("od_BookTime in", values, "odBooktime");
            return (Criteria) this;
        }

        public Criteria andOdBooktimeNotIn(List<Date> values) {
            addCriterion("od_BookTime not in", values, "odBooktime");
            return (Criteria) this;
        }

        public Criteria andOdBooktimeBetween(Date value1, Date value2) {
            addCriterion("od_BookTime between", value1, value2, "odBooktime");
            return (Criteria) this;
        }

        public Criteria andOdBooktimeNotBetween(Date value1, Date value2) {
            addCriterion("od_BookTime not between", value1, value2, "odBooktime");
            return (Criteria) this;
        }

        public Criteria andOdDurationIsNull() {
            addCriterion("od_duration is null");
            return (Criteria) this;
        }

        public Criteria andOdDurationIsNotNull() {
            addCriterion("od_duration is not null");
            return (Criteria) this;
        }

        public Criteria andOdDurationEqualTo(Integer value) {
            addCriterion("od_duration =", value, "odDuration");
            return (Criteria) this;
        }

        public Criteria andOdDurationNotEqualTo(Integer value) {
            addCriterion("od_duration <>", value, "odDuration");
            return (Criteria) this;
        }

        public Criteria andOdDurationGreaterThan(Integer value) {
            addCriterion("od_duration >", value, "odDuration");
            return (Criteria) this;
        }

        public Criteria andOdDurationGreaterThanOrEqualTo(Integer value) {
            addCriterion("od_duration >=", value, "odDuration");
            return (Criteria) this;
        }

        public Criteria andOdDurationLessThan(Integer value) {
            addCriterion("od_duration <", value, "odDuration");
            return (Criteria) this;
        }

        public Criteria andOdDurationLessThanOrEqualTo(Integer value) {
            addCriterion("od_duration <=", value, "odDuration");
            return (Criteria) this;
        }

        public Criteria andOdDurationIn(List<Integer> values) {
            addCriterion("od_duration in", values, "odDuration");
            return (Criteria) this;
        }

        public Criteria andOdDurationNotIn(List<Integer> values) {
            addCriterion("od_duration not in", values, "odDuration");
            return (Criteria) this;
        }

        public Criteria andOdDurationBetween(Integer value1, Integer value2) {
            addCriterion("od_duration between", value1, value2, "odDuration");
            return (Criteria) this;
        }

        public Criteria andOdDurationNotBetween(Integer value1, Integer value2) {
            addCriterion("od_duration not between", value1, value2, "odDuration");
            return (Criteria) this;
        }

        public Criteria andHsIdIsNull() {
            addCriterion("hs_Id is null");
            return (Criteria) this;
        }

        public Criteria andHsIdIsNotNull() {
            addCriterion("hs_Id is not null");
            return (Criteria) this;
        }

        public Criteria andHsIdEqualTo(Integer value) {
            addCriterion("hs_Id =", value, "hsId");
            return (Criteria) this;
        }

        public Criteria andHsIdNotEqualTo(Integer value) {
            addCriterion("hs_Id <>", value, "hsId");
            return (Criteria) this;
        }

        public Criteria andHsIdGreaterThan(Integer value) {
            addCriterion("hs_Id >", value, "hsId");
            return (Criteria) this;
        }

        public Criteria andHsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("hs_Id >=", value, "hsId");
            return (Criteria) this;
        }

        public Criteria andHsIdLessThan(Integer value) {
            addCriterion("hs_Id <", value, "hsId");
            return (Criteria) this;
        }

        public Criteria andHsIdLessThanOrEqualTo(Integer value) {
            addCriterion("hs_Id <=", value, "hsId");
            return (Criteria) this;
        }

        public Criteria andHsIdIn(List<Integer> values) {
            addCriterion("hs_Id in", values, "hsId");
            return (Criteria) this;
        }

        public Criteria andHsIdNotIn(List<Integer> values) {
            addCriterion("hs_Id not in", values, "hsId");
            return (Criteria) this;
        }

        public Criteria andHsIdBetween(Integer value1, Integer value2) {
            addCriterion("hs_Id between", value1, value2, "hsId");
            return (Criteria) this;
        }

        public Criteria andHsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("hs_Id not between", value1, value2, "hsId");
            return (Criteria) this;
        }

        public Criteria andOdRentIsNull() {
            addCriterion("od_Rent is null");
            return (Criteria) this;
        }

        public Criteria andOdRentIsNotNull() {
            addCriterion("od_Rent is not null");
            return (Criteria) this;
        }

        public Criteria andOdRentEqualTo(Integer value) {
            addCriterion("od_Rent =", value, "odRent");
            return (Criteria) this;
        }

        public Criteria andOdRentNotEqualTo(Integer value) {
            addCriterion("od_Rent <>", value, "odRent");
            return (Criteria) this;
        }

        public Criteria andOdRentGreaterThan(Integer value) {
            addCriterion("od_Rent >", value, "odRent");
            return (Criteria) this;
        }

        public Criteria andOdRentGreaterThanOrEqualTo(Integer value) {
            addCriterion("od_Rent >=", value, "odRent");
            return (Criteria) this;
        }

        public Criteria andOdRentLessThan(Integer value) {
            addCriterion("od_Rent <", value, "odRent");
            return (Criteria) this;
        }

        public Criteria andOdRentLessThanOrEqualTo(Integer value) {
            addCriterion("od_Rent <=", value, "odRent");
            return (Criteria) this;
        }

        public Criteria andOdRentIn(List<Integer> values) {
            addCriterion("od_Rent in", values, "odRent");
            return (Criteria) this;
        }

        public Criteria andOdRentNotIn(List<Integer> values) {
            addCriterion("od_Rent not in", values, "odRent");
            return (Criteria) this;
        }

        public Criteria andOdRentBetween(Integer value1, Integer value2) {
            addCriterion("od_Rent between", value1, value2, "odRent");
            return (Criteria) this;
        }

        public Criteria andOdRentNotBetween(Integer value1, Integer value2) {
            addCriterion("od_Rent not between", value1, value2, "odRent");
            return (Criteria) this;
        }

        public Criteria andOdStatusIsNull() {
            addCriterion("od_Status is null");
            return (Criteria) this;
        }

        public Criteria andOdStatusIsNotNull() {
            addCriterion("od_Status is not null");
            return (Criteria) this;
        }

        public Criteria andOdStatusEqualTo(Integer value) {
            addCriterion("od_Status =", value, "odStatus");
            return (Criteria) this;
        }

        public Criteria andOdStatusNotEqualTo(Integer value) {
            addCriterion("od_Status <>", value, "odStatus");
            return (Criteria) this;
        }

        public Criteria andOdStatusGreaterThan(Integer value) {
            addCriterion("od_Status >", value, "odStatus");
            return (Criteria) this;
        }

        public Criteria andOdStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("od_Status >=", value, "odStatus");
            return (Criteria) this;
        }

        public Criteria andOdStatusLessThan(Integer value) {
            addCriterion("od_Status <", value, "odStatus");
            return (Criteria) this;
        }

        public Criteria andOdStatusLessThanOrEqualTo(Integer value) {
            addCriterion("od_Status <=", value, "odStatus");
            return (Criteria) this;
        }

        public Criteria andOdStatusIn(List<Integer> values) {
            addCriterion("od_Status in", values, "odStatus");
            return (Criteria) this;
        }

        public Criteria andOdStatusNotIn(List<Integer> values) {
            addCriterion("od_Status not in", values, "odStatus");
            return (Criteria) this;
        }

        public Criteria andOdStatusBetween(Integer value1, Integer value2) {
            addCriterion("od_Status between", value1, value2, "odStatus");
            return (Criteria) this;
        }

        public Criteria andOdStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("od_Status not between", value1, value2, "odStatus");
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