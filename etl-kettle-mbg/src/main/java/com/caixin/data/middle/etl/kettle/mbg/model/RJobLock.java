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
public class RJobLock implements Serializable {
    /**
     * <pre>
     * 表字段： r_job_lock.ID_JOB_LOCK
     * </pre>
     */
    private Long idJobLock;

    /**
     * <pre>
     * 表字段： r_job_lock.ID_JOB
     * </pre>
     */
    private Integer idJob;

    /**
     * <pre>
     * 表字段： r_job_lock.ID_USER
     * </pre>
     */
    private Integer idUser;

    /**
     * <pre>
     * 表字段： r_job_lock.LOCK_DATE
     * </pre>
     */
    private Date lockDate;

    /**
     * <pre>
     * 表字段： r_job_lock.LOCK_MESSAGE
     * </pre>
     */
    private String lockMessage;

    private static final long serialVersionUID = 1L;
}