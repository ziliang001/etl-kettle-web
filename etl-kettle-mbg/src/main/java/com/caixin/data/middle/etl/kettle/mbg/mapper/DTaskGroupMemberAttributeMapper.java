package com.caixin.data.middle.etl.kettle.mbg.mapper;

import com.caixin.data.middle.etl.kettle.mbg.model.DTaskGroupMemberAttribute;
import com.caixin.data.middle.etl.kettle.mbg.model.DTaskGroupMemberAttributeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* Created by Mybatis Generator on 2020年02月07日 上午 07:59:41
*/
public interface DTaskGroupMemberAttributeMapper {
    long countByExample(DTaskGroupMemberAttributeExample example);

    int deleteByExample(DTaskGroupMemberAttributeExample example);

    int deleteByPrimaryKey(Long idTaskGroupMemberAttribute);

    int insert(DTaskGroupMemberAttribute record);

    int insertSelective(DTaskGroupMemberAttribute record);

    List<DTaskGroupMemberAttribute> selectByExample(DTaskGroupMemberAttributeExample example);

    DTaskGroupMemberAttribute selectByPrimaryKey(Long idTaskGroupMemberAttribute);

    int updateByExampleSelective(@Param("record") DTaskGroupMemberAttribute record, @Param("example") DTaskGroupMemberAttributeExample example);

    int updateByExample(@Param("record") DTaskGroupMemberAttribute record, @Param("example") DTaskGroupMemberAttributeExample example);

    int updateByPrimaryKeySelective(DTaskGroupMemberAttribute record);

    int updateByPrimaryKey(DTaskGroupMemberAttribute record);
}