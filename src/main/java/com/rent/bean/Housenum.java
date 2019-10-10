package com.rent.bean;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class Housenum implements Serializable {
    private Integer hsnId;

    @ApiModelProperty(value = "地区")
    private String hsnRegion;

    @ApiModelProperty(value = "房屋数量")
    private Integer hsnHousenum;

    private static final long serialVersionUID = 1L;

    public Integer getHsnId() {
        return hsnId;
    }

    public void setHsnId(Integer hsnId) {
        this.hsnId = hsnId;
    }

    public String getHsnRegion() {
        return hsnRegion;
    }

    public void setHsnRegion(String hsnRegion) {
        this.hsnRegion = hsnRegion;
    }

    public Integer getHsnHousenum() {
        return hsnHousenum;
    }

    public void setHsnHousenum(Integer hsnHousenum) {
        this.hsnHousenum = hsnHousenum;
    }

    public Housenum(Integer hsnId, String hsnRegion, Integer hsnHousenum) {
        this.hsnId = hsnId;
        this.hsnRegion = hsnRegion;
        this.hsnHousenum = hsnHousenum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", hsnId=").append(hsnId);
        sb.append(", hsnRegion=").append(hsnRegion);
        sb.append(", hsnHousenum=").append(hsnHousenum);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}