package com.rent.bean;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class House implements Serializable {
    @ApiModelProperty(value = "主键")
    private Integer hsId;

    @ApiModelProperty(value = "户型")
    private String hsType;

    @ApiModelProperty(value = "面积")
    private Integer hsArea;

    @ApiModelProperty(value = "地区,详细到某市某区")
    private String hsRegion;

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

    @ApiModelProperty(value = "审核状态,未审核：0 通过：1 未通过：2")
    private Integer hsStatus;

    private static final long serialVersionUID = 1L;

    public Integer getHsId() {
        return hsId;
    }

    public void setHsId(Integer hsId) {
        this.hsId = hsId;
    }

    public String getHsType() {
        return hsType;
    }

    public void setHsType(String hsType) {
        this.hsType = hsType;
    }

    public Integer getHsArea() {
        return hsArea;
    }

    public void setHsArea(Integer hsArea) {
        this.hsArea = hsArea;
    }

    public String getHsRegion() {
        return hsRegion;
    }

    public void setHsRegion(String hsRegion) {
        this.hsRegion = hsRegion;
    }

    public String getHsAddress() {
        return hsAddress;
    }

    public void setHsAddress(String hsAddress) {
        this.hsAddress = hsAddress;
    }

    public Integer getHsLayer() {
        return hsLayer;
    }

    public void setHsLayer(Integer hsLayer) {
        this.hsLayer = hsLayer;
    }

    public String getHsOriented() {
        return hsOriented;
    }

    public void setHsOriented(String hsOriented) {
        this.hsOriented = hsOriented;
    }

    public Double getHsLongitude() {
        return hsLongitude;
    }

    public void setHsLongitude(Double hsLongitude) {
        this.hsLongitude = hsLongitude;
    }

    public Double getHsLatitude() {
        return hsLatitude;
    }

    public void setHsLatitude(Double hsLatitude) {
        this.hsLatitude = hsLatitude;
    }

    public Integer getHsStatus() {
        return hsStatus;
    }

    public void setHsStatus(Integer hsStatus) {
        this.hsStatus = hsStatus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", hsId=").append(hsId);
        sb.append(", hsType=").append(hsType);
        sb.append(", hsArea=").append(hsArea);
        sb.append(", hsRegion=").append(hsRegion);
        sb.append(", hsAddress=").append(hsAddress);
        sb.append(", hsLayer=").append(hsLayer);
        sb.append(", hsOriented=").append(hsOriented);
        sb.append(", hsLongitude=").append(hsLongitude);
        sb.append(", hsLatitude=").append(hsLatitude);
        sb.append(", hsStatus=").append(hsStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    public House() {
    }

    public House(Integer hsId, String hsType, Integer hsArea, String hsRegion, String hsAddress, Integer hsLayer, String hsOriented, Double hsLongitude, Double hsLatitude, Integer hsStatus) {
        this.hsId = hsId;
        this.hsType = hsType;
        this.hsArea = hsArea;
        this.hsRegion = hsRegion;
        this.hsAddress = hsAddress;
        this.hsLayer = hsLayer;
        this.hsOriented = hsOriented;
        this.hsLongitude = hsLongitude;
        this.hsLatitude = hsLatitude;
        this.hsStatus = hsStatus;
    }

}