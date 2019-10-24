package com.rent.bean;

import java.io.Serializable;
import java.util.List;

public class HouseInfo implements Serializable {
    private Long hsId;

    private String hsDistrict;

    private String hsCity;

    private double hsRent;

    private String hsType;

    private String hsHousingEstate;

    private String hsdIdoorMAddr;

    private Long hsArea;

    private Long hsRat;

    private List<String> houseAttrValueList;

    public HouseInfo() {
    }

    public HouseInfo(Long hsId, String hsDistrict, String hsCity, double hsRent, String hsType, String hsHousingEstate, String hsdIdoorMAddr, Long hsArea, Long hsRat, List<String> houseAttrValueList) {
        this.hsId = hsId;
        this.hsDistrict = hsDistrict;
        this.hsCity = hsCity;
        this.hsRent = hsRent;
        this.hsType = hsType;
        this.hsHousingEstate = hsHousingEstate;
        this.hsdIdoorMAddr = hsdIdoorMAddr;
        this.hsArea = hsArea;
        this.hsRat = hsRat;
        this.houseAttrValueList = houseAttrValueList;
    }

    public Long getHsRat() {
        return hsRat;
    }

    public void setHsRat(Long hsRat) {
        this.hsRat = hsRat;
    }

    @Override
    public String toString() {
        return "HouseInfo{" +
                "hsId=" + hsId +
                ", hsDistrict='" + hsDistrict + '\'' +
                ", hsCity='" + hsCity + '\'' +
                ", hsRent=" + hsRent +
                ", hsType='" + hsType + '\'' +
                ", hsHousingEstate='" + hsHousingEstate + '\'' +
                ", hsdIdoorMAddr='" + hsdIdoorMAddr + '\'' +
                ", hsArea=" + hsArea +
                ", hsRat=" + hsRat +
                ", houseAttrValueList=" + houseAttrValueList +
                '}';
    }

    public List<String> getHouseAttrValueList() {
        return houseAttrValueList;
    }

    public void setHouseAttrValueList(List<String> houseAttrValueList) {
        this.houseAttrValueList = houseAttrValueList;
    }

    public Long getHsId() {
        return hsId;
    }

    public void setHsId(Long hsId) {
        this.hsId = hsId;
    }

    public String getHsDistrict() {
        return hsDistrict;
    }

    public void setHsDistrict(String hsDistrict) {
        this.hsDistrict = hsDistrict;
    }

    public String getHsCity() {
        return hsCity;
    }

    public void setHsCity(String hsCity) {
        this.hsCity = hsCity;
    }

    public double getHsRent() {
        return hsRent;
    }

    public void setHsRent(double hsRent) {
        this.hsRent = hsRent;
    }

    public String getHsType() {
        return hsType;
    }

    public void setHsType(String hsType) {
        this.hsType = hsType;
    }

    public String getHsHousingEstate() {
        return hsHousingEstate;
    }

    public void setHsHousingEstate(String hsHousingEstate) {
        this.hsHousingEstate = hsHousingEstate;
    }

    public String getHsdIdoorMAddr() {
        return hsdIdoorMAddr;
    }

    public void setHsdIdoorMAddr(String hsdIdoorMAddr) {
        this.hsdIdoorMAddr = hsdIdoorMAddr;
    }

    public Long getHsArea() {
        return hsArea;
    }

    public void setHsArea(Long hsArea) {
        this.hsArea = hsArea;
    }


}
