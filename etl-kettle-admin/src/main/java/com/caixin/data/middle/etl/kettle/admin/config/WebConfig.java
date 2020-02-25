/**
 * Copyright (C), 2019-2020, **有限公司
 * FileName: WebConfig
 * Author:   zhuzj29042
 * Date:     2020/2/7 17:29::44
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.caixin.data.middle.etl.kettle.admin.config;

import com.caixin.data.middle.etl.kettle.admin.filter.GlobalFilter;
import com.caixin.data.middle.etl.kettle.admin.listener.SystemLoadListener;
import com.caixin.data.middle.etl.kettle.admin.util.commn.MySessionListener;
//import com.caixin.data.middle.etl.kettle.monitor.util.common.BeforeLoginFilter;
//import com.caixin.data.middle.etl.kettle.monitor.util.common.BeforeLoginFilter;
//import com.caixin.data.middle.etl.kettle.monitor.util.common.LoginFilter;
//import com.caixin.data.middle.etl.kettle.monitor.util.common.MySessionListener;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CharacterEncodingFilter;

/**
 * 〈一句话功能简述〉<br>
 *  对应web.xml
 *
 * @author zhuzhongji
 * @create 2020/2/7 17:29:44
 * @since 1.0.0
 */
@Configuration
public class WebConfig {
    //----------------------Filter

    // 字符集utf-8
    @Bean
    public FilterRegistrationBean characterRegistrationBean() {
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
        characterEncodingFilter.setEncoding("UTF-8");
        characterEncodingFilter.setForceEncoding(true);
        filterRegistrationBean.setFilter(characterEncodingFilter);
        filterRegistrationBean.addUrlPatterns("/*");
        //filterRegistrationBean.addInitParameter("encoding", "UTF-8");
        //filterRegistrationBean.addInitParameter("ForceEncoding", "true");
        return filterRegistrationBean;
    }

    // 全局
    @Bean
    public FilterRegistrationBean globalRegistrationBean() {
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        GlobalFilter globalFilter = new GlobalFilter();
        filterRegistrationBean.setFilter(globalFilter);
        filterRegistrationBean.addUrlPatterns("*");
        return filterRegistrationBean;
    }

    // 验证登录
//    @Bean
//    public FilterRegistrationBean loginRegistrationBean() {
//        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
//        LoginFilter loginFilter = new LoginFilter();
//        filterRegistrationBean.setFilter(loginFilter);
//        filterRegistrationBean.addUrlPatterns("*.do", "/index.jsp");
//        filterRegistrationBean.addInitParameter("login_url", "/login.jsp");
//        filterRegistrationBean.addInitParameter("excludedPages", "/user/doLogin.do,/user/beforeLogin.do, /api/base/ping.do");  // 匹配不做拦截的请求声明
//        return filterRegistrationBean;
//    }

    // 验证登录前
//    @Bean
//    public FilterRegistrationBean beforeLoginRegistrationBean() {
//        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
//        BeforeLoginFilter beforeLoginFilter = new BeforeLoginFilter();
//        filterRegistrationBean.setFilter(beforeLoginFilter);
//        filterRegistrationBean.addUrlPatterns("/login.jsp");
//        return filterRegistrationBean;
//    }

    // 对jsp进行权限日志过滤
//    @Bean
//    public FilterRegistrationBean jspFilterRegistrationBean() {
//        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
//        JspFilter jspFilter = new JspFilter();
//        filterRegistrationBean.setFilter(jspFilter);
//        filterRegistrationBean.addUrlPatterns("*.do");
//        return filterRegistrationBean;
//    }

//    /**
//     * 如果session中没有设置locale串或者locale串不合法，默认采用request的locale，
//     * @return
//     */
//    @Bean
//    public FilterRegistrationBean localeRegistrationBean() {
//        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
//        filterRegistrationBean.setFilter(new LocaleFilter());
//        filterRegistrationBean.addUrlPatterns("*.do");
//        return filterRegistrationBean;
//    }

    // druid界面设置
//    @Bean
//    public FilterRegistrationBean webStatFilterRegistrationBean() {
//        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
//        filterRegistrationBean.setFilter(new WebStatFilter());
//        filterRegistrationBean.addUrlPatterns("/*");
//        filterRegistrationBean.addInitParameter("exclusions", "*.js,*.gif,*.jpg,*.png,*.css,*.ico,/druid/*");
//        return filterRegistrationBean;
//    }


    //--------------------------------Listener

    @Bean
    public ServletListenerRegistrationBean<SystemLoadListener> systemLoadListenerRegistrationBean(){
        ServletListenerRegistrationBean<SystemLoadListener> sessionListener = new ServletListenerRegistrationBean<SystemLoadListener>(new SystemLoadListener());
        return sessionListener;

    }
    @Bean
    public ServletListenerRegistrationBean<MySessionListener> mySessionListenerRegistrationBean(){
        ServletListenerRegistrationBean<MySessionListener> sessionListener = new ServletListenerRegistrationBean<MySessionListener>(new MySessionListener());
        return sessionListener;

    }


//    --------------------------------------Servlet

//    @Bean
//    public ServletRegistrationBean dispatcher() {
//        ServletRegistrationBean reg = new ServletRegistrationBean();
//        DispatcherServlet dispatcherServlet = new DispatcherServlet();
//        dispatcherServlet.setContextConfigLocation("classpath:config/core/spring-mvc.xml," +
//                " classpath:config/core/dao/dao_authority.xml," +
//                " classpath:config/core/dao/dao_manager.xml," +
//                " classpath:config/core/dao/dao_oim.xml," +
//                " classpath:config/core/dao/dao_oim_v2.xml," +
//                " classpath:config/core/dao/dao_orgacus.xml," +
//                " classpath:config/core/service/service_authority.xml," +
//                " classpath:config/core/service/service_manager.xml," +
//                " classpath:config/core/service/service_oim.xml," +
//                " classpath:config/core/service/service_oim_v2.xml," +
//                " classpath:config/core/service/service_orgacus.xml," +
//                " classpath:config/client/i18n.xml," +
//                " classpath:config/client/http.xml," +
//                " classpath:config/client/action/action_main.xml," +
//                " classpath:config/client/action/action_authority.xml," +
//                " classpath:config/client/action/action_manager.xml," +
//                " classpath:config/client/action/action_oim.xml," +
//                " classpath:config/client/action/action_oim_v2.xml," +
//                " classpath:config/client/action/action_orgacus.xml");
//        reg.setServlet(dispatcherServlet);
//        reg.addUrlMappings("*.do", "*.svg", "*.css2", "*.js2");
//        reg.setLoadOnStartup(1);
//        return reg;
//    }

}