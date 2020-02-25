/**
 * Copyright (C), 2019-2020, **有限公司
 * FileName: WebMvcConfig
 * Author:   zhuzj29042
 * Date:     2020/2/10 22:43::09
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.caixin.data.middle.etl.kettle.admin.config;

import com.caixin.data.middle.etl.kettle.admin.listener.LoginInterceptor;
//import com.caixin.data.middle.etl.kettle.admin.listener.LoginInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * 〈一句话功能简述〉<br> 
 *
 *
 * @author zhuzhongji
 * @create 2020/2/10 22:43:09
 * @since 1.0.0
 */
@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter {

//    @Bean
//    public HttpMessageConverters fastJsonHttpMessageConverters() {
//        //1、创建FastJson信息转换对象
//        FastJsonHttpMessageConverter fastConverter=new FastJsonHttpMessageConverter();
//        //2、创建FastJsonConfig对象并设定序列化规则  序列化规则详见SerializerFeature类中，后面会讲
//        FastJsonConfig fastJsonConfig= new FastJsonConfig();
//        fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat,SerializerFeature.WriteNonStringKeyAsString);
//        //本人就坑在WriteNonStringKeyAsString 将不是String类型的key转换成String类型，否则前台无法将Json字符串转换成Json对象
//
//        //3、中文乱码解决方案
//        List<MediaType> fastMedisTypes = new ArrayList<MediaType>();
//        fastMedisTypes.add(MediaType.APPLICATION_JSON_UTF8);//设定Json格式且编码为utf-8
//        fastConverter.setSupportedMediaTypes(fastMedisTypes);
//        //4、将转换规则应用于转换对象
//        fastConverter.setFastJsonConfig(fastJsonConfig);
//        return new HttpMessageConverters(fastConverter);
//    }


//    @Bean
//    public MappingJackson2HttpMessageConverter getMappingJackson2HttpMessageConverter() {
//        MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter = new MappingJackson2HttpMessageConverter();
//        //设置日期格式
//        ObjectMapper objectMapper = new ObjectMapper();
//        SimpleDateFormat smt = new SimpleDateFormat("yyyy-MM-dd");
//        objectMapper.setDateFormat(smt);
//        mappingJackson2HttpMessageConverter.setObjectMapper(objectMapper);
//        //设置中文编码格式
//        List<MediaType> list = new ArrayList<MediaType>();
//        list.add(MediaType.APPLICATION_JSON_UTF8);
//        mappingJackson2HttpMessageConverter.setSupportedMediaTypes(list);
//        return mappingJackson2HttpMessageConverter;
//    }

    //配置文件上传
    @Bean(name = {"multipartResolver"})
    public MultipartResolver multipartResolver(){
        CommonsMultipartResolver commonsMultipartResolver=new CommonsMultipartResolver();
        commonsMultipartResolver.setDefaultEncoding("utf-8");
        commonsMultipartResolver.setMaxUploadSize(10485760000L);
        commonsMultipartResolver.setMaxInMemorySize(40960);
        return commonsMultipartResolver;
    }

    //异常处理
//    @Bean
//    public ExceptionHandler exceptionResolver(){
//        ExceptionHandler exceptionHandler = new ExceptionHandler();
//        return exceptionHandler;
//    }

    //拦截器
    @Override
    public void addInterceptors(InterceptorRegistry registry){
        registry.addInterceptor(new LoginInterceptor()).addPathPatterns("/**")
                .excludePathPatterns("/", "/login.html", "/user/login",
                                        "/**/*.css", "*.css2", "/**/*.js", "/**/*.js2", "*.js2", "/**/*.png", "/**/*.jpg",
                                        "/**/*.jpeg", "/**/*.gif", "/**/fonts/*", "/**/*.svg", "*.svg");
        super.addInterceptors(registry);
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/ui/**/*").addResourceLocations("classpath:/ui/**/*");
//        registry.addResourceHandler("/CodeMirror/**").addResourceLocations("classpath:/CodeMirror/");
//        registry.addResourceHandler("/css/**").addResourceLocations("classpath:/css/");
//        registry.addResourceHandler("/ECharts/**").addResourceLocations("classpath:/ECharts/");
//        registry.addResourceHandler("/ext3/**").addResourceLocations("classpath:/ext3/");
//        registry.addResourceHandler("/img/**").addResourceLocations("classpath:/img/");
//        registry.addResourceHandler("/js/**").addResourceLocations("classpath:/js/");
//        registry.addResourceHandler("/mxgraph2/**").addResourceLocations("classpath:/mxgraph2/");
//        registry.addResourceHandler("/ui/global.js2").addResourceLocations("classpath:/ui/");
//        registry.addResourceHandler("/ui/css/system.css2").addResourceLocations("classpath:/ui/css/");
        super.addResourceHandlers(registry);
    }

    /**
     * -设置url后缀模式匹配规则
     * -该设置匹配所有的后缀，使用.do或.action都可以
     */
    @Override
    public void configurePathMatch(PathMatchConfigurer configurer) {
        configurer.setUseSuffixPatternMatch(true)    //设置是否是后缀模式匹配,即:/test.*
                .setUseTrailingSlashMatch(true);    //设置是否自动后缀路径模式匹配,即：/test/
    }
}