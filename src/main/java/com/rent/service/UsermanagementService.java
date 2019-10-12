package com.rent.service;

import com.rent.bean.Favorites;
import com.rent.bean.Householdinfo;
import com.rent.bean.Registy;
import com.rent.bean.Userinfo;

import java.util.List;

public interface UsermanagementService {
    /**
     * 注册，并为rent_userinfo添加一条记录
     * @param registy
     * @return  0 注册失败   1注册成功
     */
    public int Register(Registy registy);

    /**
     * 账号密码登录
     * @param username
     * @param password
     * @return 1登录成功
     */
    public int Login(String username,String password);

   // public int LoginOthter(String rgt_token);

    /**
     * 完善用户信息或更改用户信息
     * @param userinfo
     */
    public void  Motify_userinfo(Userinfo userinfo);

    /**
     * 录入户主信息
     * @param householdinfo
     */
    public void Entry_householdinfo(Householdinfo householdinfo);

    /**
     * 修改户主信息
     * @param householdinfo
     */
    public void Motify_householdinfo(Householdinfo householdinfo);

    /**
     * 获取用户信息
     * @param uif_Id
     * @return json字符串
     */
    public String getUserinfoByUif_Id(int uif_Id);

    /**
     * 获取户主信息
     * @param hhif_Id
     * @return json字符串
     */
    public String getHouseholdinfoByHhif_Id(int hhif_Id);

    /**
     * 收藏房屋
     * @param favorites
     */
    public void EntryFavorites(Favorites favorites);

    /**
     * 获取所有收藏信息
     * @param uif_Id
     * @return  JSon-----List
     */
    public String getAllFavoritesByUif_Id(int uif_Id);

    /**
     * 移出收藏夹
     * @param fvr_Id
     */
    public void  deleteFavoritesByFvr_Id(int fvr_Id);



}
