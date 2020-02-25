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
public class DTaskGroup implements Serializable {
    /**
     * <pre>
     * 表字段： d_task_group.ID_TASK_GROUP
     * </pre>
     */
    private Long idTaskGroup;

    /**
     * <pre>
     * 表字段： d_task_group.TASK_GROUP_NAME
     * </pre>
     */
    private String taskGroupName;

    /**
     * <pre>
     * 表字段： d_task_group.TASK_DESC
     * </pre>
     */
    private String taskDesc;

    /**
     * <pre>
     * 表字段： d_task_group.CREATE_DATE
     * </pre>
     */
    private Date createDate;

    private static final long serialVersionUID = 1L;
}