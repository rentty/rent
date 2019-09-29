package com.rent.mapper;

import com.rent.bean.Dialog;
import com.rent.bean.DialogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DialogMapper {
    int countByExample(DialogExample example);

    int deleteByExample(DialogExample example);

    int deleteByPrimaryKey(Integer dlId);

    int insert(Dialog record);

    int insertSelective(Dialog record);

    List<Dialog> selectByExample(DialogExample example);

    Dialog selectByPrimaryKey(Integer dlId);

    int updateByExampleSelective(@Param("record") Dialog record, @Param("example") DialogExample example);

    int updateByExample(@Param("record") Dialog record, @Param("example") DialogExample example);

    int updateByPrimaryKeySelective(Dialog record);

    int updateByPrimaryKey(Dialog record);
}