package com.caixin.data.middle.etl.kettle.mbg.mapper;

import com.caixin.data.middle.etl.kettle.mbg.model.RTransCluster;
import com.caixin.data.middle.etl.kettle.mbg.model.RTransClusterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* Created by Mybatis Generator on 2020年02月07日 上午 07:59:41
*/
public interface RTransClusterMapper {
    long countByExample(RTransClusterExample example);

    int deleteByExample(RTransClusterExample example);

    int deleteByPrimaryKey(Long idTransCluster);

    int insert(RTransCluster record);

    int insertSelective(RTransCluster record);

    List<RTransCluster> selectByExample(RTransClusterExample example);

    RTransCluster selectByPrimaryKey(Long idTransCluster);

    int updateByExampleSelective(@Param("record") RTransCluster record, @Param("example") RTransClusterExample example);

    int updateByExample(@Param("record") RTransCluster record, @Param("example") RTransClusterExample example);

    int updateByPrimaryKeySelective(RTransCluster record);

    int updateByPrimaryKey(RTransCluster record);
}