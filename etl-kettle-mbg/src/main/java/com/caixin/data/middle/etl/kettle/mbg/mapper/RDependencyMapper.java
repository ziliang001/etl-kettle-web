package com.caixin.data.middle.etl.kettle.mbg.mapper;

import com.caixin.data.middle.etl.kettle.mbg.model.RDependency;
import com.caixin.data.middle.etl.kettle.mbg.model.RDependencyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* Created by Mybatis Generator on 2020年02月07日 上午 07:59:41
*/
public interface RDependencyMapper {
    long countByExample(RDependencyExample example);

    int deleteByExample(RDependencyExample example);

    int deleteByPrimaryKey(Long idDependency);

    int insert(RDependency record);

    int insertSelective(RDependency record);

    List<RDependency> selectByExample(RDependencyExample example);

    RDependency selectByPrimaryKey(Long idDependency);

    int updateByExampleSelective(@Param("record") RDependency record, @Param("example") RDependencyExample example);

    int updateByExample(@Param("record") RDependency record, @Param("example") RDependencyExample example);

    int updateByPrimaryKeySelective(RDependency record);

    int updateByPrimaryKey(RDependency record);
}