/**
 * Copyright (C), 2019-2020, **有限公司
 * FileName: CommonStepController
 * Author:   zhuzj29042
 * Date:     2020/2/14 16:08::38
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.caixin.data.middle.etl.kettle.admin.trans.steps.common;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.util.Collection;

/**
 * 〈一句话功能简述〉<br> 
 *
 *
 * @author zhuzhongji
 * @create 2020/2/14 16:08:38
 * @since 1.0.0
 */
@Controller
@RequestMapping(value="/commonStep")
public class CommonStepController {

    //获取所有编码方式
    @RequestMapping(value="/Encodings")
    @ResponseBody
    protected void getSlaveSelect(HttpServletResponse response, HttpServletRequest request) throws Exception{
        try{
            StringBuffer sbf=new StringBuffer("[");
            Collection encodings= Charset.availableCharsets().values();

            int i=0;
            for(Object encoding:encodings){
                String encodingJson="";
                String encodingValue="\""+encoding.toString()+"\"";
                String encodingName="\""+"encodingName"+"\"";
                if(i!=encodings.size()-1){
                    encodingJson="{"+encodingName+":"+encodingValue+"},";
                }else{
                    encodingJson="{"+encodingName+":"+encodingValue+"}";
                }
                sbf.append(encodingJson);
                i++;
            }
            sbf.append("]");
            response.setContentType("text/html;charset=utf-8");
            PrintWriter out=response.getWriter();
            out.write(sbf.toString());
            out.flush();
            out.close();
        }catch(Exception e){
            e.printStackTrace();
            throw new Exception(e.getMessage());
        }
    }
}
