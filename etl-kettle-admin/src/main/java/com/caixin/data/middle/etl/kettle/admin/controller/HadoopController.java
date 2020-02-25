/**
 * Copyright (C), 2019-2020, **有限公司
 * FileName: HadoopController
 * Author:   zhuzj29042
 * Date:     2020/2/14 15:02::40
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.caixin.data.middle.etl.kettle.admin.controller;

import com.caixin.data.middle.etl.kettle.admin.service.HadoopService;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.pentaho.big.data.impl.cluster.NamedClusterImpl;
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
 * @create 2020/2/14 15:02:40
 * @since 1.0.0
 */
@Controller
@RequestMapping(value="/hadoop")
public class HadoopController {
    @Autowired
    protected HadoopService hdpService;

    @RequestMapping(value="/allCluster")
    @ResponseBody
    protected void allCluster(HttpServletResponse response, HttpServletRequest request) throws Exception{
        try{
            String result= JSONArray.fromObject(hdpService.getAllCluster()).toString();
            response.setContentType("text/html;charset=utf-8");
            PrintWriter out=response.getWriter();
            out.write(result);
            out.flush();
            out.close();
        }catch (Exception e){
            e.printStackTrace();
            throw new Exception(e.getMessage());
        }
    }

    @RequestMapping(value="/addHadoopCluster")
    @ResponseBody
    protected void addHadoopCluster(HttpServletResponse response,HttpServletRequest request) throws Exception{
        try{
            JSONObject obj=JSONObject.fromObject(request.getParameter("cluster"));
            NamedClusterImpl cluster=(NamedClusterImpl)JSONObject.toBean(obj,NamedClusterImpl.class);
            String result= hdpService.addHadoopCluster(cluster);
            response.setContentType("text/html;charset=utf-8");
            PrintWriter out=response.getWriter();
            out.write(result);
            out.flush();
            out.close();
        }catch (Exception e){
            e.printStackTrace();
            throw new Exception(e.getMessage());
        }
    }

    @RequestMapping(value="/getOneCluster")
    @ResponseBody
    protected void getOneCluster(HttpServletResponse response,HttpServletRequest request) throws Exception{
        try{
            String clusterName=request.getParameter("clusterName");
            NamedClusterImpl cluster=hdpService.getCluster(clusterName);
            Integer elementId=hdpService.getEleIdByClusterName(clusterName);
            JSONObject result=new JSONObject();
            result.put("cluster",cluster);
            result.put("elementId",elementId);
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

    @RequestMapping(value="/deleteCluster")
    @ResponseBody
    protected void deleteCluster(HttpServletResponse response,HttpServletRequest request) throws Exception{
        hdpService.deleteCluster(request.getParameter("clusterName"));
    }

    @RequestMapping(value="/updateCluster")
    @ResponseBody
    protected void updateCluster(HttpServletResponse response,HttpServletRequest request) throws Exception{
        try{
            String result= hdpService.updateHadoopCluster(request);
            response.setContentType("text/html;charset=utf-8");
            PrintWriter out=response.getWriter();
            out.write(result);
            out.flush();
            out.close();
        }catch (Exception e){
            e.printStackTrace();
            throw new Exception(e.getMessage());
        }
    }
}
