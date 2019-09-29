package com.rent.bean;

import java.util.ArrayList;
import java.util.List;

public class HousenumExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HousenumExample() {
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

        public Criteria andHsnIdIsNull() {
            addCriterion("hsn_Id is null");
            return (Criteria) this;
        }

        public Criteria andHsnIdIsNotNull() {
            addCriterion("hsn_Id is not null");
            return (Criteria) this;
        }

        public Criteria andHsnIdEqualTo(Integer value) {
            addCriterion("hsn_Id =", value, "hsnId");
            return (Criteria) this;
        }

        public Criteria andHsnIdNotEqualTo(Integer value) {
            addCriterion("hsn_Id <>", value, "hsnId");
            return (Criteria) this;
        }

        public Criteria andHsnIdGreaterThan(Integer value) {
            addCriterion("hsn_Id >", value, "hsnId");
            return (Criteria) this;
        }

        public Criteria andHsnIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("hsn_Id >=", value, "hsnId");
            return (Criteria) this;
        }

        public Criteria andHsnIdLessThan(Integer value) {
            addCriterion("hsn_Id <", value, "hsnId");
            return (Criteria) this;
        }

        public Criteria andHsnIdLessThanOrEqualTo(Integer value) {
            addCriterion("hsn_Id <=", value, "hsnId");
            return (Criteria) this;
        }

        public Criteria andHsnIdIn(List<Integer> values) {
            addCriterion("hsn_Id in", values, "hsnId");
            return (Criteria) this;
        }

        public Criteria andHsnIdNotIn(List<Integer> values) {
            addCriterion("hsn_Id not in", values, "hsnId");
            return (Criteria) this;
        }

        public Criteria andHsnIdBetween(Integer value1, Integer value2) {
            addCriterion("hsn_Id between", value1, value2, "hsnId");
            return (Criteria) this;
        }

        public Criteria andHsnIdNotBetween(Integer value1, Integer value2) {
            addCriterion("hsn_Id not between", value1, value2, "hsnId");
            return (Criteria) this;
        }

        public Criteria andHsnRegionIsNull() {
            addCriterion("hsn_Region is null");
            return (Criteria) this;
        }

        public Criteria andHsnRegionIsNotNull() {
            addCriterion("hsn_Region is not null");
            return (Criteria) this;
        }

        public Criteria andHsnRegionEqualTo(String value) {
            addCriterion("hsn_Region =", value, "hsnRegion");
            return (Criteria) this;
        }

        public Criteria andHsnRegionNotEqualTo(String value) {
            addCriterion("hsn_Region <>", value, "hsnRegion");
            return (Criteria) this;
        }

        public Criteria andHsnRegionGreaterThan(String value) {
            addCriterion("hsn_Region >", value, "hsnRegion");
            return (Criteria) this;
        }

        public Criteria andHsnRegionGreaterThanOrEqualTo(String value) {
            addCriterion("hsn_Region >=", value, "hsnRegion");
            return (Criteria) this;
        }

        public Criteria andHsnRegionLessThan(String value) {
            addCriterion("hsn_Region <", value, "hsnRegion");
            return (Criteria) this;
        }

        public Criteria andHsnRegionLessThanOrEqualTo(String value) {
            addCriterion("hsn_Region <=", value, "hsnRegion");
            return (Criteria) this;
        }

        public Criteria andHsnRegionLike(String value) {
            addCriterion("hsn_Region like", value, "hsnRegion");
            return (Criteria) this;
        }

        public Criteria andHsnRegionNotLike(String value) {
            addCriterion("hsn_Region not like", value, "hsnRegion");
            return (Criteria) this;
        }

        public Criteria andHsnRegionIn(List<String> values) {
            addCriterion("hsn_Region in", values, "hsnRegion");
            return (Criteria) this;
        }

        public Criteria andHsnRegionNotIn(List<String> values) {
            addCriterion("hsn_Region not in", values, "hsnRegion");
            return (Criteria) this;
        }

        public Criteria andHsnRegionBetween(String value1, String value2) {
            addCriterion("hsn_Region between", value1, value2, "hsnRegion");
            return (Criteria) this;
        }

        public Criteria andHsnRegionNotBetween(String value1, String value2) {
            addCriterion("hsn_Region not between", value1, value2, "hsnRegion");
            return (Criteria) this;
        }

        public Criteria andHsnHousenumIsNull() {
            addCriterion("hsn_HouseNum is null");
            return (Criteria) this;
        }

        public Criteria andHsnHousenumIsNotNull() {
            addCriterion("hsn_HouseNum is not null");
            return (Criteria) this;
        }

        public Criteria andHsnHousenumEqualTo(Integer value) {
            addCriterion("hsn_HouseNum =", value, "hsnHousenum");
            return (Criteria) this;
        }

        public Criteria andHsnHousenumNotEqualTo(Integer value) {
            addCriterion("hsn_HouseNum <>", value, "hsnHousenum");
            return (Criteria) this;
        }

        public Criteria andHsnHousenumGreaterThan(Integer value) {
            addCriterion("hsn_HouseNum >", value, "hsnHousenum");
            return (Criteria) this;
        }

        public Criteria andHsnHousenumGreaterThanOrEqualTo(Integer value) {
            addCriterion("hsn_HouseNum >=", value, "hsnHousenum");
            return (Criteria) this;
        }

        public Criteria andHsnHousenumLessThan(Integer value) {
            addCriterion("hsn_HouseNum <", value, "hsnHousenum");
            return (Criteria) this;
        }

        public Criteria andHsnHousenumLessThanOrEqualTo(Integer value) {
            addCriterion("hsn_HouseNum <=", value, "hsnHousenum");
            return (Criteria) this;
        }

        public Criteria andHsnHousenumIn(List<Integer> values) {
            addCriterion("hsn_HouseNum in", values, "hsnHousenum");
            return (Criteria) this;
        }

        public Criteria andHsnHousenumNotIn(List<Integer> values) {
            addCriterion("hsn_HouseNum not in", values, "hsnHousenum");
            return (Criteria) this;
        }

        public Criteria andHsnHousenumBetween(Integer value1, Integer value2) {
            addCriterion("hsn_HouseNum between", value1, value2, "hsnHousenum");
            return (Criteria) this;
        }

        public Criteria andHsnHousenumNotBetween(Integer value1, Integer value2) {
            addCriterion("hsn_HouseNum not between", value1, value2, "hsnHousenum");
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