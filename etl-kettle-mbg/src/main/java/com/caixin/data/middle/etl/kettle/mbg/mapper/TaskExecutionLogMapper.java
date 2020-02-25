package com.caixin.data.middle.etl.kettle.mbg.mapper;

import com.caixin.data.middle.etl.kettle.mbg.model.TaskExecutionLog;
import com.caixin.data.middle.etl.kettle.mbg.model.TaskExecutionLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* Created by Mybatis Generator on 2020年02月07日 上午 07:59:41
*/
public interface TaskExecutionLogMapper {
    long countByExample(TaskExecutionLogExample example);

    int deleteByExample(TaskExecutionLogExample example);

    int deleteByPrimaryKey(Long fireid);

    int insert(TaskExecutionLog record);

    int insertSelective(TaskExecutionLog record);

    List<TaskExecutionLog> selectByExampleWithBLOBs(TaskExecutionLogExample example);

    List<TaskExecutionLog> selectByExample(TaskExecutionLogExample example);

    TaskExecutionLog selectByPrimaryKey(Long fireid);

    int updateByExampleSelective(@Param("record") TaskExecutionLog record, @Param("example") TaskExecutionLogExample example);

    int updateByExampleWithBLOBs(@Param("record") TaskExecutionLog record, @Param("example") TaskExecutionLogExample example);

    int updateByExample(@Param("record") TaskExecutionLog record, @Param("example") TaskExecutionLogExample example);

    int updateByPrimaryKeySelective(TaskExecutionLog record);

    int updateByPrimaryKeyWithBLOBs(TaskExecutionLog record);

    int updateByPrimaryKey(TaskExecutionLog record);
}