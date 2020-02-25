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
public class RJobAttribute implements Serializable {
    /**
     * <pre>
     * 表字段： r_job_attribute.ID_JOB_ATTRIBUTE
     * </pre>
     */
    private Long idJobAttribute;

    /**
     * <pre>
     * 表字段： r_job_attribute.ID_JOB
     * </pre>
     */
    private Integer idJob;

    /**
     * <pre>
     * 表字段： r_job_attribute.NR
     * </pre>
     */
    private Integer nr;

    /**
     * <pre>
     * 表字段： r_job_attribute.CODE
     * </pre>
     */
    private String code;

    /**
     * <pre>
     * 表字段： r_job_attribute.VALUE_NUM
     * </pre>
     */
    private Long valueNum;

    /**
     * <pre>
     * 表字段： r_job_attribute.VALUE_STR
     * </pre>
     */
    private String valueStr;

    private static final long serialVersionUID = 1L;
}