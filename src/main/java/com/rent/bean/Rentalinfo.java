package com.rent.bean;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class Rentalinfo implements Serializable {
    private Integer rtlfId;

    @ApiModelProperty(value = "出租信息发布时间")
    private Date rtlfReleasetime;

    @ApiModelProperty(value = "出租类型,短租：0 长租：1")
    private Integer rtlfRentaltype;

    @ApiModelProperty(value = "户主编号")
    private Integer rtlfHhid;

    @ApiModelProperty(value = "要求描述")
    private String rtlfRequest;

    private Integer rtlfRent;

    private static final long serialVersionUID = 1L;

    public Integer getRtlfId() {
        return rtlfId;
    }

    public void setRtlfId(Integer rtlfId) {
        this.rtlfId = rtlfId;
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

    public Rentalinfo() {
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", rtlfId=").append(rtlfId);
        sb.append(", rtlfReleasetime=").append(rtlfReleasetime);
        sb.append(", rtlfRentaltype=").append(rtlfRentaltype);
        sb.append(", rtlfHhid=").append(rtlfHhid);
        sb.append(", rtlfRequest=").append(rtlfRequest);
        sb.append(", rtlfRent=").append(rtlfRent);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    public Rentalinfo(Integer rtlfId, Date rtlfReleasetime, Integer rtlfRentaltype, Integer rtlfHhid, String rtlfRequest, Integer rtlfRent) {
        this.rtlfId = rtlfId;
        this.rtlfReleasetime = rtlfReleasetime;
        this.rtlfRentaltype = rtlfRentaltype;
        this.rtlfHhid = rtlfHhid;
        this.rtlfRequest = rtlfRequest;
        this.rtlfRent = rtlfRent;
    }
}