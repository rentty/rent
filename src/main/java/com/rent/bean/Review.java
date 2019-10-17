package com.rent.bean;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class Review implements Serializable {
    @ApiModelProperty(value = "评论编号")
    private Integer rvId;

    @ApiModelProperty(value = "用户编号")
    private Integer rgtId;

    @ApiModelProperty(value = "房屋编号")
    private Integer hsId;

    @ApiModelProperty(value = "服务评分,取值范围0-10")
    private Integer rvServiceRat;

    @ApiModelProperty(value = "设施评分,取值范围0-10")
    private Integer rvFacilityRat;

    @ApiModelProperty(value = "文字评论,限制255字描述")
    private String rvReview;

    @ApiModelProperty(value = "评论附图地址")
    private String rvPicurl;

    private static final long serialVersionUID = 1L;

    public Integer getRvId() {
        return rvId;
    }

    public void setRvId(Integer rvId) {
        this.rvId = rvId;
    }

    public Integer getRgtId() {
        return rgtId;
    }

    public void setRgtId(Integer rgtId) {
        this.rgtId = rgtId;
    }

    public Integer getHsId() {
        return hsId;
    }

    public void setHsId(Integer hsId) {
        this.hsId = hsId;
    }

    public Integer getRvServiceRat() {
        return rvServiceRat;
    }

    public void setRvServiceRat(Integer rvServiceRat) {
        this.rvServiceRat = rvServiceRat;
    }

    public Integer getRvFacilityRat() {
        return rvFacilityRat;
    }

    public void setRvFacilityRat(Integer rvFacilityRat) {
        this.rvFacilityRat = rvFacilityRat;
    }

    public String getRvReview() {
        return rvReview;
    }

    public void setRvReview(String rvReview) {
        this.rvReview = rvReview;
    }

    public String getRvPicurl() {
        return rvPicurl;
    }

    public void setRvPicurl(String rvPicurl) {
        this.rvPicurl = rvPicurl;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", rvId=").append(rvId);
        sb.append(", rgtId=").append(rgtId);
        sb.append(", hsId=").append(hsId);
        sb.append(", rvServiceRat=").append(rvServiceRat);
        sb.append(", rvFacilityRat=").append(rvFacilityRat);
        sb.append(", rvReview=").append(rvReview);
        sb.append(", rvPicurl=").append(rvPicurl);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    public Review() {
    }

    public Review(Integer rvId, Integer rgtId, Integer hsId, Integer rvServiceRat, Integer rvFacilityRat, String rvReview, String rvPicurl) {
        this.rvId = rvId;
        this.rgtId = rgtId;
        this.hsId = hsId;
        this.rvServiceRat = rvServiceRat;
        this.rvFacilityRat = rvFacilityRat;
        this.rvReview = rvReview;
        this.rvPicurl = rvPicurl;
    }
}