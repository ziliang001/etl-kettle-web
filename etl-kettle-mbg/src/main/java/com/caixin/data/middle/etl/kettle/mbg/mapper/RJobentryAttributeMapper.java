package com.caixin.data.middle.etl.kettle.mbg.mapper;

import com.caixin.data.middle.etl.kettle.mbg.model.RJobentryAttribute;
import com.caixin.data.middle.etl.kettle.mbg.model.RJobentryAttributeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* Created by Mybatis Generator on 2020年02月07日 上午 07:59:41
*/
public interface RJobentryAttributeMapper {
    long countByExample(RJobentryAttributeExample example);

    int deleteByExample(RJobentryAttributeExample example);

    int deleteByPrimaryKey(Long idJobentryAttribute);

    int insert(RJobentryAttribute record);

    int insertSelective(RJobentryAttribute record);

    List<RJobentryAttribute> selectByExampleWithBLOBs(RJobentryAttributeExample example);

    List<RJobentryAttribute> selectByExample(RJobentryAttributeExample example);

    RJobentryAttribute selectByPrimaryKey(Long idJobentryAttribute);

    int updateByExampleSelective(@Param("record") RJobentryAttribute record, @Param("example") RJobentryAttributeExample example);

    int updateByExampleWithBLOBs(@Param("record") RJobentryAttribute record, @Param("example") RJobentryAttributeExample example);

    int updateByExample(@Param("record") RJobentryAttribute record, @Param("example") RJobentryAttributeExample example);

    int updateByPrimaryKeySelective(RJobentryAttribute record);

    int updateByPrimaryKeyWithBLOBs(RJobentryAttribute record);

    int updateByPrimaryKey(RJobentryAttribute record);
}