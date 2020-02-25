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
public class DUserGroup implements Serializable {
    /**
     * <pre>
     * 表字段： d_user_group.ID_USER_GROUP
     * </pre>
     */
    private Integer idUserGroup;

    /**
     * <pre>
     * 表字段： d_user_group.USER_GROUP_NAME
     * </pre>
     */
    private String userGroupName;

    /**
     * <pre>
     * 表字段： d_user_group.USER_GROUP_DESC
     * </pre>
     */
    private String userGroupDesc;

    /**
     * <pre>
     * 表字段： d_user_group.TYPE
     * </pre>
     */
    private Integer type;

    private static final long serialVersionUID = 1L;
}