package com.rent.bean;

import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

public class HouseUser {
    @ApiModelProperty(value = "审核状态")
    private String status;

    @ApiModelProperty(value = "出租类型,短租：0 长租：1")
    private String rtlfRentaltype;

    @ApiModelProperty(value = "")
    private Integer rtlfId;

    @ApiModelProperty(value = "要求描述")
    private String rtlfRequest;

    private Integer rtlfRent;

    private String address;

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public HouseUser() {
    }

    private static final long serialVersionUID = 1L;


    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public HouseUser(String status, String rtlfRentaltype, Integer rtlfId, String rtlfRequest, Integer rtlfRent, String address) {
        this.status = status;
        this.rtlfRentaltype = rtlfRentaltype;
        this.rtlfId = rtlfId;
        this.rtlfRequest = rtlfRequest;
        this.rtlfRent = rtlfRent;
        this.address = address;
    }

    public String getRtlfRentaltype() {
        return rtlfRentaltype;
    }

    public void setRtlfRentaltype(String rtlfRentaltype) {
        this.rtlfRentaltype = rtlfRentaltype;
    }

    public Integer getRtlfId() {
        return rtlfId;
    }

    public void setRtlfId(Integer rtlfHhid) {
        this.rtlfId = rtlfHhid;
    }

    public String getRtlfRequest() {
        return rtlfRequest;
    }



    public void setRtlfRequest(String rtlfRequest) {
        this.rtlfRequest = rtlfRequest;
    }

    public Integer getRtlfRent() {
        return rtlfRent;
    }

    public void setRtlfRent(Integer rtlfRent) {
        this.rtlfRent = rtlfRent;
    }



}
