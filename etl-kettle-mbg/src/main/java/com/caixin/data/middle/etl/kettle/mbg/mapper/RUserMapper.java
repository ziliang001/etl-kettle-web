package com.caixin.data.middle.etl.kettle.mbg.mapper;

import com.caixin.data.middle.etl.kettle.mbg.model.RUser;
import com.caixin.data.middle.etl.kettle.mbg.model.RUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* Created by Mybatis Generator on 2020年02月07日 上午 07:59:41
*/
public interface RUserMapper {
    long countByExample(RUserExample example);

    int deleteByExample(RUserExample example);

    int deleteByPrimaryKey(Long idUser);

    int insert(RUser record);

    int insertSelective(RUser record);

    List<RUser> selectByExample(RUserExample example);

    RUser selectByPrimaryKey(Long idUser);

    int updateByExampleSelective(@Param("record") RUser record, @Param("example") RUserExample example);

    int updateByExample(@Param("record") RUser record, @Param("example") RUserExample example);

    int updateByPrimaryKeySelective(RUser record);

    int updateByPrimaryKey(RUser record);
}