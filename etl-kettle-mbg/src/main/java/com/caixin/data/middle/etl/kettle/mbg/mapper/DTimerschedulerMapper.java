package com.caixin.data.middle.etl.kettle.mbg.mapper;

import com.caixin.data.middle.etl.kettle.mbg.model.DTimerscheduler;
import com.caixin.data.middle.etl.kettle.mbg.model.DTimerschedulerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* Created by Mybatis Generator on 2020年02月07日 上午 07:59:41
*/
public interface DTimerschedulerMapper {
    long countByExample(DTimerschedulerExample example);

    int deleteByExample(DTimerschedulerExample example);

    int deleteByPrimaryKey(Long idJobtask);

    int insert(DTimerscheduler record);

    int insertSelective(DTimerscheduler record);

    List<DTimerscheduler> selectByExampleWithBLOBs(DTimerschedulerExample example);

    List<DTimerscheduler> selectByExample(DTimerschedulerExample example);

    DTimerscheduler selectByPrimaryKey(Long idJobtask);

    int updateByExampleSelective(@Param("record") DTimerscheduler record, @Param("example") DTimerschedulerExample example);

    int updateByExampleWithBLOBs(@Param("record") DTimerscheduler record, @Param("example") DTimerschedulerExample example);

    int updateByExample(@Param("record") DTimerscheduler record, @Param("example") DTimerschedulerExample example);

    int updateByPrimaryKeySelective(DTimerscheduler record);

    int updateByPrimaryKeyWithBLOBs(DTimerscheduler record);

    int updateByPrimaryKey(DTimerscheduler record);
}