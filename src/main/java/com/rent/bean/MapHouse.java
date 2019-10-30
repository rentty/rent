package com.rent.bean;

import io.swagger.annotations.ApiModelProperty;

public class MapHouse {
    @ApiModelProperty(value = "主键")
    private Integer hsId;

    @ApiModelProperty(value = "户型")
    private String hsType;

    @ApiModelProperty(value = "面积")
    private Integer hsArea;

    @ApiModelProperty(value = "城市")
    private String hsCity;

    @ApiModelProperty(value = "县区")
    private String hsDistrict;

    @ApiModelProperty(value = "小区")
    private String hsHousingestate;

    @ApiModelProperty(value = "详细地址,详细到街道门牌")
    private String hsAddress;

    @ApiModelProperty(value = "层数")
    private Integer hsLayer;

    @ApiModelProperty(value = "朝向")
    private String hsOriented;

    @ApiModelProperty(value = "经度")
    private Double hsLongitude;

    @ApiModelProperty(value = "纬度")
    private Double hsLatitude;

    @ApiModelProperty(value = "出租类型,短租：0 长租：1")
    private Integer rtlfRentaltype;

    @ApiModelProperty(value = "要求描述")
    private String rtlfRequest;

    @ApiModelProperty(value = "租金")
    private Integer rtlfRent;

    @ApiModelProperty(value = "户主编号")
    private Integer rtlfHhid;

    public MapHouse() {
    }

    public void setRtlfRent(Integer rtlfRent) {
        this.rtlfRent = rtlfRent;
    }

    public Integer getRtlfRent() {
        return rtlfRent;
    }

    public void setHsLongitude(Double hsLongitude) {
        this.hsLongitude = hsLongitude;
    }

    public void setHsLatitude(Double hsLatitude) {
        this.hsLatitude = hsLatitude;
    }

    public Double getHsLongitude() {
        return hsLongitude;
    }

    public Double getHsLatitude() {
        return hsLatitude;
    }

    public MapHouse(Integer hsId, String hsType, Integer hsArea, String hsCity, String hsDistrict, String hsHousingestate, String hsAddress, Integer hsLayer, String hsOriented, Double hsLongitude, Double hsLatitude, Integer rtlfRentaltype, String rtlfRequest, Integer rtlfRent, Integer rtlfHhid) {
        this.hsId = hsId;
        this.hsType = hsType;
        this.hsArea = hsArea;
        this.hsCity = hsCity;
        this.hsDistrict = hsDistrict;
        this.hsHousingestate = hsHousingestate;
        this.hsAddress = hsAddress;
        this.hsLayer = hsLayer;
        this.hsOriented = hsOriented;
        this.hsLongitude = hsLongitude;
        this.hsLatitude = hsLatitude;
        this.rtlfRentaltype = rtlfRentaltype;
        this.rtlfRequest = rtlfRequest;
        this.rtlfRent = rtlfRent;
        this.rtlfHhid = rtlfHhid;
    }

    public void setHsId(Integer hsId) {
        this.hsId = hsId;
    }

    public void setHsType(String hsType) {
        this.hsType = hsType;
    }

    public void setHsArea(Integer hsArea) {
        this.hsArea = hsArea;
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

    public void setHsAddress(String hsAddress) {
        this.hsAddress = hsAddress;
    }

    public void setHsLayer(Integer hsLayer) {
        this.hsLayer = hsLayer;
    }

    public void setHsOriented(String hsOriented) {
        this.hsOriented = hsOriented;
    }

    public void setRtlfRentaltype(Integer rtlfRentaltype) {
        this.rtlfRentaltype = rtlfRentaltype;
    }

    public void setRtlfRequest(String rtlfRequest) {
        this.rtlfRequest = rtlfRequest;
    }

    public void setRtlfHhid(Integer rtlfHhid) {
        this.rtlfHhid = rtlfHhid;
    }

    public Integer getHsId() {
        return hsId;
    }

    public String getHsType() {
        return hsType;
    }

    public Integer getHsArea() {
        return hsArea;
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

    public String getHsAddress() {
        return hsAddress;
    }

    public Integer getHsLayer() {
        return hsLayer;
    }

    public String getHsOriented() {
        return hsOriented;
    }

    public Integer getRtlfRentaltype() {
        return rtlfRentaltype;
    }

    public String getRtlfRequest() {
        return rtlfRequest;
    }

    public Integer getRtlfHhid() {
        return rtlfHhid;
    }
}
