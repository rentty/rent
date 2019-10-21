package com.rent.bean;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class ShowHouse {
    @ApiModelProperty("收藏编号")
    private int fvrId;

    @ApiModelProperty("房屋图片地址")
    private String hsdldoormaddr;

    @ApiModelProperty("房屋设施描述")
    private String hsdFacilityDesc;

    @ApiModelProperty(value = "城市")
    private String hsCity;

    @ApiModelProperty(value = "县区")
    private String hsDistrict;

    @ApiModelProperty(value = "小区")
    private String hsHousingestate;

    @ApiModelProperty("房屋户型")
    private String hsType;

    @ApiModelProperty("房屋租金")
    private int rtlfRent;

    public ShowHouse() {
    }

    public ShowHouse(int fvrId, String hsdldoormaddr, String hsdFacilityDesc, String hsCity, String hsDistrict, String hsHousingestate, String hsType, int rtlfRent) {
        this.fvrId = fvrId;
        this.hsdldoormaddr = hsdldoormaddr;
        this.hsdFacilityDesc = hsdFacilityDesc;
        this.hsCity = hsCity;
        this.hsDistrict = hsDistrict;
        this.hsHousingestate = hsHousingestate;
        this.hsType = hsType;
        this.rtlfRent = rtlfRent;
    }

    public String getHsdldoormaddr() {
        return hsdldoormaddr;
    }

    public String getHsdFacilityDesc() {
        return hsdFacilityDesc;
    }


    public String getHsType() {
        return hsType;
    }

    public int getRtlfRent() {
        return rtlfRent;
    }

    public void setHsdldoormaddr(String hsdldoormaddr) {
        this.hsdldoormaddr = hsdldoormaddr;
    }

    public void setHsdFacilityDesc(String hsdFacilityDesc) {
        this.hsdFacilityDesc = hsdFacilityDesc;
    }


    public void setHsType(String hsType) {
        this.hsType = hsType;
    }

    public void setRtlfRent(int rtlfRent) {
        this.rtlfRent = rtlfRent;
    }

    public String getHsCity() {
        return hsCity;
    }

    public String getHsDistrict() {
        return hsDistrict;
    }

    public String getHsHousingestate() {
        return hsHousingestate;
    }

    public void setHsCity(String hsCity) {
        this.hsCity = hsCity;
    }

    public void setHsDistrict(String hsDistrict) {
        this.hsDistrict = hsDistrict;
    }

    public void setHsHousingestate(String hsHousingestate) {
        this.hsHousingestate = hsHousingestate;
    }

    @Override
    public String toString() {
        return "ShowHouse{" +
                "hsdldoormaddr='" + hsdldoormaddr + '\'' +
                ", hsdFacilityDesc='" + hsdFacilityDesc + '\'' +
                ", hsCity='" + hsCity + '\'' +
                ", hsDistrict='" + hsDistrict + '\'' +
                ", hsHousingestate='" + hsHousingestate + '\'' +
                ", hsType='" + hsType + '\'' +
                ", rtlfRent=" + rtlfRent +
                '}';
    }

    public int getFvrId() {
        return fvrId;
    }

    public void setFvrId(int fvrId) {
        this.fvrId = fvrId;
    }
}
