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
public class RElementAttribute implements Serializable {
    /**
     * <pre>
     * 表字段： r_element_attribute.ID_ELEMENT_ATTRIBUTE
     * </pre>
     */
    private Long idElementAttribute;

    /**
     * <pre>
     * 表字段： r_element_attribute.ID_ELEMENT
     * </pre>
     */
    private Integer idElement;

    /**
     * <pre>
     * 表字段： r_element_attribute.ID_ELEMENT_ATTRIBUTE_PARENT
     * </pre>
     */
    private Integer idElementAttributeParent;

    /**
     * <pre>
     * 表字段： r_element_attribute.ATTR_KEY
     * </pre>
     */
    private String attrKey;

    /**
     * <pre>
     * 表字段： r_element_attribute.ATTR_VALUE
     * </pre>
     */
    private String attrValue;

    private static final long serialVersionUID = 1L;
}