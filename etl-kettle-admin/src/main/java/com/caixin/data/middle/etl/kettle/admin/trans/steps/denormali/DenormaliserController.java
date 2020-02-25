/**
 * Copyright (C), 2019-2020, **有限公司
 * FileName: DenormaliserController
 * Author:   zhuzj29042
 * Date:     2020/2/14 16:09::23
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.caixin.data.middle.etl.kettle.admin.trans.steps.denormali;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.pentaho.di.trans.steps.denormaliser.DenormaliserTargetField;
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
 * @create 2020/2/14 16:09:23
 * @since 1.0.0
 */
@Controller
@RequestMapping(value="/denormaliser")
public class DenormaliserController {

    @RequestMapping(value="/aggre")
    @ResponseBody
    protected void types(HttpServletResponse response, HttpServletRequest request) throws Exception {
        try{
            JSONArray jsonArr=new JSONArray();
            for(String aggre: DenormaliserTargetField.typeAggrLongDesc){
                JSONObject json=new JSONObject();
                json.put("aggre",aggre);
                jsonArr.add(json);
            }
            response.setContentType("text/html;charset=utf-8");
            PrintWriter out=response.getWriter();
            out.write(jsonArr.toString());
            out.flush();
            out.close();
        }catch(Exception e){
            e.printStackTrace();
            throw new Exception(e.getMessage());
        }
    }
}
