/**
 * Copyright (C), 2019-2020, **有限公司
 * FileName: MergeJoinController
 * Author:   zhuzj29042
 * Date:     2020/2/11 21:29::37
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.caixin.data.middle.etl.kettle.admin.trans.steps.mergejoin;

import org.pentaho.di.trans.steps.mergejoin.MergeJoinMeta;
import org.springframework.stereotype.Controller;
import org.springframework.util.LinkedCaseInsensitiveMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 *
 *
 * @author zhuzhongji
 * @create 2020/2/11 21:29:37
 * @since 1.0.0
 */
@Controller
@RequestMapping(value = "/mergejoin")
public class MergeJoinController {

    @RequestMapping(method = RequestMethod.POST, value = "/types")
    protected @ResponseBody
    List types() throws Exception {
        ArrayList list = new ArrayList();
        for (int i = 0; i < MergeJoinMeta.join_types.length; i++) {
            LinkedCaseInsensitiveMap record = new LinkedCaseInsensitiveMap();
            record.put("name", MergeJoinMeta.join_types[i]);
            list.add(record);
        }
        return list;
    }


}