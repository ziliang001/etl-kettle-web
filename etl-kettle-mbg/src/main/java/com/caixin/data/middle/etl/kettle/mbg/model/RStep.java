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
public class RStep implements Serializable {
    /**
     * <pre>
     * 表字段： r_step.ID_STEP
     * </pre>
     */
    private Long idStep;

    /**
     * <pre>
     * 表字段： r_step.ID_TRANSFORMATION
     * </pre>
     */
    private Integer idTransformation;

    /**
     * <pre>
     * 表字段： r_step.NAME
     * </pre>
     */
    private String name;

    /**
     * <pre>
     * 表字段： r_step.ID_STEP_TYPE
     * </pre>
     */
    private Integer idStepType;

    /**
     * <pre>
     * 表字段： r_step.DISTRIBUTE
     * </pre>
     */
    private String distribute;

    /**
     * <pre>
     * 表字段： r_step.COPIES
     * </pre>
     */
    private Integer copies;

    /**
     * <pre>
     * 表字段： r_step.GUI_LOCATION_X
     * </pre>
     */
    private Integer guiLocationX;

    /**
     * <pre>
     * 表字段： r_step.GUI_LOCATION_Y
     * </pre>
     */
    private Integer guiLocationY;

    /**
     * <pre>
     * 表字段： r_step.GUI_DRAW
     * </pre>
     */
    private String guiDraw;

    /**
     * <pre>
     * 表字段： r_step.COPIES_STRING
     * </pre>
     */
    private String copiesString;

    /**
     * <pre>
     * 表字段： r_step.DESCRIPTION
     * </pre>
     */
    private String description;

    private static final long serialVersionUID = 1L;
}