package com.rent.bean;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.List;

public class HouseInfo implements Serializable {
    @ApiModelProperty("房屋编号")
    private Long hsId;

    @ApiModelProperty(value = "县区")
    private String hsDistrict;

    @ApiModelProperty(value = "城市")
    private String hsCity;

    @ApiModelProperty(value = "租金")
    private double hsRent;

    @ApiModelProperty(value = "户型")
    private String hsType;

    @ApiModelProperty(value = "小区")
    private String hsHousingEstate;

    @ApiModelProperty(value = "标题")
    private String hsTitle;

    @ApiModelProperty(value = "室内图地址，图片服务器上的地址")
    private String hsdIdoorMAddr;

    @ApiModelProperty(value = "面积")
    private Long hsArea;

    @ApiModelProperty(value = "筛选的信息对应编号集合")
    private List<String> houseAttrValueList;

    public HouseInfo() {
    }

    public HouseInfo(Long hsId, String hsDistrict, String hsCity, double hsRent, String hsType, String hsHousingEstate, String hsTitle, String hsdIdoorMAddr, Long hsArea, List<String> houseAttrValueList) {
        this.hsId = hsId;
        this.hsDistrict = hsDistrict;
        this.hsCity = hsCity;
        this.hsRent = hsRent;
        this.hsType = hsType;
        this.hsHousingEstate = hsHousingEstate;
        this.hsTitle = hsTitle;
        this.hsdIdoorMAddr = hsdIdoorMAddr;
        this.hsArea = hsArea;
        this.houseAttrValueList = houseAttrValueList;
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
                ", hsTitle='" + hsTitle + '\'' +
                ", hsdIdoorMAddr='" + hsdIdoorMAddr + '\'' +
                ", hsArea=" + hsArea +
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

    public String getHsTitle() {
        return hsTitle;
    }

    public void setHsTitle(String hsTitle) {
        this.hsTitle = hsTitle;
    }
}
