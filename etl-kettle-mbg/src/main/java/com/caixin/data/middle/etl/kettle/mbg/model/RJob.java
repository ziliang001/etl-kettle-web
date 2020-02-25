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
public class RJob implements Serializable {
    /**
     * <pre>
     * 表字段： r_job.ID_JOB
     * </pre>
     */
    private Long idJob;

    /**
     * <pre>
     * 表字段： r_job.ID_DIRECTORY
     * </pre>
     */
    private Integer idDirectory;

    /**
     * <pre>
     * 表字段： r_job.NAME
     * </pre>
     */
    private String name;

    /**
     * <pre>
     * 表字段： r_job.JOB_VERSION
     * </pre>
     */
    private String jobVersion;

    /**
     * <pre>
     * 表字段： r_job.JOB_STATUS
     * </pre>
     */
    private Integer jobStatus;

    /**
     * <pre>
     * 表字段： r_job.ID_DATABASE_LOG
     * </pre>
     */
    private Integer idDatabaseLog;

    /**
     * <pre>
     * 表字段： r_job.TABLE_NAME_LOG
     * </pre>
     */
    private String tableNameLog;

    /**
     * <pre>
     * 表字段： r_job.CREATED_USER
     * </pre>
     */
    private String createdUser;

    /**
     * <pre>
     * 表字段： r_job.CREATED_DATE
     * </pre>
     */
    private Date createdDate;

    /**
     * <pre>
     * 表字段： r_job.MODIFIED_USER
     * </pre>
     */
    private String modifiedUser;

    /**
     * <pre>
     * 表字段： r_job.MODIFIED_DATE
     * </pre>
     */
    private Date modifiedDate;

    /**
     * <pre>
     * 表字段： r_job.USE_BATCH_ID
     * </pre>
     */
    private String useBatchId;

    /**
     * <pre>
     * 表字段： r_job.PASS_BATCH_ID
     * </pre>
     */
    private String passBatchId;

    /**
     * <pre>
     * 表字段： r_job.USE_LOGFIELD
     * </pre>
     */
    private String useLogfield;

    /**
     * <pre>
     * 表字段： r_job.SHARED_FILE
     * </pre>
     */
    private String sharedFile;

    /**
     * <pre>
     * 表字段： r_job.DESCRIPTION
     * </pre>
     */
    private String description;

    /**
     * <pre>
     * 表字段： r_job.EXTENDED_DESCRIPTION
     * </pre>
     */
    private String extendedDescription;

    private static final long serialVersionUID = 1L;
}