/**
 * Copyright (C), 2019-2020, **有限公司
 * FileName: JobService
 * Author:   zhuzj29042
 * Date:     2020/2/10 16:24::19
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.caixin.data.middle.etl.kettle.admin.service;

import com.caixin.data.middle.etl.kettle.admin.entity.JobEntity;
import com.caixin.data.middle.etl.kettle.admin.entity.JobTimeSchedulerEntity;
import net.sf.json.JSONObject;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

/**
 * 〈一句话功能简述〉<br> 
 *
 *
 * @author zhuzhongji
 * @create 2020/2/10 16:24:19
 * @since 1.0.0
 */
public interface JobService {
    public JSONObject findJobs(int start, int limit, String name, String createDate, String userGroupName) throws Exception;

    public void deleteJobs(String jobPath, String flag) throws Exception;

    public void executeJob(String path, Integer slaveId) throws Exception;

    public boolean judgeJobIsAlike(JobTimeSchedulerEntity willAddJobTimer);

    public void addTimeExecuteJob(String graphXml, String executionConfiguration, HttpServletRequest request) throws Exception;

    public boolean beforeTimeExecuteJob(Map<String, Object> params, HttpServletRequest request) throws Exception;

    public List<JobTimeSchedulerEntity> getAllTimerJob() throws Exception;

    public JobEntity getJobById(Integer jobId) throws Exception;

    public List<JobEntity> getJobPath(List<JobEntity> jobs) throws Exception;

    public JobEntity getJobByName(String jobName) throws Exception;

    public boolean updateJobName(String oldName, String newName);
}
