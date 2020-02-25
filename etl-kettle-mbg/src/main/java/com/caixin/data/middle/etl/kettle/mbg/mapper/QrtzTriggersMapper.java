package com.caixin.data.middle.etl.kettle.mbg.mapper;

import com.caixin.data.middle.etl.kettle.mbg.model.QrtzTriggers;
import com.caixin.data.middle.etl.kettle.mbg.model.QrtzTriggersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* Created by Mybatis Generator on 2020年02月07日 上午 07:59:41
*/
public interface QrtzTriggersMapper {
    long countByExample(QrtzTriggersExample example);

    int deleteByExample(QrtzTriggersExample example);

    int deleteByPrimaryKey(@Param("schedName") String schedName, @Param("triggerName") String triggerName, @Param("triggerGroup") String triggerGroup);

    int insert(QrtzTriggers record);

    int insertSelective(QrtzTriggers record);

    List<QrtzTriggers> selectByExampleWithBLOBs(QrtzTriggersExample example);

    List<QrtzTriggers> selectByExample(QrtzTriggersExample example);

    QrtzTriggers selectByPrimaryKey(@Param("schedName") String schedName, @Param("triggerName") String triggerName, @Param("triggerGroup") String triggerGroup);

    int updateByExampleSelective(@Param("record") QrtzTriggers record, @Param("example") QrtzTriggersExample example);

    int updateByExampleWithBLOBs(@Param("record") QrtzTriggers record, @Param("example") QrtzTriggersExample example);

    int updateByExample(@Param("record") QrtzTriggers record, @Param("example") QrtzTriggersExample example);

    int updateByPrimaryKeySelective(QrtzTriggers record);

    int updateByPrimaryKeyWithBLOBs(QrtzTriggers record);

    int updateByPrimaryKey(QrtzTriggers record);
}