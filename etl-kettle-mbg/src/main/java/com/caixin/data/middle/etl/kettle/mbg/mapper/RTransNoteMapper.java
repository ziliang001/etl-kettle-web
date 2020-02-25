package com.caixin.data.middle.etl.kettle.mbg.mapper;

import com.caixin.data.middle.etl.kettle.mbg.model.RTransNote;
import com.caixin.data.middle.etl.kettle.mbg.model.RTransNoteExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* Created by Mybatis Generator on 2020年02月07日 上午 07:59:41
*/
public interface RTransNoteMapper {
    long countByExample(RTransNoteExample example);

    int deleteByExample(RTransNoteExample example);

    int insert(RTransNote record);

    int insertSelective(RTransNote record);

    List<RTransNote> selectByExample(RTransNoteExample example);

    int updateByExampleSelective(@Param("record") RTransNote record, @Param("example") RTransNoteExample example);

    int updateByExample(@Param("record") RTransNote record, @Param("example") RTransNoteExample example);
}