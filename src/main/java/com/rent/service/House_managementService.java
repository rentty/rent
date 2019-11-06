package com.rent.service;

import com.rent.bean.*;

import java.util.List;

public interface House_managementService {
    /**
     *   录入房屋信息表(三表)，三表主键一样,在rent_rentalInfo绑定户主编号
     * @param house 审核状态默认0,hs_Id是自增
     * @param housedl hs_Id
     * @param  rentalinfo hs_Id
     * @param username ExpandMapper获取用户id
     */
    public int entryHouse(House house,Housedl housedl,Rentalinfo rentalinfo,String username);
    /**
     *  获取该用户的所有房屋信息
     * @param username
     * @return json
     */
    public  String getAllHouseByUsername(String username);

    /**
     *  删除房屋信息表、详情、出租
     * @param id 房屋信息表
     */
   public int deleteHouse(Integer id);

    /**
     * @param house
     * @param housedl
     * @param rentalinfo
     */
    public int updateHouse(House house, Housedl housedl, Rentalinfo rentalinfo);

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

    /**
     *  添加房屋信息到索引库
     */
    public int addHouseToEs(int id);

    /**
     *  根据租金展示最高租金的三个房屋信息
     */
    public List<HouseSituation> showHousesByRent();

    /**
     *  显示户主的所有信息
     */
    public List<HouseUser> getAllHouseAndRentById(int id);

    /**
     *  显示房屋详情信息
     */
    public HouseDetailInfo showHouseDetail(int id);

    /**
     *  查询房屋信息
     */
    public List<HouseInfo> searchEntity(String keyword,List<String> list);

    /**
     *  根据城市获取查询条件
     */
    public List<Dialog> getSearchCondition();

    /**
     *  根据城市获取区域值
     */
    public List<Entrydl> getSearchValue(String city);

 /**
  *  根据房屋编号判断是否可以删除(是否有订单)
  */
 public int deleteById(int id);

 /**
  *  修改出租信息
  */
 public int updateById(int id,int rent,String req);
}
