package com.caixin.data.middle.etl.kettle.mbg.mapper;

import com.caixin.data.middle.etl.kettle.mbg.model.QrtzSimpleTriggers;
import com.caixin.data.middle.etl.kettle.mbg.model.QrtzSimpleTriggersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* Created by Mybatis Generator on 2020年02月07日 上午 07:59:41
*/
public interface QrtzSimpleTriggersMapper {
    long countByExample(QrtzSimpleTriggersExample example);

    int deleteByExample(QrtzSimpleTriggersExample example);

    int deleteByPrimaryKey(@Param("schedName") String schedName, @Param("triggerName") String triggerName, @Param("triggerGroup") String triggerGroup);

    int insert(QrtzSimpleTriggers record);

    int insertSelective(QrtzSimpleTriggers record);

    List<QrtzSimpleTriggers> selectByExample(QrtzSimpleTriggersExample example);

    QrtzSimpleTriggers selectByPrimaryKey(@Param("schedName") String schedName, @Param("triggerName") String triggerName, @Param("triggerGroup") String triggerGroup);

    int updateByExampleSelective(@Param("record") QrtzSimpleTriggers record, @Param("example") QrtzSimpleTriggersExample example);

    int updateByExample(@Param("record") QrtzSimpleTriggers record, @Param("example") QrtzSimpleTriggersExample example);

    int updateByPrimaryKeySelective(QrtzSimpleTriggers record);

    int updateByPrimaryKey(QrtzSimpleTriggers record);
}