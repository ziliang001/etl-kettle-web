package com.caixin.data.middle.etl.kettle.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
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
public class TaskExecutionLog implements Serializable {
    /**
     * <pre>
     * 表字段： task_execution_log.fireId
     * </pre>
     */
    private Long fireid;

    /**
     * <pre>
     * 表字段： task_execution_log.jobName
     * </pre>
     */
    private String jobname;

    /**
     * <pre>
     * 表字段： task_execution_log.startTime
     * </pre>
     */
    private Date starttime;

    /**
     * <pre>
     * 表字段： task_execution_log.endTime
     * </pre>
     */
    private Date endtime;

    /**
     * <pre>
     * 表字段： task_execution_log.execMethod
     * </pre>
     */
    private String execmethod;

    /**
     * <pre>
     * 表字段： task_execution_log.status
     * </pre>
     */
    private String status;

    /**
     * <pre>
     * 表字段： task_execution_log.type
     * </pre>
     */
    private String type;

    /**
     * <pre>
     * 表字段： task_execution_log.executionConfiguration
     * </pre>
     */
    private String executionconfiguration;

    /**
     * <pre>
     * 表字段： task_execution_log.executionLog
     * </pre>
     */
    private String executionlog;

    private static final long serialVersionUID = 1L;
}