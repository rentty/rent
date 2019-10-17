package com.rent.bean;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class Housedl implements Serializable {
    private Integer hsdId;

    @ApiModelProperty(value = "室内图地址，图片服务器上的地址")
    private String hsdIdoormaddr;

    @ApiModelProperty(value = "户型图地址，图片服务器上的地址")
    private String hsdFloorpaddr;

    @ApiModelProperty(value = "环境图地址，图片服务器上的地址")
    private String hsdConditionmaddr;

    @ApiModelProperty(value = "房屋设施描述，每个位置代表一件事物，为0表示不存在，为1存在")
    private String hsdFacilityDesc;

    private static final long serialVersionUID = 1L;

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

    public Housedl(Integer hsdId, String hsdIdoormaddr, String hsdFloorpaddr, String hsdConditionmaddr, String hsdFacilityDesc) {
        this.hsdId = hsdId;
        this.hsdIdoormaddr = hsdIdoormaddr;
        this.hsdFloorpaddr = hsdFloorpaddr;
        this.hsdConditionmaddr = hsdConditionmaddr;
        this.hsdFacilityDesc = hsdFacilityDesc;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", hsdId=").append(hsdId);
        sb.append(", hsdIdoormaddr=").append(hsdIdoormaddr);
        sb.append(", hsdFloorpaddr=").append(hsdFloorpaddr);
        sb.append(", hsdConditionmaddr=").append(hsdConditionmaddr);
        sb.append(", hsdFacilityDesc=").append(hsdFacilityDesc);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    public Housedl() {
    }
}