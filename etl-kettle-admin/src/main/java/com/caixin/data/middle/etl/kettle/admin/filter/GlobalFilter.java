/**
 * Copyright (C), 2019-2020, **有限公司
 * FileName: GlobalFilter
 * Author:   zhuzj29042
 * Date:     2020/2/10 12:04::38
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.caixin.data.middle.etl.kettle.admin.filter;

import com.caixin.data.middle.etl.kettle.ext.util.JsonUtils;

import javax.servlet.*;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 〈一句话功能简述〉<br> 
 *
 *
 * @author zhuzhongji
 * @create 2020/2/10 12:04:38
 * @since 1.0.0
 */
public class GlobalFilter implements Filter {

    @Override
    public void destroy() {

    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain fc) throws IOException, ServletException {
        if(res instanceof HttpServletResponse) {
            HttpServletResponse response = (HttpServletResponse) res;
            JsonUtils.putResponse(response);
        }

        fc.doFilter(req, res);
    }

    @Override
    public void init(FilterConfig fc) throws ServletException {

    }

}