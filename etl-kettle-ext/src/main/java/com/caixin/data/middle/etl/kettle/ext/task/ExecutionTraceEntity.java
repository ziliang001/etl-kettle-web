/**
 * Copyright (C), 2019-2020, **有限公司
 * FileName: ExecutionTraceEntity
 * Author:   zhuzj29042
 * Date:     2020/2/10 16:07::53
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.caixin.data.middle.etl.kettle.ext.task;

import java.util.Date;

/**
 * 〈一句话功能简述〉<br> 
 *
 *
 * @author zhuzhongji
 * @create 2020/2/10 16:07:53
 * @since 1.0.0
 */
public class ExecutionTraceEntity {
    private Integer fireId;
    private String jobName;
    private Date startTime;
    private Date endTime;
    private String execMethod;
    private String status;
    private String executionConfiguration;
    private String executionLog;
    private String type;

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getExecMethod() {
        return execMethod;
    }

    public void setExecMethod(String execMethod) {
        this.execMethod = execMethod;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getExecutionConfiguration() {
        return executionConfiguration;
    }

    public void setExecutionConfiguration(String executionConfiguration) {
        this.executionConfiguration = executionConfiguration;
    }

    public String getExecutionLog() {
        return executionLog;
    }

    public void setExecutionLog(String executionLog) {
        this.executionLog = executionLog;
    }

    public Integer getFireId() {
        return fireId;
    }

    public void setFireId(Integer fireId) {
        this.fireId = fireId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
