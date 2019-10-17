package com.rent.bean;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class Entrydl implements Serializable {
    @ApiModelProperty(value = "条目详情编号")
    private Integer edlId;

    @ApiModelProperty(value = "条目编号,0：长租 0：短租 1：公寓 1：...")
    private Integer dlId;

    @ApiModelProperty(value = "条件内容")
    private String edlDetail;

    private static final long serialVersionUID = 1L;

    public Integer getEdlId() {
        return edlId;
    }

    public void setEdlId(Integer edlId) {
        this.edlId = edlId;
    }

    public Integer getDlId() {
        return dlId;
    }

    public void setDlId(Integer dlId) {
        this.dlId = dlId;
    }

    public String getEdlDetail() {
        return edlDetail;
    }

    public void setEdlDetail(String edlDetail) {
        this.edlDetail = edlDetail;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", edlId=").append(edlId);
        sb.append(", dlId=").append(dlId);
        sb.append(", edlDetail=").append(edlDetail);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    public Entrydl() {
    }

    public Entrydl(Integer edlId, Integer dlId, String edlDetail) {
        this.edlId = edlId;
        this.dlId = dlId;
        this.edlDetail = edlDetail;
    }
}