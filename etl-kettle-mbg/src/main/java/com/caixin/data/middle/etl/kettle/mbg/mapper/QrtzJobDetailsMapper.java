package com.caixin.data.middle.etl.kettle.mbg.mapper;

import com.caixin.data.middle.etl.kettle.mbg.model.QrtzJobDetails;
import com.caixin.data.middle.etl.kettle.mbg.model.QrtzJobDetailsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* Created by Mybatis Generator on 2020年02月07日 上午 07:59:41
*/
public interface QrtzJobDetailsMapper {
    long countByExample(QrtzJobDetailsExample example);

    int deleteByExample(QrtzJobDetailsExample example);

    int deleteByPrimaryKey(@Param("schedName") String schedName, @Param("jobName") String jobName, @Param("jobGroup") String jobGroup);

    int insert(QrtzJobDetails record);

    int insertSelective(QrtzJobDetails record);

    List<QrtzJobDetails> selectByExampleWithBLOBs(QrtzJobDetailsExample example);

    List<QrtzJobDetails> selectByExample(QrtzJobDetailsExample example);

    QrtzJobDetails selectByPrimaryKey(@Param("schedName") String schedName, @Param("jobName") String jobName, @Param("jobGroup") String jobGroup);

    int updateByExampleSelective(@Param("record") QrtzJobDetails record, @Param("example") QrtzJobDetailsExample example);

    int updateByExampleWithBLOBs(@Param("record") QrtzJobDetails record, @Param("example") QrtzJobDetailsExample example);

    int updateByExample(@Param("record") QrtzJobDetails record, @Param("example") QrtzJobDetailsExample example);

    int updateByPrimaryKeySelective(QrtzJobDetails record);

    int updateByPrimaryKeyWithBLOBs(QrtzJobDetails record);

    int updateByPrimaryKey(QrtzJobDetails record);
}