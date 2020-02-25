package com.caixin.data.middle.etl.kettle.mbg.mapper;

import com.caixin.data.middle.etl.kettle.mbg.model.RTransAttribute;
import com.caixin.data.middle.etl.kettle.mbg.model.RTransAttributeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* Created by Mybatis Generator on 2020年02月07日 上午 07:59:41
*/
public interface RTransAttributeMapper {
    long countByExample(RTransAttributeExample example);

    int deleteByExample(RTransAttributeExample example);

    int deleteByPrimaryKey(Long idTransAttribute);

    int insert(RTransAttribute record);

    int insertSelective(RTransAttribute record);

    List<RTransAttribute> selectByExampleWithBLOBs(RTransAttributeExample example);

    List<RTransAttribute> selectByExample(RTransAttributeExample example);

    RTransAttribute selectByPrimaryKey(Long idTransAttribute);

    int updateByExampleSelective(@Param("record") RTransAttribute record, @Param("example") RTransAttributeExample example);

    int updateByExampleWithBLOBs(@Param("record") RTransAttribute record, @Param("example") RTransAttributeExample example);

    int updateByExample(@Param("record") RTransAttribute record, @Param("example") RTransAttributeExample example);

    int updateByPrimaryKeySelective(RTransAttribute record);

    int updateByPrimaryKeyWithBLOBs(RTransAttribute record);

    int updateByPrimaryKey(RTransAttribute record);
}