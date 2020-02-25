/**
 * Copyright (C), 2019-2020, **有限公司
 * FileName: IndexController
 * Author:   zhuzj29042
 * Date:     2020/2/11 16:16::24
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.caixin.data.middle.etl.kettle.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 〈一句话功能简述〉<br> 
 *
 *
 * @author zhuzhongji
 * @create 2020/2/11 16:16:24
 * @since 1.0.0
 */
@Controller
public class IndexController {

    /**
     * 配置一个请求，作为访问默认首页的请求
     * @return
     */
    @GetMapping(value = {"/", "/index.html"})
    public String index() {
        return "/login.jsp";
    }
}