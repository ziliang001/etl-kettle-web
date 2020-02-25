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
public class RPartitionSchema implements Serializable {
    /**
     * <pre>
     * 表字段： r_partition_schema.ID_PARTITION_SCHEMA
     * </pre>
     */
    private Long idPartitionSchema;

    /**
     * <pre>
     * 表字段： r_partition_schema.NAME
     * </pre>
     */
    private String name;

    /**
     * <pre>
     * 表字段： r_partition_schema.DYNAMIC_DEFINITION
     * </pre>
     */
    private String dynamicDefinition;

    /**
     * <pre>
     * 表字段： r_partition_schema.PARTITIONS_PER_SLAVE
     * </pre>
     */
    private String partitionsPerSlave;

    private static final long serialVersionUID = 1L;
}