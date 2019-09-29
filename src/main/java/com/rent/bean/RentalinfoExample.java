package com.rent.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RentalinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RentalinfoExample() {
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

        public Criteria andRtlfIdIsNull() {
            addCriterion("rtlf_Id is null");
            return (Criteria) this;
        }

        public Criteria andRtlfIdIsNotNull() {
            addCriterion("rtlf_Id is not null");
            return (Criteria) this;
        }

        public Criteria andRtlfIdEqualTo(Integer value) {
            addCriterion("rtlf_Id =", value, "rtlfId");
            return (Criteria) this;
        }

        public Criteria andRtlfIdNotEqualTo(Integer value) {
            addCriterion("rtlf_Id <>", value, "rtlfId");
            return (Criteria) this;
        }

        public Criteria andRtlfIdGreaterThan(Integer value) {
            addCriterion("rtlf_Id >", value, "rtlfId");
            return (Criteria) this;
        }

        public Criteria andRtlfIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("rtlf_Id >=", value, "rtlfId");
            return (Criteria) this;
        }

        public Criteria andRtlfIdLessThan(Integer value) {
            addCriterion("rtlf_Id <", value, "rtlfId");
            return (Criteria) this;
        }

        public Criteria andRtlfIdLessThanOrEqualTo(Integer value) {
            addCriterion("rtlf_Id <=", value, "rtlfId");
            return (Criteria) this;
        }

        public Criteria andRtlfIdIn(List<Integer> values) {
            addCriterion("rtlf_Id in", values, "rtlfId");
            return (Criteria) this;
        }

        public Criteria andRtlfIdNotIn(List<Integer> values) {
            addCriterion("rtlf_Id not in", values, "rtlfId");
            return (Criteria) this;
        }

        public Criteria andRtlfIdBetween(Integer value1, Integer value2) {
            addCriterion("rtlf_Id between", value1, value2, "rtlfId");
            return (Criteria) this;
        }

        public Criteria andRtlfIdNotBetween(Integer value1, Integer value2) {
            addCriterion("rtlf_Id not between", value1, value2, "rtlfId");
            return (Criteria) this;
        }

        public Criteria andRtlfRent
rtlfRentIsNull() {
            addCriterion("rtlf_Rent
rtlf_Rent is null");
            return (Criteria) this;
        }

        public Criteria andRtlfRent
rtlfRentIsNotNull() {
            addCriterion("rtlf_Rent
rtlf_Rent is not null");
            return (Criteria) this;
        }

        public Criteria andRtlfRent
rtlfRentEqualTo(Integer value) {
            addCriterion("rtlf_Rent
rtlf_Rent =", value, "rtlfRent
rtlfRent");
            return (Criteria) this;
        }

        public Criteria andRtlfRent
rtlfRentNotEqualTo(Integer value) {
            addCriterion("rtlf_Rent
rtlf_Rent <>", value, "rtlfRent
rtlfRent");
            return (Criteria) this;
        }

        public Criteria andRtlfRent
rtlfRentGreaterThan(Integer value) {
            addCriterion("rtlf_Rent
rtlf_Rent >", value, "rtlfRent
rtlfRent");
            return (Criteria) this;
        }

        public Criteria andRtlfRent
rtlfRentGreaterThanOrEqualTo(Integer value) {
            addCriterion("rtlf_Rent
rtlf_Rent >=", value, "rtlfRent
rtlfRent");
            return (Criteria) this;
        }

        public Criteria andRtlfRent
rtlfRentLessThan(Integer value) {
            addCriterion("rtlf_Rent
rtlf_Rent <", value, "rtlfRent
rtlfRent");
            return (Criteria) this;
        }

        public Criteria andRtlfRent
rtlfRentLessThanOrEqualTo(Integer value) {
            addCriterion("rtlf_Rent
rtlf_Rent <=", value, "rtlfRent
rtlfRent");
            return (Criteria) this;
        }

        public Criteria andRtlfRent
rtlfRentIn(List<Integer> values) {
            addCriterion("rtlf_Rent
rtlf_Rent in", values, "rtlfRent
rtlfRent");
            return (Criteria) this;
        }

        public Criteria andRtlfRent
rtlfRentNotIn(List<Integer> values) {
            addCriterion("rtlf_Rent
rtlf_Rent not in", values, "rtlfRent
rtlfRent");
            return (Criteria) this;
        }

        public Criteria andRtlfRent
rtlfRentBetween(Integer value1, Integer value2) {
            addCriterion("rtlf_Rent
rtlf_Rent between", value1, value2, "rtlfRent
rtlfRent");
            return (Criteria) this;
        }

        public Criteria andRtlfRent
rtlfRentNotBetween(Integer value1, Integer value2) {
            addCriterion("rtlf_Rent
rtlf_Rent not between", value1, value2, "rtlfRent
rtlfRent");
            return (Criteria) this;
        }

        public Criteria andRtlfReleasetimeIsNull() {
            addCriterion("rtlf_ReleaseTime is null");
            return (Criteria) this;
        }

        public Criteria andRtlfReleasetimeIsNotNull() {
            addCriterion("rtlf_ReleaseTime is not null");
            return (Criteria) this;
        }

        public Criteria andRtlfReleasetimeEqualTo(Date value) {
            addCriterion("rtlf_ReleaseTime =", value, "rtlfReleasetime");
            return (Criteria) this;
        }

        public Criteria andRtlfReleasetimeNotEqualTo(Date value) {
            addCriterion("rtlf_ReleaseTime <>", value, "rtlfReleasetime");
            return (Criteria) this;
        }

        public Criteria andRtlfReleasetimeGreaterThan(Date value) {
            addCriterion("rtlf_ReleaseTime >", value, "rtlfReleasetime");
            return (Criteria) this;
        }

        public Criteria andRtlfReleasetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("rtlf_ReleaseTime >=", value, "rtlfReleasetime");
            return (Criteria) this;
        }

        public Criteria andRtlfReleasetimeLessThan(Date value) {
            addCriterion("rtlf_ReleaseTime <", value, "rtlfReleasetime");
            return (Criteria) this;
        }

        public Criteria andRtlfReleasetimeLessThanOrEqualTo(Date value) {
            addCriterion("rtlf_ReleaseTime <=", value, "rtlfReleasetime");
            return (Criteria) this;
        }

        public Criteria andRtlfReleasetimeIn(List<Date> values) {
            addCriterion("rtlf_ReleaseTime in", values, "rtlfReleasetime");
            return (Criteria) this;
        }

        public Criteria andRtlfReleasetimeNotIn(List<Date> values) {
            addCriterion("rtlf_ReleaseTime not in", values, "rtlfReleasetime");
            return (Criteria) this;
        }

        public Criteria andRtlfReleasetimeBetween(Date value1, Date value2) {
            addCriterion("rtlf_ReleaseTime between", value1, value2, "rtlfReleasetime");
            return (Criteria) this;
        }

        public Criteria andRtlfReleasetimeNotBetween(Date value1, Date value2) {
            addCriterion("rtlf_ReleaseTime not between", value1, value2, "rtlfReleasetime");
            return (Criteria) this;
        }

        public Criteria andRtlfRentaltypeIsNull() {
            addCriterion("rtlf_RentalType is null");
            return (Criteria) this;
        }

        public Criteria andRtlfRentaltypeIsNotNull() {
            addCriterion("rtlf_RentalType is not null");
            return (Criteria) this;
        }

        public Criteria andRtlfRentaltypeEqualTo(Integer value) {
            addCriterion("rtlf_RentalType =", value, "rtlfRentaltype");
            return (Criteria) this;
        }

        public Criteria andRtlfRentaltypeNotEqualTo(Integer value) {
            addCriterion("rtlf_RentalType <>", value, "rtlfRentaltype");
            return (Criteria) this;
        }

        public Criteria andRtlfRentaltypeGreaterThan(Integer value) {
            addCriterion("rtlf_RentalType >", value, "rtlfRentaltype");
            return (Criteria) this;
        }

        public Criteria andRtlfRentaltypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("rtlf_RentalType >=", value, "rtlfRentaltype");
            return (Criteria) this;
        }

        public Criteria andRtlfRentaltypeLessThan(Integer value) {
            addCriterion("rtlf_RentalType <", value, "rtlfRentaltype");
            return (Criteria) this;
        }

        public Criteria andRtlfRentaltypeLessThanOrEqualTo(Integer value) {
            addCriterion("rtlf_RentalType <=", value, "rtlfRentaltype");
            return (Criteria) this;
        }

        public Criteria andRtlfRentaltypeIn(List<Integer> values) {
            addCriterion("rtlf_RentalType in", values, "rtlfRentaltype");
            return (Criteria) this;
        }

        public Criteria andRtlfRentaltypeNotIn(List<Integer> values) {
            addCriterion("rtlf_RentalType not in", values, "rtlfRentaltype");
            return (Criteria) this;
        }

        public Criteria andRtlfRentaltypeBetween(Integer value1, Integer value2) {
            addCriterion("rtlf_RentalType between", value1, value2, "rtlfRentaltype");
            return (Criteria) this;
        }

        public Criteria andRtlfRentaltypeNotBetween(Integer value1, Integer value2) {
            addCriterion("rtlf_RentalType not between", value1, value2, "rtlfRentaltype");
            return (Criteria) this;
        }

        public Criteria andRtlfHhidIsNull() {
            addCriterion("rtlf_HHId is null");
            return (Criteria) this;
        }

        public Criteria andRtlfHhidIsNotNull() {
            addCriterion("rtlf_HHId is not null");
            return (Criteria) this;
        }

        public Criteria andRtlfHhidEqualTo(Integer value) {
            addCriterion("rtlf_HHId =", value, "rtlfHhid");
            return (Criteria) this;
        }

        public Criteria andRtlfHhidNotEqualTo(Integer value) {
            addCriterion("rtlf_HHId <>", value, "rtlfHhid");
            return (Criteria) this;
        }

        public Criteria andRtlfHhidGreaterThan(Integer value) {
            addCriterion("rtlf_HHId >", value, "rtlfHhid");
            return (Criteria) this;
        }

        public Criteria andRtlfHhidGreaterThanOrEqualTo(Integer value) {
            addCriterion("rtlf_HHId >=", value, "rtlfHhid");
            return (Criteria) this;
        }

        public Criteria andRtlfHhidLessThan(Integer value) {
            addCriterion("rtlf_HHId <", value, "rtlfHhid");
            return (Criteria) this;
        }

        public Criteria andRtlfHhidLessThanOrEqualTo(Integer value) {
            addCriterion("rtlf_HHId <=", value, "rtlfHhid");
            return (Criteria) this;
        }

        public Criteria andRtlfHhidIn(List<Integer> values) {
            addCriterion("rtlf_HHId in", values, "rtlfHhid");
            return (Criteria) this;
        }

        public Criteria andRtlfHhidNotIn(List<Integer> values) {
            addCriterion("rtlf_HHId not in", values, "rtlfHhid");
            return (Criteria) this;
        }

        public Criteria andRtlfHhidBetween(Integer value1, Integer value2) {
            addCriterion("rtlf_HHId between", value1, value2, "rtlfHhid");
            return (Criteria) this;
        }

        public Criteria andRtlfHhidNotBetween(Integer value1, Integer value2) {
            addCriterion("rtlf_HHId not between", value1, value2, "rtlfHhid");
            return (Criteria) this;
        }

        public Criteria andRtlfRequestIsNull() {
            addCriterion("rtlf_Request is null");
            return (Criteria) this;
        }

        public Criteria andRtlfRequestIsNotNull() {
            addCriterion("rtlf_Request is not null");
            return (Criteria) this;
        }

        public Criteria andRtlfRequestEqualTo(String value) {
            addCriterion("rtlf_Request =", value, "rtlfRequest");
            return (Criteria) this;
        }

        public Criteria andRtlfRequestNotEqualTo(String value) {
            addCriterion("rtlf_Request <>", value, "rtlfRequest");
            return (Criteria) this;
        }

        public Criteria andRtlfRequestGreaterThan(String value) {
            addCriterion("rtlf_Request >", value, "rtlfRequest");
            return (Criteria) this;
        }

        public Criteria andRtlfRequestGreaterThanOrEqualTo(String value) {
            addCriterion("rtlf_Request >=", value, "rtlfRequest");
            return (Criteria) this;
        }

        public Criteria andRtlfRequestLessThan(String value) {
            addCriterion("rtlf_Request <", value, "rtlfRequest");
            return (Criteria) this;
        }

        public Criteria andRtlfRequestLessThanOrEqualTo(String value) {
            addCriterion("rtlf_Request <=", value, "rtlfRequest");
            return (Criteria) this;
        }

        public Criteria andRtlfRequestLike(String value) {
            addCriterion("rtlf_Request like", value, "rtlfRequest");
            return (Criteria) this;
        }

        public Criteria andRtlfRequestNotLike(String value) {
            addCriterion("rtlf_Request not like", value, "rtlfRequest");
            return (Criteria) this;
        }

        public Criteria andRtlfRequestIn(List<String> values) {
            addCriterion("rtlf_Request in", values, "rtlfRequest");
            return (Criteria) this;
        }

        public Criteria andRtlfRequestNotIn(List<String> values) {
            addCriterion("rtlf_Request not in", values, "rtlfRequest");
            return (Criteria) this;
        }

        public Criteria andRtlfRequestBetween(String value1, String value2) {
            addCriterion("rtlf_Request between", value1, value2, "rtlfRequest");
            return (Criteria) this;
        }

        public Criteria andRtlfRequestNotBetween(String value1, String value2) {
            addCriterion("rtlf_Request not between", value1, value2, "rtlfRequest");
            return (Criteria) this;
        }

        public Criteria andRtlfCalendarIsNull() {
            addCriterion("rtlf_Calendar is null");
            return (Criteria) this;
        }

        public Criteria andRtlfCalendarIsNotNull() {
            addCriterion("rtlf_Calendar is not null");
            return (Criteria) this;
        }

        public Criteria andRtlfCalendarEqualTo(String value) {
            addCriterion("rtlf_Calendar =", value, "rtlfCalendar");
            return (Criteria) this;
        }

        public Criteria andRtlfCalendarNotEqualTo(String value) {
            addCriterion("rtlf_Calendar <>", value, "rtlfCalendar");
            return (Criteria) this;
        }

        public Criteria andRtlfCalendarGreaterThan(String value) {
            addCriterion("rtlf_Calendar >", value, "rtlfCalendar");
            return (Criteria) this;
        }

        public Criteria andRtlfCalendarGreaterThanOrEqualTo(String value) {
            addCriterion("rtlf_Calendar >=", value, "rtlfCalendar");
            return (Criteria) this;
        }

        public Criteria andRtlfCalendarLessThan(String value) {
            addCriterion("rtlf_Calendar <", value, "rtlfCalendar");
            return (Criteria) this;
        }

        public Criteria andRtlfCalendarLessThanOrEqualTo(String value) {
            addCriterion("rtlf_Calendar <=", value, "rtlfCalendar");
            return (Criteria) this;
        }

        public Criteria andRtlfCalendarLike(String value) {
            addCriterion("rtlf_Calendar like", value, "rtlfCalendar");
            return (Criteria) this;
        }

        public Criteria andRtlfCalendarNotLike(String value) {
            addCriterion("rtlf_Calendar not like", value, "rtlfCalendar");
            return (Criteria) this;
        }

        public Criteria andRtlfCalendarIn(List<String> values) {
            addCriterion("rtlf_Calendar in", values, "rtlfCalendar");
            return (Criteria) this;
        }

        public Criteria andRtlfCalendarNotIn(List<String> values) {
            addCriterion("rtlf_Calendar not in", values, "rtlfCalendar");
            return (Criteria) this;
        }

        public Criteria andRtlfCalendarBetween(String value1, String value2) {
            addCriterion("rtlf_Calendar between", value1, value2, "rtlfCalendar");
            return (Criteria) this;
        }

        public Criteria andRtlfCalendarNotBetween(String value1, String value2) {
            addCriterion("rtlf_Calendar not between", value1, value2, "rtlfCalendar");
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