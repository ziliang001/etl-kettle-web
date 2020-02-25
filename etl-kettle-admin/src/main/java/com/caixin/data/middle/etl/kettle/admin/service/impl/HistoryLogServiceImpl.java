/**
 * Copyright (C), 2019-2020, **有限公司
 * FileName: HistoryLogServiceImpl
 * Author:   zhuzj29042
 * Date:     2020/2/12 07:51::28
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.caixin.data.middle.etl.kettle.admin.service.impl;

import com.caixin.data.middle.etl.kettle.admin.bean.PageforBean;
import com.caixin.data.middle.etl.kettle.admin.dao.ExecutionTraceDao;
import com.caixin.data.middle.etl.kettle.admin.dao.TaskGroupDao;
import com.caixin.data.middle.etl.kettle.admin.util.commn.StringDateUtil;
import com.caixin.data.middle.etl.kettle.admin.service.HistoryLogService;
import com.caixin.data.middle.etl.kettle.ext.task.ExecutionTraceEntity;
//import com.caixin.data.middle.etl.kettle.monitor.bean.PageforBean;
import com.caixin.data.middle.etl.kettle.admin.entity.TaskGroupAttributeEntity;
//import com.caixin.data.middle.etl.kettle.monitor.util.common.StringDateUtil;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 *
 *
 * @author zhuzhongji
 * @create 2020/2/12 07:51:28
 * @since 1.0.0
 */
@Service
public class HistoryLogServiceImpl implements HistoryLogService {
    @Autowired
//    @Qualifier("taskExecutionTraceDao")
    private ExecutionTraceDao executionTraceDao;

    @Autowired
    private TaskGroupDao groupDao;

    @Override
    public String getAllHistoryLog(int start, int limit,String statu,String type,String startDate,String taskName,String userGroupName) throws Exception{
        List<ExecutionTraceEntity> traces=executionTraceDao.getAllLogByPage(start,limit,statu,type,startDate,taskName,userGroupName);
        for(ExecutionTraceEntity trace:traces){
            if(trace.getStatus().equals("成功")){
                trace.setStatus("<font color='green'>"+trace.getStatus()+"</font>");
            }else{
                trace.setStatus("<font color='red'>"+trace.getStatus()+"</font>");
            }
        }

        PageforBean json=new PageforBean();
        json.setTotalProperty(executionTraceDao.getAllLogCount(statu,type,startDate,taskName,userGroupName));
        json.setRoot(traces);

        return JSONObject.fromObject(json, StringDateUtil.configJson("yyyy-MM-dd HH:mm:ss")).toString();
    }

    @Override
    public String getExecutionTraceById(Integer id) throws Exception{
        ExecutionTraceEntity trace=executionTraceDao.getTraceById(id);
        //增加所属任务组属性
        String config=trace.getExecutionConfiguration();
        if(null!=config){
            JSONObject json=JSONObject.fromObject(config);
            List<TaskGroupAttributeEntity> groups=groupDao.getTaskGroupByTaskName(trace.getJobName(),trace.getType());
            if(null!=groups && groups.size()>0){
                String[] groupNames=new String[groups.size()];
                for(int i=0;i<groups.size();i++){
                    TaskGroupAttributeEntity group=groups.get(i);
                    groupNames[i]=group.getTaskGroupName();
                }
                json.put("group",groupNames);
            }else{
                json.put("group","暂未分配任务组");
            }
            trace.setExecutionConfiguration(json.toString());
            trace.setExecutionLog(trace.getExecutionLog().replaceAll("\\\\n","<br/>"));
        }
        return JSONObject.fromObject(trace).toString();
    }
}
