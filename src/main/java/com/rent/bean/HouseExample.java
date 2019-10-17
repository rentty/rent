package com.rent.bean;

import java.util.ArrayList;
import java.util.List;

public class HouseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HouseExample() {
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

        public Criteria andHsTypeIsNull() {
            addCriterion("hs_Type is null");
            return (Criteria) this;
        }

        public Criteria andHsTypeIsNotNull() {
            addCriterion("hs_Type is not null");
            return (Criteria) this;
        }

        public Criteria andHsTypeEqualTo(String value) {
            addCriterion("hs_Type =", value, "hsType");
            return (Criteria) this;
        }

        public Criteria andHsTypeNotEqualTo(String value) {
            addCriterion("hs_Type <>", value, "hsType");
            return (Criteria) this;
        }

        public Criteria andHsTypeGreaterThan(String value) {
            addCriterion("hs_Type >", value, "hsType");
            return (Criteria) this;
        }

        public Criteria andHsTypeGreaterThanOrEqualTo(String value) {
            addCriterion("hs_Type >=", value, "hsType");
            return (Criteria) this;
        }

        public Criteria andHsTypeLessThan(String value) {
            addCriterion("hs_Type <", value, "hsType");
            return (Criteria) this;
        }

        public Criteria andHsTypeLessThanOrEqualTo(String value) {
            addCriterion("hs_Type <=", value, "hsType");
            return (Criteria) this;
        }

        public Criteria andHsTypeLike(String value) {
            addCriterion("hs_Type like", value, "hsType");
            return (Criteria) this;
        }

        public Criteria andHsTypeNotLike(String value) {
            addCriterion("hs_Type not like", value, "hsType");
            return (Criteria) this;
        }

        public Criteria andHsTypeIn(List<String> values) {
            addCriterion("hs_Type in", values, "hsType");
            return (Criteria) this;
        }

        public Criteria andHsTypeNotIn(List<String> values) {
            addCriterion("hs_Type not in", values, "hsType");
            return (Criteria) this;
        }

        public Criteria andHsTypeBetween(String value1, String value2) {
            addCriterion("hs_Type between", value1, value2, "hsType");
            return (Criteria) this;
        }

        public Criteria andHsTypeNotBetween(String value1, String value2) {
            addCriterion("hs_Type not between", value1, value2, "hsType");
            return (Criteria) this;
        }

        public Criteria andHsAreaIsNull() {
            addCriterion("hs_Area is null");
            return (Criteria) this;
        }

        public Criteria andHsAreaIsNotNull() {
            addCriterion("hs_Area is not null");
            return (Criteria) this;
        }

        public Criteria andHsAreaEqualTo(Integer value) {
            addCriterion("hs_Area =", value, "hsArea");
            return (Criteria) this;
        }

        public Criteria andHsAreaNotEqualTo(Integer value) {
            addCriterion("hs_Area <>", value, "hsArea");
            return (Criteria) this;
        }

        public Criteria andHsAreaGreaterThan(Integer value) {
            addCriterion("hs_Area >", value, "hsArea");
            return (Criteria) this;
        }

        public Criteria andHsAreaGreaterThanOrEqualTo(Integer value) {
            addCriterion("hs_Area >=", value, "hsArea");
            return (Criteria) this;
        }

        public Criteria andHsAreaLessThan(Integer value) {
            addCriterion("hs_Area <", value, "hsArea");
            return (Criteria) this;
        }

        public Criteria andHsAreaLessThanOrEqualTo(Integer value) {
            addCriterion("hs_Area <=", value, "hsArea");
            return (Criteria) this;
        }

        public Criteria andHsAreaIn(List<Integer> values) {
            addCriterion("hs_Area in", values, "hsArea");
            return (Criteria) this;
        }

        public Criteria andHsAreaNotIn(List<Integer> values) {
            addCriterion("hs_Area not in", values, "hsArea");
            return (Criteria) this;
        }

        public Criteria andHsAreaBetween(Integer value1, Integer value2) {
            addCriterion("hs_Area between", value1, value2, "hsArea");
            return (Criteria) this;
        }

        public Criteria andHsAreaNotBetween(Integer value1, Integer value2) {
            addCriterion("hs_Area not between", value1, value2, "hsArea");
            return (Criteria) this;
        }

        public Criteria andHsCityIsNull() {
            addCriterion("hs_City is null");
            return (Criteria) this;
        }

        public Criteria andHsCityIsNotNull() {
            addCriterion("hs_City is not null");
            return (Criteria) this;
        }

        public Criteria andHsCityEqualTo(String value) {
            addCriterion("hs_City =", value, "hsCity");
            return (Criteria) this;
        }

        public Criteria andHsCityNotEqualTo(String value) {
            addCriterion("hs_City <>", value, "hsCity");
            return (Criteria) this;
        }

        public Criteria andHsCityGreaterThan(String value) {
            addCriterion("hs_City >", value, "hsCity");
            return (Criteria) this;
        }

        public Criteria andHsCityGreaterThanOrEqualTo(String value) {
            addCriterion("hs_City >=", value, "hsCity");
            return (Criteria) this;
        }

        public Criteria andHsCityLessThan(String value) {
            addCriterion("hs_City <", value, "hsCity");
            return (Criteria) this;
        }

        public Criteria andHsCityLessThanOrEqualTo(String value) {
            addCriterion("hs_City <=", value, "hsCity");
            return (Criteria) this;
        }

        public Criteria andHsCityLike(String value) {
            addCriterion("hs_City like", value, "hsCity");
            return (Criteria) this;
        }

        public Criteria andHsCityNotLike(String value) {
            addCriterion("hs_City not like", value, "hsCity");
            return (Criteria) this;
        }

        public Criteria andHsCityIn(List<String> values) {
            addCriterion("hs_City in", values, "hsCity");
            return (Criteria) this;
        }

        public Criteria andHsCityNotIn(List<String> values) {
            addCriterion("hs_City not in", values, "hsCity");
            return (Criteria) this;
        }

        public Criteria andHsCityBetween(String value1, String value2) {
            addCriterion("hs_City between", value1, value2, "hsCity");
            return (Criteria) this;
        }

        public Criteria andHsCityNotBetween(String value1, String value2) {
            addCriterion("hs_City not between", value1, value2, "hsCity");
            return (Criteria) this;
        }

        public Criteria andHsDistrictIsNull() {
            addCriterion("hs_District is null");
            return (Criteria) this;
        }

        public Criteria andHsDistrictIsNotNull() {
            addCriterion("hs_District is not null");
            return (Criteria) this;
        }

        public Criteria andHsDistrictEqualTo(String value) {
            addCriterion("hs_District =", value, "hsDistrict");
            return (Criteria) this;
        }

        public Criteria andHsDistrictNotEqualTo(String value) {
            addCriterion("hs_District <>", value, "hsDistrict");
            return (Criteria) this;
        }

        public Criteria andHsDistrictGreaterThan(String value) {
            addCriterion("hs_District >", value, "hsDistrict");
            return (Criteria) this;
        }

        public Criteria andHsDistrictGreaterThanOrEqualTo(String value) {
            addCriterion("hs_District >=", value, "hsDistrict");
            return (Criteria) this;
        }

        public Criteria andHsDistrictLessThan(String value) {
            addCriterion("hs_District <", value, "hsDistrict");
            return (Criteria) this;
        }

        public Criteria andHsDistrictLessThanOrEqualTo(String value) {
            addCriterion("hs_District <=", value, "hsDistrict");
            return (Criteria) this;
        }

        public Criteria andHsDistrictLike(String value) {
            addCriterion("hs_District like", value, "hsDistrict");
            return (Criteria) this;
        }

        public Criteria andHsDistrictNotLike(String value) {
            addCriterion("hs_District not like", value, "hsDistrict");
            return (Criteria) this;
        }

        public Criteria andHsDistrictIn(List<String> values) {
            addCriterion("hs_District in", values, "hsDistrict");
            return (Criteria) this;
        }

        public Criteria andHsDistrictNotIn(List<String> values) {
            addCriterion("hs_District not in", values, "hsDistrict");
            return (Criteria) this;
        }

        public Criteria andHsDistrictBetween(String value1, String value2) {
            addCriterion("hs_District between", value1, value2, "hsDistrict");
            return (Criteria) this;
        }

        public Criteria andHsDistrictNotBetween(String value1, String value2) {
            addCriterion("hs_District not between", value1, value2, "hsDistrict");
            return (Criteria) this;
        }

        public Criteria andHsHousingestateIsNull() {
            addCriterion("hs_HousingEstate is null");
            return (Criteria) this;
        }

        public Criteria andHsHousingestateIsNotNull() {
            addCriterion("hs_HousingEstate is not null");
            return (Criteria) this;
        }

        public Criteria andHsHousingestateEqualTo(String value) {
            addCriterion("hs_HousingEstate =", value, "hsHousingestate");
            return (Criteria) this;
        }

        public Criteria andHsHousingestateNotEqualTo(String value) {
            addCriterion("hs_HousingEstate <>", value, "hsHousingestate");
            return (Criteria) this;
        }

        public Criteria andHsHousingestateGreaterThan(String value) {
            addCriterion("hs_HousingEstate >", value, "hsHousingestate");
            return (Criteria) this;
        }

        public Criteria andHsHousingestateGreaterThanOrEqualTo(String value) {
            addCriterion("hs_HousingEstate >=", value, "hsHousingestate");
            return (Criteria) this;
        }

        public Criteria andHsHousingestateLessThan(String value) {
            addCriterion("hs_HousingEstate <", value, "hsHousingestate");
            return (Criteria) this;
        }

        public Criteria andHsHousingestateLessThanOrEqualTo(String value) {
            addCriterion("hs_HousingEstate <=", value, "hsHousingestate");
            return (Criteria) this;
        }

        public Criteria andHsHousingestateLike(String value) {
            addCriterion("hs_HousingEstate like", value, "hsHousingestate");
            return (Criteria) this;
        }

        public Criteria andHsHousingestateNotLike(String value) {
            addCriterion("hs_HousingEstate not like", value, "hsHousingestate");
            return (Criteria) this;
        }

        public Criteria andHsHousingestateIn(List<String> values) {
            addCriterion("hs_HousingEstate in", values, "hsHousingestate");
            return (Criteria) this;
        }

        public Criteria andHsHousingestateNotIn(List<String> values) {
            addCriterion("hs_HousingEstate not in", values, "hsHousingestate");
            return (Criteria) this;
        }

        public Criteria andHsHousingestateBetween(String value1, String value2) {
            addCriterion("hs_HousingEstate between", value1, value2, "hsHousingestate");
            return (Criteria) this;
        }

        public Criteria andHsHousingestateNotBetween(String value1, String value2) {
            addCriterion("hs_HousingEstate not between", value1, value2, "hsHousingestate");
            return (Criteria) this;
        }

        public Criteria andHsAddressIsNull() {
            addCriterion("hs_Address is null");
            return (Criteria) this;
        }

        public Criteria andHsAddressIsNotNull() {
            addCriterion("hs_Address is not null");
            return (Criteria) this;
        }

        public Criteria andHsAddressEqualTo(String value) {
            addCriterion("hs_Address =", value, "hsAddress");
            return (Criteria) this;
        }

        public Criteria andHsAddressNotEqualTo(String value) {
            addCriterion("hs_Address <>", value, "hsAddress");
            return (Criteria) this;
        }

        public Criteria andHsAddressGreaterThan(String value) {
            addCriterion("hs_Address >", value, "hsAddress");
            return (Criteria) this;
        }

        public Criteria andHsAddressGreaterThanOrEqualTo(String value) {
            addCriterion("hs_Address >=", value, "hsAddress");
            return (Criteria) this;
        }

        public Criteria andHsAddressLessThan(String value) {
            addCriterion("hs_Address <", value, "hsAddress");
            return (Criteria) this;
        }

        public Criteria andHsAddressLessThanOrEqualTo(String value) {
            addCriterion("hs_Address <=", value, "hsAddress");
            return (Criteria) this;
        }

        public Criteria andHsAddressLike(String value) {
            addCriterion("hs_Address like", value, "hsAddress");
            return (Criteria) this;
        }

        public Criteria andHsAddressNotLike(String value) {
            addCriterion("hs_Address not like", value, "hsAddress");
            return (Criteria) this;
        }

        public Criteria andHsAddressIn(List<String> values) {
            addCriterion("hs_Address in", values, "hsAddress");
            return (Criteria) this;
        }

        public Criteria andHsAddressNotIn(List<String> values) {
            addCriterion("hs_Address not in", values, "hsAddress");
            return (Criteria) this;
        }

        public Criteria andHsAddressBetween(String value1, String value2) {
            addCriterion("hs_Address between", value1, value2, "hsAddress");
            return (Criteria) this;
        }

        public Criteria andHsAddressNotBetween(String value1, String value2) {
            addCriterion("hs_Address not between", value1, value2, "hsAddress");
            return (Criteria) this;
        }

        public Criteria andHsLayerIsNull() {
            addCriterion("hs_Layer is null");
            return (Criteria) this;
        }

        public Criteria andHsLayerIsNotNull() {
            addCriterion("hs_Layer is not null");
            return (Criteria) this;
        }

        public Criteria andHsLayerEqualTo(Integer value) {
            addCriterion("hs_Layer =", value, "hsLayer");
            return (Criteria) this;
        }

        public Criteria andHsLayerNotEqualTo(Integer value) {
            addCriterion("hs_Layer <>", value, "hsLayer");
            return (Criteria) this;
        }

        public Criteria andHsLayerGreaterThan(Integer value) {
            addCriterion("hs_Layer >", value, "hsLayer");
            return (Criteria) this;
        }

        public Criteria andHsLayerGreaterThanOrEqualTo(Integer value) {
            addCriterion("hs_Layer >=", value, "hsLayer");
            return (Criteria) this;
        }

        public Criteria andHsLayerLessThan(Integer value) {
            addCriterion("hs_Layer <", value, "hsLayer");
            return (Criteria) this;
        }

        public Criteria andHsLayerLessThanOrEqualTo(Integer value) {
            addCriterion("hs_Layer <=", value, "hsLayer");
            return (Criteria) this;
        }

        public Criteria andHsLayerIn(List<Integer> values) {
            addCriterion("hs_Layer in", values, "hsLayer");
            return (Criteria) this;
        }

        public Criteria andHsLayerNotIn(List<Integer> values) {
            addCriterion("hs_Layer not in", values, "hsLayer");
            return (Criteria) this;
        }

        public Criteria andHsLayerBetween(Integer value1, Integer value2) {
            addCriterion("hs_Layer between", value1, value2, "hsLayer");
            return (Criteria) this;
        }

        public Criteria andHsLayerNotBetween(Integer value1, Integer value2) {
            addCriterion("hs_Layer not between", value1, value2, "hsLayer");
            return (Criteria) this;
        }

        public Criteria andHsOrientedIsNull() {
            addCriterion("hs_Oriented is null");
            return (Criteria) this;
        }

        public Criteria andHsOrientedIsNotNull() {
            addCriterion("hs_Oriented is not null");
            return (Criteria) this;
        }

        public Criteria andHsOrientedEqualTo(String value) {
            addCriterion("hs_Oriented =", value, "hsOriented");
            return (Criteria) this;
        }

        public Criteria andHsOrientedNotEqualTo(String value) {
            addCriterion("hs_Oriented <>", value, "hsOriented");
            return (Criteria) this;
        }

        public Criteria andHsOrientedGreaterThan(String value) {
            addCriterion("hs_Oriented >", value, "hsOriented");
            return (Criteria) this;
        }

        public Criteria andHsOrientedGreaterThanOrEqualTo(String value) {
            addCriterion("hs_Oriented >=", value, "hsOriented");
            return (Criteria) this;
        }

        public Criteria andHsOrientedLessThan(String value) {
            addCriterion("hs_Oriented <", value, "hsOriented");
            return (Criteria) this;
        }

        public Criteria andHsOrientedLessThanOrEqualTo(String value) {
            addCriterion("hs_Oriented <=", value, "hsOriented");
            return (Criteria) this;
        }

        public Criteria andHsOrientedLike(String value) {
            addCriterion("hs_Oriented like", value, "hsOriented");
            return (Criteria) this;
        }

        public Criteria andHsOrientedNotLike(String value) {
            addCriterion("hs_Oriented not like", value, "hsOriented");
            return (Criteria) this;
        }

        public Criteria andHsOrientedIn(List<String> values) {
            addCriterion("hs_Oriented in", values, "hsOriented");
            return (Criteria) this;
        }

        public Criteria andHsOrientedNotIn(List<String> values) {
            addCriterion("hs_Oriented not in", values, "hsOriented");
            return (Criteria) this;
        }

        public Criteria andHsOrientedBetween(String value1, String value2) {
            addCriterion("hs_Oriented between", value1, value2, "hsOriented");
            return (Criteria) this;
        }

        public Criteria andHsOrientedNotBetween(String value1, String value2) {
            addCriterion("hs_Oriented not between", value1, value2, "hsOriented");
            return (Criteria) this;
        }

        public Criteria andHsLongitudeIsNull() {
            addCriterion("hs_Longitude is null");
            return (Criteria) this;
        }

        public Criteria andHsLongitudeIsNotNull() {
            addCriterion("hs_Longitude is not null");
            return (Criteria) this;
        }

        public Criteria andHsLongitudeEqualTo(Double value) {
            addCriterion("hs_Longitude =", value, "hsLongitude");
            return (Criteria) this;
        }

        public Criteria andHsLongitudeNotEqualTo(Double value) {
            addCriterion("hs_Longitude <>", value, "hsLongitude");
            return (Criteria) this;
        }

        public Criteria andHsLongitudeGreaterThan(Double value) {
            addCriterion("hs_Longitude >", value, "hsLongitude");
            return (Criteria) this;
        }

        public Criteria andHsLongitudeGreaterThanOrEqualTo(Double value) {
            addCriterion("hs_Longitude >=", value, "hsLongitude");
            return (Criteria) this;
        }

        public Criteria andHsLongitudeLessThan(Double value) {
            addCriterion("hs_Longitude <", value, "hsLongitude");
            return (Criteria) this;
        }

        public Criteria andHsLongitudeLessThanOrEqualTo(Double value) {
            addCriterion("hs_Longitude <=", value, "hsLongitude");
            return (Criteria) this;
        }

        public Criteria andHsLongitudeIn(List<Double> values) {
            addCriterion("hs_Longitude in", values, "hsLongitude");
            return (Criteria) this;
        }

        public Criteria andHsLongitudeNotIn(List<Double> values) {
            addCriterion("hs_Longitude not in", values, "hsLongitude");
            return (Criteria) this;
        }

        public Criteria andHsLongitudeBetween(Double value1, Double value2) {
            addCriterion("hs_Longitude between", value1, value2, "hsLongitude");
            return (Criteria) this;
        }

        public Criteria andHsLongitudeNotBetween(Double value1, Double value2) {
            addCriterion("hs_Longitude not between", value1, value2, "hsLongitude");
            return (Criteria) this;
        }

        public Criteria andHsLatitudeIsNull() {
            addCriterion("hs_Latitude is null");
            return (Criteria) this;
        }

        public Criteria andHsLatitudeIsNotNull() {
            addCriterion("hs_Latitude is not null");
            return (Criteria) this;
        }

        public Criteria andHsLatitudeEqualTo(Double value) {
            addCriterion("hs_Latitude =", value, "hsLatitude");
            return (Criteria) this;
        }

        public Criteria andHsLatitudeNotEqualTo(Double value) {
            addCriterion("hs_Latitude <>", value, "hsLatitude");
            return (Criteria) this;
        }

        public Criteria andHsLatitudeGreaterThan(Double value) {
            addCriterion("hs_Latitude >", value, "hsLatitude");
            return (Criteria) this;
        }

        public Criteria andHsLatitudeGreaterThanOrEqualTo(Double value) {
            addCriterion("hs_Latitude >=", value, "hsLatitude");
            return (Criteria) this;
        }

        public Criteria andHsLatitudeLessThan(Double value) {
            addCriterion("hs_Latitude <", value, "hsLatitude");
            return (Criteria) this;
        }

        public Criteria andHsLatitudeLessThanOrEqualTo(Double value) {
            addCriterion("hs_Latitude <=", value, "hsLatitude");
            return (Criteria) this;
        }

        public Criteria andHsLatitudeIn(List<Double> values) {
            addCriterion("hs_Latitude in", values, "hsLatitude");
            return (Criteria) this;
        }

        public Criteria andHsLatitudeNotIn(List<Double> values) {
            addCriterion("hs_Latitude not in", values, "hsLatitude");
            return (Criteria) this;
        }

        public Criteria andHsLatitudeBetween(Double value1, Double value2) {
            addCriterion("hs_Latitude between", value1, value2, "hsLatitude");
            return (Criteria) this;
        }

        public Criteria andHsLatitudeNotBetween(Double value1, Double value2) {
            addCriterion("hs_Latitude not between", value1, value2, "hsLatitude");
            return (Criteria) this;
        }

        public Criteria andHsStatusIsNull() {
            addCriterion("hs_Status is null");
            return (Criteria) this;
        }

        public Criteria andHsStatusIsNotNull() {
            addCriterion("hs_Status is not null");
            return (Criteria) this;
        }

        public Criteria andHsStatusEqualTo(Integer value) {
            addCriterion("hs_Status =", value, "hsStatus");
            return (Criteria) this;
        }

        public Criteria andHsStatusNotEqualTo(Integer value) {
            addCriterion("hs_Status <>", value, "hsStatus");
            return (Criteria) this;
        }

        public Criteria andHsStatusGreaterThan(Integer value) {
            addCriterion("hs_Status >", value, "hsStatus");
            return (Criteria) this;
        }

        public Criteria andHsStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("hs_Status >=", value, "hsStatus");
            return (Criteria) this;
        }

        public Criteria andHsStatusLessThan(Integer value) {
            addCriterion("hs_Status <", value, "hsStatus");
            return (Criteria) this;
        }

        public Criteria andHsStatusLessThanOrEqualTo(Integer value) {
            addCriterion("hs_Status <=", value, "hsStatus");
            return (Criteria) this;
        }

        public Criteria andHsStatusIn(List<Integer> values) {
            addCriterion("hs_Status in", values, "hsStatus");
            return (Criteria) this;
        }

        public Criteria andHsStatusNotIn(List<Integer> values) {
            addCriterion("hs_Status not in", values, "hsStatus");
            return (Criteria) this;
        }

        public Criteria andHsStatusBetween(Integer value1, Integer value2) {
            addCriterion("hs_Status between", value1, value2, "hsStatus");
            return (Criteria) this;
        }

        public Criteria andHsStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("hs_Status not between", value1, value2, "hsStatus");
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