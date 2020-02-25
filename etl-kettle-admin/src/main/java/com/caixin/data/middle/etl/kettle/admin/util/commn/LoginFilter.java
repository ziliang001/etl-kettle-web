/**
 * Copyright (C), 2019-2020, **有限公司
 * FileName: LoginFilter
 * Author:   zhuzj29042
 * Date:     2020/2/14 15:13::13
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.caixin.data.middle.etl.kettle.admin.util.commn;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 〈一句话功能简述〉<br> 
 *
 *
 * @author zhuzhongji
 * @create 2020/2/14 15:13:13
 * @since 1.0.0
 */
public class LoginFilter implements Filter {
    private String loginUrl="";
    private String[] excludedArray=null;
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        loginUrl=filterConfig.getInitParameter("login_url");
        String excludedPages=filterConfig.getInitParameter("excludedPages");
        if(excludedPages.indexOf(",")!=-1){
            excludedArray=excludedPages.split(",");
        }else{
            excludedArray=new String[]{excludedPages};
        }
    }

    @Override
    public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest request=(HttpServletRequest)arg0;
        HttpServletResponse response=(HttpServletResponse)arg1;
        HttpSession session=request.getSession();

        boolean isExclude=false;
        for(String excludePage:excludedArray){
            if(excludePage.equals(request.getServletPath())){
                isExclude=true;
            }
        }
        if (!isExclude) {
            Object user=session.getAttribute("login");
            if (user!=null) {
                chain.doFilter(arg0, arg1);
                return;
            }else {
                PrintWriter out=response.getWriter();
                //如果是异步请求
                if (request.getHeader("x-requested-with") != null && request.getHeader("x-requested-with").equals("XMLHttpRequest")) {
                    response.addHeader("sessionstatus", "timeout");
                    chain.doFilter(request, response);
                }else {
                    response.sendRedirect(request.getContextPath()+loginUrl);
                    return;
                }
            }
        }else{
            chain.doFilter(arg0, arg1);
            return;
        }
    }

    @Override
    public void destroy() {

    }
}
