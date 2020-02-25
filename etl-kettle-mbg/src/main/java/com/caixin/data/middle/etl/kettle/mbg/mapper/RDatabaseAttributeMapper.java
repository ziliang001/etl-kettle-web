package com.caixin.data.middle.etl.kettle.mbg.mapper;

import com.caixin.data.middle.etl.kettle.mbg.model.RDatabaseAttribute;
import com.caixin.data.middle.etl.kettle.mbg.model.RDatabaseAttributeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* Created by Mybatis Generator on 2020年02月07日 上午 07:59:41
*/
public interface RDatabaseAttributeMapper {
    long countByExample(RDatabaseAttributeExample example);

    int deleteByExample(RDatabaseAttributeExample example);

    int deleteByPrimaryKey(Long idDatabaseAttribute);

    int insert(RDatabaseAttribute record);

    int insertSelective(RDatabaseAttribute record);

    List<RDatabaseAttribute> selectByExampleWithBLOBs(RDatabaseAttributeExample example);

    List<RDatabaseAttribute> selectByExample(RDatabaseAttributeExample example);

    RDatabaseAttribute selectByPrimaryKey(Long idDatabaseAttribute);

    int updateByExampleSelective(@Param("record") RDatabaseAttribute record, @Param("example") RDatabaseAttributeExample example);

    int updateByExampleWithBLOBs(@Param("record") RDatabaseAttribute record, @Param("example") RDatabaseAttributeExample example);

    int updateByExample(@Param("record") RDatabaseAttribute record, @Param("example") RDatabaseAttributeExample example);

    int updateByPrimaryKeySelective(RDatabaseAttribute record);

    int updateByPrimaryKeyWithBLOBs(RDatabaseAttribute record);

    int updateByPrimaryKey(RDatabaseAttribute record);
}