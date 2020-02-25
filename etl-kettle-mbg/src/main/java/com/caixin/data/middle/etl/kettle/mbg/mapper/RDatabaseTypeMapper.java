package com.caixin.data.middle.etl.kettle.mbg.mapper;

import com.caixin.data.middle.etl.kettle.mbg.model.RDatabaseType;
import com.caixin.data.middle.etl.kettle.mbg.model.RDatabaseTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* Created by Mybatis Generator on 2020年02月07日 上午 07:59:41
*/
public interface RDatabaseTypeMapper {
    long countByExample(RDatabaseTypeExample example);

    int deleteByExample(RDatabaseTypeExample example);

    int deleteByPrimaryKey(Long idDatabaseType);

    int insert(RDatabaseType record);

    int insertSelective(RDatabaseType record);

    List<RDatabaseType> selectByExample(RDatabaseTypeExample example);

    RDatabaseType selectByPrimaryKey(Long idDatabaseType);

    int updateByExampleSelective(@Param("record") RDatabaseType record, @Param("example") RDatabaseTypeExample example);

    int updateByExample(@Param("record") RDatabaseType record, @Param("example") RDatabaseTypeExample example);

    int updateByPrimaryKeySelective(RDatabaseType record);

    int updateByPrimaryKey(RDatabaseType record);
}