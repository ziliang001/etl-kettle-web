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
public class RVersion implements Serializable {
    /**
     * <pre>
     * 表字段： r_version.ID_VERSION
     * </pre>
     */
    private Long idVersion;

    /**
     * <pre>
     * 表字段： r_version.MAJOR_VERSION
     * </pre>
     */
    private Integer majorVersion;

    /**
     * <pre>
     * 表字段： r_version.MINOR_VERSION
     * </pre>
     */
    private Integer minorVersion;

    /**
     * <pre>
     * 表字段： r_version.UPGRADE_DATE
     * </pre>
     */
    private Date upgradeDate;

    /**
     * <pre>
     * 表字段： r_version.IS_UPGRADE
     * </pre>
     */
    private String isUpgrade;

    private static final long serialVersionUID = 1L;
}