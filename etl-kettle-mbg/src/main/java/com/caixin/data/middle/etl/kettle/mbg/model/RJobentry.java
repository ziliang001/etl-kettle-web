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
public class RJobentry implements Serializable {
    /**
     * <pre>
     * 表字段： r_jobentry.ID_JOBENTRY
     * </pre>
     */
    private Long idJobentry;

    /**
     * <pre>
     * 表字段： r_jobentry.ID_JOB
     * </pre>
     */
    private Integer idJob;

    /**
     * <pre>
     * 表字段： r_jobentry.ID_JOBENTRY_TYPE
     * </pre>
     */
    private Integer idJobentryType;

    /**
     * <pre>
     * 表字段： r_jobentry.NAME
     * </pre>
     */
    private String name;

    /**
     * <pre>
     * 表字段： r_jobentry.DESCRIPTION
     * </pre>
     */
    private String description;

    private static final long serialVersionUID = 1L;
}