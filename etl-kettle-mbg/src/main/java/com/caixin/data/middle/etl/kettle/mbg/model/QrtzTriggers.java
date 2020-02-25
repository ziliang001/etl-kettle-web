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
public class QrtzTriggers implements Serializable {
    /**
     * <pre>
     * 表字段： qrtz_triggers.SCHED_NAME
     * </pre>
     */
    private String schedName;

    /**
     * <pre>
     * 表字段： qrtz_triggers.TRIGGER_NAME
     * </pre>
     */
    private String triggerName;

    /**
     * <pre>
     * 表字段： qrtz_triggers.TRIGGER_GROUP
     * </pre>
     */
    private String triggerGroup;

    /**
     * <pre>
     * 表字段： qrtz_triggers.JOB_NAME
     * </pre>
     */
    private String jobName;

    /**
     * <pre>
     * 表字段： qrtz_triggers.JOB_GROUP
     * </pre>
     */
    private String jobGroup;

    /**
     * <pre>
     * 表字段： qrtz_triggers.DESCRIPTION
     * </pre>
     */
    private String description;

    /**
     * <pre>
     * 表字段： qrtz_triggers.NEXT_FIRE_TIME
     * </pre>
     */
    private Long nextFireTime;

    /**
     * <pre>
     * 表字段： qrtz_triggers.PREV_FIRE_TIME
     * </pre>
     */
    private Long prevFireTime;

    /**
     * <pre>
     * 表字段： qrtz_triggers.PRIORITY
     * </pre>
     */
    private Integer priority;

    /**
     * <pre>
     * 表字段： qrtz_triggers.TRIGGER_STATE
     * </pre>
     */
    private String triggerState;

    /**
     * <pre>
     * 表字段： qrtz_triggers.TRIGGER_TYPE
     * </pre>
     */
    private String triggerType;

    /**
     * <pre>
     * 表字段： qrtz_triggers.START_TIME
     * </pre>
     */
    private Long startTime;

    /**
     * <pre>
     * 表字段： qrtz_triggers.END_TIME
     * </pre>
     */
    private Long endTime;

    /**
     * <pre>
     * 表字段： qrtz_triggers.CALENDAR_NAME
     * </pre>
     */
    private String calendarName;

    /**
     * <pre>
     * 表字段： qrtz_triggers.MISFIRE_INSTR
     * </pre>
     */
    private Short misfireInstr;

    /**
     * <pre>
     * 表字段： qrtz_triggers.JOB_DATA
     * </pre>
     */
    private byte[] jobData;

    private static final long serialVersionUID = 1L;
}