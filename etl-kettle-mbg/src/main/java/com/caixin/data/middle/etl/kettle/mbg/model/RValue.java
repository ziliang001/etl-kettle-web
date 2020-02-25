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
public class RValue implements Serializable {
    /**
     * <pre>
     * 表字段： r_value.ID_VALUE
     * </pre>
     */
    private Long idValue;

    /**
     * <pre>
     * 表字段： r_value.NAME
     * </pre>
     */
    private String name;

    /**
     * <pre>
     * 表字段： r_value.VALUE_TYPE
     * </pre>
     */
    private String valueType;

    /**
     * <pre>
     * 表字段： r_value.VALUE_STR
     * </pre>
     */
    private String valueStr;

    /**
     * <pre>
     * 表字段： r_value.IS_NULL
     * </pre>
     */
    private String isNull;

    private static final long serialVersionUID = 1L;
}