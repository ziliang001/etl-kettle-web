package com.caixin.data.middle.etl.kettle.admin.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Swagger2API文档的配置
 * Created by zhuzhongji on 2019/9/4.
 */
@Configuration
@EnableSwagger2
public class Swagger2Config {
    @Bean
    public Docket createRestApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.caixin.data.middle.etl.kettle.admin.controller"))
                .paths(PathSelectors.any())
                .build()
                /*.securitySchemes(securitySchemes())
                .securityContexts(securityContexts())*/;
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("user后台系统")
                .description("user后台模块")
                .contact("zhuzhongji")
                .version("1.0")
                .build();
    }

//    private List<ApiKey> securitySchemes() {
//        //设置请求头信息
//        List<ApiKey> result = new ArrayList<>();
//        ApiKey apiKey = new ApiKey("Authorization", "Authorization", "header");
//        result.add(apiKey);
//        return result;
//    }

//    private List<SecurityContext> securityContexts() {
//        //设置需要登录认证的路径
//        List<SecurityContext> result = new ArrayList<>();
//        result.add(getContextByPath("/brand/.*"));
//        result.add(getContextByPath("/product/.*"));
//        result.add(getContextByPath("/productCategory/.*"));
//        return result;
//    }

//    private SecurityContext getContextByPath(String pathRegex){
//        return SecurityContext.builder()
//                .securityReferences(defaultAuth())
//                .forPaths(PathSelectors.regex(pathRegex))
//                .build();
//    }

//    private List<SecurityReference> defaultAuth() {
//        List<SecurityReference> result = new ArrayList<>();
//        AuthorizationScope authorizationScope = new AuthorizationScope("global", "accessEverything");
//        AuthorizationScope[] authorizationScopes = new AuthorizationScope[1];
//        authorizationScopes[0] = authorizationScope;
//        result.add(new SecurityReference("Authorization", authorizationScopes));
//        return result;
//    }
}
