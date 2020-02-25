package com.caixin.data.middle.etl.kettle.mbg.mapper;

import com.caixin.data.middle.etl.kettle.mbg.model.RNote;
import com.caixin.data.middle.etl.kettle.mbg.model.RNoteExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* Created by Mybatis Generator on 2020年02月07日 上午 07:59:41
*/
public interface RNoteMapper {
    long countByExample(RNoteExample example);

    int deleteByExample(RNoteExample example);

    int deleteByPrimaryKey(Long idNote);

    int insert(RNote record);

    int insertSelective(RNote record);

    List<RNote> selectByExampleWithBLOBs(RNoteExample example);

    List<RNote> selectByExample(RNoteExample example);

    RNote selectByPrimaryKey(Long idNote);

    int updateByExampleSelective(@Param("record") RNote record, @Param("example") RNoteExample example);

    int updateByExampleWithBLOBs(@Param("record") RNote record, @Param("example") RNoteExample example);

    int updateByExample(@Param("record") RNote record, @Param("example") RNoteExample example);

    int updateByPrimaryKeySelective(RNote record);

    int updateByPrimaryKeyWithBLOBs(RNote record);

    int updateByPrimaryKey(RNote record);
}