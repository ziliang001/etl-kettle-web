package com.caixin.data.middle.etl.kettle.mbg.mapper;

import com.caixin.data.middle.etl.kettle.mbg.model.QrtzBlobTriggers;
import com.caixin.data.middle.etl.kettle.mbg.model.QrtzBlobTriggersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* Created by Mybatis Generator on 2020年02月07日 上午 07:59:41
*/
public interface QrtzBlobTriggersMapper {
    long countByExample(QrtzBlobTriggersExample example);

    int deleteByExample(QrtzBlobTriggersExample example);

    int deleteByPrimaryKey(@Param("schedName") String schedName, @Param("triggerName") String triggerName, @Param("triggerGroup") String triggerGroup);

    int insert(QrtzBlobTriggers record);

    int insertSelective(QrtzBlobTriggers record);

    List<QrtzBlobTriggers> selectByExampleWithBLOBs(QrtzBlobTriggersExample example);

    List<QrtzBlobTriggers> selectByExample(QrtzBlobTriggersExample example);

    QrtzBlobTriggers selectByPrimaryKey(@Param("schedName") String schedName, @Param("triggerName") String triggerName, @Param("triggerGroup") String triggerGroup);

    int updateByExampleSelective(@Param("record") QrtzBlobTriggers record, @Param("example") QrtzBlobTriggersExample example);

    int updateByExampleWithBLOBs(@Param("record") QrtzBlobTriggers record, @Param("example") QrtzBlobTriggersExample example);

    int updateByExample(@Param("record") QrtzBlobTriggers record, @Param("example") QrtzBlobTriggersExample example);

    int updateByPrimaryKeySelective(QrtzBlobTriggers record);

    int updateByPrimaryKeyWithBLOBs(QrtzBlobTriggers record);
}