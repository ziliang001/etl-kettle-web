package com.caixin.data.middle.etl.kettle.mbg.mapper;

import com.caixin.data.middle.etl.kettle.mbg.model.RJobLock;
import com.caixin.data.middle.etl.kettle.mbg.model.RJobLockExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* Created by Mybatis Generator on 2020年02月07日 上午 07:59:41
*/
public interface RJobLockMapper {
    long countByExample(RJobLockExample example);

    int deleteByExample(RJobLockExample example);

    int deleteByPrimaryKey(Long idJobLock);

    int insert(RJobLock record);

    int insertSelective(RJobLock record);

    List<RJobLock> selectByExampleWithBLOBs(RJobLockExample example);

    List<RJobLock> selectByExample(RJobLockExample example);

    RJobLock selectByPrimaryKey(Long idJobLock);

    int updateByExampleSelective(@Param("record") RJobLock record, @Param("example") RJobLockExample example);

    int updateByExampleWithBLOBs(@Param("record") RJobLock record, @Param("example") RJobLockExample example);

    int updateByExample(@Param("record") RJobLock record, @Param("example") RJobLockExample example);

    int updateByPrimaryKeySelective(RJobLock record);

    int updateByPrimaryKeyWithBLOBs(RJobLock record);

    int updateByPrimaryKey(RJobLock record);
}