package com.rent.mapper;

import com.rent.bean.Housedl;
import com.rent.bean.HousedlExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HousedlMapper {
    int countByExample(HousedlExample example);

    int deleteByExample(HousedlExample example);

    int deleteByPrimaryKey(Integer hsdId);

    int insert(Housedl record);

    int insertSelective(Housedl record);

    List<Housedl> selectByExample(HousedlExample example);

    Housedl selectByPrimaryKey(Integer hsdId);

    int updateByExampleSelective(@Param("record") Housedl record, @Param("example") HousedlExample example);

    int updateByExample(@Param("record") Housedl record, @Param("example") HousedlExample example);

    int updateByPrimaryKeySelective(Housedl record);

    int updateByPrimaryKey(Housedl record);
}