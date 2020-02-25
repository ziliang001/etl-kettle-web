package com.caixin.data.middle.etl.kettle.mbg.mapper;

import com.caixin.data.middle.etl.kettle.mbg.model.RTransformation;
import com.caixin.data.middle.etl.kettle.mbg.model.RTransformationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* Created by Mybatis Generator on 2020年02月07日 上午 07:59:41
*/
public interface RTransformationMapper {
    long countByExample(RTransformationExample example);

    int deleteByExample(RTransformationExample example);

    int deleteByPrimaryKey(Long idTransformation);

    int insert(RTransformation record);

    int insertSelective(RTransformation record);

    List<RTransformation> selectByExampleWithBLOBs(RTransformationExample example);

    List<RTransformation> selectByExample(RTransformationExample example);

    RTransformation selectByPrimaryKey(Long idTransformation);

    int updateByExampleSelective(@Param("record") RTransformation record, @Param("example") RTransformationExample example);

    int updateByExampleWithBLOBs(@Param("record") RTransformation record, @Param("example") RTransformationExample example);

    int updateByExample(@Param("record") RTransformation record, @Param("example") RTransformationExample example);

    int updateByPrimaryKeySelective(RTransformation record);

    int updateByPrimaryKeyWithBLOBs(RTransformation record);

    int updateByPrimaryKey(RTransformation record);
}