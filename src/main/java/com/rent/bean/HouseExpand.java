package com.rent.bean;

import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

public class HouseExpand extends House{
    private Integer hsdId;

    @ApiModelProperty(value = "室内图地址，图片服务器上的地址")
    private String hsdIdoormaddr;

    @ApiModelProperty(value = "户型图地址，图片服务器上的地址")
    private String hsdFloorpaddr;

    @ApiModelProperty(value = "环境图地址，图片服务器上的地址")
    private String hsdConditionmaddr;

    @ApiModelProperty(value = "房屋设施描述，每个位置代表一件事物，为0表示不存在，为1存在")
    private String hsdFacilityDesc;
    private Integer rtlfId;

    @ApiModelProperty(value = "租金")
    private Integer rtlfRent;

    @ApiModelProperty(value = "出租信息发布时间")
    private Date rtlfReleasetime;

    @ApiModelProperty(value = "出租类型,短租：0 长租：1")
    private Integer rtlfRentaltype;

    @ApiModelProperty(value = "户主编号")
    private Integer rtlfHhid;

    @ApiModelProperty(value = "要求描述")
    private String rtlfRequest;

    @ApiModelProperty(value = "日历")
    private String rtlfCalendar;

    public HouseExpand(Integer hsId, String hsType, Integer hsArea, String hsRegion, String hsAddress, Integer hsLayer, String hsOriented, Double hsLongitude, Double hsLatitude, Integer hsStatus) {
        super(hsId, hsType, hsArea, hsRegion, hsAddress, hsLayer, hsOriented, hsLongitude, hsLatitude, hsStatus);
    }

    public Integer getHsdId() {
        return hsdId;
    }

    public void setHsdId(Integer hsdId) {
        this.hsdId = hsdId;
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

    public String getHsdFacilityDesc() {
        return hsdFacilityDesc;
    }

    public void setHsdFacilityDesc(String hsdFacilityDesc) {
        this.hsdFacilityDesc = hsdFacilityDesc;
    }

    public Integer getRtlfId() {
        return rtlfId;
    }

    public void setRtlfId(Integer rtlfId) {
        this.rtlfId = rtlfId;
    }

    public Integer getRtlfRent() {
        return rtlfRent;
    }

    public void setRtlfRent(Integer rtlfRent) {
        this.rtlfRent = rtlfRent;
    }

    public Date getRtlfReleasetime() {
        return rtlfReleasetime;
    }

    public void setRtlfReleasetime(Date rtlfReleasetime) {
        this.rtlfReleasetime = rtlfReleasetime;
    }

    public Integer getRtlfRentaltype() {
        return rtlfRentaltype;
    }

    public void setRtlfRentaltype(Integer rtlfRentaltype) {
        this.rtlfRentaltype = rtlfRentaltype;
    }

    public Integer getRtlfHhid() {
        return rtlfHhid;
    }

    public void setRtlfHhid(Integer rtlfHhid) {
        this.rtlfHhid = rtlfHhid;
    }

    public String getRtlfRequest() {
        return rtlfRequest;
    }

    public void setRtlfRequest(String rtlfRequest) {
        this.rtlfRequest = rtlfRequest;
    }

    public String getRtlfCalendar() {
        return rtlfCalendar;
    }

    public void setRtlfCalendar(String rtlfCalendar) {
        this.rtlfCalendar = rtlfCalendar;
    }
}
