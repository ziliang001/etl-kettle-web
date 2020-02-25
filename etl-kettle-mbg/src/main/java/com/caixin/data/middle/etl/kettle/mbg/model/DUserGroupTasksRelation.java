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
public class DUserGroupTasksRelation implements Serializable {
    /**
     * <pre>
     * 表字段： d_user_group_tasks_relation.ID_USERGROUP_TASKS_RELATION
     * </pre>
     */
    private Integer idUsergroupTasksRelation;

    /**
     * <pre>
     * 表字段： d_user_group_tasks_relation.USER_GROUP_NAME
     * </pre>
     */
    private String userGroupName;

    /**
     * <pre>
     * 表字段： d_user_group_tasks_relation.TASK_GROUP_NAME
     * </pre>
     */
    private String taskGroupName;

    /**
     * <pre>
     * 表字段： d_user_group_tasks_relation.TYPE
     * </pre>
     */
    private Integer type;

    private static final long serialVersionUID = 1L;
}