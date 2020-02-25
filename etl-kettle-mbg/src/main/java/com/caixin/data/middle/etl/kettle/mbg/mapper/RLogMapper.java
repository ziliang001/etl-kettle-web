package com.caixin.data.middle.etl.kettle.mbg.mapper;

import com.caixin.data.middle.etl.kettle.mbg.model.RLog;
import com.caixin.data.middle.etl.kettle.mbg.model.RLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* Created by Mybatis Generator on 2020年02月07日 上午 07:59:41
*/
public interface RLogMapper {
    long countByExample(RLogExample example);

    int deleteByExample(RLogExample example);

    int deleteByPrimaryKey(Long idLog);

    int insert(RLog record);

    int insertSelective(RLog record);

    List<RLog> selectByExample(RLogExample example);

    RLog selectByPrimaryKey(Long idLog);

    int updateByExampleSelective(@Param("record") RLog record, @Param("example") RLogExample example);

    int updateByExample(@Param("record") RLog record, @Param("example") RLogExample example);

    int updateByPrimaryKeySelective(RLog record);

    int updateByPrimaryKey(RLog record);
}