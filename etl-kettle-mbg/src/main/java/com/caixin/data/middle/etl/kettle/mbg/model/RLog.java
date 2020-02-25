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
public class RLog implements Serializable {
    /**
     * <pre>
     * 表字段： r_log.ID_LOG
     * </pre>
     */
    private Long idLog;

    /**
     * <pre>
     * 表字段： r_log.NAME
     * </pre>
     */
    private String name;

    /**
     * <pre>
     * 表字段： r_log.ID_LOGLEVEL
     * </pre>
     */
    private Integer idLoglevel;

    /**
     * <pre>
     * 表字段： r_log.LOGTYPE
     * </pre>
     */
    private String logtype;

    /**
     * <pre>
     * 表字段： r_log.FILENAME
     * </pre>
     */
    private String filename;

    /**
     * <pre>
     * 表字段： r_log.FILEEXTENTION
     * </pre>
     */
    private String fileextention;

    /**
     * <pre>
     * 表字段： r_log.ADD_DATE
     * </pre>
     */
    private String addDate;

    /**
     * <pre>
     * 表字段： r_log.ADD_TIME
     * </pre>
     */
    private String addTime;

    /**
     * <pre>
     * 表字段： r_log.ID_DATABASE_LOG
     * </pre>
     */
    private Integer idDatabaseLog;

    /**
     * <pre>
     * 表字段： r_log.TABLE_NAME_LOG
     * </pre>
     */
    private String tableNameLog;

    private static final long serialVersionUID = 1L;
}