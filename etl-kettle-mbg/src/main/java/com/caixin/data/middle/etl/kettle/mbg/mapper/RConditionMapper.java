package com.caixin.data.middle.etl.kettle.mbg.mapper;

import com.caixin.data.middle.etl.kettle.mbg.model.RCondition;
import com.caixin.data.middle.etl.kettle.mbg.model.RConditionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* Created by Mybatis Generator on 2020年02月07日 上午 07:59:41
*/
public interface RConditionMapper {
    long countByExample(RConditionExample example);

    int deleteByExample(RConditionExample example);

    int deleteByPrimaryKey(Long idCondition);

    int insert(RCondition record);

    int insertSelective(RCondition record);

    List<RCondition> selectByExample(RConditionExample example);

    RCondition selectByPrimaryKey(Long idCondition);

    int updateByExampleSelective(@Param("record") RCondition record, @Param("example") RConditionExample example);

    int updateByExample(@Param("record") RCondition record, @Param("example") RConditionExample example);

    int updateByPrimaryKeySelective(RCondition record);

    int updateByPrimaryKey(RCondition record);
}