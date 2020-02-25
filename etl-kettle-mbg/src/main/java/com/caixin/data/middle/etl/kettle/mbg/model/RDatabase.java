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
public class RDatabase implements Serializable {
    /**
     * <pre>
     * 表字段： r_database.ID_DATABASE
     * </pre>
     */
    private Long idDatabase;

    /**
     * <pre>
     * 表字段： r_database.NAME
     * </pre>
     */
    private String name;

    /**
     * <pre>
     * 表字段： r_database.ID_DATABASE_TYPE
     * </pre>
     */
    private Integer idDatabaseType;

    /**
     * <pre>
     * 表字段： r_database.ID_DATABASE_CONTYPE
     * </pre>
     */
    private Integer idDatabaseContype;

    /**
     * <pre>
     * 表字段： r_database.HOST_NAME
     * </pre>
     */
    private String hostName;

    /**
     * <pre>
     * 表字段： r_database.PORT
     * </pre>
     */
    private Integer port;

    /**
     * <pre>
     * 表字段： r_database.USERNAME
     * </pre>
     */
    private String username;

    /**
     * <pre>
     * 表字段： r_database.PASSWORD
     * </pre>
     */
    private String password;

    /**
     * <pre>
     * 表字段： r_database.SERVERNAME
     * </pre>
     */
    private String servername;

    /**
     * <pre>
     * 表字段： r_database.DATA_TBS
     * </pre>
     */
    private String dataTbs;

    /**
     * <pre>
     * 表字段： r_database.INDEX_TBS
     * </pre>
     */
    private String indexTbs;

    /**
     * <pre>
     * 表字段： r_database.DATABASE_NAME
     * </pre>
     */
    private String databaseName;

    private static final long serialVersionUID = 1L;
}