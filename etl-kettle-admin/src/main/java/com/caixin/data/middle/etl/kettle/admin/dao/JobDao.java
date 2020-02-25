/**
 * Copyright (C), 2019-2020, **有限公司
 * FileName: JobDao
 * Author:   zhuzj29042
 * Date:     2020/2/10 17:24::05
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.caixin.data.middle.etl.kettle.admin.dao;

import com.caixin.data.middle.etl.kettle.admin.entity.JobEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 *
 *
 * @author zhuzhongji
 * @create 2020/2/10 17:24:05
 * @since 1.0.0
 */
@Mapper
//@Repository
public interface JobDao {

    public List<JobEntity> getThisPageJob(int start, int limit, String userGroupName);

    public Integer getTotalCount(String userGroupName); //获得总记录数

    public List<JobEntity> conditionFindJobs(int start, int limit, String namme, String date, String userGroupName);//带条件的查询

    public Integer conditionFindJobCount(String name, String date, String UserGroupName);//带条件查询总记录数

    public JobEntity getJobById(Integer jobId);

    public JobEntity getJobByName(String jobName);

    public void updateJobNameforJob(String oldName, String newName);
}