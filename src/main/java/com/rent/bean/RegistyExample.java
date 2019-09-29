package com.rent.bean;

import java.util.ArrayList;
import java.util.List;

public class RegistyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RegistyExample() {
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

        public Criteria andRgtIdIsNull() {
            addCriterion("rgt_Id is null");
            return (Criteria) this;
        }

        public Criteria andRgtIdIsNotNull() {
            addCriterion("rgt_Id is not null");
            return (Criteria) this;
        }

        public Criteria andRgtIdEqualTo(Integer value) {
            addCriterion("rgt_Id =", value, "rgtId");
            return (Criteria) this;
        }

        public Criteria andRgtIdNotEqualTo(Integer value) {
            addCriterion("rgt_Id <>", value, "rgtId");
            return (Criteria) this;
        }

        public Criteria andRgtIdGreaterThan(Integer value) {
            addCriterion("rgt_Id >", value, "rgtId");
            return (Criteria) this;
        }

        public Criteria andRgtIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("rgt_Id >=", value, "rgtId");
            return (Criteria) this;
        }

        public Criteria andRgtIdLessThan(Integer value) {
            addCriterion("rgt_Id <", value, "rgtId");
            return (Criteria) this;
        }

        public Criteria andRgtIdLessThanOrEqualTo(Integer value) {
            addCriterion("rgt_Id <=", value, "rgtId");
            return (Criteria) this;
        }

        public Criteria andRgtIdIn(List<Integer> values) {
            addCriterion("rgt_Id in", values, "rgtId");
            return (Criteria) this;
        }

        public Criteria andRgtIdNotIn(List<Integer> values) {
            addCriterion("rgt_Id not in", values, "rgtId");
            return (Criteria) this;
        }

        public Criteria andRgtIdBetween(Integer value1, Integer value2) {
            addCriterion("rgt_Id between", value1, value2, "rgtId");
            return (Criteria) this;
        }

        public Criteria andRgtIdNotBetween(Integer value1, Integer value2) {
            addCriterion("rgt_Id not between", value1, value2, "rgtId");
            return (Criteria) this;
        }

        public Criteria andRgtUserIsNull() {
            addCriterion("rgt_User is null");
            return (Criteria) this;
        }

        public Criteria andRgtUserIsNotNull() {
            addCriterion("rgt_User is not null");
            return (Criteria) this;
        }

        public Criteria andRgtUserEqualTo(String value) {
            addCriterion("rgt_User =", value, "rgtUser");
            return (Criteria) this;
        }

        public Criteria andRgtUserNotEqualTo(String value) {
            addCriterion("rgt_User <>", value, "rgtUser");
            return (Criteria) this;
        }

        public Criteria andRgtUserGreaterThan(String value) {
            addCriterion("rgt_User >", value, "rgtUser");
            return (Criteria) this;
        }

        public Criteria andRgtUserGreaterThanOrEqualTo(String value) {
            addCriterion("rgt_User >=", value, "rgtUser");
            return (Criteria) this;
        }

        public Criteria andRgtUserLessThan(String value) {
            addCriterion("rgt_User <", value, "rgtUser");
            return (Criteria) this;
        }

        public Criteria andRgtUserLessThanOrEqualTo(String value) {
            addCriterion("rgt_User <=", value, "rgtUser");
            return (Criteria) this;
        }

        public Criteria andRgtUserLike(String value) {
            addCriterion("rgt_User like", value, "rgtUser");
            return (Criteria) this;
        }

        public Criteria andRgtUserNotLike(String value) {
            addCriterion("rgt_User not like", value, "rgtUser");
            return (Criteria) this;
        }

        public Criteria andRgtUserIn(List<String> values) {
            addCriterion("rgt_User in", values, "rgtUser");
            return (Criteria) this;
        }

        public Criteria andRgtUserNotIn(List<String> values) {
            addCriterion("rgt_User not in", values, "rgtUser");
            return (Criteria) this;
        }

        public Criteria andRgtUserBetween(String value1, String value2) {
            addCriterion("rgt_User between", value1, value2, "rgtUser");
            return (Criteria) this;
        }

        public Criteria andRgtUserNotBetween(String value1, String value2) {
            addCriterion("rgt_User not between", value1, value2, "rgtUser");
            return (Criteria) this;
        }

        public Criteria andRgtPasswordIsNull() {
            addCriterion("rgt_password is null");
            return (Criteria) this;
        }

        public Criteria andRgtPasswordIsNotNull() {
            addCriterion("rgt_password is not null");
            return (Criteria) this;
        }

        public Criteria andRgtPasswordEqualTo(String value) {
            addCriterion("rgt_password =", value, "rgtPassword");
            return (Criteria) this;
        }

        public Criteria andRgtPasswordNotEqualTo(String value) {
            addCriterion("rgt_password <>", value, "rgtPassword");
            return (Criteria) this;
        }

        public Criteria andRgtPasswordGreaterThan(String value) {
            addCriterion("rgt_password >", value, "rgtPassword");
            return (Criteria) this;
        }

        public Criteria andRgtPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("rgt_password >=", value, "rgtPassword");
            return (Criteria) this;
        }

        public Criteria andRgtPasswordLessThan(String value) {
            addCriterion("rgt_password <", value, "rgtPassword");
            return (Criteria) this;
        }

        public Criteria andRgtPasswordLessThanOrEqualTo(String value) {
            addCriterion("rgt_password <=", value, "rgtPassword");
            return (Criteria) this;
        }

        public Criteria andRgtPasswordLike(String value) {
            addCriterion("rgt_password like", value, "rgtPassword");
            return (Criteria) this;
        }

        public Criteria andRgtPasswordNotLike(String value) {
            addCriterion("rgt_password not like", value, "rgtPassword");
            return (Criteria) this;
        }

        public Criteria andRgtPasswordIn(List<String> values) {
            addCriterion("rgt_password in", values, "rgtPassword");
            return (Criteria) this;
        }

        public Criteria andRgtPasswordNotIn(List<String> values) {
            addCriterion("rgt_password not in", values, "rgtPassword");
            return (Criteria) this;
        }

        public Criteria andRgtPasswordBetween(String value1, String value2) {
            addCriterion("rgt_password between", value1, value2, "rgtPassword");
            return (Criteria) this;
        }

        public Criteria andRgtPasswordNotBetween(String value1, String value2) {
            addCriterion("rgt_password not between", value1, value2, "rgtPassword");
            return (Criteria) this;
        }

        public Criteria andRgtTokenIsNull() {
            addCriterion("rgt_token is null");
            return (Criteria) this;
        }

        public Criteria andRgtTokenIsNotNull() {
            addCriterion("rgt_token is not null");
            return (Criteria) this;
        }

        public Criteria andRgtTokenEqualTo(String value) {
            addCriterion("rgt_token =", value, "rgtToken");
            return (Criteria) this;
        }

        public Criteria andRgtTokenNotEqualTo(String value) {
            addCriterion("rgt_token <>", value, "rgtToken");
            return (Criteria) this;
        }

        public Criteria andRgtTokenGreaterThan(String value) {
            addCriterion("rgt_token >", value, "rgtToken");
            return (Criteria) this;
        }

        public Criteria andRgtTokenGreaterThanOrEqualTo(String value) {
            addCriterion("rgt_token >=", value, "rgtToken");
            return (Criteria) this;
        }

        public Criteria andRgtTokenLessThan(String value) {
            addCriterion("rgt_token <", value, "rgtToken");
            return (Criteria) this;
        }

        public Criteria andRgtTokenLessThanOrEqualTo(String value) {
            addCriterion("rgt_token <=", value, "rgtToken");
            return (Criteria) this;
        }

        public Criteria andRgtTokenLike(String value) {
            addCriterion("rgt_token like", value, "rgtToken");
            return (Criteria) this;
        }

        public Criteria andRgtTokenNotLike(String value) {
            addCriterion("rgt_token not like", value, "rgtToken");
            return (Criteria) this;
        }

        public Criteria andRgtTokenIn(List<String> values) {
            addCriterion("rgt_token in", values, "rgtToken");
            return (Criteria) this;
        }

        public Criteria andRgtTokenNotIn(List<String> values) {
            addCriterion("rgt_token not in", values, "rgtToken");
            return (Criteria) this;
        }

        public Criteria andRgtTokenBetween(String value1, String value2) {
            addCriterion("rgt_token between", value1, value2, "rgtToken");
            return (Criteria) this;
        }

        public Criteria andRgtTokenNotBetween(String value1, String value2) {
            addCriterion("rgt_token not between", value1, value2, "rgtToken");
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