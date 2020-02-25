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
public class RStepAttribute implements Serializable {
    /**
     * <pre>
     * 表字段： r_step_attribute.ID_STEP_ATTRIBUTE
     * </pre>
     */
    private Long idStepAttribute;

    /**
     * <pre>
     * 表字段： r_step_attribute.ID_TRANSFORMATION
     * </pre>
     */
    private Integer idTransformation;

    /**
     * <pre>
     * 表字段： r_step_attribute.ID_STEP
     * </pre>
     */
    private Integer idStep;

    /**
     * <pre>
     * 表字段： r_step_attribute.NR
     * </pre>
     */
    private Integer nr;

    /**
     * <pre>
     * 表字段： r_step_attribute.CODE
     * </pre>
     */
    private String code;

    /**
     * <pre>
     * 表字段： r_step_attribute.VALUE_NUM
     * </pre>
     */
    private Long valueNum;

    /**
     * <pre>
     * 表字段： r_step_attribute.VALUE_STR
     * </pre>
     */
    private String valueStr;

    private static final long serialVersionUID = 1L;
}