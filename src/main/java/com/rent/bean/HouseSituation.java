package com.rent.bean;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

public class HouseSituation implements Serializable {
    @ApiModelProperty("房屋编号")
    private int hsId;

    @ApiModelProperty("房屋图片地址")
    private String hsdldoormaddr;

    @ApiModelProperty(value = "城市")
    private String hsCity;

    @ApiModelProperty(value = "县区")
    private String hsDistrict;

    @ApiModelProperty(value = "标题")
    private String hsTitle;

    @ApiModelProperty("房屋租金")
    private int rtlfRent;

    public int getHsId() {
        return hsId;
    }

    public void setHsId(int hsId) {
        this.hsId = hsId;
    }

    public String getHsdldoormaddr() {
        return hsdldoormaddr;
    }

    public void setHsdldoormaddr(String hsdldoormaddr) {
        this.hsdldoormaddr = hsdldoormaddr;
    }

    public String getHsCity() {
        return hsCity;
    }

    public void setHsCity(String hsCity) {
        this.hsCity = hsCity;
    }

    public String getHsDistrict() {
        return hsDistrict;
    }

    public void setHsDistrict(String hsDistrict) {
        this.hsDistrict = hsDistrict;
    }

    public int getRtlfRent() {
        return rtlfRent;
    }

    public void setRtlfRent(int rtlfRent) {
        this.rtlfRent = rtlfRent;
    }

    public String getHsTitle() {
        return hsTitle;
    }

    public void setHsTitle(String hsTitle) {
        this.hsTitle = hsTitle;
    }

    public HouseSituation() {
    }

    public HouseSituation(int hsId, String hsdldoormaddr, String hsCity, String hsDistrict, String hsTitle, int rtlfRent) {
        this.hsId = hsId;
        this.hsdldoormaddr = hsdldoormaddr;
        this.hsCity = hsCity;
        this.hsDistrict = hsDistrict;
        this.hsTitle = hsTitle;
        this.rtlfRent = rtlfRent;
    }

    @Override
    public String toString() {
        return "HouseSituation{" +
                "hsId=" + hsId +
                ", hsdldoormaddr='" + hsdldoormaddr + '\'' +
                ", hsCity='" + hsCity + '\'' +
                ", hsDistrict='" + hsDistrict + '\'' +
                ", hsTitle='" + hsTitle + '\'' +
                ", rtlfRent=" + rtlfRent +
                '}';
    }
}
