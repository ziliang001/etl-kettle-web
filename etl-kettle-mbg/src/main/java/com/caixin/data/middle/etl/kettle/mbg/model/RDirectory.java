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
public class RDirectory implements Serializable {
    /**
     * <pre>
     * 表字段： r_directory.ID_DIRECTORY
     * </pre>
     */
    private Long idDirectory;

    /**
     * <pre>
     * 表字段： r_directory.ID_DIRECTORY_PARENT
     * </pre>
     */
    private Integer idDirectoryParent;

    /**
     * <pre>
     * 表字段： r_directory.DIRECTORY_NAME
     * </pre>
     */
    private String directoryName;

    private static final long serialVersionUID = 1L;
}