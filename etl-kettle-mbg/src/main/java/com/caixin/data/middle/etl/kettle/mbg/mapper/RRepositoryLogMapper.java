package com.caixin.data.middle.etl.kettle.mbg.mapper;

import com.caixin.data.middle.etl.kettle.mbg.model.RRepositoryLog;
import com.caixin.data.middle.etl.kettle.mbg.model.RRepositoryLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* Created by Mybatis Generator on 2020年02月07日 上午 07:59:41
*/
public interface RRepositoryLogMapper {
    long countByExample(RRepositoryLogExample example);

    int deleteByExample(RRepositoryLogExample example);

    int deleteByPrimaryKey(Long idRepositoryLog);

    int insert(RRepositoryLog record);

    int insertSelective(RRepositoryLog record);

    List<RRepositoryLog> selectByExampleWithBLOBs(RRepositoryLogExample example);

    List<RRepositoryLog> selectByExample(RRepositoryLogExample example);

    RRepositoryLog selectByPrimaryKey(Long idRepositoryLog);

    int updateByExampleSelective(@Param("record") RRepositoryLog record, @Param("example") RRepositoryLogExample example);

    int updateByExampleWithBLOBs(@Param("record") RRepositoryLog record, @Param("example") RRepositoryLogExample example);

    int updateByExample(@Param("record") RRepositoryLog record, @Param("example") RRepositoryLogExample example);

    int updateByPrimaryKeySelective(RRepositoryLog record);

    int updateByPrimaryKeyWithBLOBs(RRepositoryLog record);

    int updateByPrimaryKey(RRepositoryLog record);
}