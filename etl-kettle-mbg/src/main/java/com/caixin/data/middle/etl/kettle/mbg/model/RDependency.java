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
public class RDependency implements Serializable {
    /**
     * <pre>
     * 表字段： r_dependency.ID_DEPENDENCY
     * </pre>
     */
    private Long idDependency;

    /**
     * <pre>
     * 表字段： r_dependency.ID_TRANSFORMATION
     * </pre>
     */
    private Integer idTransformation;

    /**
     * <pre>
     * 表字段： r_dependency.ID_DATABASE
     * </pre>
     */
    private Integer idDatabase;

    /**
     * <pre>
     * 表字段： r_dependency.TABLE_NAME
     * </pre>
     */
    private String tableName;

    /**
     * <pre>
     * 表字段： r_dependency.FIELD_NAME
     * </pre>
     */
    private String fieldName;

    private static final long serialVersionUID = 1L;
}