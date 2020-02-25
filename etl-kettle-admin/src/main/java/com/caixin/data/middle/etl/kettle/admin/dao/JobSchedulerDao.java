/**
 * Copyright (C), 2019-2020, **有限公司
 * FileName: JobSchedulerDao
 * Author:   zhuzj29042
 * Date:     2020/2/10 17:27::39
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.caixin.data.middle.etl.kettle.admin.dao;

import com.caixin.data.middle.etl.kettle.admin.entity.JobTimeSchedulerEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 *
 *
 * @author zhuzhongji
 * @create 2020/2/10 17:27:39
 * @since 1.0.0
 */
@Mapper
//@Repository
public interface JobSchedulerDao {
    public List<JobTimeSchedulerEntity> getAllTimerJob(String userGroupName);

    public void addTimerJob(JobTimeSchedulerEntity job);

    public Integer getTotalCount(Integer typeId, String slaves, String jobName, String userGroupName);

    public List<JobTimeSchedulerEntity> getTimerJobByPage(int start, int limit, Integer typeId, String slaves, String jobName, String userGroupName);

    public void deleteScheduler(long taskId);

    public JobTimeSchedulerEntity getSchedulerBytaskId(long taskId);

    public void updateScheduler(JobTimeSchedulerEntity schedulerJob);

    public void deleteSchedulerByJobName(String jobName);

    public List<JobTimeSchedulerEntity> getTimerJobByJobName(String jobName);

}