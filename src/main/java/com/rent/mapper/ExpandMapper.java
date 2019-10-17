package com.rent.mapper;

import com.rent.bean.House;
import com.rent.bean.HouseExpand;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;


@Mapper
public interface ExpandMapper {
    @Select("select rgt_Id from rent_registy where rgt_User=#{username}")
    public int selectRgt_IdByUsername(@Param("username") String username);
    @Select("select rent_house.* from rent_house,rent_favorites where rent_favorites.hs_Id=rent_house.hs_Id and rent_favorites.uif_Id=#{uif_Id}")
    public List<House> selectAllFavoritesByUif_Id(@Param("uif_Id")int uif_Id);
    @Select("SELECT * FROM rent_house,rent_housedl,rent_rentalinfo WHERE rent_house.hs_Id=rent_housedl.hsd_Id and rent_house.hs_Id=rent_rentalinfo.rtlf_Id and rent_rentalinfo.rtlf_HHId=#{rgt_Id}")
    public List<HouseExpand> selectHouseByRgt_Id(@Param("rgt_Id")int rgt_Id);
}

