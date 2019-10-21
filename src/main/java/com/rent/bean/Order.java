package com.rent.bean;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class Order implements Serializable,Comparable<Order>{
    @ApiModelProperty(value = "订单编号")
    private Integer odId;

    @ApiModelProperty(value = "下单时间")
    private Date odOrdertime;

    @ApiModelProperty(value = "用户编号")
    private Integer uifId;

    private Integer hhifId;

    @ApiModelProperty(value = "预定时间")
    private Date odBooktime;

    @ApiModelProperty(value = "租期时长,单位为 /天")
    private Integer odDuration;

    @ApiModelProperty(value = "预定房屋编号")
    private Integer hsId;

    @ApiModelProperty(value = "支付金额,单位 /元 ")
    private Integer odRent;

    @ApiModelProperty(value = "待支付：0 已支付待确认：1 已支付已确认：2 退订中：3 已退订：4")
    private Integer odStatus;

    private static final long serialVersionUID = 1L;

    public Integer getOdId() {
        return odId;
    }

    public void setOdId(Integer odId) {
        this.odId = odId;
    }

    public Date getOdOrdertime() {
        return odOrdertime;
    }

    public void setOdOrdertime(Date odOrdertime) {
        this.odOrdertime = odOrdertime;
    }

    public Integer getUifId() {
        return uifId;
    }

    public void setUifId(Integer uifId) {
        this.uifId = uifId;
    }

    public Integer getHhifId() {
        return hhifId;
    }

    public void setHhifId(Integer hhifId) {
        this.hhifId = hhifId;
    }

    public Date getOdBooktime() {
        return odBooktime;
    }

    public void setOdBooktime(Date odBooktime) {
        this.odBooktime = odBooktime;
    }

    public Integer getOdDuration() {
        return odDuration;
    }

    public void setOdDuration(Integer odDuration) {
        this.odDuration = odDuration;
    }

    public Integer getHsId() {
        return hsId;
    }

    public void setHsId(Integer hsId) {
        this.hsId = hsId;
    }

    public Integer getOdRent() {
        return odRent;
    }

    public void setOdRent(Integer odRent) {
        this.odRent = odRent;
    }

    public Integer getOdStatus() {
        return odStatus;
    }

    public void setOdStatus(Integer odStatus) {
        this.odStatus = odStatus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", odId=").append(odId);
        sb.append(", odOrdertime=").append(odOrdertime);
        sb.append(", uifId=").append(uifId);
        sb.append(", hhifId=").append(hhifId);
        sb.append(", odBooktime=").append(odBooktime);
        sb.append(", odDuration=").append(odDuration);
        sb.append(", hsId=").append(hsId);
        sb.append(", odRent=").append(odRent);
        sb.append(", odStatus=").append(odStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    public Order() {
    }

    public Order(Integer odId, Date odOrdertime, Integer uifId, Integer hhifId, Date odBooktime, Integer odDuration, Integer hsId, Integer odRent, Integer odStatus) {
        this.odId = odId;
        this.odOrdertime = odOrdertime;
        this.uifId = uifId;
        this.hhifId = hhifId;
        this.odBooktime = odBooktime;
        this.odDuration = odDuration;
        this.hsId = hsId;
        this.odRent = odRent;
        this.odStatus = odStatus;
    }


    @Override
    public int compareTo(Order o) {
        int compare = this.getOdOrdertime().compareTo(o.getOdOrdertime());
        return compare;
    }
}