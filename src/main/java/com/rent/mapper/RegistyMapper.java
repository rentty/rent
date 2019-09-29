package com.rent.mapper;

import com.rent.bean.Registy;
import com.rent.bean.RegistyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RegistyMapper {
    int countByExample(RegistyExample example);

    int deleteByExample(RegistyExample example);

    int deleteByPrimaryKey(Integer rgtId);

    int insert(Registy record);

    int insertSelective(Registy record);

    List<Registy> selectByExample(RegistyExample example);

    Registy selectByPrimaryKey(Integer rgtId);

    int updateByExampleSelective(@Param("record") Registy record, @Param("example") RegistyExample example);

    int updateByExample(@Param("record") Registy record, @Param("example") RegistyExample example);

    int updateByPrimaryKeySelective(Registy record);

    int updateByPrimaryKey(Registy record);
}