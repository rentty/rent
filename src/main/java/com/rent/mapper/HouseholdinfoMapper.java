package com.rent.mapper;

import com.rent.bean.Householdinfo;
import com.rent.bean.HouseholdinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HouseholdinfoMapper {
    int countByExample(HouseholdinfoExample example);

    int deleteByExample(HouseholdinfoExample example);

    int deleteByPrimaryKey(Integer hhifId);

    int insert(Householdinfo record);

    int insertSelective(Householdinfo record);

    List<Householdinfo> selectByExample(HouseholdinfoExample example);

    Householdinfo selectByPrimaryKey(Integer hhifId);

    int updateByExampleSelective(@Param("record") Householdinfo record, @Param("example") HouseholdinfoExample example);

    int updateByExample(@Param("record") Householdinfo record, @Param("example") HouseholdinfoExample example);

    int updateByPrimaryKeySelective(Householdinfo record);

    int updateByPrimaryKey(Householdinfo record);
}