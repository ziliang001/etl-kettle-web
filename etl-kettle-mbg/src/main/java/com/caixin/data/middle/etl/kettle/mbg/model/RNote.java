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
public class RNote implements Serializable {
    /**
     * <pre>
     * 表字段： r_note.ID_NOTE
     * </pre>
     */
    private Long idNote;

    /**
     * <pre>
     * 表字段： r_note.GUI_LOCATION_X
     * </pre>
     */
    private Integer guiLocationX;

    /**
     * <pre>
     * 表字段： r_note.GUI_LOCATION_Y
     * </pre>
     */
    private Integer guiLocationY;

    /**
     * <pre>
     * 表字段： r_note.GUI_LOCATION_WIDTH
     * </pre>
     */
    private Integer guiLocationWidth;

    /**
     * <pre>
     * 表字段： r_note.GUI_LOCATION_HEIGHT
     * </pre>
     */
    private Integer guiLocationHeight;

    /**
     * <pre>
     * 表字段： r_note.FONT_SIZE
     * </pre>
     */
    private Integer fontSize;

    /**
     * <pre>
     * 表字段： r_note.FONT_BOLD
     * </pre>
     */
    private String fontBold;

    /**
     * <pre>
     * 表字段： r_note.FONT_ITALIC
     * </pre>
     */
    private String fontItalic;

    /**
     * <pre>
     * 表字段： r_note.FONT_COLOR_RED
     * </pre>
     */
    private Integer fontColorRed;

    /**
     * <pre>
     * 表字段： r_note.FONT_COLOR_GREEN
     * </pre>
     */
    private Integer fontColorGreen;

    /**
     * <pre>
     * 表字段： r_note.FONT_COLOR_BLUE
     * </pre>
     */
    private Integer fontColorBlue;

    /**
     * <pre>
     * 表字段： r_note.FONT_BACK_GROUND_COLOR_RED
     * </pre>
     */
    private Integer fontBackGroundColorRed;

    /**
     * <pre>
     * 表字段： r_note.FONT_BACK_GROUND_COLOR_GREEN
     * </pre>
     */
    private Integer fontBackGroundColorGreen;

    /**
     * <pre>
     * 表字段： r_note.FONT_BACK_GROUND_COLOR_BLUE
     * </pre>
     */
    private Integer fontBackGroundColorBlue;

    /**
     * <pre>
     * 表字段： r_note.FONT_BORDER_COLOR_RED
     * </pre>
     */
    private Integer fontBorderColorRed;

    /**
     * <pre>
     * 表字段： r_note.FONT_BORDER_COLOR_GREEN
     * </pre>
     */
    private Integer fontBorderColorGreen;

    /**
     * <pre>
     * 表字段： r_note.FONT_BORDER_COLOR_BLUE
     * </pre>
     */
    private Integer fontBorderColorBlue;

    /**
     * <pre>
     * 表字段： r_note.DRAW_SHADOW
     * </pre>
     */
    private String drawShadow;

    /**
     * <pre>
     * 表字段： r_note.VALUE_STR
     * </pre>
     */
    private String valueStr;

    /**
     * <pre>
     * 表字段： r_note.FONT_NAME
     * </pre>
     */
    private String fontName;

    private static final long serialVersionUID = 1L;
}