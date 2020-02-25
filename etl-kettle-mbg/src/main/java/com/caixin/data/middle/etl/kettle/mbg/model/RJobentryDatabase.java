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
public class RJobentryDatabase implements Serializable {
    /**
     * <pre>
     * 表字段： r_jobentry_database.ID_JOB
     * </pre>
     */
    private Integer idJob;

    /**
     * <pre>
     * 表字段： r_jobentry_database.ID_JOBENTRY
     * </pre>
     */
    private Integer idJobentry;

    /**
     * <pre>
     * 表字段： r_jobentry_database.ID_DATABASE
     * </pre>
     */
    private Integer idDatabase;

    private static final long serialVersionUID = 1L;
}