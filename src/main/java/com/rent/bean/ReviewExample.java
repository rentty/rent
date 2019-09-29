package com.rent.bean;

import java.util.ArrayList;
import java.util.List;

public class ReviewExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReviewExample() {
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

        public Criteria andRvIdIsNull() {
            addCriterion("rv_Id is null");
            return (Criteria) this;
        }

        public Criteria andRvIdIsNotNull() {
            addCriterion("rv_Id is not null");
            return (Criteria) this;
        }

        public Criteria andRvIdEqualTo(Integer value) {
            addCriterion("rv_Id =", value, "rvId");
            return (Criteria) this;
        }

        public Criteria andRvIdNotEqualTo(Integer value) {
            addCriterion("rv_Id <>", value, "rvId");
            return (Criteria) this;
        }

        public Criteria andRvIdGreaterThan(Integer value) {
            addCriterion("rv_Id >", value, "rvId");
            return (Criteria) this;
        }

        public Criteria andRvIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("rv_Id >=", value, "rvId");
            return (Criteria) this;
        }

        public Criteria andRvIdLessThan(Integer value) {
            addCriterion("rv_Id <", value, "rvId");
            return (Criteria) this;
        }

        public Criteria andRvIdLessThanOrEqualTo(Integer value) {
            addCriterion("rv_Id <=", value, "rvId");
            return (Criteria) this;
        }

        public Criteria andRvIdIn(List<Integer> values) {
            addCriterion("rv_Id in", values, "rvId");
            return (Criteria) this;
        }

        public Criteria andRvIdNotIn(List<Integer> values) {
            addCriterion("rv_Id not in", values, "rvId");
            return (Criteria) this;
        }

        public Criteria andRvIdBetween(Integer value1, Integer value2) {
            addCriterion("rv_Id between", value1, value2, "rvId");
            return (Criteria) this;
        }

        public Criteria andRvIdNotBetween(Integer value1, Integer value2) {
            addCriterion("rv_Id not between", value1, value2, "rvId");
            return (Criteria) this;
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

        public Criteria andRvServiceRatIsNull() {
            addCriterion("rv_Service_rat is null");
            return (Criteria) this;
        }

        public Criteria andRvServiceRatIsNotNull() {
            addCriterion("rv_Service_rat is not null");
            return (Criteria) this;
        }

        public Criteria andRvServiceRatEqualTo(Integer value) {
            addCriterion("rv_Service_rat =", value, "rvServiceRat");
            return (Criteria) this;
        }

        public Criteria andRvServiceRatNotEqualTo(Integer value) {
            addCriterion("rv_Service_rat <>", value, "rvServiceRat");
            return (Criteria) this;
        }

        public Criteria andRvServiceRatGreaterThan(Integer value) {
            addCriterion("rv_Service_rat >", value, "rvServiceRat");
            return (Criteria) this;
        }

        public Criteria andRvServiceRatGreaterThanOrEqualTo(Integer value) {
            addCriterion("rv_Service_rat >=", value, "rvServiceRat");
            return (Criteria) this;
        }

        public Criteria andRvServiceRatLessThan(Integer value) {
            addCriterion("rv_Service_rat <", value, "rvServiceRat");
            return (Criteria) this;
        }

        public Criteria andRvServiceRatLessThanOrEqualTo(Integer value) {
            addCriterion("rv_Service_rat <=", value, "rvServiceRat");
            return (Criteria) this;
        }

        public Criteria andRvServiceRatIn(List<Integer> values) {
            addCriterion("rv_Service_rat in", values, "rvServiceRat");
            return (Criteria) this;
        }

        public Criteria andRvServiceRatNotIn(List<Integer> values) {
            addCriterion("rv_Service_rat not in", values, "rvServiceRat");
            return (Criteria) this;
        }

        public Criteria andRvServiceRatBetween(Integer value1, Integer value2) {
            addCriterion("rv_Service_rat between", value1, value2, "rvServiceRat");
            return (Criteria) this;
        }

        public Criteria andRvServiceRatNotBetween(Integer value1, Integer value2) {
            addCriterion("rv_Service_rat not between", value1, value2, "rvServiceRat");
            return (Criteria) this;
        }

        public Criteria andRvFacilityRatIsNull() {
            addCriterion("rv_Facility_rat is null");
            return (Criteria) this;
        }

        public Criteria andRvFacilityRatIsNotNull() {
            addCriterion("rv_Facility_rat is not null");
            return (Criteria) this;
        }

        public Criteria andRvFacilityRatEqualTo(Integer value) {
            addCriterion("rv_Facility_rat =", value, "rvFacilityRat");
            return (Criteria) this;
        }

        public Criteria andRvFacilityRatNotEqualTo(Integer value) {
            addCriterion("rv_Facility_rat <>", value, "rvFacilityRat");
            return (Criteria) this;
        }

        public Criteria andRvFacilityRatGreaterThan(Integer value) {
            addCriterion("rv_Facility_rat >", value, "rvFacilityRat");
            return (Criteria) this;
        }

        public Criteria andRvFacilityRatGreaterThanOrEqualTo(Integer value) {
            addCriterion("rv_Facility_rat >=", value, "rvFacilityRat");
            return (Criteria) this;
        }

        public Criteria andRvFacilityRatLessThan(Integer value) {
            addCriterion("rv_Facility_rat <", value, "rvFacilityRat");
            return (Criteria) this;
        }

        public Criteria andRvFacilityRatLessThanOrEqualTo(Integer value) {
            addCriterion("rv_Facility_rat <=", value, "rvFacilityRat");
            return (Criteria) this;
        }

        public Criteria andRvFacilityRatIn(List<Integer> values) {
            addCriterion("rv_Facility_rat in", values, "rvFacilityRat");
            return (Criteria) this;
        }

        public Criteria andRvFacilityRatNotIn(List<Integer> values) {
            addCriterion("rv_Facility_rat not in", values, "rvFacilityRat");
            return (Criteria) this;
        }

        public Criteria andRvFacilityRatBetween(Integer value1, Integer value2) {
            addCriterion("rv_Facility_rat between", value1, value2, "rvFacilityRat");
            return (Criteria) this;
        }

        public Criteria andRvFacilityRatNotBetween(Integer value1, Integer value2) {
            addCriterion("rv_Facility_rat not between", value1, value2, "rvFacilityRat");
            return (Criteria) this;
        }

        public Criteria andRvReviewIsNull() {
            addCriterion("rv_Review is null");
            return (Criteria) this;
        }

        public Criteria andRvReviewIsNotNull() {
            addCriterion("rv_Review is not null");
            return (Criteria) this;
        }

        public Criteria andRvReviewEqualTo(String value) {
            addCriterion("rv_Review =", value, "rvReview");
            return (Criteria) this;
        }

        public Criteria andRvReviewNotEqualTo(String value) {
            addCriterion("rv_Review <>", value, "rvReview");
            return (Criteria) this;
        }

        public Criteria andRvReviewGreaterThan(String value) {
            addCriterion("rv_Review >", value, "rvReview");
            return (Criteria) this;
        }

        public Criteria andRvReviewGreaterThanOrEqualTo(String value) {
            addCriterion("rv_Review >=", value, "rvReview");
            return (Criteria) this;
        }

        public Criteria andRvReviewLessThan(String value) {
            addCriterion("rv_Review <", value, "rvReview");
            return (Criteria) this;
        }

        public Criteria andRvReviewLessThanOrEqualTo(String value) {
            addCriterion("rv_Review <=", value, "rvReview");
            return (Criteria) this;
        }

        public Criteria andRvReviewLike(String value) {
            addCriterion("rv_Review like", value, "rvReview");
            return (Criteria) this;
        }

        public Criteria andRvReviewNotLike(String value) {
            addCriterion("rv_Review not like", value, "rvReview");
            return (Criteria) this;
        }

        public Criteria andRvReviewIn(List<String> values) {
            addCriterion("rv_Review in", values, "rvReview");
            return (Criteria) this;
        }

        public Criteria andRvReviewNotIn(List<String> values) {
            addCriterion("rv_Review not in", values, "rvReview");
            return (Criteria) this;
        }

        public Criteria andRvReviewBetween(String value1, String value2) {
            addCriterion("rv_Review between", value1, value2, "rvReview");
            return (Criteria) this;
        }

        public Criteria andRvReviewNotBetween(String value1, String value2) {
            addCriterion("rv_Review not between", value1, value2, "rvReview");
            return (Criteria) this;
        }

        public Criteria andRvPicurlIsNull() {
            addCriterion("rv_PicUrl is null");
            return (Criteria) this;
        }

        public Criteria andRvPicurlIsNotNull() {
            addCriterion("rv_PicUrl is not null");
            return (Criteria) this;
        }

        public Criteria andRvPicurlEqualTo(String value) {
            addCriterion("rv_PicUrl =", value, "rvPicurl");
            return (Criteria) this;
        }

        public Criteria andRvPicurlNotEqualTo(String value) {
            addCriterion("rv_PicUrl <>", value, "rvPicurl");
            return (Criteria) this;
        }

        public Criteria andRvPicurlGreaterThan(String value) {
            addCriterion("rv_PicUrl >", value, "rvPicurl");
            return (Criteria) this;
        }

        public Criteria andRvPicurlGreaterThanOrEqualTo(String value) {
            addCriterion("rv_PicUrl >=", value, "rvPicurl");
            return (Criteria) this;
        }

        public Criteria andRvPicurlLessThan(String value) {
            addCriterion("rv_PicUrl <", value, "rvPicurl");
            return (Criteria) this;
        }

        public Criteria andRvPicurlLessThanOrEqualTo(String value) {
            addCriterion("rv_PicUrl <=", value, "rvPicurl");
            return (Criteria) this;
        }

        public Criteria andRvPicurlLike(String value) {
            addCriterion("rv_PicUrl like", value, "rvPicurl");
            return (Criteria) this;
        }

        public Criteria andRvPicurlNotLike(String value) {
            addCriterion("rv_PicUrl not like", value, "rvPicurl");
            return (Criteria) this;
        }

        public Criteria andRvPicurlIn(List<String> values) {
            addCriterion("rv_PicUrl in", values, "rvPicurl");
            return (Criteria) this;
        }

        public Criteria andRvPicurlNotIn(List<String> values) {
            addCriterion("rv_PicUrl not in", values, "rvPicurl");
            return (Criteria) this;
        }

        public Criteria andRvPicurlBetween(String value1, String value2) {
            addCriterion("rv_PicUrl between", value1, value2, "rvPicurl");
            return (Criteria) this;
        }

        public Criteria andRvPicurlNotBetween(String value1, String value2) {
            addCriterion("rv_PicUrl not between", value1, value2, "rvPicurl");
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