package com.caixin.data.middle.etl.kettle.mbg.mapper;

import com.caixin.data.middle.etl.kettle.mbg.model.RLoglevel;
import com.caixin.data.middle.etl.kettle.mbg.model.RLoglevelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* Created by Mybatis Generator on 2020年02月07日 上午 07:59:41
*/
public interface RLoglevelMapper {
    long countByExample(RLoglevelExample example);

    int deleteByExample(RLoglevelExample example);

    int deleteByPrimaryKey(Long idLoglevel);

    int insert(RLoglevel record);

    int insertSelective(RLoglevel record);

    List<RLoglevel> selectByExample(RLoglevelExample example);

    RLoglevel selectByPrimaryKey(Long idLoglevel);

    int updateByExampleSelective(@Param("record") RLoglevel record, @Param("example") RLoglevelExample example);

    int updateByExample(@Param("record") RLoglevel record, @Param("example") RLoglevelExample example);

    int updateByPrimaryKeySelective(RLoglevel record);

    int updateByPrimaryKey(RLoglevel record);
}