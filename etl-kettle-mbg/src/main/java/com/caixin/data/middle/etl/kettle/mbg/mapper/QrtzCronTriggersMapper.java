package com.caixin.data.middle.etl.kettle.mbg.mapper;

import com.caixin.data.middle.etl.kettle.mbg.model.QrtzCronTriggers;
import com.caixin.data.middle.etl.kettle.mbg.model.QrtzCronTriggersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* Created by Mybatis Generator on 2020年02月07日 上午 07:59:41
*/
public interface QrtzCronTriggersMapper {
    long countByExample(QrtzCronTriggersExample example);

    int deleteByExample(QrtzCronTriggersExample example);

    int deleteByPrimaryKey(@Param("schedName") String schedName, @Param("triggerName") String triggerName, @Param("triggerGroup") String triggerGroup);

    int insert(QrtzCronTriggers record);

    int insertSelective(QrtzCronTriggers record);

    List<QrtzCronTriggers> selectByExample(QrtzCronTriggersExample example);

    QrtzCronTriggers selectByPrimaryKey(@Param("schedName") String schedName, @Param("triggerName") String triggerName, @Param("triggerGroup") String triggerGroup);

    int updateByExampleSelective(@Param("record") QrtzCronTriggers record, @Param("example") QrtzCronTriggersExample example);

    int updateByExample(@Param("record") QrtzCronTriggers record, @Param("example") QrtzCronTriggersExample example);

    int updateByPrimaryKeySelective(QrtzCronTriggers record);

    int updateByPrimaryKey(QrtzCronTriggers record);
}