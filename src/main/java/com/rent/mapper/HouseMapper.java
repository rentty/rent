package com.rent.mapper;

import com.rent.bean.House;
import com.rent.bean.HouseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HouseMapper {
    int countByExample(HouseExample example);

    int deleteByExample(HouseExample example);

    int deleteByPrimaryKey(Integer hsId);

    int insert(House record);

    int insertSelective(House record);

    List<House> selectByExample(HouseExample example);

    /**/
    List<House> selectByExampleWithReview(HouseExample example);

    House selectByPrimaryKey(Integer hsId);

    int updateByExampleSelective(@Param("record") House record, @Param("example") HouseExample example);

    int updateByExample(@Param("record") House record, @Param("example") HouseExample example);

    int updateByPrimaryKeySelective(House record);

    int updateByPrimaryKey(House record);
}