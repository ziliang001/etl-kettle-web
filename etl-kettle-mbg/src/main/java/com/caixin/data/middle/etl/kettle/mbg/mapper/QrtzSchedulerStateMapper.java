package com.caixin.data.middle.etl.kettle.mbg.mapper;

import com.caixin.data.middle.etl.kettle.mbg.model.QrtzSchedulerState;
import com.caixin.data.middle.etl.kettle.mbg.model.QrtzSchedulerStateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* Created by Mybatis Generator on 2020年02月07日 上午 07:59:41
*/
public interface QrtzSchedulerStateMapper {
    long countByExample(QrtzSchedulerStateExample example);

    int deleteByExample(QrtzSchedulerStateExample example);

    int deleteByPrimaryKey(@Param("schedName") String schedName, @Param("instanceName") String instanceName);

    int insert(QrtzSchedulerState record);

    int insertSelective(QrtzSchedulerState record);

    List<QrtzSchedulerState> selectByExample(QrtzSchedulerStateExample example);

    QrtzSchedulerState selectByPrimaryKey(@Param("schedName") String schedName, @Param("instanceName") String instanceName);

    int updateByExampleSelective(@Param("record") QrtzSchedulerState record, @Param("example") QrtzSchedulerStateExample example);

    int updateByExample(@Param("record") QrtzSchedulerState record, @Param("example") QrtzSchedulerStateExample example);

    int updateByPrimaryKeySelective(QrtzSchedulerState record);

    int updateByPrimaryKey(QrtzSchedulerState record);
}