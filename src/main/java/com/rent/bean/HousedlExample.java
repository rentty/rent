package com.rent.bean;

import java.util.ArrayList;
import java.util.List;

public class HousedlExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HousedlExample() {
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

        public Criteria andHsdIdIsNull() {
            addCriterion("hsd_Id is null");
            return (Criteria) this;
        }

        public Criteria andHsdIdIsNotNull() {
            addCriterion("hsd_Id is not null");
            return (Criteria) this;
        }

        public Criteria andHsdIdEqualTo(Integer value) {
            addCriterion("hsd_Id =", value, "hsdId");
            return (Criteria) this;
        }

        public Criteria andHsdIdNotEqualTo(Integer value) {
            addCriterion("hsd_Id <>", value, "hsdId");
            return (Criteria) this;
        }

        public Criteria andHsdIdGreaterThan(Integer value) {
            addCriterion("hsd_Id >", value, "hsdId");
            return (Criteria) this;
        }

        public Criteria andHsdIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("hsd_Id >=", value, "hsdId");
            return (Criteria) this;
        }

        public Criteria andHsdIdLessThan(Integer value) {
            addCriterion("hsd_Id <", value, "hsdId");
            return (Criteria) this;
        }

        public Criteria andHsdIdLessThanOrEqualTo(Integer value) {
            addCriterion("hsd_Id <=", value, "hsdId");
            return (Criteria) this;
        }

        public Criteria andHsdIdIn(List<Integer> values) {
            addCriterion("hsd_Id in", values, "hsdId");
            return (Criteria) this;
        }

        public Criteria andHsdIdNotIn(List<Integer> values) {
            addCriterion("hsd_Id not in", values, "hsdId");
            return (Criteria) this;
        }

        public Criteria andHsdIdBetween(Integer value1, Integer value2) {
            addCriterion("hsd_Id between", value1, value2, "hsdId");
            return (Criteria) this;
        }

        public Criteria andHsdIdNotBetween(Integer value1, Integer value2) {
            addCriterion("hsd_Id not between", value1, value2, "hsdId");
            return (Criteria) this;
        }

        public Criteria andHsdIdoormaddrIsNull() {
            addCriterion("hsd_IdoorMAddr is null");
            return (Criteria) this;
        }

        public Criteria andHsdIdoormaddrIsNotNull() {
            addCriterion("hsd_IdoorMAddr is not null");
            return (Criteria) this;
        }

        public Criteria andHsdIdoormaddrEqualTo(String value) {
            addCriterion("hsd_IdoorMAddr =", value, "hsdIdoormaddr");
            return (Criteria) this;
        }

        public Criteria andHsdIdoormaddrNotEqualTo(String value) {
            addCriterion("hsd_IdoorMAddr <>", value, "hsdIdoormaddr");
            return (Criteria) this;
        }

        public Criteria andHsdIdoormaddrGreaterThan(String value) {
            addCriterion("hsd_IdoorMAddr >", value, "hsdIdoormaddr");
            return (Criteria) this;
        }

        public Criteria andHsdIdoormaddrGreaterThanOrEqualTo(String value) {
            addCriterion("hsd_IdoorMAddr >=", value, "hsdIdoormaddr");
            return (Criteria) this;
        }

        public Criteria andHsdIdoormaddrLessThan(String value) {
            addCriterion("hsd_IdoorMAddr <", value, "hsdIdoormaddr");
            return (Criteria) this;
        }

        public Criteria andHsdIdoormaddrLessThanOrEqualTo(String value) {
            addCriterion("hsd_IdoorMAddr <=", value, "hsdIdoormaddr");
            return (Criteria) this;
        }

        public Criteria andHsdIdoormaddrLike(String value) {
            addCriterion("hsd_IdoorMAddr like", value, "hsdIdoormaddr");
            return (Criteria) this;
        }

        public Criteria andHsdIdoormaddrNotLike(String value) {
            addCriterion("hsd_IdoorMAddr not like", value, "hsdIdoormaddr");
            return (Criteria) this;
        }

        public Criteria andHsdIdoormaddrIn(List<String> values) {
            addCriterion("hsd_IdoorMAddr in", values, "hsdIdoormaddr");
            return (Criteria) this;
        }

        public Criteria andHsdIdoormaddrNotIn(List<String> values) {
            addCriterion("hsd_IdoorMAddr not in", values, "hsdIdoormaddr");
            return (Criteria) this;
        }

        public Criteria andHsdIdoormaddrBetween(String value1, String value2) {
            addCriterion("hsd_IdoorMAddr between", value1, value2, "hsdIdoormaddr");
            return (Criteria) this;
        }

        public Criteria andHsdIdoormaddrNotBetween(String value1, String value2) {
            addCriterion("hsd_IdoorMAddr not between", value1, value2, "hsdIdoormaddr");
            return (Criteria) this;
        }

        public Criteria andHsdFloorpaddrIsNull() {
            addCriterion("hsd_FloorPAddr is null");
            return (Criteria) this;
        }

        public Criteria andHsdFloorpaddrIsNotNull() {
            addCriterion("hsd_FloorPAddr is not null");
            return (Criteria) this;
        }

        public Criteria andHsdFloorpaddrEqualTo(String value) {
            addCriterion("hsd_FloorPAddr =", value, "hsdFloorpaddr");
            return (Criteria) this;
        }

        public Criteria andHsdFloorpaddrNotEqualTo(String value) {
            addCriterion("hsd_FloorPAddr <>", value, "hsdFloorpaddr");
            return (Criteria) this;
        }

        public Criteria andHsdFloorpaddrGreaterThan(String value) {
            addCriterion("hsd_FloorPAddr >", value, "hsdFloorpaddr");
            return (Criteria) this;
        }

        public Criteria andHsdFloorpaddrGreaterThanOrEqualTo(String value) {
            addCriterion("hsd_FloorPAddr >=", value, "hsdFloorpaddr");
            return (Criteria) this;
        }

        public Criteria andHsdFloorpaddrLessThan(String value) {
            addCriterion("hsd_FloorPAddr <", value, "hsdFloorpaddr");
            return (Criteria) this;
        }

        public Criteria andHsdFloorpaddrLessThanOrEqualTo(String value) {
            addCriterion("hsd_FloorPAddr <=", value, "hsdFloorpaddr");
            return (Criteria) this;
        }

        public Criteria andHsdFloorpaddrLike(String value) {
            addCriterion("hsd_FloorPAddr like", value, "hsdFloorpaddr");
            return (Criteria) this;
        }

        public Criteria andHsdFloorpaddrNotLike(String value) {
            addCriterion("hsd_FloorPAddr not like", value, "hsdFloorpaddr");
            return (Criteria) this;
        }

        public Criteria andHsdFloorpaddrIn(List<String> values) {
            addCriterion("hsd_FloorPAddr in", values, "hsdFloorpaddr");
            return (Criteria) this;
        }

        public Criteria andHsdFloorpaddrNotIn(List<String> values) {
            addCriterion("hsd_FloorPAddr not in", values, "hsdFloorpaddr");
            return (Criteria) this;
        }

        public Criteria andHsdFloorpaddrBetween(String value1, String value2) {
            addCriterion("hsd_FloorPAddr between", value1, value2, "hsdFloorpaddr");
            return (Criteria) this;
        }

        public Criteria andHsdFloorpaddrNotBetween(String value1, String value2) {
            addCriterion("hsd_FloorPAddr not between", value1, value2, "hsdFloorpaddr");
            return (Criteria) this;
        }

        public Criteria andHsdConditionmaddrIsNull() {
            addCriterion("hsd_ConditionMAddr is null");
            return (Criteria) this;
        }

        public Criteria andHsdConditionmaddrIsNotNull() {
            addCriterion("hsd_ConditionMAddr is not null");
            return (Criteria) this;
        }

        public Criteria andHsdConditionmaddrEqualTo(String value) {
            addCriterion("hsd_ConditionMAddr =", value, "hsdConditionmaddr");
            return (Criteria) this;
        }

        public Criteria andHsdConditionmaddrNotEqualTo(String value) {
            addCriterion("hsd_ConditionMAddr <>", value, "hsdConditionmaddr");
            return (Criteria) this;
        }

        public Criteria andHsdConditionmaddrGreaterThan(String value) {
            addCriterion("hsd_ConditionMAddr >", value, "hsdConditionmaddr");
            return (Criteria) this;
        }

        public Criteria andHsdConditionmaddrGreaterThanOrEqualTo(String value) {
            addCriterion("hsd_ConditionMAddr >=", value, "hsdConditionmaddr");
            return (Criteria) this;
        }

        public Criteria andHsdConditionmaddrLessThan(String value) {
            addCriterion("hsd_ConditionMAddr <", value, "hsdConditionmaddr");
            return (Criteria) this;
        }

        public Criteria andHsdConditionmaddrLessThanOrEqualTo(String value) {
            addCriterion("hsd_ConditionMAddr <=", value, "hsdConditionmaddr");
            return (Criteria) this;
        }

        public Criteria andHsdConditionmaddrLike(String value) {
            addCriterion("hsd_ConditionMAddr like", value, "hsdConditionmaddr");
            return (Criteria) this;
        }

        public Criteria andHsdConditionmaddrNotLike(String value) {
            addCriterion("hsd_ConditionMAddr not like", value, "hsdConditionmaddr");
            return (Criteria) this;
        }

        public Criteria andHsdConditionmaddrIn(List<String> values) {
            addCriterion("hsd_ConditionMAddr in", values, "hsdConditionmaddr");
            return (Criteria) this;
        }

        public Criteria andHsdConditionmaddrNotIn(List<String> values) {
            addCriterion("hsd_ConditionMAddr not in", values, "hsdConditionmaddr");
            return (Criteria) this;
        }

        public Criteria andHsdConditionmaddrBetween(String value1, String value2) {
            addCriterion("hsd_ConditionMAddr between", value1, value2, "hsdConditionmaddr");
            return (Criteria) this;
        }

        public Criteria andHsdConditionmaddrNotBetween(String value1, String value2) {
            addCriterion("hsd_ConditionMAddr not between", value1, value2, "hsdConditionmaddr");
            return (Criteria) this;
        }

        public Criteria andHsdFacilityDescIsNull() {
            addCriterion("`hsd_Facility desc` is null");
            return (Criteria) this;
        }

        public Criteria andHsdFacilityDescIsNotNull() {
            addCriterion("`hsd_Facility desc` is not null");
            return (Criteria) this;
        }

        public Criteria andHsdFacilityDescEqualTo(String value) {
            addCriterion("`hsd_Facility desc` =", value, "hsdFacilityDesc");
            return (Criteria) this;
        }

        public Criteria andHsdFacilityDescNotEqualTo(String value) {
            addCriterion("`hsd_Facility desc` <>", value, "hsdFacilityDesc");
            return (Criteria) this;
        }

        public Criteria andHsdFacilityDescGreaterThan(String value) {
            addCriterion("`hsd_Facility desc` >", value, "hsdFacilityDesc");
            return (Criteria) this;
        }

        public Criteria andHsdFacilityDescGreaterThanOrEqualTo(String value) {
            addCriterion("`hsd_Facility desc` >=", value, "hsdFacilityDesc");
            return (Criteria) this;
        }

        public Criteria andHsdFacilityDescLessThan(String value) {
            addCriterion("`hsd_Facility desc` <", value, "hsdFacilityDesc");
            return (Criteria) this;
        }

        public Criteria andHsdFacilityDescLessThanOrEqualTo(String value) {
            addCriterion("`hsd_Facility desc` <=", value, "hsdFacilityDesc");
            return (Criteria) this;
        }

        public Criteria andHsdFacilityDescLike(String value) {
            addCriterion("`hsd_Facility desc` like", value, "hsdFacilityDesc");
            return (Criteria) this;
        }

        public Criteria andHsdFacilityDescNotLike(String value) {
            addCriterion("`hsd_Facility desc` not like", value, "hsdFacilityDesc");
            return (Criteria) this;
        }

        public Criteria andHsdFacilityDescIn(List<String> values) {
            addCriterion("`hsd_Facility desc` in", values, "hsdFacilityDesc");
            return (Criteria) this;
        }

        public Criteria andHsdFacilityDescNotIn(List<String> values) {
            addCriterion("`hsd_Facility desc` not in", values, "hsdFacilityDesc");
            return (Criteria) this;
        }

        public Criteria andHsdFacilityDescBetween(String value1, String value2) {
            addCriterion("`hsd_Facility desc` between", value1, value2, "hsdFacilityDesc");
            return (Criteria) this;
        }

        public Criteria andHsdFacilityDescNotBetween(String value1, String value2) {
            addCriterion("`hsd_Facility desc` not between", value1, value2, "hsdFacilityDesc");
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