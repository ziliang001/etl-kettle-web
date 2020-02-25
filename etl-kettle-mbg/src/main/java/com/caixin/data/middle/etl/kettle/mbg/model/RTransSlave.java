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
public class RTransSlave implements Serializable {
    /**
     * <pre>
     * 表字段： r_trans_slave.ID_TRANS_SLAVE
     * </pre>
     */
    private Long idTransSlave;

    /**
     * <pre>
     * 表字段： r_trans_slave.ID_TRANSFORMATION
     * </pre>
     */
    private Integer idTransformation;

    /**
     * <pre>
     * 表字段： r_trans_slave.ID_SLAVE
     * </pre>
     */
    private Integer idSlave;

    private static final long serialVersionUID = 1L;
}