package com.rent.bean;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class ShowHouse {
    @ApiModelProperty("房屋图片地址")
    private String hsdldoormaddr;

    @ApiModelProperty("房屋设施描述")
    private String hsdFacilityDesc;

    @ApiModelProperty("房屋所在地区")
    private String hsRegion;

    @ApiModelProperty("房屋户型")
    private String hsType;

    @ApiModelProperty("房屋租金")
    private String rtlfRent;

    public ShowHouse(String hsdldoormaddr, String hsdFacilityDesc, String hsRegion, String hsType, String rtlfRent) {
        this.hsdldoormaddr = hsdldoormaddr;
        this.hsdFacilityDesc = hsdFacilityDesc;
        this.hsRegion = hsRegion;
        this.hsType = hsType;
        this.rtlfRent = rtlfRent;
    }
}
