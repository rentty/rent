package com.rent.bean;

import java.util.ArrayList;
import java.util.List;

public class HouseholdinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HouseholdinfoExample() {
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

        public Criteria andHhifNameIsNull() {
            addCriterion("hhif_Name is null");
            return (Criteria) this;
        }

        public Criteria andHhifNameIsNotNull() {
            addCriterion("hhif_Name is not null");
            return (Criteria) this;
        }

        public Criteria andHhifNameEqualTo(String value) {
            addCriterion("hhif_Name =", value, "hhifName");
            return (Criteria) this;
        }

        public Criteria andHhifNameNotEqualTo(String value) {
            addCriterion("hhif_Name <>", value, "hhifName");
            return (Criteria) this;
        }

        public Criteria andHhifNameGreaterThan(String value) {
            addCriterion("hhif_Name >", value, "hhifName");
            return (Criteria) this;
        }

        public Criteria andHhifNameGreaterThanOrEqualTo(String value) {
            addCriterion("hhif_Name >=", value, "hhifName");
            return (Criteria) this;
        }

        public Criteria andHhifNameLessThan(String value) {
            addCriterion("hhif_Name <", value, "hhifName");
            return (Criteria) this;
        }

        public Criteria andHhifNameLessThanOrEqualTo(String value) {
            addCriterion("hhif_Name <=", value, "hhifName");
            return (Criteria) this;
        }

        public Criteria andHhifNameLike(String value) {
            addCriterion("hhif_Name like", value, "hhifName");
            return (Criteria) this;
        }

        public Criteria andHhifNameNotLike(String value) {
            addCriterion("hhif_Name not like", value, "hhifName");
            return (Criteria) this;
        }

        public Criteria andHhifNameIn(List<String> values) {
            addCriterion("hhif_Name in", values, "hhifName");
            return (Criteria) this;
        }

        public Criteria andHhifNameNotIn(List<String> values) {
            addCriterion("hhif_Name not in", values, "hhifName");
            return (Criteria) this;
        }

        public Criteria andHhifNameBetween(String value1, String value2) {
            addCriterion("hhif_Name between", value1, value2, "hhifName");
            return (Criteria) this;
        }

        public Criteria andHhifNameNotBetween(String value1, String value2) {
            addCriterion("hhif_Name not between", value1, value2, "hhifName");
            return (Criteria) this;
        }

        public Criteria andHhifIdcardIsNull() {
            addCriterion("hhif_IdCard is null");
            return (Criteria) this;
        }

        public Criteria andHhifIdcardIsNotNull() {
            addCriterion("hhif_IdCard is not null");
            return (Criteria) this;
        }

        public Criteria andHhifIdcardEqualTo(String value) {
            addCriterion("hhif_IdCard =", value, "hhifIdcard");
            return (Criteria) this;
        }

        public Criteria andHhifIdcardNotEqualTo(String value) {
            addCriterion("hhif_IdCard <>", value, "hhifIdcard");
            return (Criteria) this;
        }

        public Criteria andHhifIdcardGreaterThan(String value) {
            addCriterion("hhif_IdCard >", value, "hhifIdcard");
            return (Criteria) this;
        }

        public Criteria andHhifIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("hhif_IdCard >=", value, "hhifIdcard");
            return (Criteria) this;
        }

        public Criteria andHhifIdcardLessThan(String value) {
            addCriterion("hhif_IdCard <", value, "hhifIdcard");
            return (Criteria) this;
        }

        public Criteria andHhifIdcardLessThanOrEqualTo(String value) {
            addCriterion("hhif_IdCard <=", value, "hhifIdcard");
            return (Criteria) this;
        }

        public Criteria andHhifIdcardLike(String value) {
            addCriterion("hhif_IdCard like", value, "hhifIdcard");
            return (Criteria) this;
        }

        public Criteria andHhifIdcardNotLike(String value) {
            addCriterion("hhif_IdCard not like", value, "hhifIdcard");
            return (Criteria) this;
        }

        public Criteria andHhifIdcardIn(List<String> values) {
            addCriterion("hhif_IdCard in", values, "hhifIdcard");
            return (Criteria) this;
        }

        public Criteria andHhifIdcardNotIn(List<String> values) {
            addCriterion("hhif_IdCard not in", values, "hhifIdcard");
            return (Criteria) this;
        }

        public Criteria andHhifIdcardBetween(String value1, String value2) {
            addCriterion("hhif_IdCard between", value1, value2, "hhifIdcard");
            return (Criteria) this;
        }

        public Criteria andHhifIdcardNotBetween(String value1, String value2) {
            addCriterion("hhif_IdCard not between", value1, value2, "hhifIdcard");
            return (Criteria) this;
        }

        public Criteria andHhifDeedIsNull() {
            addCriterion("hhif_Deed is null");
            return (Criteria) this;
        }

        public Criteria andHhifDeedIsNotNull() {
            addCriterion("hhif_Deed is not null");
            return (Criteria) this;
        }

        public Criteria andHhifDeedEqualTo(String value) {
            addCriterion("hhif_Deed =", value, "hhifDeed");
            return (Criteria) this;
        }

        public Criteria andHhifDeedNotEqualTo(String value) {
            addCriterion("hhif_Deed <>", value, "hhifDeed");
            return (Criteria) this;
        }

        public Criteria andHhifDeedGreaterThan(String value) {
            addCriterion("hhif_Deed >", value, "hhifDeed");
            return (Criteria) this;
        }

        public Criteria andHhifDeedGreaterThanOrEqualTo(String value) {
            addCriterion("hhif_Deed >=", value, "hhifDeed");
            return (Criteria) this;
        }

        public Criteria andHhifDeedLessThan(String value) {
            addCriterion("hhif_Deed <", value, "hhifDeed");
            return (Criteria) this;
        }

        public Criteria andHhifDeedLessThanOrEqualTo(String value) {
            addCriterion("hhif_Deed <=", value, "hhifDeed");
            return (Criteria) this;
        }

        public Criteria andHhifDeedLike(String value) {
            addCriterion("hhif_Deed like", value, "hhifDeed");
            return (Criteria) this;
        }

        public Criteria andHhifDeedNotLike(String value) {
            addCriterion("hhif_Deed not like", value, "hhifDeed");
            return (Criteria) this;
        }

        public Criteria andHhifDeedIn(List<String> values) {
            addCriterion("hhif_Deed in", values, "hhifDeed");
            return (Criteria) this;
        }

        public Criteria andHhifDeedNotIn(List<String> values) {
            addCriterion("hhif_Deed not in", values, "hhifDeed");
            return (Criteria) this;
        }

        public Criteria andHhifDeedBetween(String value1, String value2) {
            addCriterion("hhif_Deed between", value1, value2, "hhifDeed");
            return (Criteria) this;
        }

        public Criteria andHhifDeedNotBetween(String value1, String value2) {
            addCriterion("hhif_Deed not between", value1, value2, "hhifDeed");
            return (Criteria) this;
        }

        public Criteria andHhifPhoneIsNull() {
            addCriterion("hhif_Phone is null");
            return (Criteria) this;
        }

        public Criteria andHhifPhoneIsNotNull() {
            addCriterion("hhif_Phone is not null");
            return (Criteria) this;
        }

        public Criteria andHhifPhoneEqualTo(String value) {
            addCriterion("hhif_Phone =", value, "hhifPhone");
            return (Criteria) this;
        }

        public Criteria andHhifPhoneNotEqualTo(String value) {
            addCriterion("hhif_Phone <>", value, "hhifPhone");
            return (Criteria) this;
        }

        public Criteria andHhifPhoneGreaterThan(String value) {
            addCriterion("hhif_Phone >", value, "hhifPhone");
            return (Criteria) this;
        }

        public Criteria andHhifPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("hhif_Phone >=", value, "hhifPhone");
            return (Criteria) this;
        }

        public Criteria andHhifPhoneLessThan(String value) {
            addCriterion("hhif_Phone <", value, "hhifPhone");
            return (Criteria) this;
        }

        public Criteria andHhifPhoneLessThanOrEqualTo(String value) {
            addCriterion("hhif_Phone <=", value, "hhifPhone");
            return (Criteria) this;
        }

        public Criteria andHhifPhoneLike(String value) {
            addCriterion("hhif_Phone like", value, "hhifPhone");
            return (Criteria) this;
        }

        public Criteria andHhifPhoneNotLike(String value) {
            addCriterion("hhif_Phone not like", value, "hhifPhone");
            return (Criteria) this;
        }

        public Criteria andHhifPhoneIn(List<String> values) {
            addCriterion("hhif_Phone in", values, "hhifPhone");
            return (Criteria) this;
        }

        public Criteria andHhifPhoneNotIn(List<String> values) {
            addCriterion("hhif_Phone not in", values, "hhifPhone");
            return (Criteria) this;
        }

        public Criteria andHhifPhoneBetween(String value1, String value2) {
            addCriterion("hhif_Phone between", value1, value2, "hhifPhone");
            return (Criteria) this;
        }

        public Criteria andHhifPhoneNotBetween(String value1, String value2) {
            addCriterion("hhif_Phone not between", value1, value2, "hhifPhone");
            return (Criteria) this;
        }

        public Criteria andHhifStatusIsNull() {
            addCriterion("hhif_Status is null");
            return (Criteria) this;
        }

        public Criteria andHhifStatusIsNotNull() {
            addCriterion("hhif_Status is not null");
            return (Criteria) this;
        }

        public Criteria andHhifStatusEqualTo(Integer value) {
            addCriterion("hhif_Status =", value, "hhifStatus");
            return (Criteria) this;
        }

        public Criteria andHhifStatusNotEqualTo(Integer value) {
            addCriterion("hhif_Status <>", value, "hhifStatus");
            return (Criteria) this;
        }

        public Criteria andHhifStatusGreaterThan(Integer value) {
            addCriterion("hhif_Status >", value, "hhifStatus");
            return (Criteria) this;
        }

        public Criteria andHhifStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("hhif_Status >=", value, "hhifStatus");
            return (Criteria) this;
        }

        public Criteria andHhifStatusLessThan(Integer value) {
            addCriterion("hhif_Status <", value, "hhifStatus");
            return (Criteria) this;
        }

        public Criteria andHhifStatusLessThanOrEqualTo(Integer value) {
            addCriterion("hhif_Status <=", value, "hhifStatus");
            return (Criteria) this;
        }

        public Criteria andHhifStatusIn(List<Integer> values) {
            addCriterion("hhif_Status in", values, "hhifStatus");
            return (Criteria) this;
        }

        public Criteria andHhifStatusNotIn(List<Integer> values) {
            addCriterion("hhif_Status not in", values, "hhifStatus");
            return (Criteria) this;
        }

        public Criteria andHhifStatusBetween(Integer value1, Integer value2) {
            addCriterion("hhif_Status between", value1, value2, "hhifStatus");
            return (Criteria) this;
        }

        public Criteria andHhifStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("hhif_Status not between", value1, value2, "hhifStatus");
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