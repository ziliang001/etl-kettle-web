package com.caixin.data.middle.etl.kettle.mbg.mapper;

import com.caixin.data.middle.etl.kettle.mbg.model.RJobentryCopy;
import com.caixin.data.middle.etl.kettle.mbg.model.RJobentryCopyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* Created by Mybatis Generator on 2020年02月07日 上午 07:59:41
*/
public interface RJobentryCopyMapper {
    long countByExample(RJobentryCopyExample example);

    int deleteByExample(RJobentryCopyExample example);

    int deleteByPrimaryKey(Long idJobentryCopy);

    int insert(RJobentryCopy record);

    int insertSelective(RJobentryCopy record);

    List<RJobentryCopy> selectByExample(RJobentryCopyExample example);

    RJobentryCopy selectByPrimaryKey(Long idJobentryCopy);

    int updateByExampleSelective(@Param("record") RJobentryCopy record, @Param("example") RJobentryCopyExample example);

    int updateByExample(@Param("record") RJobentryCopy record, @Param("example") RJobentryCopyExample example);

    int updateByPrimaryKeySelective(RJobentryCopy record);

    int updateByPrimaryKey(RJobentryCopy record);
}