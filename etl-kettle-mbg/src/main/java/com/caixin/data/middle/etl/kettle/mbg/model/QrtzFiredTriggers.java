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
public class QrtzFiredTriggers implements Serializable {
    /**
     * <pre>
     * 表字段： qrtz_fired_triggers.SCHED_NAME
     * </pre>
     */
    private String schedName;

    /**
     * <pre>
     * 表字段： qrtz_fired_triggers.ENTRY_ID
     * </pre>
     */
    private String entryId;

    /**
     * <pre>
     * 表字段： qrtz_fired_triggers.TRIGGER_NAME
     * </pre>
     */
    private String triggerName;

    /**
     * <pre>
     * 表字段： qrtz_fired_triggers.TRIGGER_GROUP
     * </pre>
     */
    private String triggerGroup;

    /**
     * <pre>
     * 表字段： qrtz_fired_triggers.INSTANCE_NAME
     * </pre>
     */
    private String instanceName;

    /**
     * <pre>
     * 表字段： qrtz_fired_triggers.FIRED_TIME
     * </pre>
     */
    private Long firedTime;

    /**
     * <pre>
     * 表字段： qrtz_fired_triggers.SCHED_TIME
     * </pre>
     */
    private Long schedTime;

    /**
     * <pre>
     * 表字段： qrtz_fired_triggers.PRIORITY
     * </pre>
     */
    private Integer priority;

    /**
     * <pre>
     * 表字段： qrtz_fired_triggers.STATE
     * </pre>
     */
    private String state;

    /**
     * <pre>
     * 表字段： qrtz_fired_triggers.JOB_NAME
     * </pre>
     */
    private String jobName;

    /**
     * <pre>
     * 表字段： qrtz_fired_triggers.JOB_GROUP
     * </pre>
     */
    private String jobGroup;

    /**
     * <pre>
     * 表字段： qrtz_fired_triggers.IS_NONCONCURRENT
     * </pre>
     */
    private String isNonconcurrent;

    /**
     * <pre>
     * 表字段： qrtz_fired_triggers.REQUESTS_RECOVERY
     * </pre>
     */
    private String requestsRecovery;

    private static final long serialVersionUID = 1L;
}