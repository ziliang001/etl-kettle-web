package com.caixin.data.middle.etl.kettle.mbg.mapper;

import com.caixin.data.middle.etl.kettle.mbg.model.DUserGroup;
import com.caixin.data.middle.etl.kettle.mbg.model.DUserGroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* Created by Mybatis Generator on 2020年02月07日 上午 07:59:41
*/
public interface DUserGroupMapper {
    long countByExample(DUserGroupExample example);

    int deleteByExample(DUserGroupExample example);

    int deleteByPrimaryKey(Integer idUserGroup);

    int insert(DUserGroup record);

    int insertSelective(DUserGroup record);

    List<DUserGroup> selectByExample(DUserGroupExample example);

    DUserGroup selectByPrimaryKey(Integer idUserGroup);

    int updateByExampleSelective(@Param("record") DUserGroup record, @Param("example") DUserGroupExample example);

    int updateByExample(@Param("record") DUserGroup record, @Param("example") DUserGroupExample example);

    int updateByPrimaryKeySelective(DUserGroup record);

    int updateByPrimaryKey(DUserGroup record);
}