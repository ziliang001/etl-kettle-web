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
public class RStepType implements Serializable {
    /**
     * <pre>
     * 表字段： r_step_type.ID_STEP_TYPE
     * </pre>
     */
    private Long idStepType;

    /**
     * <pre>
     * 表字段： r_step_type.CODE
     * </pre>
     */
    private String code;

    /**
     * <pre>
     * 表字段： r_step_type.DESCRIPTION
     * </pre>
     */
    private String description;

    /**
     * <pre>
     * 表字段： r_step_type.HELPTEXT
     * </pre>
     */
    private String helptext;

    private static final long serialVersionUID = 1L;
}