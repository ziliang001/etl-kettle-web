package com.caixin.data.middle.etl.kettle.mbg.mapper;

import com.caixin.data.middle.etl.kettle.mbg.model.RPartitionSchema;
import com.caixin.data.middle.etl.kettle.mbg.model.RPartitionSchemaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* Created by Mybatis Generator on 2020年02月07日 上午 07:59:41
*/
public interface RPartitionSchemaMapper {
    long countByExample(RPartitionSchemaExample example);

    int deleteByExample(RPartitionSchemaExample example);

    int deleteByPrimaryKey(Long idPartitionSchema);

    int insert(RPartitionSchema record);

    int insertSelective(RPartitionSchema record);

    List<RPartitionSchema> selectByExample(RPartitionSchemaExample example);

    RPartitionSchema selectByPrimaryKey(Long idPartitionSchema);

    int updateByExampleSelective(@Param("record") RPartitionSchema record, @Param("example") RPartitionSchemaExample example);

    int updateByExample(@Param("record") RPartitionSchema record, @Param("example") RPartitionSchemaExample example);

    int updateByPrimaryKeySelective(RPartitionSchema record);

    int updateByPrimaryKey(RPartitionSchema record);
}