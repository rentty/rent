package com.rent.service;

import com.rent.bean.House;
import com.rent.bean.Housedl;
import com.rent.bean.Rentalinfo;

import java.util.List;

public interface House_managementService {
    /**
     *   录入房屋信息表(三表)，三表主键一样,在rent_rentalInfo绑定户主编号
     * @param house 审核状态默认0,hs_Id是自增
     * @param housedl hs_Id
     * @param  rentalinfo hs_Id
     * @param username ExpandMapper获取用户id
     */
    public void entryHouse(House house,Housedl housedl,Rentalinfo rentalinfo,String username);
    /**
     *  获取该用户的所有房屋信息
     * @param username
     * @return json
     */
    public  String getAllHouseByUsername(String username);


    /**
     *
     * @param house
     * @param housedl
     * @param rentalinfo
     * @param username ExpandMapper获取用户id
     */
    public void  modifyHouse(House house,Housedl housedl,Rentalinfo rentalinfo,String username);

    /**
     *  删除房屋信息表、详情、出租
     * @param hs_Id 房屋信息表
     */
   public void deleteHouse(String hs_Id);

    /**
     *  查询所有的房屋基本信息
     */
    public List<House> findAllHouse();

    /**
     *  查询所有的房屋详细信息
     */
    public List<Housedl> findAllHousedl();

    /**
     *  根据审核状态查询房屋基本信息
     */
    public List<House> findAllHouseByStatus(int status);

    /**
     *  更改房屋审核状态
     */
    public int changeStatus(int id,int status);

    /**
     *  查询所有的出租信息
     */
    public List<Rentalinfo> findAllRentalinfo();

    /**
     *  查询所有带用户评论信息的房屋信息
     */
    public List<House> findAllHouseWithReview();

}
