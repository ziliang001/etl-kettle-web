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
public class RTransStepCondition implements Serializable {
    /**
     * <pre>
     * 表字段： r_trans_step_condition.ID_TRANSFORMATION
     * </pre>
     */
    private Integer idTransformation;

    /**
     * <pre>
     * 表字段： r_trans_step_condition.ID_STEP
     * </pre>
     */
    private Integer idStep;

    /**
     * <pre>
     * 表字段： r_trans_step_condition.ID_CONDITION
     * </pre>
     */
    private Integer idCondition;

    private static final long serialVersionUID = 1L;
}