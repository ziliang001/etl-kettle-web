/**
 * Copyright (C), 2019-2020, **有限公司
 * FileName: PluginFactory
 * Author:   zhuzj29042
 * Date:     2020/2/10 17:38::29
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.caixin.data.middle.etl.kettle.ext;

import org.springframework.beans.BeansException;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * 〈一句话功能简述〉<br> 
 *
 *
 * @author zhuzhongji
 * @create 2020/2/10 17:38:29
 * @since 1.0.0
 */
public class PluginFactory implements ApplicationContextAware {
    private static ApplicationContext context = null;

    @Override
    public void setApplicationContext(ApplicationContext ctx) throws BeansException {
        context = ctx;
    }

    public static Object getBean(String beanId) {
        return context.getBean(beanId);
    }

    public static boolean containBean(String beanId) {
        return context.containsBean(beanId);
    }

}