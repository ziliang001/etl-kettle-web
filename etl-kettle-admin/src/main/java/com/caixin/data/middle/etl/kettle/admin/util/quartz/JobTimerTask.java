/**
 * Copyright (C), 2019-2020, **有限公司
 * FileName: JobTimerTask
 * Author:   zhuzj29042
 * Date:     2020/2/14 15:20::55
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.caixin.data.middle.etl.kettle.admin.util.quartz;

import com.caixin.data.middle.etl.kettle.admin.entity.UserEntity;
import com.caixin.data.middle.etl.kettle.admin.util.JobExecutor;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 * 〈一句话功能简述〉<br> 
 *
 *
 * @author zhuzhongji
 * @create 2020/2/14 15:20:55
 * @since 1.0.0
 */
public class JobTimerTask implements Job {
    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        JobExecutor jobExecutor = (JobExecutor)context.getJobDetail().getJobDataMap().get("jobExecutor");
        UserEntity user=(UserEntity)context.getJobDetail().getJobDataMap().get("loginUser");
        try {
           /*   使用与carte服务器交互的方式执行定时作业
           CarteClient cc=new CarteClient(slave);
            //拼接资源库名
            String repoId=CarteClient.hostName+"_"+CarteClient.databaseName;
            //节点执行作业的请求
            String urlString="/?rep="+repoId+"&user="+user.getLogin()+"&pass="+user.getPassword()+"&job="+path+"&level=Basic";
            urlString = Const.replace(urlString, "/", "%2F");
            urlString = cc.getHttpUrl() + CarteClient.EXECREMOTE_JOB +urlString;
            System.out.println("定时作业请求的url字符串为" + urlString);
            CarteTaskManager.addTask(cc, "job_exec", urlString);*/
            //调用kettle api方式执行定时作业
            Thread tr = new Thread(jobExecutor, "JobExecutor_" + jobExecutor.getExecutionId());
            tr.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
