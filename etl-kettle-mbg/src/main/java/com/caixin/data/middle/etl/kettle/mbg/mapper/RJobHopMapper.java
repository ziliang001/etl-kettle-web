package com.caixin.data.middle.etl.kettle.mbg.mapper;

import com.caixin.data.middle.etl.kettle.mbg.model.RJobHop;
import com.caixin.data.middle.etl.kettle.mbg.model.RJobHopExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* Created by Mybatis Generator on 2020年02月07日 上午 07:59:41
*/
public interface RJobHopMapper {
    long countByExample(RJobHopExample example);

    int deleteByExample(RJobHopExample example);

    int deleteByPrimaryKey(Long idJobHop);

    int insert(RJobHop record);

    int insertSelective(RJobHop record);

    List<RJobHop> selectByExample(RJobHopExample example);

    RJobHop selectByPrimaryKey(Long idJobHop);

    int updateByExampleSelective(@Param("record") RJobHop record, @Param("example") RJobHopExample example);

    int updateByExample(@Param("record") RJobHop record, @Param("example") RJobHopExample example);

    int updateByPrimaryKeySelective(RJobHop record);

    int updateByPrimaryKey(RJobHop record);
}