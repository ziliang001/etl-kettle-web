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
public class RJobentryCopy implements Serializable {
    /**
     * <pre>
     * 表字段： r_jobentry_copy.ID_JOBENTRY_COPY
     * </pre>
     */
    private Long idJobentryCopy;

    /**
     * <pre>
     * 表字段： r_jobentry_copy.ID_JOBENTRY
     * </pre>
     */
    private Integer idJobentry;

    /**
     * <pre>
     * 表字段： r_jobentry_copy.ID_JOB
     * </pre>
     */
    private Integer idJob;

    /**
     * <pre>
     * 表字段： r_jobentry_copy.ID_JOBENTRY_TYPE
     * </pre>
     */
    private Integer idJobentryType;

    /**
     * <pre>
     * 表字段： r_jobentry_copy.NR
     * </pre>
     */
    private Integer nr;

    /**
     * <pre>
     * 表字段： r_jobentry_copy.GUI_LOCATION_X
     * </pre>
     */
    private Integer guiLocationX;

    /**
     * <pre>
     * 表字段： r_jobentry_copy.GUI_LOCATION_Y
     * </pre>
     */
    private Integer guiLocationY;

    /**
     * <pre>
     * 表字段： r_jobentry_copy.GUI_DRAW
     * </pre>
     */
    private String guiDraw;

    /**
     * <pre>
     * 表字段： r_jobentry_copy.PARALLEL
     * </pre>
     */
    private String parallel;

    private static final long serialVersionUID = 1L;
}