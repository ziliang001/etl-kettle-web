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
public class RTransAttribute implements Serializable {
    /**
     * <pre>
     * 表字段： r_trans_attribute.ID_TRANS_ATTRIBUTE
     * </pre>
     */
    private Long idTransAttribute;

    /**
     * <pre>
     * 表字段： r_trans_attribute.ID_TRANSFORMATION
     * </pre>
     */
    private Integer idTransformation;

    /**
     * <pre>
     * 表字段： r_trans_attribute.NR
     * </pre>
     */
    private Integer nr;

    /**
     * <pre>
     * 表字段： r_trans_attribute.CODE
     * </pre>
     */
    private String code;

    /**
     * <pre>
     * 表字段： r_trans_attribute.VALUE_NUM
     * </pre>
     */
    private Long valueNum;

    /**
     * <pre>
     * 表字段： r_trans_attribute.VALUE_STR
     * </pre>
     */
    private String valueStr;

    private static final long serialVersionUID = 1L;
}