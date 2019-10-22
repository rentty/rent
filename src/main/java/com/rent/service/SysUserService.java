package com.rent.service;

import com.rent.bean.Dialog;
import com.rent.bean.Sysuser;
import com.rent.bean.Userinfo;

import java.util.List;

/**
 * @author BABA
 * @date 2019/10/16 9:32
 */
public interface SysUserService {
    /**
     * 系统管理员登录
     * @return 0：用户名或密码错误，1：登陆成功，-1：没有管理员权限
     */
    int login(Sysuser sysuser);

    /**
     * 根据用户名获取用户信息
     * @return
     */
    Userinfo info(String username);

    //返回带条目详情的目录
     List<Dialog> getDialogWithEdtrydl();

    /**
     * 获取所有带收藏夹的用户信息
     * @return List<Householdinfo>
     */

     List<Userinfo>  findAllUserWithFavor();
}

