/**
 * Copyright (C), 2019-2020, **有限公司
 * FileName: CheckSumController
 * Author:   zhuzj29042
 * Date:     2020/2/11 21:27::11
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.caixin.data.middle.etl.kettle.admin.trans.steps.checksum;

import org.pentaho.di.trans.steps.checksum.CheckSumMeta;
import org.springframework.stereotype.Controller;
import org.springframework.util.LinkedCaseInsensitiveMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 *
 *
 * @author zhuzhongji
 * @create 2020/2/11 21:27:11
 * @since 1.0.0
 */

@Controller
@RequestMapping(value="/checksum")
public class CheckSumController {

    @RequestMapping(method= RequestMethod.POST, value="/types")
    protected @ResponseBody
    List types() throws IOException {
        ArrayList list = new ArrayList();

        for (String code : CheckSumMeta.checksumtypeCodes) {
            LinkedCaseInsensitiveMap record = new LinkedCaseInsensitiveMap();
            record.put("code", code);
            list.add(record);
        }

        return list;
    }

    @RequestMapping(method=RequestMethod.POST, value="/resulttype")
    protected @ResponseBody List resulttype() throws IOException {
        ArrayList list = new ArrayList();

        for (int i=0; i<CheckSumMeta.resultTypeCode.length; i++) {
            LinkedCaseInsensitiveMap record = new LinkedCaseInsensitiveMap();
            record.put("code", CheckSumMeta.resultTypeCode[i]);
            record.put("desc", CheckSumMeta.resultTypeDesc[i]);
            list.add(record);
        }

        return list;
    }

}