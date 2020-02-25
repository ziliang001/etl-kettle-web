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
public class CarteInfo implements Serializable {
    /**
     * <pre>
     * 表字段： carte_info.carte_record_id
     * </pre>
     */
    private Long carteRecordId;

    /**
     * <pre>
     * 表字段： carte_info.n_date
     * </pre>
     */
    private Date nDate;

    /**
     * <pre>
     * 表字段： carte_info.slave_id
     * </pre>
     */
    private Integer slaveId;

    /**
     * <pre>
     * 表字段： carte_info.thread_num
     * </pre>
     */
    private Integer threadNum;

    /**
     * <pre>
     * 表字段： carte_info.job_num
     * </pre>
     */
    private Integer jobNum;

    /**
     * <pre>
     * 表字段： carte_info.trans_num
     * </pre>
     */
    private Integer transNum;

    /**
     * <pre>
     * 表字段： carte_info.free_mem
     * </pre>
     */
    private Integer freeMem;

    /**
     * <pre>
     * 表字段： carte_info.total_mem
     * </pre>
     */
    private Integer totalMem;

    /**
     * <pre>
     * 表字段： carte_info.used_mem_percent
     * </pre>
     */
    private String usedMemPercent;

    /**
     * <pre>
     * 表字段： carte_info.load_avg
     * </pre>
     */
    private Float loadAvg;

    /**
     * <pre>
     * 表字段： carte_info.finished_job_num
     * </pre>
     */
    private Integer finishedJobNum;

    /**
     * <pre>
     * 表字段： carte_info.finished_trans_num
     * </pre>
     */
    private Integer finishedTransNum;

    /**
     * <pre>
     * 表字段： carte_info.host_free_mem
     * </pre>
     */
    private String hostFreeMem;

    /**
     * <pre>
     * 表字段： carte_info.host_cpu_usage
     * </pre>
     */
    private String hostCpuUsage;

    /**
     * <pre>
     * 表字段： carte_info.host_free_disk
     * </pre>
     */
    private String hostFreeDisk;

    private static final long serialVersionUID = 1L;
}