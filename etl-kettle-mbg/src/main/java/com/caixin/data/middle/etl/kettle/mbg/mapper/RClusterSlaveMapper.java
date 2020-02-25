package com.caixin.data.middle.etl.kettle.mbg.mapper;

import com.caixin.data.middle.etl.kettle.mbg.model.RClusterSlave;
import com.caixin.data.middle.etl.kettle.mbg.model.RClusterSlaveExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* Created by Mybatis Generator on 2020年02月07日 上午 07:59:41
*/
public interface RClusterSlaveMapper {
    long countByExample(RClusterSlaveExample example);

    int deleteByExample(RClusterSlaveExample example);

    int deleteByPrimaryKey(Long idClusterSlave);

    int insert(RClusterSlave record);

    int insertSelective(RClusterSlave record);

    List<RClusterSlave> selectByExample(RClusterSlaveExample example);

    RClusterSlave selectByPrimaryKey(Long idClusterSlave);

    int updateByExampleSelective(@Param("record") RClusterSlave record, @Param("example") RClusterSlaveExample example);

    int updateByExample(@Param("record") RClusterSlave record, @Param("example") RClusterSlaveExample example);

    int updateByPrimaryKeySelective(RClusterSlave record);

    int updateByPrimaryKey(RClusterSlave record);
}