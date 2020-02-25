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
public class RDatabaseType implements Serializable {
    /**
     * <pre>
     * 表字段： r_database_type.ID_DATABASE_TYPE
     * </pre>
     */
    private Long idDatabaseType;

    /**
     * <pre>
     * 表字段： r_database_type.CODE
     * </pre>
     */
    private String code;

    /**
     * <pre>
     * 表字段： r_database_type.DESCRIPTION
     * </pre>
     */
    private String description;

    private static final long serialVersionUID = 1L;
}