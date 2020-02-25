package com.caixin.data.middle.etl.kettle.mbg.mapper;

import com.caixin.data.middle.etl.kettle.mbg.model.RVersion;
import com.caixin.data.middle.etl.kettle.mbg.model.RVersionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* Created by Mybatis Generator on 2020年02月07日 上午 07:59:41
*/
public interface RVersionMapper {
    long countByExample(RVersionExample example);

    int deleteByExample(RVersionExample example);

    int deleteByPrimaryKey(Long idVersion);

    int insert(RVersion record);

    int insertSelective(RVersion record);

    List<RVersion> selectByExample(RVersionExample example);

    RVersion selectByPrimaryKey(Long idVersion);

    int updateByExampleSelective(@Param("record") RVersion record, @Param("example") RVersionExample example);

    int updateByExample(@Param("record") RVersion record, @Param("example") RVersionExample example);

    int updateByPrimaryKeySelective(RVersion record);

    int updateByPrimaryKey(RVersion record);
}