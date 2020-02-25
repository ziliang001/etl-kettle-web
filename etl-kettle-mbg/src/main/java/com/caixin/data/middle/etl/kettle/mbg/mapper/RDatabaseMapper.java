package com.caixin.data.middle.etl.kettle.mbg.mapper;

import com.caixin.data.middle.etl.kettle.mbg.model.RDatabase;
import com.caixin.data.middle.etl.kettle.mbg.model.RDatabaseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* Created by Mybatis Generator on 2020年02月07日 上午 07:59:41
*/
public interface RDatabaseMapper {
    long countByExample(RDatabaseExample example);

    int deleteByExample(RDatabaseExample example);

    int deleteByPrimaryKey(Long idDatabase);

    int insert(RDatabase record);

    int insertSelective(RDatabase record);

    List<RDatabase> selectByExampleWithBLOBs(RDatabaseExample example);

    List<RDatabase> selectByExample(RDatabaseExample example);

    RDatabase selectByPrimaryKey(Long idDatabase);

    int updateByExampleSelective(@Param("record") RDatabase record, @Param("example") RDatabaseExample example);

    int updateByExampleWithBLOBs(@Param("record") RDatabase record, @Param("example") RDatabaseExample example);

    int updateByExample(@Param("record") RDatabase record, @Param("example") RDatabaseExample example);

    int updateByPrimaryKeySelective(RDatabase record);

    int updateByPrimaryKeyWithBLOBs(RDatabase record);

    int updateByPrimaryKey(RDatabase record);
}