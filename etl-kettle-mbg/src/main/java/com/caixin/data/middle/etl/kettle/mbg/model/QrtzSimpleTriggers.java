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
public class QrtzSimpleTriggers implements Serializable {
    /**
     * <pre>
     * 表字段： qrtz_simple_triggers.SCHED_NAME
     * </pre>
     */
    private String schedName;

    /**
     * <pre>
     * 表字段： qrtz_simple_triggers.TRIGGER_NAME
     * </pre>
     */
    private String triggerName;

    /**
     * <pre>
     * 表字段： qrtz_simple_triggers.TRIGGER_GROUP
     * </pre>
     */
    private String triggerGroup;

    /**
     * <pre>
     * 表字段： qrtz_simple_triggers.REPEAT_COUNT
     * </pre>
     */
    private Long repeatCount;

    /**
     * <pre>
     * 表字段： qrtz_simple_triggers.REPEAT_INTERVAL
     * </pre>
     */
    private Long repeatInterval;

    /**
     * <pre>
     * 表字段： qrtz_simple_triggers.TIMES_TRIGGERED
     * </pre>
     */
    private Long timesTriggered;

    private static final long serialVersionUID = 1L;
}