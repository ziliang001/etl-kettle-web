package com.caixin.data.middle.etl.kettle.mbg.mapper;

import com.caixin.data.middle.etl.kettle.mbg.model.DUserGroupTasksRelation;
import com.caixin.data.middle.etl.kettle.mbg.model.DUserGroupTasksRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* Created by Mybatis Generator on 2020年02月07日 上午 07:59:41
*/
public interface DUserGroupTasksRelationMapper {
    long countByExample(DUserGroupTasksRelationExample example);

    int deleteByExample(DUserGroupTasksRelationExample example);

    int deleteByPrimaryKey(Integer idUsergroupTasksRelation);

    int insert(DUserGroupTasksRelation record);

    int insertSelective(DUserGroupTasksRelation record);

    List<DUserGroupTasksRelation> selectByExample(DUserGroupTasksRelationExample example);

    DUserGroupTasksRelation selectByPrimaryKey(Integer idUsergroupTasksRelation);

    int updateByExampleSelective(@Param("record") DUserGroupTasksRelation record, @Param("example") DUserGroupTasksRelationExample example);

    int updateByExample(@Param("record") DUserGroupTasksRelation record, @Param("example") DUserGroupTasksRelationExample example);

    int updateByPrimaryKeySelective(DUserGroupTasksRelation record);

    int updateByPrimaryKey(DUserGroupTasksRelation record);
}