package com.caixin.data.middle.etl.kettle.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
* Created by Mybatis Generator on 2020年02月07日 上午 07:59:41
*/
@Data
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class QrtzCalendars implements Serializable {
    /**
     * <pre>
     * 表字段： qrtz_calendars.SCHED_NAME
     * </pre>
     */
    private String schedName;

    /**
     * <pre>
     * 表字段： qrtz_calendars.CALENDAR_NAME
     * </pre>
     */
    private String calendarName;

    /**
     * <pre>
     * 表字段： qrtz_calendars.CALENDAR
     * </pre>
     */
    private byte[] calendar;

    private static final long serialVersionUID = 1L;
}