package com.caixin.data.middle.etl.kettle.mbg.mapper;

import com.caixin.data.middle.etl.kettle.mbg.model.RElement;
import com.caixin.data.middle.etl.kettle.mbg.model.RElementExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* Created by Mybatis Generator on 2020年02月07日 上午 07:59:41
*/
public interface RElementMapper {
    long countByExample(RElementExample example);

    int deleteByExample(RElementExample example);

    int deleteByPrimaryKey(Long idElement);

    int insert(RElement record);

    int insertSelective(RElement record);

    List<RElement> selectByExampleWithBLOBs(RElementExample example);

    List<RElement> selectByExample(RElementExample example);

    RElement selectByPrimaryKey(Long idElement);

    int updateByExampleSelective(@Param("record") RElement record, @Param("example") RElementExample example);

    int updateByExampleWithBLOBs(@Param("record") RElement record, @Param("example") RElementExample example);

    int updateByExample(@Param("record") RElement record, @Param("example") RElementExample example);

    int updateByPrimaryKeySelective(RElement record);

    int updateByPrimaryKeyWithBLOBs(RElement record);

    int updateByPrimaryKey(RElement record);
}