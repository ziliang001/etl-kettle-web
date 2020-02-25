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
public class DUserGroupMemberAttribute implements Serializable {
    /**
     * <pre>
     * 表字段： d_user_group_member_attribute.ID_USERGROUP_MEMBER_ATTRIBUTE
     * </pre>
     */
    private Integer idUsergroupMemberAttribute;

    /**
     * <pre>
     * 表字段： d_user_group_member_attribute.USER_TYPE
     * </pre>
     */
    private Integer userType;

    /**
     * <pre>
     * 表字段： d_user_group_member_attribute.USER_GROUP_NAME
     * </pre>
     */
    private String userGroupName;

    /**
     * <pre>
     * 表字段： d_user_group_member_attribute.USER_NAME
     * </pre>
     */
    private String userName;

    /**
     * <pre>
     * 表字段： d_user_group_member_attribute.SLAVE_PERMISSION_TYPE
     * </pre>
     */
    private Integer slavePermissionType;

    /**
     * <pre>
     * 表字段： d_user_group_member_attribute.TASK_PERMISSION_TYPE
     * </pre>
     */
    private Integer taskPermissionType;

    /**
     * <pre>
     * 表字段： d_user_group_member_attribute.CREATE_DATE
     * </pre>
     */
    private Date createDate;

    private static final long serialVersionUID = 1L;
}