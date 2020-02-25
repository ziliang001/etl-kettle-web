package com.caixin.data.middle.etl.kettle.mbg.mapper;

import com.caixin.data.middle.etl.kettle.mbg.model.RTransSlave;
import com.caixin.data.middle.etl.kettle.mbg.model.RTransSlaveExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* Created by Mybatis Generator on 2020年02月07日 上午 07:59:41
*/
public interface RTransSlaveMapper {
    long countByExample(RTransSlaveExample example);

    int deleteByExample(RTransSlaveExample example);

    int deleteByPrimaryKey(Long idTransSlave);

    int insert(RTransSlave record);

    int insertSelective(RTransSlave record);

    List<RTransSlave> selectByExample(RTransSlaveExample example);

    RTransSlave selectByPrimaryKey(Long idTransSlave);

    int updateByExampleSelective(@Param("record") RTransSlave record, @Param("example") RTransSlaveExample example);

    int updateByExample(@Param("record") RTransSlave record, @Param("example") RTransSlaveExample example);

    int updateByPrimaryKeySelective(RTransSlave record);

    int updateByPrimaryKey(RTransSlave record);
}