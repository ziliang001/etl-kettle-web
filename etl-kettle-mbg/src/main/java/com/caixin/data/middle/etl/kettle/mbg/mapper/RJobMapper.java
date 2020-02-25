package com.caixin.data.middle.etl.kettle.mbg.mapper;

import com.caixin.data.middle.etl.kettle.mbg.model.RJob;
import com.caixin.data.middle.etl.kettle.mbg.model.RJobExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* Created by Mybatis Generator on 2020年02月07日 上午 07:59:41
*/
public interface RJobMapper {
    long countByExample(RJobExample example);

    int deleteByExample(RJobExample example);

    int deleteByPrimaryKey(Long idJob);

    int insert(RJob record);

    int insertSelective(RJob record);

    List<RJob> selectByExampleWithBLOBs(RJobExample example);

    List<RJob> selectByExample(RJobExample example);

    RJob selectByPrimaryKey(Long idJob);

    int updateByExampleSelective(@Param("record") RJob record, @Param("example") RJobExample example);

    int updateByExampleWithBLOBs(@Param("record") RJob record, @Param("example") RJobExample example);

    int updateByExample(@Param("record") RJob record, @Param("example") RJobExample example);

    int updateByPrimaryKeySelective(RJob record);

    int updateByPrimaryKeyWithBLOBs(RJob record);

    int updateByPrimaryKey(RJob record);
}