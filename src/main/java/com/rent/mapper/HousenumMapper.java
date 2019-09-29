package com.rent.mapper;

import com.rent.bean.Housenum;
import com.rent.bean.HousenumExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HousenumMapper {
    int countByExample(HousenumExample example);

    int deleteByExample(HousenumExample example);

    int deleteByPrimaryKey(Integer hsnId);

    int insert(Housenum record);

    int insertSelective(Housenum record);

    List<Housenum> selectByExample(HousenumExample example);

    Housenum selectByPrimaryKey(Integer hsnId);

    int updateByExampleSelective(@Param("record") Housenum record, @Param("example") HousenumExample example);

    int updateByExample(@Param("record") Housenum record, @Param("example") HousenumExample example);

    int updateByPrimaryKeySelective(Housenum record);

    int updateByPrimaryKey(Housenum record);
}