package com.caixin.data.middle.etl.kettle.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
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
public class RRepositoryLog implements Serializable {
    /**
     * <pre>
     * 表字段： r_repository_log.ID_REPOSITORY_LOG
     * </pre>
     */
    private Long idRepositoryLog;

    /**
     * <pre>
     * 表字段： r_repository_log.REP_VERSION
     * </pre>
     */
    private String repVersion;

    /**
     * <pre>
     * 表字段： r_repository_log.LOG_DATE
     * </pre>
     */
    private Date logDate;

    /**
     * <pre>
     * 表字段： r_repository_log.LOG_USER
     * </pre>
     */
    private String logUser;

    /**
     * <pre>
     * 表字段： r_repository_log.OPERATION_DESC
     * </pre>
     */
    private String operationDesc;

    private static final long serialVersionUID = 1L;
}