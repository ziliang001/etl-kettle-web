package com.caixin.data.middle.etl.kettle.mbg.mapper;

import com.caixin.data.middle.etl.kettle.mbg.model.CarteInfo;
import com.caixin.data.middle.etl.kettle.mbg.model.CarteInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* Created by Mybatis Generator on 2020年02月07日 上午 07:59:41
*/
public interface CarteInfoMapper {
    long countByExample(CarteInfoExample example);

    int deleteByExample(CarteInfoExample example);

    int deleteByPrimaryKey(Long carteRecordId);

    int insert(CarteInfo record);

    int insertSelective(CarteInfo record);

    List<CarteInfo> selectByExample(CarteInfoExample example);

    CarteInfo selectByPrimaryKey(Long carteRecordId);

    int updateByExampleSelective(@Param("record") CarteInfo record, @Param("example") CarteInfoExample example);

    int updateByExample(@Param("record") CarteInfo record, @Param("example") CarteInfoExample example);

    int updateByPrimaryKeySelective(CarteInfo record);

    int updateByPrimaryKey(CarteInfo record);
}