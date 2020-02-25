/**
 * Copyright (C), 2019-2020, **有限公司
 * FileName: ViewController
 * Author:   zhuzj29042
 * Date:     2020/2/11 21:31::35
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.caixin.data.middle.etl.kettle.admin.controller;

import com.caixin.data.middle.etl.kettle.admin.service.ControlService;
import com.caixin.data.middle.etl.kettle.admin.service.SchedulerService;
import com.caixin.data.middle.etl.kettle.admin.service.SlaveService;
import com.caixin.data.middle.etl.kettle.ext.util.JSONObject;
import com.caixin.data.middle.etl.kettle.admin.entity.UserGroupAttributeEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

/**
 * 〈一句话功能简述〉<br> 
 *
 *
 * @author zhuzhongji
 * @create 2020/2/11 21:31:35
 * @since 1.0.0
 */
@Controller
@RequestMapping(value="/viewModule")
public class ViewController {
    @Autowired
    protected ControlService controlService;
    @Autowired
    protected SlaveService slaveService;
    @Autowired
    protected SchedulerService schedulerService;

    //获取平台模块的数据
    @RequestMapping(value="/getData")
    @ResponseBody
    protected void getDatabases(HttpServletResponse response, HttpServletRequest request) throws Exception{
        try{
            UserGroupAttributeEntity attr=(UserGroupAttributeEntity)request.getSession().getAttribute("userInfo");
            String userGroupName="";
            if(null!=attr){
                userGroupName=attr.getUserGroupName();
            }
            Integer runningJobCount=controlService.getAllRunningJob(userGroupName).size();
            Integer runningTransCount=controlService.getAllRunningTrans(userGroupName).size();
            Integer slaveCount=slaveService.getAllSlaveSize();
            Integer schedulerCount=schedulerService.getSchedulerJobByLogin(userGroupName).size();

            JSONObject result=new JSONObject();

            JSONObject runningJob=new JSONObject();
            runningJob.put("value",runningJobCount);
            runningJob.put("name","");
            JSONObject runningTrans=new JSONObject();
            runningTrans.put("value",runningTransCount);
            runningTrans.put("name","");
            JSONObject slave=new JSONObject();
            slave.put("value",slaveCount);
            slave.put("name","");
            JSONObject scheduler=new JSONObject();
            scheduler.put("value",schedulerCount);
            scheduler.put("name","");

            result.put("runningJob",runningJob);
            result.put("runningTrans",runningTrans);
            result.put("slave",slave);
            result.put("scheduler",scheduler);


            response.setContentType("text/html;charset=utf-8");
            PrintWriter out=response.getWriter();
            out.write(result.toString());
            out.flush();
            out.close();
        }catch (Exception e){
            e.printStackTrace();
            throw new Exception(e.getMessage());
        }
    }
}
