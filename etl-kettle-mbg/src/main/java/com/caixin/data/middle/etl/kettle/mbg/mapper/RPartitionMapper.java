package com.caixin.data.middle.etl.kettle.mbg.mapper;

import com.caixin.data.middle.etl.kettle.mbg.model.RPartition;
import com.caixin.data.middle.etl.kettle.mbg.model.RPartitionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* Created by Mybatis Generator on 2020年02月07日 上午 07:59:41
*/
public interface RPartitionMapper {
    long countByExample(RPartitionExample example);

    int deleteByExample(RPartitionExample example);

    int deleteByPrimaryKey(Long idPartition);

    int insert(RPartition record);

    int insertSelective(RPartition record);

    List<RPartition> selectByExample(RPartitionExample example);

    RPartition selectByPrimaryKey(Long idPartition);

    int updateByExampleSelective(@Param("record") RPartition record, @Param("example") RPartitionExample example);

    int updateByExample(@Param("record") RPartition record, @Param("example") RPartitionExample example);

    int updateByPrimaryKeySelective(RPartition record);

    int updateByPrimaryKey(RPartition record);
}