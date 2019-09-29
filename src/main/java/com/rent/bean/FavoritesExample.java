package com.rent.bean;

import java.util.ArrayList;
import java.util.List;

public class FavoritesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FavoritesExample() {
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

        public Criteria andFvrIdIsNull() {
            addCriterion("fvr_Id is null");
            return (Criteria) this;
        }

        public Criteria andFvrIdIsNotNull() {
            addCriterion("fvr_Id is not null");
            return (Criteria) this;
        }

        public Criteria andFvrIdEqualTo(Integer value) {
            addCriterion("fvr_Id =", value, "fvrId");
            return (Criteria) this;
        }

        public Criteria andFvrIdNotEqualTo(Integer value) {
            addCriterion("fvr_Id <>", value, "fvrId");
            return (Criteria) this;
        }

        public Criteria andFvrIdGreaterThan(Integer value) {
            addCriterion("fvr_Id >", value, "fvrId");
            return (Criteria) this;
        }

        public Criteria andFvrIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("fvr_Id >=", value, "fvrId");
            return (Criteria) this;
        }

        public Criteria andFvrIdLessThan(Integer value) {
            addCriterion("fvr_Id <", value, "fvrId");
            return (Criteria) this;
        }

        public Criteria andFvrIdLessThanOrEqualTo(Integer value) {
            addCriterion("fvr_Id <=", value, "fvrId");
            return (Criteria) this;
        }

        public Criteria andFvrIdIn(List<Integer> values) {
            addCriterion("fvr_Id in", values, "fvrId");
            return (Criteria) this;
        }

        public Criteria andFvrIdNotIn(List<Integer> values) {
            addCriterion("fvr_Id not in", values, "fvrId");
            return (Criteria) this;
        }

        public Criteria andFvrIdBetween(Integer value1, Integer value2) {
            addCriterion("fvr_Id between", value1, value2, "fvrId");
            return (Criteria) this;
        }

        public Criteria andFvrIdNotBetween(Integer value1, Integer value2) {
            addCriterion("fvr_Id not between", value1, value2, "fvrId");
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