package com.caixin.data.middle.etl.kettle.mbg.mapper;

import com.caixin.data.middle.etl.kettle.mbg.model.RTransStepCondition;
import com.caixin.data.middle.etl.kettle.mbg.model.RTransStepConditionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* Created by Mybatis Generator on 2020年02月07日 上午 07:59:41
*/
public interface RTransStepConditionMapper {
    long countByExample(RTransStepConditionExample example);

    int deleteByExample(RTransStepConditionExample example);

    int insert(RTransStepCondition record);

    int insertSelective(RTransStepCondition record);

    List<RTransStepCondition> selectByExample(RTransStepConditionExample example);

    int updateByExampleSelective(@Param("record") RTransStepCondition record, @Param("example") RTransStepConditionExample example);

    int updateByExample(@Param("record") RTransStepCondition record, @Param("example") RTransStepConditionExample example);
}