/**
 * Copyright (C), 2019-2020, **有限公司
 * FileName: TaskSchedulerController
 * Author:   zhuzj29042
 * Date:     2020/2/12 07:46::43
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.caixin.data.middle.etl.kettle.admin.controller;

import com.caixin.data.middle.etl.kettle.admin.bean.PageforBean;
import com.caixin.data.middle.etl.kettle.admin.util.commn.StringDateUtil;
import com.caixin.data.middle.etl.kettle.admin.service.SchedulerService;
//import com.caixin.data.middle.etl.kettle.monitor.bean.PageforBean;
import com.caixin.data.middle.etl.kettle.admin.entity.UserGroupAttributeEntity;
//import com.caixin.data.middle.etl.kettle.monitor.util.common.StringDateUtil;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

/**
 * 〈一句话功能简述〉<br> 
 *  作业调度
 *
 * @author zhuzhongji
 * @create 2020/2/12 07:46:43
 * @since 1.0.0
 */
@Controller
@RequestMapping(value="/scheduler")
public class TaskSchedulerController {
    @Autowired
    SchedulerService schedulerService;

    //获取作业的定时调度信息
    @RequestMapping(value="/getAllJobScheduler")
    @ResponseBody
    protected void getJobs(HttpServletResponse response, HttpServletRequest request) throws Exception{
        try{
            //获取前台传递的分页参数
            int start=Integer.parseInt(request.getParameter("start"));
            int limit=Integer.parseInt(request.getParameter("limit"));
            //获取查询参数
            Integer typeId=null;
            if(!StringDateUtil.isEmpty(request.getParameter("typeId"))){
                if(request.getParameter("typeId").equals("间隔重复")){
                    typeId=1;
                }else if(request.getParameter("typeId").equals("每天执行")){
                    typeId=2;
                }else if(request.getParameter("typeId").equals("每周执行")){
                    typeId=3;
                }else{
                    typeId=4;
                }
            }
            String hostName=request.getParameter("hostName");
            String jobName=request.getParameter("jobName");
            //获取当前用户所在的用户组
            UserGroupAttributeEntity attr=(UserGroupAttributeEntity)request.getSession().getAttribute("userInfo");
            String userGroupName="";
            if(null!=attr){
                userGroupName=attr.getUserGroupName();
            }
            PageforBean bean=schedulerService.getAllSchedulerByPage(start,limit,typeId,hostName,jobName,userGroupName);
            //输出结果返回给客户端
            response.setContentType("text/html;charset=utf-8");
            PrintWriter out=response.getWriter();
            out.write(JSONObject.fromObject(bean).toString());
            out.flush();
            out.close();
        }catch (Exception e){
            e.printStackTrace();
            throw new Exception(e.getMessage());
        }
    }

    //获取所有作业的定时调度信息
    @RequestMapping(value="/deleteScheduler")
    @ResponseBody
    protected void deleteScheduler(HttpServletResponse response,HttpServletRequest request) throws Exception{
        try{
            String[] taskIdArray=request.getParameterValues("taskIdArray");
            schedulerService.deleteScheduler(taskIdArray);
        }catch (org.quartz.SchedulerException e){
            e.printStackTrace();
            throw new Exception(e.getMessage());
        }
    }

    //获取修改前所需要的数据展现
    @RequestMapping(value="/beforeUpdateScheduler")
    @ResponseBody
    protected void beforeUpdateScheduler(HttpServletResponse response,HttpServletRequest request) throws Exception{
        try{
            //获取需要修改的定时作业详细信息
            String taskId=request.getParameter("taskId");
            JSONObject json=schedulerService.beforeUpdate(taskId);

            response.setContentType("text/html;charset=utf-8");
            PrintWriter out=response.getWriter();
            out.write(json.toString());
            out.flush();
            out.close();
        }catch (Exception e){
            e.printStackTrace();
            throw new Exception(e.getMessage());
        }
    }

    //修改
    @RequestMapping(value="/updateJobScheduler")
    @ResponseBody
    protected void updateJobScheduler(HttpServletResponse response,HttpServletRequest request) throws Exception{
        try{
            response.setContentType("text/html;charset=utf-8");
            PrintWriter out=response.getWriter();
            String json="";
            boolean isSuccess=schedulerService.updateSchedulerJob(StringDateUtil.getMapByRequest(request),request);
            if(isSuccess){
                json="{'success':true,'isSuccess':true}";
            }else{
                json="{'success':true,'isSuccess':false}";
            }
            out.write(json);
            out.flush();
            out.close();
        }catch (Exception e){
            e.printStackTrace();
            throw new Exception(e.getMessage());
        }
    }
}
