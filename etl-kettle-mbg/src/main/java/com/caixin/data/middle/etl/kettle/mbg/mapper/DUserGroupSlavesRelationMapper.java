package com.caixin.data.middle.etl.kettle.mbg.mapper;

import com.caixin.data.middle.etl.kettle.mbg.model.DUserGroupSlavesRelation;
import com.caixin.data.middle.etl.kettle.mbg.model.DUserGroupSlavesRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* Created by Mybatis Generator on 2020年02月07日 上午 07:59:41
*/
public interface DUserGroupSlavesRelationMapper {
    long countByExample(DUserGroupSlavesRelationExample example);

    int deleteByExample(DUserGroupSlavesRelationExample example);

    int deleteByPrimaryKey(Integer idUsergroupSlavesRelation);

    int insert(DUserGroupSlavesRelation record);

    int insertSelective(DUserGroupSlavesRelation record);

    List<DUserGroupSlavesRelation> selectByExample(DUserGroupSlavesRelationExample example);

    DUserGroupSlavesRelation selectByPrimaryKey(Integer idUsergroupSlavesRelation);

    int updateByExampleSelective(@Param("record") DUserGroupSlavesRelation record, @Param("example") DUserGroupSlavesRelationExample example);

    int updateByExample(@Param("record") DUserGroupSlavesRelation record, @Param("example") DUserGroupSlavesRelationExample example);

    int updateByPrimaryKeySelective(DUserGroupSlavesRelation record);

    int updateByPrimaryKey(DUserGroupSlavesRelation record);
}