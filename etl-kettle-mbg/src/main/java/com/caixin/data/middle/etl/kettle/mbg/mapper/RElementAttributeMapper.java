package com.caixin.data.middle.etl.kettle.mbg.mapper;

import com.caixin.data.middle.etl.kettle.mbg.model.RElementAttribute;
import com.caixin.data.middle.etl.kettle.mbg.model.RElementAttributeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* Created by Mybatis Generator on 2020年02月07日 上午 07:59:41
*/
public interface RElementAttributeMapper {
    long countByExample(RElementAttributeExample example);

    int deleteByExample(RElementAttributeExample example);

    int deleteByPrimaryKey(Long idElementAttribute);

    int insert(RElementAttribute record);

    int insertSelective(RElementAttribute record);

    List<RElementAttribute> selectByExampleWithBLOBs(RElementAttributeExample example);

    List<RElementAttribute> selectByExample(RElementAttributeExample example);

    RElementAttribute selectByPrimaryKey(Long idElementAttribute);

    int updateByExampleSelective(@Param("record") RElementAttribute record, @Param("example") RElementAttributeExample example);

    int updateByExampleWithBLOBs(@Param("record") RElementAttribute record, @Param("example") RElementAttributeExample example);

    int updateByExample(@Param("record") RElementAttribute record, @Param("example") RElementAttributeExample example);

    int updateByPrimaryKeySelective(RElementAttribute record);

    int updateByPrimaryKeyWithBLOBs(RElementAttribute record);

    int updateByPrimaryKey(RElementAttribute record);
}