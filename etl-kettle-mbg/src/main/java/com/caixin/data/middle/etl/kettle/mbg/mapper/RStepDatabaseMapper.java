package com.caixin.data.middle.etl.kettle.mbg.mapper;

import com.caixin.data.middle.etl.kettle.mbg.model.RStepDatabase;
import com.caixin.data.middle.etl.kettle.mbg.model.RStepDatabaseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* Created by Mybatis Generator on 2020年02月07日 上午 07:59:41
*/
public interface RStepDatabaseMapper {
    long countByExample(RStepDatabaseExample example);

    int deleteByExample(RStepDatabaseExample example);

    int insert(RStepDatabase record);

    int insertSelective(RStepDatabase record);

    List<RStepDatabase> selectByExample(RStepDatabaseExample example);

    int updateByExampleSelective(@Param("record") RStepDatabase record, @Param("example") RStepDatabaseExample example);

    int updateByExample(@Param("record") RStepDatabase record, @Param("example") RStepDatabaseExample example);
}