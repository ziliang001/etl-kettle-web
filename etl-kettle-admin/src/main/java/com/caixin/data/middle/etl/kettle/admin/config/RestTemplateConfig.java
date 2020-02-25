package com.caixin.data.middle.etl.kettle.admin.config;

import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * RestTemplate的配置
 * Created by zhuzhongji on 2019/9/5.
 */
//@Configuration
public class RestTemplateConfig {
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
