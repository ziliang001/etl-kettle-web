package com.caixin.data.middle.etl.kettle.mbg.mapper;

import com.caixin.data.middle.etl.kettle.mbg.model.RStepType;
import com.caixin.data.middle.etl.kettle.mbg.model.RStepTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* Created by Mybatis Generator on 2020年02月07日 上午 07:59:41
*/
public interface RStepTypeMapper {
    long countByExample(RStepTypeExample example);

    int deleteByExample(RStepTypeExample example);

    int deleteByPrimaryKey(Long idStepType);

    int insert(RStepType record);

    int insertSelective(RStepType record);

    List<RStepType> selectByExample(RStepTypeExample example);

    RStepType selectByPrimaryKey(Long idStepType);

    int updateByExampleSelective(@Param("record") RStepType record, @Param("example") RStepTypeExample example);

    int updateByExample(@Param("record") RStepType record, @Param("example") RStepTypeExample example);

    int updateByPrimaryKeySelective(RStepType record);

    int updateByPrimaryKey(RStepType record);
}