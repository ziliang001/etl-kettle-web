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
public class RJobHop implements Serializable {
    /**
     * <pre>
     * 表字段： r_job_hop.ID_JOB_HOP
     * </pre>
     */
    private Long idJobHop;

    /**
     * <pre>
     * 表字段： r_job_hop.ID_JOB
     * </pre>
     */
    private Integer idJob;

    /**
     * <pre>
     * 表字段： r_job_hop.ID_JOBENTRY_COPY_FROM
     * </pre>
     */
    private Integer idJobentryCopyFrom;

    /**
     * <pre>
     * 表字段： r_job_hop.ID_JOBENTRY_COPY_TO
     * </pre>
     */
    private Integer idJobentryCopyTo;

    /**
     * <pre>
     * 表字段： r_job_hop.ENABLED
     * </pre>
     */
    private String enabled;

    /**
     * <pre>
     * 表字段： r_job_hop.EVALUATION
     * </pre>
     */
    private String evaluation;

    /**
     * <pre>
     * 表字段： r_job_hop.UNCONDITIONAL
     * </pre>
     */
    private String unconditional;

    private static final long serialVersionUID = 1L;
}