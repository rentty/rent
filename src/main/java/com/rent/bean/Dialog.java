package com.rent.bean;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class Dialog implements Serializable {
    @ApiModelProperty(value = "条目编号,0：方式  1：类型 2：户型 3：租金 4：更多...")
    private Integer dlId;

    @ApiModelProperty(value = "条目")
    private String dlEntry;

    private static final long serialVersionUID = 1L;

    public Integer getDlId() {
        return dlId;
    }

    public void setDlId(Integer dlId) {
        this.dlId = dlId;
    }

    public String getDlEntry() {
        return dlEntry;
    }

    public void setDlEntry(String dlEntry) {
        this.dlEntry = dlEntry;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", dlId=").append(dlId);
        sb.append(", dlEntry=").append(dlEntry);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    public Dialog() {
    }

    public Dialog(Integer dlId, String dlEntry) {
        this.dlId = dlId;
        this.dlEntry = dlEntry;
    }
}