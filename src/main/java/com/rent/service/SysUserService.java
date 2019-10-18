package com.rent.service;

import com.rent.bean.Sysuser;

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
}
