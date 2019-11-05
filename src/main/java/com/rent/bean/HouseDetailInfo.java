package com.rent.bean;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

public class HouseDetailInfo implements Serializable {

    @ApiModelProperty("房屋编号")
    private int hsId;

    @ApiModelProperty(value = "室内图地址，图片服务器上的地址")
    private String hsdIdoormaddr;

    @ApiModelProperty(value = "户型图地址，图片服务器上的地址")
    private String hsdFloorpaddr;

    @ApiModelProperty(value = "环境图地址，图片服务器上的地址")
    private String hsdConditionmaddr;

    @ApiModelProperty(value = "标题")
    private String hsTitle;

    @ApiModelProperty("房屋租金")
    private int rtlfRent;

    @ApiModelProperty(value = "层数")
    private Integer hsLayer;

    @ApiModelProperty(value = "朝向")
    private String hsOriented;

    @ApiModelProperty(value = "出租信息发布时间")
    private Date rtlfReleasetime;

    @ApiModelProperty(value = "详细地址,详细到街道门牌")
    private String hsAddress;

    public HouseDetailInfo() {
    }

    public HouseDetailInfo(int hsId, String hsdIdoormaddr, String hsdFloorpaddr, String hsdConditionmaddr, String hsTitle, int rtlfRent, Integer hsLayer, String hsOriented, Date rtlfReleasetime, String hsAddress) {
        this.hsId = hsId;
        this.hsdIdoormaddr = hsdIdoormaddr;
        this.hsdFloorpaddr = hsdFloorpaddr;
        this.hsdConditionmaddr = hsdConditionmaddr;
        this.hsTitle = hsTitle;
        this.rtlfRent = rtlfRent;
        this.hsLayer = hsLayer;
        this.hsOriented = hsOriented;
        this.rtlfReleasetime = rtlfReleasetime;
        this.hsAddress = hsAddress;
    }

    public String getHsAddress() {
        return hsAddress;
    }

    public void setHsAddress(String hsAddress) {
        this.hsAddress = hsAddress;
    }

    public int getHsId() {
        return hsId;
    }

    public void setHsId(int hsId) {
        this.hsId = hsId;
    }

    public String getHsdIdoormaddr() {
        return hsdIdoormaddr;
    }

    public void setHsdIdoormaddr(String hsdIdoormaddr) {
        this.hsdIdoormaddr = hsdIdoormaddr;
    }

    public String getHsdFloorpaddr() {
        return hsdFloorpaddr;
    }

    public void setHsdFloorpaddr(String hsdFloorpaddr) {
        this.hsdFloorpaddr = hsdFloorpaddr;
    }

    public String getHsdConditionmaddr() {
        return hsdConditionmaddr;
    }

    public void setHsdConditionmaddr(String hsdConditionmaddr) {
        this.hsdConditionmaddr = hsdConditionmaddr;
    }

    public String getHsTitle() {
        return hsTitle;
    }

    public void setHsTitle(String hsTitle) {
        this.hsTitle = hsTitle;
    }

    public int getRtlfRent() {
        return rtlfRent;
    }

    public void setRtlfRent(int rtlfRent) {
        this.rtlfRent = rtlfRent;
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

    public Date getRtlfReleasetime() {
        return rtlfReleasetime;
    }

    public void setRtlfReleasetime(Date rtlfReleasetime) {
        this.rtlfReleasetime = rtlfReleasetime;
    }


}
