package com.caixin.data.middle.etl.kettle.mbg.mapper;

import com.caixin.data.middle.etl.kettle.mbg.model.RTransLock;
import com.caixin.data.middle.etl.kettle.mbg.model.RTransLockExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* Created by Mybatis Generator on 2020年02月07日 上午 07:59:41
*/
public interface RTransLockMapper {
    long countByExample(RTransLockExample example);

    int deleteByExample(RTransLockExample example);

    int deleteByPrimaryKey(Long idTransLock);

    int insert(RTransLock record);

    int insertSelective(RTransLock record);

    List<RTransLock> selectByExampleWithBLOBs(RTransLockExample example);

    List<RTransLock> selectByExample(RTransLockExample example);

    RTransLock selectByPrimaryKey(Long idTransLock);

    int updateByExampleSelective(@Param("record") RTransLock record, @Param("example") RTransLockExample example);

    int updateByExampleWithBLOBs(@Param("record") RTransLock record, @Param("example") RTransLockExample example);

    int updateByExample(@Param("record") RTransLock record, @Param("example") RTransLockExample example);

    int updateByPrimaryKeySelective(RTransLock record);

    int updateByPrimaryKeyWithBLOBs(RTransLock record);

    int updateByPrimaryKey(RTransLock record);
}