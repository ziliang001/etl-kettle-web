package com.caixin.data.middle.etl.kettle.mbg.mapper;

import com.caixin.data.middle.etl.kettle.mbg.model.QrtzPausedTriggerGrps;
import com.caixin.data.middle.etl.kettle.mbg.model.QrtzPausedTriggerGrpsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* Created by Mybatis Generator on 2020年02月07日 上午 07:59:41
*/
public interface QrtzPausedTriggerGrpsMapper {
    long countByExample(QrtzPausedTriggerGrpsExample example);

    int deleteByExample(QrtzPausedTriggerGrpsExample example);

    int deleteByPrimaryKey(@Param("schedName") String schedName, @Param("triggerGroup") String triggerGroup);

    int insert(QrtzPausedTriggerGrps record);

    int insertSelective(QrtzPausedTriggerGrps record);

    List<QrtzPausedTriggerGrps> selectByExample(QrtzPausedTriggerGrpsExample example);

    int updateByExampleSelective(@Param("record") QrtzPausedTriggerGrps record, @Param("example") QrtzPausedTriggerGrpsExample example);

    int updateByExample(@Param("record") QrtzPausedTriggerGrps record, @Param("example") QrtzPausedTriggerGrpsExample example);
}