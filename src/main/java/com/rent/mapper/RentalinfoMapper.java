package com.rent.mapper;

import com.rent.bean.Rentalinfo;
import com.rent.bean.RentalinfoExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface RentalinfoMapper {
    int countByExample(RentalinfoExample example);

    int deleteByExample(RentalinfoExample example);

    int deleteByPrimaryKey(Integer rtlfId);

    int insert(Rentalinfo record);

    int insertSelective(Rentalinfo record);

    List<Rentalinfo> selectByExample(RentalinfoExample example);

    Rentalinfo selectByPrimaryKey(Integer rtlfId);

    int updateByExampleSelective(@Param("record") Rentalinfo record, @Param("example") RentalinfoExample example);

    int updateByExample(@Param("record") Rentalinfo record, @Param("example") RentalinfoExample example);

    int updateByPrimaryKeySelective(Rentalinfo record);

    int updateByPrimaryKey(Rentalinfo record);

}