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
public class RUser implements Serializable {
    /**
     * <pre>
     * 表字段： r_user.ID_USER
     * </pre>
     */
    private Long idUser;

    /**
     * <pre>
     * 表字段： r_user.LOGIN
     * </pre>
     */
    private String login;

    /**
     * <pre>
     * 表字段： r_user.PASSWORD
     * </pre>
     */
    private String password;

    /**
     * <pre>
     * 表字段： r_user.NAME
     * </pre>
     */
    private String name;

    /**
     * <pre>
     * 表字段： r_user.DESCRIPTION
     * </pre>
     */
    private String description;

    /**
     * <pre>
     * 表字段： r_user.ENABLED
     * </pre>
     */
    private String enabled;

    private static final long serialVersionUID = 1L;
}