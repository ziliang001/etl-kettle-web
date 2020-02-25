package com.caixin.data.middle.etl.kettle.mbg.mapper;

import com.caixin.data.middle.etl.kettle.mbg.model.RJobNote;
import com.caixin.data.middle.etl.kettle.mbg.model.RJobNoteExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* Created by Mybatis Generator on 2020年02月07日 上午 07:59:41
*/
public interface RJobNoteMapper {
    long countByExample(RJobNoteExample example);

    int deleteByExample(RJobNoteExample example);

    int insert(RJobNote record);

    int insertSelective(RJobNote record);

    List<RJobNote> selectByExample(RJobNoteExample example);

    int updateByExampleSelective(@Param("record") RJobNote record, @Param("example") RJobNoteExample example);

    int updateByExample(@Param("record") RJobNote record, @Param("example") RJobNoteExample example);
}