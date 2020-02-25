package com.caixin.data.middle.etl.kettle.mbg.mapper;

import com.caixin.data.middle.etl.kettle.mbg.model.RTransPartitionSchema;
import com.caixin.data.middle.etl.kettle.mbg.model.RTransPartitionSchemaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* Created by Mybatis Generator on 2020年02月07日 上午 07:59:41
*/
public interface RTransPartitionSchemaMapper {
    long countByExample(RTransPartitionSchemaExample example);

    int deleteByExample(RTransPartitionSchemaExample example);

    int deleteByPrimaryKey(Long idTransPartitionSchema);

    int insert(RTransPartitionSchema record);

    int insertSelective(RTransPartitionSchema record);

    List<RTransPartitionSchema> selectByExample(RTransPartitionSchemaExample example);

    RTransPartitionSchema selectByPrimaryKey(Long idTransPartitionSchema);

    int updateByExampleSelective(@Param("record") RTransPartitionSchema record, @Param("example") RTransPartitionSchemaExample example);

    int updateByExample(@Param("record") RTransPartitionSchema record, @Param("example") RTransPartitionSchemaExample example);

    int updateByPrimaryKeySelective(RTransPartitionSchema record);

    int updateByPrimaryKey(RTransPartitionSchema record);
}