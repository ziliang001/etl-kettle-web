package com.caixin.data.middle.etl.kettle.mbg.mapper;

import com.caixin.data.middle.etl.kettle.mbg.model.DUserGroupMemberAttribute;
import com.caixin.data.middle.etl.kettle.mbg.model.DUserGroupMemberAttributeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* Created by Mybatis Generator on 2020年02月07日 上午 07:59:41
*/
public interface DUserGroupMemberAttributeMapper {
    long countByExample(DUserGroupMemberAttributeExample example);

    int deleteByExample(DUserGroupMemberAttributeExample example);

    int deleteByPrimaryKey(Integer idUsergroupMemberAttribute);

    int insert(DUserGroupMemberAttribute record);

    int insertSelective(DUserGroupMemberAttribute record);

    List<DUserGroupMemberAttribute> selectByExample(DUserGroupMemberAttributeExample example);

    DUserGroupMemberAttribute selectByPrimaryKey(Integer idUsergroupMemberAttribute);

    int updateByExampleSelective(@Param("record") DUserGroupMemberAttribute record, @Param("example") DUserGroupMemberAttributeExample example);

    int updateByExample(@Param("record") DUserGroupMemberAttribute record, @Param("example") DUserGroupMemberAttributeExample example);

    int updateByPrimaryKeySelective(DUserGroupMemberAttribute record);

    int updateByPrimaryKey(DUserGroupMemberAttribute record);
}