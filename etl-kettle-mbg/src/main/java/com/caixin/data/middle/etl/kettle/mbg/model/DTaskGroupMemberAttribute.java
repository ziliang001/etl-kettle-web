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
public class DTaskGroupMemberAttribute implements Serializable {
    /**
     * <pre>
     * 表字段： d_task_group_member_attribute.ID_TASK_GROUP_MEMBER_ATTRIBUTE
     * </pre>
     */
    private Long idTaskGroupMemberAttribute;

    /**
     * <pre>
     * 表字段： d_task_group_member_attribute.TASK_GROUP_NAME
     * </pre>
     */
    private String taskGroupName;

    /**
     * <pre>
     * 表字段： d_task_group_member_attribute.TYPE
     * </pre>
     */
    private String type;

    /**
     * <pre>
     * 表字段： d_task_group_member_attribute.ID_TASK
     * </pre>
     */
    private Long idTask;

    /**
     * <pre>
     * 表字段： d_task_group_member_attribute.TASK_NAME
     * </pre>
     */
    private String taskName;

    /**
     * <pre>
     * 表字段： d_task_group_member_attribute.TASK_PATH
     * </pre>
     */
    private String taskPath;

    private static final long serialVersionUID = 1L;
}