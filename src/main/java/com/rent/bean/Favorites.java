package com.rent.bean;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class Favorites implements Serializable {
    @ApiModelProperty(value = "收藏夹编号")
    private Integer fvrId;

    @ApiModelProperty(value = "用户编号")
    private Integer uifId;

    private Integer hsId;

    private static final long serialVersionUID = 1L;

    public Integer getFvrId() {
        return fvrId;
    }

    public void setFvrId(Integer fvrId) {
        this.fvrId = fvrId;
    }

    public Integer getUifId() {
        return uifId;
    }

    public void setUifId(Integer uifId) {
        this.uifId = uifId;
    }

    public Integer getHsId() {
        return hsId;
    }

    public void setHsId(Integer hsId) {
        this.hsId = hsId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", fvrId=").append(fvrId);
        sb.append(", uifId=").append(uifId);
        sb.append(", hsId=").append(hsId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    public Favorites(Integer fvrId, Integer uifId, Integer hsId) {
        this.fvrId = fvrId;
        this.uifId = uifId;
        this.hsId = hsId;
    }
}