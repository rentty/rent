package com.rent.bean;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class Registy implements Serializable {
    @ApiModelProperty(value = "用户编号")
    private Integer rgtId;

    @ApiModelProperty(value = "用户账号,用户名为空时密码为空，第三方登录不为空。反之亦是")
    private String rgtUser;

    @ApiModelProperty(value = "密码,用户名为空时密码为空，第三方登录不为空。反之亦是")
    private String rgtPassword;

    @ApiModelProperty(value = "第三方登录凭证,用户名为空时密码为空，第三方登录不为空。反之亦是")
    private String rgtToken;

    private static final long serialVersionUID = 1L;

    public Integer getRgtId() {
        return rgtId;
    }

    public void setRgtId(Integer rgtId) {
        this.rgtId = rgtId;
    }

    public String getRgtUser() {
        return rgtUser;
    }

    public void setRgtUser(String rgtUser) {
        this.rgtUser = rgtUser;
    }

    public String getRgtPassword() {
        return rgtPassword;
    }

    public void setRgtPassword(String rgtPassword) {
        this.rgtPassword = rgtPassword;
    }

    public String getRgtToken() {
        return rgtToken;
    }

    public void setRgtToken(String rgtToken) {
        this.rgtToken = rgtToken;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", rgtId=").append(rgtId);
        sb.append(", rgtUser=").append(rgtUser);
        sb.append(", rgtPassword=").append(rgtPassword);
        sb.append(", rgtToken=").append(rgtToken);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    public Registy() {
    }

    public Registy(Integer rgtId, String rgtUser, String rgtPassword, String rgtToken) {
        this.rgtId = rgtId;
        this.rgtUser = rgtUser;
        this.rgtPassword = rgtPassword;
        this.rgtToken = rgtToken;
    }
}