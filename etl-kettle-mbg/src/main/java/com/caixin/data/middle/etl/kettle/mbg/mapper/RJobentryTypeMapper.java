package com.caixin.data.middle.etl.kettle.mbg.mapper;

import com.caixin.data.middle.etl.kettle.mbg.model.RJobentryType;
import com.caixin.data.middle.etl.kettle.mbg.model.RJobentryTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* Created by Mybatis Generator on 2020年02月07日 上午 07:59:41
*/
public interface RJobentryTypeMapper {
    long countByExample(RJobentryTypeExample example);

    int deleteByExample(RJobentryTypeExample example);

    int deleteByPrimaryKey(Long idJobentryType);

    int insert(RJobentryType record);

    int insertSelective(RJobentryType record);

    List<RJobentryType> selectByExample(RJobentryTypeExample example);

    RJobentryType selectByPrimaryKey(Long idJobentryType);

    int updateByExampleSelective(@Param("record") RJobentryType record, @Param("example") RJobentryTypeExample example);

    int updateByExample(@Param("record") RJobentryType record, @Param("example") RJobentryTypeExample example);

    int updateByPrimaryKeySelective(RJobentryType record);

    int updateByPrimaryKey(RJobentryType record);
}