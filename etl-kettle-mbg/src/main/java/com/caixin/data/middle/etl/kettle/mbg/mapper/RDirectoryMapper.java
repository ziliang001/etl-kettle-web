package com.caixin.data.middle.etl.kettle.mbg.mapper;

import com.caixin.data.middle.etl.kettle.mbg.model.RDirectory;
import com.caixin.data.middle.etl.kettle.mbg.model.RDirectoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* Created by Mybatis Generator on 2020年02月07日 上午 07:59:41
*/
public interface RDirectoryMapper {
    long countByExample(RDirectoryExample example);

    int deleteByExample(RDirectoryExample example);

    int deleteByPrimaryKey(Long idDirectory);

    int insert(RDirectory record);

    int insertSelective(RDirectory record);

    List<RDirectory> selectByExample(RDirectoryExample example);

    RDirectory selectByPrimaryKey(Long idDirectory);

    int updateByExampleSelective(@Param("record") RDirectory record, @Param("example") RDirectoryExample example);

    int updateByExample(@Param("record") RDirectory record, @Param("example") RDirectoryExample example);

    int updateByPrimaryKeySelective(RDirectory record);

    int updateByPrimaryKey(RDirectory record);
}