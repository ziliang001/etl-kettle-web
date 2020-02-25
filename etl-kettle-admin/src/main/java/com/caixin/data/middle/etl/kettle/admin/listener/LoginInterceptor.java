/**
 * Copyright (C), 2019-2020, **有限公司
 * FileName: LoginInterceptor
 * Author:   zhuzj29042
 * Date:     2020/2/10 22:50::24
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.caixin.data.middle.etl.kettle.admin.listener;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 〈一句话功能简述〉<br>
 *
 *
 * @author zhuzhongji
 * @create 2020/2/10 22:50:24
 * @since 1.0.0
 */
public class LoginInterceptor implements HandlerInterceptor {

    @Override
    public void afterCompletion(HttpServletRequest request,
                                HttpServletResponse response, Object handler, Exception e)
            throws Exception {

    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response,
                           Object handler, ModelAndView mv) throws Exception {

    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
                             Object handler) throws Exception {
        String uri = request.getRequestURI();
        String cp = request.getContextPath();
        String url = uri.replaceAll(cp, "");


//        if(request.getSession().getAttribute("loginuser") == null) {
//            if("/repository/types.do".equals(url))
//                return true;
//            if("/repository/list.do".equals(url))
//                return true;
//            if("/api/base/ping".equals(url)) {
//                return true;
//            }
//
//
//            response.getWriter().write("access forbidden");
//
//            return false;
//        }

        return true;
    }

}
