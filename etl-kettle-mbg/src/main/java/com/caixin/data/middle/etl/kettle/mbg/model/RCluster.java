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
public class RCluster implements Serializable {
    /**
     * <pre>
     * 表字段： r_cluster.ID_CLUSTER
     * </pre>
     */
    private Long idCluster;

    /**
     * <pre>
     * 表字段： r_cluster.NAME
     * </pre>
     */
    private String name;

    /**
     * <pre>
     * 表字段： r_cluster.BASE_PORT
     * </pre>
     */
    private String basePort;

    /**
     * <pre>
     * 表字段： r_cluster.SOCKETS_BUFFER_SIZE
     * </pre>
     */
    private String socketsBufferSize;

    /**
     * <pre>
     * 表字段： r_cluster.SOCKETS_FLUSH_INTERVAL
     * </pre>
     */
    private String socketsFlushInterval;

    /**
     * <pre>
     * 表字段： r_cluster.SOCKETS_COMPRESSED
     * </pre>
     */
    private String socketsCompressed;

    /**
     * <pre>
     * 表字段： r_cluster.DYNAMIC_CLUSTER
     * </pre>
     */
    private String dynamicCluster;

    private static final long serialVersionUID = 1L;
}