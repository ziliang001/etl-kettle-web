package com.caixin.data.middle.etl.kettle.mbg.mapper;

import com.caixin.data.middle.etl.kettle.mbg.model.RElementType;
import com.caixin.data.middle.etl.kettle.mbg.model.RElementTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* Created by Mybatis Generator on 2020年02月07日 上午 07:59:41
*/
public interface RElementTypeMapper {
    long countByExample(RElementTypeExample example);

    int deleteByExample(RElementTypeExample example);

    int deleteByPrimaryKey(Long idElementType);

    int insert(RElementType record);

    int insertSelective(RElementType record);

    List<RElementType> selectByExampleWithBLOBs(RElementTypeExample example);

    List<RElementType> selectByExample(RElementTypeExample example);

    RElementType selectByPrimaryKey(Long idElementType);

    int updateByExampleSelective(@Param("record") RElementType record, @Param("example") RElementTypeExample example);

    int updateByExampleWithBLOBs(@Param("record") RElementType record, @Param("example") RElementTypeExample example);

    int updateByExample(@Param("record") RElementType record, @Param("example") RElementTypeExample example);

    int updateByPrimaryKeySelective(RElementType record);

    int updateByPrimaryKeyWithBLOBs(RElementType record);

    int updateByPrimaryKey(RElementType record);
}