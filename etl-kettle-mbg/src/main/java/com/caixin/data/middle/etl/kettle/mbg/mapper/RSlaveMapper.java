package com.caixin.data.middle.etl.kettle.mbg.mapper;

import com.caixin.data.middle.etl.kettle.mbg.model.RSlave;
import com.caixin.data.middle.etl.kettle.mbg.model.RSlaveExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* Created by Mybatis Generator on 2020年02月07日 上午 07:59:41
*/
public interface RSlaveMapper {
    long countByExample(RSlaveExample example);

    int deleteByExample(RSlaveExample example);

    int deleteByPrimaryKey(Long idSlave);

    int insert(RSlave record);

    int insertSelective(RSlave record);

    List<RSlave> selectByExample(RSlaveExample example);

    RSlave selectByPrimaryKey(Long idSlave);

    int updateByExampleSelective(@Param("record") RSlave record, @Param("example") RSlaveExample example);

    int updateByExample(@Param("record") RSlave record, @Param("example") RSlaveExample example);

    int updateByPrimaryKeySelective(RSlave record);

    int updateByPrimaryKey(RSlave record);
}