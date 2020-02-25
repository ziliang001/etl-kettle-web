package com.caixin.data.middle.etl.kettle.mbg.mapper;

import com.caixin.data.middle.etl.kettle.mbg.model.QrtzCalendars;
import com.caixin.data.middle.etl.kettle.mbg.model.QrtzCalendarsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* Created by Mybatis Generator on 2020年02月07日 上午 07:59:41
*/
public interface QrtzCalendarsMapper {
    long countByExample(QrtzCalendarsExample example);

    int deleteByExample(QrtzCalendarsExample example);

    int deleteByPrimaryKey(@Param("schedName") String schedName, @Param("calendarName") String calendarName);

    int insert(QrtzCalendars record);

    int insertSelective(QrtzCalendars record);

    List<QrtzCalendars> selectByExampleWithBLOBs(QrtzCalendarsExample example);

    List<QrtzCalendars> selectByExample(QrtzCalendarsExample example);

    QrtzCalendars selectByPrimaryKey(@Param("schedName") String schedName, @Param("calendarName") String calendarName);

    int updateByExampleSelective(@Param("record") QrtzCalendars record, @Param("example") QrtzCalendarsExample example);

    int updateByExampleWithBLOBs(@Param("record") QrtzCalendars record, @Param("example") QrtzCalendarsExample example);

    int updateByExample(@Param("record") QrtzCalendars record, @Param("example") QrtzCalendarsExample example);

    int updateByPrimaryKeySelective(QrtzCalendars record);

    int updateByPrimaryKeyWithBLOBs(QrtzCalendars record);
}