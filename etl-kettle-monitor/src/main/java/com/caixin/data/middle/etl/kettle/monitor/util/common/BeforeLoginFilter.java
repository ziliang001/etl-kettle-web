///**
// * Copyright (C), 2019-2020, **有限公司
// * FileName: BeforeLoginFilter
// * Author:   zhuzj29042
// * Date:     2020/2/10 15:17::32
// * Description:
// * History:
// * <author>          <time>          <version>          <desc>
// * 作者姓名           修改时间           版本号              描述
// */
//package com.caixin.data.middle.etl.kettle.monitor.util.common;
//
//import javax.servlet.*;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//import java.io.IOException;
//
///**
// * 〈一句话功能简述〉<br>
// *
// *
// * @author zhuzhongji
// * @create 2020/2/10 15:17:32
// * @since 1.0.0
// */
//public class BeforeLoginFilter implements Filter {
//    @Override
//    public void init(FilterConfig filterConfig) throws ServletException {
//
//    }
//
//    @Override
//    public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain chain) throws IOException, ServletException {
//        HttpServletRequest request=(HttpServletRequest)arg0;
//        HttpServletResponse response=(HttpServletResponse)arg1;
//        HttpSession session=request.getSession();
//        if (null!=session.getAttribute("login")) {
//            response.sendRedirect(request.getContextPath()+"/index.jsp");
//            return;
//        } else {
//            chain.doFilter(arg0, arg1);
//            return;
//        }
//    }
//
//    @Override
//    public void destroy() {
//
//    }
//}
