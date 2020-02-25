package com.caixin.data.middle.etl.kettle.mbg.mapper;

import com.caixin.data.middle.etl.kettle.mbg.model.RValue;
import com.caixin.data.middle.etl.kettle.mbg.model.RValueExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* Created by Mybatis Generator on 2020年02月07日 上午 07:59:41
*/
public interface RValueMapper {
    long countByExample(RValueExample example);

    int deleteByExample(RValueExample example);

    int deleteByPrimaryKey(Long idValue);

    int insert(RValue record);

    int insertSelective(RValue record);

    List<RValue> selectByExample(RValueExample example);

    RValue selectByPrimaryKey(Long idValue);

    int updateByExampleSelective(@Param("record") RValue record, @Param("example") RValueExample example);

    int updateByExample(@Param("record") RValue record, @Param("example") RValueExample example);

    int updateByPrimaryKeySelective(RValue record);

    int updateByPrimaryKey(RValue record);
}