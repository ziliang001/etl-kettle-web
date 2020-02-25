package com.caixin.data.middle.etl.kettle.mbg.mapper;

import com.caixin.data.middle.etl.kettle.mbg.model.RStepAttribute;
import com.caixin.data.middle.etl.kettle.mbg.model.RStepAttributeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* Created by Mybatis Generator on 2020年02月07日 上午 07:59:41
*/
public interface RStepAttributeMapper {
    long countByExample(RStepAttributeExample example);

    int deleteByExample(RStepAttributeExample example);

    int deleteByPrimaryKey(Long idStepAttribute);

    int insert(RStepAttribute record);

    int insertSelective(RStepAttribute record);

    List<RStepAttribute> selectByExampleWithBLOBs(RStepAttributeExample example);

    List<RStepAttribute> selectByExample(RStepAttributeExample example);

    RStepAttribute selectByPrimaryKey(Long idStepAttribute);

    int updateByExampleSelective(@Param("record") RStepAttribute record, @Param("example") RStepAttributeExample example);

    int updateByExampleWithBLOBs(@Param("record") RStepAttribute record, @Param("example") RStepAttributeExample example);

    int updateByExample(@Param("record") RStepAttribute record, @Param("example") RStepAttributeExample example);

    int updateByPrimaryKeySelective(RStepAttribute record);

    int updateByPrimaryKeyWithBLOBs(RStepAttribute record);

    int updateByPrimaryKey(RStepAttribute record);
}