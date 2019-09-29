package com.rent.bean;

import java.util.ArrayList;
import java.util.List;

public class DialogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DialogExample() {
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

        public Criteria andDlIdIsNull() {
            addCriterion("dl_Id is null");
            return (Criteria) this;
        }

        public Criteria andDlIdIsNotNull() {
            addCriterion("dl_Id is not null");
            return (Criteria) this;
        }

        public Criteria andDlIdEqualTo(Integer value) {
            addCriterion("dl_Id =", value, "dlId");
            return (Criteria) this;
        }

        public Criteria andDlIdNotEqualTo(Integer value) {
            addCriterion("dl_Id <>", value, "dlId");
            return (Criteria) this;
        }

        public Criteria andDlIdGreaterThan(Integer value) {
            addCriterion("dl_Id >", value, "dlId");
            return (Criteria) this;
        }

        public Criteria andDlIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("dl_Id >=", value, "dlId");
            return (Criteria) this;
        }

        public Criteria andDlIdLessThan(Integer value) {
            addCriterion("dl_Id <", value, "dlId");
            return (Criteria) this;
        }

        public Criteria andDlIdLessThanOrEqualTo(Integer value) {
            addCriterion("dl_Id <=", value, "dlId");
            return (Criteria) this;
        }

        public Criteria andDlIdIn(List<Integer> values) {
            addCriterion("dl_Id in", values, "dlId");
            return (Criteria) this;
        }

        public Criteria andDlIdNotIn(List<Integer> values) {
            addCriterion("dl_Id not in", values, "dlId");
            return (Criteria) this;
        }

        public Criteria andDlIdBetween(Integer value1, Integer value2) {
            addCriterion("dl_Id between", value1, value2, "dlId");
            return (Criteria) this;
        }

        public Criteria andDlIdNotBetween(Integer value1, Integer value2) {
            addCriterion("dl_Id not between", value1, value2, "dlId");
            return (Criteria) this;
        }

        public Criteria andDlEntryIsNull() {
            addCriterion("dl_Entry is null");
            return (Criteria) this;
        }

        public Criteria andDlEntryIsNotNull() {
            addCriterion("dl_Entry is not null");
            return (Criteria) this;
        }

        public Criteria andDlEntryEqualTo(String value) {
            addCriterion("dl_Entry =", value, "dlEntry");
            return (Criteria) this;
        }

        public Criteria andDlEntryNotEqualTo(String value) {
            addCriterion("dl_Entry <>", value, "dlEntry");
            return (Criteria) this;
        }

        public Criteria andDlEntryGreaterThan(String value) {
            addCriterion("dl_Entry >", value, "dlEntry");
            return (Criteria) this;
        }

        public Criteria andDlEntryGreaterThanOrEqualTo(String value) {
            addCriterion("dl_Entry >=", value, "dlEntry");
            return (Criteria) this;
        }

        public Criteria andDlEntryLessThan(String value) {
            addCriterion("dl_Entry <", value, "dlEntry");
            return (Criteria) this;
        }

        public Criteria andDlEntryLessThanOrEqualTo(String value) {
            addCriterion("dl_Entry <=", value, "dlEntry");
            return (Criteria) this;
        }

        public Criteria andDlEntryLike(String value) {
            addCriterion("dl_Entry like", value, "dlEntry");
            return (Criteria) this;
        }

        public Criteria andDlEntryNotLike(String value) {
            addCriterion("dl_Entry not like", value, "dlEntry");
            return (Criteria) this;
        }

        public Criteria andDlEntryIn(List<String> values) {
            addCriterion("dl_Entry in", values, "dlEntry");
            return (Criteria) this;
        }

        public Criteria andDlEntryNotIn(List<String> values) {
            addCriterion("dl_Entry not in", values, "dlEntry");
            return (Criteria) this;
        }

        public Criteria andDlEntryBetween(String value1, String value2) {
            addCriterion("dl_Entry between", value1, value2, "dlEntry");
            return (Criteria) this;
        }

        public Criteria andDlEntryNotBetween(String value1, String value2) {
            addCriterion("dl_Entry not between", value1, value2, "dlEntry");
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