package com.caixin.data.middle.etl.kettle.mbg.mapper;

import com.caixin.data.middle.etl.kettle.mbg.model.RJobentryDatabase;
import com.caixin.data.middle.etl.kettle.mbg.model.RJobentryDatabaseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* Created by Mybatis Generator on 2020年02月07日 上午 07:59:41
*/
public interface RJobentryDatabaseMapper {
    long countByExample(RJobentryDatabaseExample example);

    int deleteByExample(RJobentryDatabaseExample example);

    int insert(RJobentryDatabase record);

    int insertSelective(RJobentryDatabase record);

    List<RJobentryDatabase> selectByExample(RJobentryDatabaseExample example);

    int updateByExampleSelective(@Param("record") RJobentryDatabase record, @Param("example") RJobentryDatabaseExample example);

    int updateByExample(@Param("record") RJobentryDatabase record, @Param("example") RJobentryDatabaseExample example);
}