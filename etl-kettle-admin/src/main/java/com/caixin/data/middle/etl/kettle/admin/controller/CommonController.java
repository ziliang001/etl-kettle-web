/**
 * Copyright (C), 2019-2020, **有限公司
 * FileName: CommonController
 * Author:   zhuzj29042
 * Date:     2020/2/14 14:57::16
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.caixin.data.middle.etl.kettle.admin.controller;

import com.caixin.data.middle.etl.kettle.admin.util.RepositoryUtils;
import com.caixin.data.middle.etl.kettle.admin.entity.DatabaseConnEntity;
import com.caixin.data.middle.etl.kettle.admin.service.CommonService;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.pentaho.di.core.database.DatabaseMeta;
import org.pentaho.di.trans.TransMeta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 *
 *
 * @author zhuzhongji
 * @create 2020/2/14 14:57:16
 * @since 1.0.0
 */
@Controller
@RequestMapping(value="/common")
public class CommonController {
    @Autowired
    protected CommonService cService;

    //获取所有的数据库连接
    @RequestMapping(value="/getDatabases")
    @ResponseBody
    protected void getDatabases(HttpServletResponse response, HttpServletRequest request) throws Exception{
        try{
            List<DatabaseConnEntity> items=cService.getDatabases();
            String result= JSONArray.fromObject(items).toString();
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

    //
    @RequestMapping(value="/getDatabaseMeta")
    @ResponseBody
    protected void getDatabaseMeta(HttpServletResponse response,@RequestParam String databaseConn) throws Exception{
        try{

            TransMeta tra= RepositoryUtils.loadTransByPath("/test");
            DatabaseMeta inf=tra.findDatabase(databaseConn);
            String result= JSONObject.fromObject(inf).toString();
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

    @RequestMapping(value="/deleteDatabaseConn")
    @ResponseBody
    protected void deleteDatabaseConn(@RequestParam String id) throws Exception{
        cService.deleteDatabaseConn(Integer.valueOf(id));
    }
}
