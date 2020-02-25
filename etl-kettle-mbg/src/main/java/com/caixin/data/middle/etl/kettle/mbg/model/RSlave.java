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
public class RSlave implements Serializable {
    /**
     * <pre>
     * 表字段： r_slave.ID_SLAVE
     * </pre>
     */
    private Long idSlave;

    /**
     * <pre>
     * 表字段： r_slave.NAME
     * </pre>
     */
    private String name;

    /**
     * <pre>
     * 表字段： r_slave.HOST_NAME
     * </pre>
     */
    private String hostName;

    /**
     * <pre>
     * 表字段： r_slave.PORT
     * </pre>
     */
    private String port;

    /**
     * <pre>
     * 表字段： r_slave.WEB_APP_NAME
     * </pre>
     */
    private String webAppName;

    /**
     * <pre>
     * 表字段： r_slave.USERNAME
     * </pre>
     */
    private String username;

    /**
     * <pre>
     * 表字段： r_slave.PASSWORD
     * </pre>
     */
    private String password;

    /**
     * <pre>
     * 表字段： r_slave.PROXY_HOST_NAME
     * </pre>
     */
    private String proxyHostName;

    /**
     * <pre>
     * 表字段： r_slave.PROXY_PORT
     * </pre>
     */
    private String proxyPort;

    /**
     * <pre>
     * 表字段： r_slave.NON_PROXY_HOSTS
     * </pre>
     */
    private String nonProxyHosts;

    /**
     * <pre>
     * 表字段： r_slave.MASTER
     * </pre>
     */
    private String master;

    private static final long serialVersionUID = 1L;
}