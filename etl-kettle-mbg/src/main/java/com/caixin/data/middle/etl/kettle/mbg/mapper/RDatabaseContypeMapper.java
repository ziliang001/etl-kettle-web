package com.caixin.data.middle.etl.kettle.mbg.mapper;

import com.caixin.data.middle.etl.kettle.mbg.model.RDatabaseContype;
import com.caixin.data.middle.etl.kettle.mbg.model.RDatabaseContypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* Created by Mybatis Generator on 2020年02月07日 上午 07:59:41
*/
public interface RDatabaseContypeMapper {
    long countByExample(RDatabaseContypeExample example);

    int deleteByExample(RDatabaseContypeExample example);

    int deleteByPrimaryKey(Long idDatabaseContype);

    int insert(RDatabaseContype record);

    int insertSelective(RDatabaseContype record);

    List<RDatabaseContype> selectByExample(RDatabaseContypeExample example);

    RDatabaseContype selectByPrimaryKey(Long idDatabaseContype);

    int updateByExampleSelective(@Param("record") RDatabaseContype record, @Param("example") RDatabaseContypeExample example);

    int updateByExample(@Param("record") RDatabaseContype record, @Param("example") RDatabaseContypeExample example);

    int updateByPrimaryKeySelective(RDatabaseContype record);

    int updateByPrimaryKey(RDatabaseContype record);
}