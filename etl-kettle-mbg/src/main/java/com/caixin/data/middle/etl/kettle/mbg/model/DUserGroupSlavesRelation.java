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
public class DUserGroupSlavesRelation implements Serializable {
    /**
     * <pre>
     * 表字段： d_user_group_slaves_relation.ID_USERGROUP_SLAVES_RELATION
     * </pre>
     */
    private Integer idUsergroupSlavesRelation;

    /**
     * <pre>
     * 表字段： d_user_group_slaves_relation.USER_GROUP_NAME
     * </pre>
     */
    private String userGroupName;

    /**
     * <pre>
     * 表字段： d_user_group_slaves_relation.ID_SLAVE
     * </pre>
     */
    private Integer idSlave;

    /**
     * <pre>
     * 表字段： d_user_group_slaves_relation.TYPE
     * </pre>
     */
    private Integer type;

    private static final long serialVersionUID = 1L;
}