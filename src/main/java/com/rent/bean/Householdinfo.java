package com.rent.bean;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class Householdinfo implements Serializable {
    @ApiModelProperty(value = "户主编号")
    private Integer hhifId;

    @ApiModelProperty(value = "姓名")
    private String hhifName;

    @ApiModelProperty(value = "身份证图片")
    private String hhifIdcard;

    @ApiModelProperty(value = "房产证图片")
    private String hhifDeed;

    @ApiModelProperty(value = "联系手机号")
    private String hhifPhone;

    @ApiModelProperty(value = "审核状态")
    private Integer hhifStatus;

    private static final long serialVersionUID = 1L;

    public Integer getHhifId() {
        return hhifId;
    }

    public void setHhifId(Integer hhifId) {
        this.hhifId = hhifId;
    }

    public String getHhifName() {
        return hhifName;
    }

    public void setHhifName(String hhifName) {
        this.hhifName = hhifName;
    }

    public String getHhifIdcard() {
        return hhifIdcard;
    }

    public void setHhifIdcard(String hhifIdcard) {
        this.hhifIdcard = hhifIdcard;
    }

    public String getHhifDeed() {
        return hhifDeed;
    }

    public void setHhifDeed(String hhifDeed) {
        this.hhifDeed = hhifDeed;
    }

    public String getHhifPhone() {
        return hhifPhone;
    }

    public void setHhifPhone(String hhifPhone) {
        this.hhifPhone = hhifPhone;
    }

    public Integer getHhifStatus() {
        return hhifStatus;
    }

    public void setHhifStatus(Integer hhifStatus) {
        this.hhifStatus = hhifStatus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", hhifId=").append(hhifId);
        sb.append(", hhifName=").append(hhifName);
        sb.append(", hhifIdcard=").append(hhifIdcard);
        sb.append(", hhifDeed=").append(hhifDeed);
        sb.append(", hhifPhone=").append(hhifPhone);
        sb.append(", hhifStatus=").append(hhifStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    public Householdinfo(Integer hhifId, String hhifName, String hhifIdcard, String hhifDeed, String hhifPhone, Integer hhifStatus) {
        this.hhifId = hhifId;
        this.hhifName = hhifName;
        this.hhifIdcard = hhifIdcard;
        this.hhifDeed = hhifDeed;
        this.hhifPhone = hhifPhone;
        this.hhifStatus = hhifStatus;
    }
}