package com.caixin.data.middle.etl.kettle.mbg.mapper;

import com.caixin.data.middle.etl.kettle.mbg.model.RTransHop;
import com.caixin.data.middle.etl.kettle.mbg.model.RTransHopExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* Created by Mybatis Generator on 2020年02月07日 上午 07:59:41
*/
public interface RTransHopMapper {
    long countByExample(RTransHopExample example);

    int deleteByExample(RTransHopExample example);

    int deleteByPrimaryKey(Long idTransHop);

    int insert(RTransHop record);

    int insertSelective(RTransHop record);

    List<RTransHop> selectByExample(RTransHopExample example);

    RTransHop selectByPrimaryKey(Long idTransHop);

    int updateByExampleSelective(@Param("record") RTransHop record, @Param("example") RTransHopExample example);

    int updateByExample(@Param("record") RTransHop record, @Param("example") RTransHopExample example);

    int updateByPrimaryKeySelective(RTransHop record);

    int updateByPrimaryKey(RTransHop record);
}