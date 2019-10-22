
package com.rent.service;

import com.rent.bean.*;

import java.util.HashMap;
import java.util.List;
import java.util.logging.Handler;

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

    public HashMap Login(String username, String password);

   // public int LoginOthter(String rgt_token);


/**
 * 获取用户信息
 * @return json字符串
 */

    public Userinfo getUserinfo(int id);

    /**
     * 获取用户信息
     * @return json字符串
     */

    public Householdinfo getHouseholdinfo(int id);

/**
 * 完善用户信息或更改用户信息
 * @param userinfo
 * @param  username 根据用户名获取userinfo的id
 */

    public int Motify_userinfo(Userinfo userinfo);


/**
 * 录入户主信息
 * @param householdinfo
 * @param  username 用于获取id
 */

    public void Entry_householdinfo(Householdinfo householdinfo,String username);


/**
 * 修改户主信息
 * @param householdinfo
 * @param  username 用于获取id
 */

    public String Motify_householdinfo(Householdinfo householdinfo,String username);



/**
 * 获取户主信息
 * @param username
 * @return json字符串
 */

    public String getHouseholdinfoByUsername(String username);


/**
 * 收藏房屋
 * @param hs_Id 房屋编号
 * @param  username 获取用户id
 */

    public void EntryFavorites(int hs_Id,String username);


/**
 * 获取所有收藏信息
 * @param username
 * @return  JSon-----List
 */

    public  List<ShowHouse> getAllFavorites(int id);


/**
 * 移出收藏夹,要想从List中删除，需要从新查询全部，使用@CachePut重新填入
 * @param fvr_Id
 * @return  返回用户名，清除huanc
 */

    public int  deleteFavoritesByFvr_Id(int fvr_Id);

    /**
     * 获取所有用户信息
     * @return List<Userinfo>
     */

    public List<Userinfo>  findAllUserinfo();

    /**
     * 获取所有户主信息
     * @return List<Householdinfo>
     */

    public List<Householdinfo>  findAllHouseholdinfo();


}

