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
public class DTimerscheduler implements Serializable {
    /**
     * <pre>
     * 表字段： d_timerscheduler.ID_JOBTASK
     * </pre>
     */
    private Long idJobtask;

    /**
     * <pre>
     * 表字段： d_timerscheduler.ID_JOB
     * </pre>
     */
    private Long idJob;

    /**
     * <pre>
     * 表字段： d_timerscheduler.SLAVES
     * </pre>
     */
    private String slaves;

    /**
     * <pre>
     * 存放作业定时信息
     * 表字段： d_timerscheduler.JOB_NAME
     * </pre>
     */
    @ApiModelProperty(value = "存放作业定时信息")
    private String jobName;

    /**
     * <pre>
     * 表字段： d_timerscheduler.ISREPEAT
     * </pre>
     */
    private String isrepeat;

    /**
     * <pre>
     * 表字段： d_timerscheduler.SCHEDULERTYPE
     * </pre>
     */
    private Integer schedulertype;

    /**
     * <pre>
     * 表字段： d_timerscheduler.INTERVALMINUTES
     * </pre>
     */
    private Integer intervalminutes;

    /**
     * <pre>
     * 表字段： d_timerscheduler.HOUR
     * </pre>
     */
    private Integer hour;

    /**
     * <pre>
     * 表字段： d_timerscheduler.MINUTES
     * </pre>
     */
    private Integer minutes;

    /**
     * <pre>
     * 表字段： d_timerscheduler.WEEKDAY
     * </pre>
     */
    private Integer weekday;

    /**
     * <pre>
     * 表字段： d_timerscheduler.DAYOFMONTH
     * </pre>
     */
    private Integer dayofmonth;

    /**
     * <pre>
     * 表字段： d_timerscheduler.username
     * </pre>
     */
    private String username;

    /**
     * <pre>
     * 表字段： d_timerscheduler.executionConfig
     * </pre>
     */
    private String executionconfig;

    private static final long serialVersionUID = 1L;
}