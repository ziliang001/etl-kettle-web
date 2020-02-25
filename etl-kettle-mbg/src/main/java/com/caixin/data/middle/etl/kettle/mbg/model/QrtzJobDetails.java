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
public class QrtzJobDetails implements Serializable {
    /**
     * <pre>
     * 表字段： qrtz_job_details.SCHED_NAME
     * </pre>
     */
    private String schedName;

    /**
     * <pre>
     * 表字段： qrtz_job_details.JOB_NAME
     * </pre>
     */
    private String jobName;

    /**
     * <pre>
     * 表字段： qrtz_job_details.JOB_GROUP
     * </pre>
     */
    private String jobGroup;

    /**
     * <pre>
     * 表字段： qrtz_job_details.DESCRIPTION
     * </pre>
     */
    private String description;

    /**
     * <pre>
     * 表字段： qrtz_job_details.JOB_CLASS_NAME
     * </pre>
     */
    private String jobClassName;

    /**
     * <pre>
     * 表字段： qrtz_job_details.IS_DURABLE
     * </pre>
     */
    private String isDurable;

    /**
     * <pre>
     * 表字段： qrtz_job_details.IS_NONCONCURRENT
     * </pre>
     */
    private String isNonconcurrent;

    /**
     * <pre>
     * 表字段： qrtz_job_details.IS_UPDATE_DATA
     * </pre>
     */
    private String isUpdateData;

    /**
     * <pre>
     * 表字段： qrtz_job_details.REQUESTS_RECOVERY
     * </pre>
     */
    private String requestsRecovery;

    /**
     * <pre>
     * 表字段： qrtz_job_details.JOB_DATA
     * </pre>
     */
    private byte[] jobData;

    private static final long serialVersionUID = 1L;
}