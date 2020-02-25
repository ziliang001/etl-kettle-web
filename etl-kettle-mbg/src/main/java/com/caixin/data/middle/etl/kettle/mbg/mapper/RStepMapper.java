package com.caixin.data.middle.etl.kettle.mbg.mapper;

import com.caixin.data.middle.etl.kettle.mbg.model.RStep;
import com.caixin.data.middle.etl.kettle.mbg.model.RStepExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* Created by Mybatis Generator on 2020年02月07日 上午 07:59:41
*/
public interface RStepMapper {
    long countByExample(RStepExample example);

    int deleteByExample(RStepExample example);

    int deleteByPrimaryKey(Long idStep);

    int insert(RStep record);

    int insertSelective(RStep record);

    List<RStep> selectByExampleWithBLOBs(RStepExample example);

    List<RStep> selectByExample(RStepExample example);

    RStep selectByPrimaryKey(Long idStep);

    int updateByExampleSelective(@Param("record") RStep record, @Param("example") RStepExample example);

    int updateByExampleWithBLOBs(@Param("record") RStep record, @Param("example") RStepExample example);

    int updateByExample(@Param("record") RStep record, @Param("example") RStepExample example);

    int updateByPrimaryKeySelective(RStep record);

    int updateByPrimaryKeyWithBLOBs(RStep record);

    int updateByPrimaryKey(RStep record);
}