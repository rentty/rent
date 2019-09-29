package com.rent.bean;

import java.util.ArrayList;
import java.util.List;

public class UserinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserinfoExample() {
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

        public Criteria andUifNicknameIsNull() {
            addCriterion("uif_NickName is null");
            return (Criteria) this;
        }

        public Criteria andUifNicknameIsNotNull() {
            addCriterion("uif_NickName is not null");
            return (Criteria) this;
        }

        public Criteria andUifNicknameEqualTo(String value) {
            addCriterion("uif_NickName =", value, "uifNickname");
            return (Criteria) this;
        }

        public Criteria andUifNicknameNotEqualTo(String value) {
            addCriterion("uif_NickName <>", value, "uifNickname");
            return (Criteria) this;
        }

        public Criteria andUifNicknameGreaterThan(String value) {
            addCriterion("uif_NickName >", value, "uifNickname");
            return (Criteria) this;
        }

        public Criteria andUifNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("uif_NickName >=", value, "uifNickname");
            return (Criteria) this;
        }

        public Criteria andUifNicknameLessThan(String value) {
            addCriterion("uif_NickName <", value, "uifNickname");
            return (Criteria) this;
        }

        public Criteria andUifNicknameLessThanOrEqualTo(String value) {
            addCriterion("uif_NickName <=", value, "uifNickname");
            return (Criteria) this;
        }

        public Criteria andUifNicknameLike(String value) {
            addCriterion("uif_NickName like", value, "uifNickname");
            return (Criteria) this;
        }

        public Criteria andUifNicknameNotLike(String value) {
            addCriterion("uif_NickName not like", value, "uifNickname");
            return (Criteria) this;
        }

        public Criteria andUifNicknameIn(List<String> values) {
            addCriterion("uif_NickName in", values, "uifNickname");
            return (Criteria) this;
        }

        public Criteria andUifNicknameNotIn(List<String> values) {
            addCriterion("uif_NickName not in", values, "uifNickname");
            return (Criteria) this;
        }

        public Criteria andUifNicknameBetween(String value1, String value2) {
            addCriterion("uif_NickName between", value1, value2, "uifNickname");
            return (Criteria) this;
        }

        public Criteria andUifNicknameNotBetween(String value1, String value2) {
            addCriterion("uif_NickName not between", value1, value2, "uifNickname");
            return (Criteria) this;
        }

        public Criteria andUifAvatarIsNull() {
            addCriterion("uif_Avatar is null");
            return (Criteria) this;
        }

        public Criteria andUifAvatarIsNotNull() {
            addCriterion("uif_Avatar is not null");
            return (Criteria) this;
        }

        public Criteria andUifAvatarEqualTo(String value) {
            addCriterion("uif_Avatar =", value, "uifAvatar");
            return (Criteria) this;
        }

        public Criteria andUifAvatarNotEqualTo(String value) {
            addCriterion("uif_Avatar <>", value, "uifAvatar");
            return (Criteria) this;
        }

        public Criteria andUifAvatarGreaterThan(String value) {
            addCriterion("uif_Avatar >", value, "uifAvatar");
            return (Criteria) this;
        }

        public Criteria andUifAvatarGreaterThanOrEqualTo(String value) {
            addCriterion("uif_Avatar >=", value, "uifAvatar");
            return (Criteria) this;
        }

        public Criteria andUifAvatarLessThan(String value) {
            addCriterion("uif_Avatar <", value, "uifAvatar");
            return (Criteria) this;
        }

        public Criteria andUifAvatarLessThanOrEqualTo(String value) {
            addCriterion("uif_Avatar <=", value, "uifAvatar");
            return (Criteria) this;
        }

        public Criteria andUifAvatarLike(String value) {
            addCriterion("uif_Avatar like", value, "uifAvatar");
            return (Criteria) this;
        }

        public Criteria andUifAvatarNotLike(String value) {
            addCriterion("uif_Avatar not like", value, "uifAvatar");
            return (Criteria) this;
        }

        public Criteria andUifAvatarIn(List<String> values) {
            addCriterion("uif_Avatar in", values, "uifAvatar");
            return (Criteria) this;
        }

        public Criteria andUifAvatarNotIn(List<String> values) {
            addCriterion("uif_Avatar not in", values, "uifAvatar");
            return (Criteria) this;
        }

        public Criteria andUifAvatarBetween(String value1, String value2) {
            addCriterion("uif_Avatar between", value1, value2, "uifAvatar");
            return (Criteria) this;
        }

        public Criteria andUifAvatarNotBetween(String value1, String value2) {
            addCriterion("uif_Avatar not between", value1, value2, "uifAvatar");
            return (Criteria) this;
        }

        public Criteria andUifPhoneIsNull() {
            addCriterion("uif_Phone is null");
            return (Criteria) this;
        }

        public Criteria andUifPhoneIsNotNull() {
            addCriterion("uif_Phone is not null");
            return (Criteria) this;
        }

        public Criteria andUifPhoneEqualTo(String value) {
            addCriterion("uif_Phone =", value, "uifPhone");
            return (Criteria) this;
        }

        public Criteria andUifPhoneNotEqualTo(String value) {
            addCriterion("uif_Phone <>", value, "uifPhone");
            return (Criteria) this;
        }

        public Criteria andUifPhoneGreaterThan(String value) {
            addCriterion("uif_Phone >", value, "uifPhone");
            return (Criteria) this;
        }

        public Criteria andUifPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("uif_Phone >=", value, "uifPhone");
            return (Criteria) this;
        }

        public Criteria andUifPhoneLessThan(String value) {
            addCriterion("uif_Phone <", value, "uifPhone");
            return (Criteria) this;
        }

        public Criteria andUifPhoneLessThanOrEqualTo(String value) {
            addCriterion("uif_Phone <=", value, "uifPhone");
            return (Criteria) this;
        }

        public Criteria andUifPhoneLike(String value) {
            addCriterion("uif_Phone like", value, "uifPhone");
            return (Criteria) this;
        }

        public Criteria andUifPhoneNotLike(String value) {
            addCriterion("uif_Phone not like", value, "uifPhone");
            return (Criteria) this;
        }

        public Criteria andUifPhoneIn(List<String> values) {
            addCriterion("uif_Phone in", values, "uifPhone");
            return (Criteria) this;
        }

        public Criteria andUifPhoneNotIn(List<String> values) {
            addCriterion("uif_Phone not in", values, "uifPhone");
            return (Criteria) this;
        }

        public Criteria andUifPhoneBetween(String value1, String value2) {
            addCriterion("uif_Phone between", value1, value2, "uifPhone");
            return (Criteria) this;
        }

        public Criteria andUifPhoneNotBetween(String value1, String value2) {
            addCriterion("uif_Phone not between", value1, value2, "uifPhone");
            return (Criteria) this;
        }

        public Criteria andUifWechatcodeIsNull() {
            addCriterion("uif_WeChatCode is null");
            return (Criteria) this;
        }

        public Criteria andUifWechatcodeIsNotNull() {
            addCriterion("uif_WeChatCode is not null");
            return (Criteria) this;
        }

        public Criteria andUifWechatcodeEqualTo(String value) {
            addCriterion("uif_WeChatCode =", value, "uifWechatcode");
            return (Criteria) this;
        }

        public Criteria andUifWechatcodeNotEqualTo(String value) {
            addCriterion("uif_WeChatCode <>", value, "uifWechatcode");
            return (Criteria) this;
        }

        public Criteria andUifWechatcodeGreaterThan(String value) {
            addCriterion("uif_WeChatCode >", value, "uifWechatcode");
            return (Criteria) this;
        }

        public Criteria andUifWechatcodeGreaterThanOrEqualTo(String value) {
            addCriterion("uif_WeChatCode >=", value, "uifWechatcode");
            return (Criteria) this;
        }

        public Criteria andUifWechatcodeLessThan(String value) {
            addCriterion("uif_WeChatCode <", value, "uifWechatcode");
            return (Criteria) this;
        }

        public Criteria andUifWechatcodeLessThanOrEqualTo(String value) {
            addCriterion("uif_WeChatCode <=", value, "uifWechatcode");
            return (Criteria) this;
        }

        public Criteria andUifWechatcodeLike(String value) {
            addCriterion("uif_WeChatCode like", value, "uifWechatcode");
            return (Criteria) this;
        }

        public Criteria andUifWechatcodeNotLike(String value) {
            addCriterion("uif_WeChatCode not like", value, "uifWechatcode");
            return (Criteria) this;
        }

        public Criteria andUifWechatcodeIn(List<String> values) {
            addCriterion("uif_WeChatCode in", values, "uifWechatcode");
            return (Criteria) this;
        }

        public Criteria andUifWechatcodeNotIn(List<String> values) {
            addCriterion("uif_WeChatCode not in", values, "uifWechatcode");
            return (Criteria) this;
        }

        public Criteria andUifWechatcodeBetween(String value1, String value2) {
            addCriterion("uif_WeChatCode between", value1, value2, "uifWechatcode");
            return (Criteria) this;
        }

        public Criteria andUifWechatcodeNotBetween(String value1, String value2) {
            addCriterion("uif_WeChatCode not between", value1, value2, "uifWechatcode");
            return (Criteria) this;
        }

        public Criteria andUifUsertypeIsNull() {
            addCriterion("uif_UserType is null");
            return (Criteria) this;
        }

        public Criteria andUifUsertypeIsNotNull() {
            addCriterion("uif_UserType is not null");
            return (Criteria) this;
        }

        public Criteria andUifUsertypeEqualTo(Integer value) {
            addCriterion("uif_UserType =", value, "uifUsertype");
            return (Criteria) this;
        }

        public Criteria andUifUsertypeNotEqualTo(Integer value) {
            addCriterion("uif_UserType <>", value, "uifUsertype");
            return (Criteria) this;
        }

        public Criteria andUifUsertypeGreaterThan(Integer value) {
            addCriterion("uif_UserType >", value, "uifUsertype");
            return (Criteria) this;
        }

        public Criteria andUifUsertypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("uif_UserType >=", value, "uifUsertype");
            return (Criteria) this;
        }

        public Criteria andUifUsertypeLessThan(Integer value) {
            addCriterion("uif_UserType <", value, "uifUsertype");
            return (Criteria) this;
        }

        public Criteria andUifUsertypeLessThanOrEqualTo(Integer value) {
            addCriterion("uif_UserType <=", value, "uifUsertype");
            return (Criteria) this;
        }

        public Criteria andUifUsertypeIn(List<Integer> values) {
            addCriterion("uif_UserType in", values, "uifUsertype");
            return (Criteria) this;
        }

        public Criteria andUifUsertypeNotIn(List<Integer> values) {
            addCriterion("uif_UserType not in", values, "uifUsertype");
            return (Criteria) this;
        }

        public Criteria andUifUsertypeBetween(Integer value1, Integer value2) {
            addCriterion("uif_UserType between", value1, value2, "uifUsertype");
            return (Criteria) this;
        }

        public Criteria andUifUsertypeNotBetween(Integer value1, Integer value2) {
            addCriterion("uif_UserType not between", value1, value2, "uifUsertype");
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