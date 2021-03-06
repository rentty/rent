package com.rent.bean;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.List;

public class Userinfo implements Serializable {
    @ApiModelProperty(value = "用户编号")
    private Integer uifId;

    @ApiModelProperty(value = "昵称")
    private String uifNickname;

    @ApiModelProperty(value = "头像")
    private String uifAvatar;

    @ApiModelProperty(value = "手机号")
    private String uifPhone;

    @ApiModelProperty(value = "微信二维码图片")
    private String uifWechatcode;

    @ApiModelProperty(value = "用户类型")
    private Integer uifUsertype;

    @ApiModelProperty(value = "用户收藏表")
    private List<Favorites> favorites;

    private static final long serialVersionUID = 1L;

    public Integer getUifId() {
        return uifId;
    }

    public void setUifId(Integer uifId) {
        this.uifId = uifId;
    }

    public String getUifNickname() {
        return uifNickname;
    }

    public void setUifNickname(String uifNickname) {
        this.uifNickname = uifNickname;
    }

    public String getUifAvatar() {
        return uifAvatar;
    }

    public void setUifAvatar(String uifAvatar) {
        this.uifAvatar = uifAvatar;
    }

    public String getUifPhone() {
        return uifPhone;
    }

    public void setUifPhone(String uifPhone) {
        this.uifPhone = uifPhone;
    }

    public String getUifWechatcode() {
        return uifWechatcode;
    }

    public void setUifWechatcode(String uifWechatcode) {
        this.uifWechatcode = uifWechatcode;
    }

    public Integer getUifUsertype() {
        return uifUsertype;
    }

    public void setUifUsertype(Integer uifUsertype) {
        this.uifUsertype = uifUsertype;
    }

    public List<Favorites> getFavorites() {
        return favorites;
    }

    public void setFavorites(List<Favorites> favorites) {
        this.favorites = favorites;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", uifId=").append(uifId);
        sb.append(", uifNickname=").append(uifNickname);
        sb.append(", uifAvatar=").append(uifAvatar);
        sb.append(", uifPhone=").append(uifPhone);
        sb.append(", uifWechatcode=").append(uifWechatcode);
        sb.append(", uifUsertype=").append(uifUsertype);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    public Userinfo() {
    }

    public Userinfo(Integer uifId, String uifNickname, String uifAvatar, String uifPhone, String uifWechatcode, Integer uifUsertype) {
        this.uifId = uifId;
        this.uifNickname = uifNickname;
        this.uifAvatar = uifAvatar;
        this.uifPhone = uifPhone;
        this.uifWechatcode = uifWechatcode;
        this.uifUsertype = uifUsertype;
    }
}