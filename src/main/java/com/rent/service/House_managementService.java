package com.rent.service;

import com.rent.bean.House;
import com.rent.bean.Housedl;
import com.rent.bean.Rentalinfo;

import java.util.List;

public interface House_managementService {
    /**
     *   录入房屋基本信息表,为rent_housedl、rent_rentalInfo创建一条记录，主键一样,在rent_rentalInfo绑定户主编号
     * @param house 审核状态默认0,hs_Id是自增
     * @param hhif_Id 户主编号
     */
    public void entryRent_house(House house,String hhif_Id);

    /**
     *  修改房屋详情----------------------初始有默认值,这里添加与修改通用
     * @param housedl  id与房屋基本信息表id一致
     */
    public void  modifyRent_housedl(Housedl housedl);

    /**
     *
     * @param rentalinfo id与房屋基本信息表id一致
     */
   public void modifyRent_rentalInfo(Rentalinfo rentalinfo);

    /**
     *  删除房屋信息表、详情、出租
     * @param hs_Id 房屋信息表
     */
   public void deleteHouse(String hs_Id);

    /**
     *  获取房屋信息
     * @param hs_Id
     * @return json
     */
   public  String getHouseByHs_Id(int hs_Id);





}
