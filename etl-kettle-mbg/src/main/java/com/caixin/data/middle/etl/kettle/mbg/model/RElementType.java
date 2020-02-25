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
public class RElementType implements Serializable {
    /**
     * <pre>
     * 表字段： r_element_type.ID_ELEMENT_TYPE
     * </pre>
     */
    private Long idElementType;

    /**
     * <pre>
     * 表字段： r_element_type.ID_NAMESPACE
     * </pre>
     */
    private Integer idNamespace;

    /**
     * <pre>
     * 表字段： r_element_type.NAME
     * </pre>
     */
    private String name;

    /**
     * <pre>
     * 表字段： r_element_type.DESCRIPTION
     * </pre>
     */
    private String description;

    private static final long serialVersionUID = 1L;
}