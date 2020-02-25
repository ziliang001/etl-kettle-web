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
public class RCondition implements Serializable {
    /**
     * <pre>
     * 表字段： r_condition.ID_CONDITION
     * </pre>
     */
    private Long idCondition;

    /**
     * <pre>
     * 表字段： r_condition.ID_CONDITION_PARENT
     * </pre>
     */
    private Integer idConditionParent;

    /**
     * <pre>
     * 表字段： r_condition.NEGATED
     * </pre>
     */
    private String negated;

    /**
     * <pre>
     * 表字段： r_condition.OPERATOR
     * </pre>
     */
    private String operator;

    /**
     * <pre>
     * 表字段： r_condition.LEFT_NAME
     * </pre>
     */
    private String leftName;

    /**
     * <pre>
     * 表字段： r_condition.CONDITION_FUNCTION
     * </pre>
     */
    private String conditionFunction;

    /**
     * <pre>
     * 表字段： r_condition.RIGHT_NAME
     * </pre>
     */
    private String rightName;

    /**
     * <pre>
     * 表字段： r_condition.ID_VALUE_RIGHT
     * </pre>
     */
    private Integer idValueRight;

    private static final long serialVersionUID = 1L;
}