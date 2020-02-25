package com.caixin.data.middle.etl.kettle.mbg.mapper;

import com.caixin.data.middle.etl.kettle.mbg.model.DTaskGroup;
import com.caixin.data.middle.etl.kettle.mbg.model.DTaskGroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* Created by Mybatis Generator on 2020年02月07日 上午 07:59:41
*/
public interface DTaskGroupMapper {
    long countByExample(DTaskGroupExample example);

    int deleteByExample(DTaskGroupExample example);

    int deleteByPrimaryKey(Long idTaskGroup);

    int insert(DTaskGroup record);

    int insertSelective(DTaskGroup record);

    List<DTaskGroup> selectByExample(DTaskGroupExample example);

    DTaskGroup selectByPrimaryKey(Long idTaskGroup);

    int updateByExampleSelective(@Param("record") DTaskGroup record, @Param("example") DTaskGroupExample example);

    int updateByExample(@Param("record") DTaskGroup record, @Param("example") DTaskGroupExample example);

    int updateByPrimaryKeySelective(DTaskGroup record);

    int updateByPrimaryKey(DTaskGroup record);
}