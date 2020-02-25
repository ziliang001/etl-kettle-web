package com.caixin.data.middle.etl.kettle.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
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
public class QrtzSimpropTriggers implements Serializable {
    /**
     * <pre>
     * 表字段： qrtz_simprop_triggers.SCHED_NAME
     * </pre>
     */
    private String schedName;

    /**
     * <pre>
     * 表字段： qrtz_simprop_triggers.TRIGGER_NAME
     * </pre>
     */
    private String triggerName;

    /**
     * <pre>
     * 表字段： qrtz_simprop_triggers.TRIGGER_GROUP
     * </pre>
     */
    private String triggerGroup;

    /**
     * <pre>
     * 表字段： qrtz_simprop_triggers.STR_PROP_1
     * </pre>
     */
    private String strProp1;

    /**
     * <pre>
     * 表字段： qrtz_simprop_triggers.STR_PROP_2
     * </pre>
     */
    private String strProp2;

    /**
     * <pre>
     * 表字段： qrtz_simprop_triggers.STR_PROP_3
     * </pre>
     */
    private String strProp3;

    /**
     * <pre>
     * 表字段： qrtz_simprop_triggers.INT_PROP_1
     * </pre>
     */
    private Integer intProp1;

    /**
     * <pre>
     * 表字段： qrtz_simprop_triggers.INT_PROP_2
     * </pre>
     */
    private Integer intProp2;

    /**
     * <pre>
     * 表字段： qrtz_simprop_triggers.LONG_PROP_1
     * </pre>
     */
    private Long longProp1;

    /**
     * <pre>
     * 表字段： qrtz_simprop_triggers.LONG_PROP_2
     * </pre>
     */
    private Long longProp2;

    /**
     * <pre>
     * 表字段： qrtz_simprop_triggers.DEC_PROP_1
     * </pre>
     */
    private BigDecimal decProp1;

    /**
     * <pre>
     * 表字段： qrtz_simprop_triggers.DEC_PROP_2
     * </pre>
     */
    private BigDecimal decProp2;

    /**
     * <pre>
     * 表字段： qrtz_simprop_triggers.BOOL_PROP_1
     * </pre>
     */
    private String boolProp1;

    /**
     * <pre>
     * 表字段： qrtz_simprop_triggers.BOOL_PROP_2
     * </pre>
     */
    private String boolProp2;

    private static final long serialVersionUID = 1L;
}