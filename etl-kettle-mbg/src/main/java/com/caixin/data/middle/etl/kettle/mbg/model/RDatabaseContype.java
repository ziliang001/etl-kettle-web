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
public class RDatabaseContype implements Serializable {
    /**
     * <pre>
     * 表字段： r_database_contype.ID_DATABASE_CONTYPE
     * </pre>
     */
    private Long idDatabaseContype;

    /**
     * <pre>
     * 表字段： r_database_contype.CODE
     * </pre>
     */
    private String code;

    /**
     * <pre>
     * 表字段： r_database_contype.DESCRIPTION
     * </pre>
     */
    private String description;

    private static final long serialVersionUID = 1L;
}