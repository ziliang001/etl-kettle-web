package com.caixin.data.middle.etl.kettle.mbg.mapper;

import com.caixin.data.middle.etl.kettle.mbg.model.RJobAttribute;
import com.caixin.data.middle.etl.kettle.mbg.model.RJobAttributeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* Created by Mybatis Generator on 2020年02月07日 上午 07:59:41
*/
public interface RJobAttributeMapper {
    long countByExample(RJobAttributeExample example);

    int deleteByExample(RJobAttributeExample example);

    int deleteByPrimaryKey(Long idJobAttribute);

    int insert(RJobAttribute record);

    int insertSelective(RJobAttribute record);

    List<RJobAttribute> selectByExampleWithBLOBs(RJobAttributeExample example);

    List<RJobAttribute> selectByExample(RJobAttributeExample example);

    RJobAttribute selectByPrimaryKey(Long idJobAttribute);

    int updateByExampleSelective(@Param("record") RJobAttribute record, @Param("example") RJobAttributeExample example);

    int updateByExampleWithBLOBs(@Param("record") RJobAttribute record, @Param("example") RJobAttributeExample example);

    int updateByExample(@Param("record") RJobAttribute record, @Param("example") RJobAttributeExample example);

    int updateByPrimaryKeySelective(RJobAttribute record);

    int updateByPrimaryKeyWithBLOBs(RJobAttribute record);

    int updateByPrimaryKey(RJobAttribute record);
}