/**
 * Copyright (C), 2019-2020,**有限公司
 * FileName: SchedulerService
 * Author:   zhuzj29042
 * Date:     2020/2/11 22:06::17
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.caixin.data.middle.etl.kettle.admin.service;

//import com.caixin.data.middle.etl.kettle.monitor.bean.PageforBean;
import com.caixin.data.middle.etl.kettle.admin.bean.PageforBean;
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
 * @create 2020/2/11 22:06:17
 * @since 1.0.0
 */
public interface SchedulerService {
    public PageforBean getAllSchedulerByPage(int start, int limit, Integer typeId, String slaves, String jobName, String userGroupName) throws Exception;

    public void deleteScheduler(String[] taskIdArray) throws Exception;

    public JSONObject beforeUpdate(String taskId) throws Exception;

    public boolean updateSchedulerJob(Map<String,Object> params, HttpServletRequest request) throws Exception;

    public List<JobTimeSchedulerEntity> getSchedulerJobByLogin(String userGroupName);

}