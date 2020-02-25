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
public class RTransHop implements Serializable {
    /**
     * <pre>
     * 表字段： r_trans_hop.ID_TRANS_HOP
     * </pre>
     */
    private Long idTransHop;

    /**
     * <pre>
     * 表字段： r_trans_hop.ID_TRANSFORMATION
     * </pre>
     */
    private Integer idTransformation;

    /**
     * <pre>
     * 表字段： r_trans_hop.ID_STEP_FROM
     * </pre>
     */
    private Integer idStepFrom;

    /**
     * <pre>
     * 表字段： r_trans_hop.ID_STEP_TO
     * </pre>
     */
    private Integer idStepTo;

    /**
     * <pre>
     * 表字段： r_trans_hop.ENABLED
     * </pre>
     */
    private String enabled;

    private static final long serialVersionUID = 1L;
}