package com.caixin.data.middle.etl.kettle.mbg.mapper;

import com.caixin.data.middle.etl.kettle.mbg.model.RCluster;
import com.caixin.data.middle.etl.kettle.mbg.model.RClusterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* Created by Mybatis Generator on 2020年02月07日 上午 07:59:41
*/
public interface RClusterMapper {
    long countByExample(RClusterExample example);

    int deleteByExample(RClusterExample example);

    int deleteByPrimaryKey(Long idCluster);

    int insert(RCluster record);

    int insertSelective(RCluster record);

    List<RCluster> selectByExample(RClusterExample example);

    RCluster selectByPrimaryKey(Long idCluster);

    int updateByExampleSelective(@Param("record") RCluster record, @Param("example") RClusterExample example);

    int updateByExample(@Param("record") RCluster record, @Param("example") RClusterExample example);

    int updateByPrimaryKeySelective(RCluster record);

    int updateByPrimaryKey(RCluster record);
}