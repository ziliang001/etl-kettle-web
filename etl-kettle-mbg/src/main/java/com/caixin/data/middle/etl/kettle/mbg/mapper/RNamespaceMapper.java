package com.caixin.data.middle.etl.kettle.mbg.mapper;

import com.caixin.data.middle.etl.kettle.mbg.model.RNamespace;
import com.caixin.data.middle.etl.kettle.mbg.model.RNamespaceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* Created by Mybatis Generator on 2020年02月07日 上午 07:59:41
*/
public interface RNamespaceMapper {
    long countByExample(RNamespaceExample example);

    int deleteByExample(RNamespaceExample example);

    int deleteByPrimaryKey(Long idNamespace);

    int insert(RNamespace record);

    int insertSelective(RNamespace record);

    List<RNamespace> selectByExampleWithBLOBs(RNamespaceExample example);

    List<RNamespace> selectByExample(RNamespaceExample example);

    RNamespace selectByPrimaryKey(Long idNamespace);

    int updateByExampleSelective(@Param("record") RNamespace record, @Param("example") RNamespaceExample example);

    int updateByExampleWithBLOBs(@Param("record") RNamespace record, @Param("example") RNamespaceExample example);

    int updateByExample(@Param("record") RNamespace record, @Param("example") RNamespaceExample example);

    int updateByPrimaryKeySelective(RNamespace record);

    int updateByPrimaryKeyWithBLOBs(RNamespace record);
}