package com.rent.mapper;

import com.rent.bean.Entrydl;
import com.rent.bean.EntrydlExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EntrydlMapper {
    int countByExample(EntrydlExample example);

    int deleteByExample(EntrydlExample example);

    int deleteByPrimaryKey(Integer edlId);

    int insert(Entrydl record);

    int insertSelective(Entrydl record);

    List<Entrydl> selectByExample(EntrydlExample example);

    Entrydl selectByPrimaryKey(Integer edlId);

    int updateByExampleSelective(@Param("record") Entrydl record, @Param("example") EntrydlExample example);

    int updateByExample(@Param("record") Entrydl record, @Param("example") EntrydlExample example);

    int updateByPrimaryKeySelective(Entrydl record);

    int updateByPrimaryKey(Entrydl record);
}