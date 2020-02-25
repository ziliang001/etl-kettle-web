/**
 * Copyright (C), 2019-2020, **有限公司
 * FileName: MybatisDaoSuppo
 * Author:   zhuzj29042
 * Date:     2020/2/10 16:08::46
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.caixin.data.middle.etl.kettle.ext.task;

import org.apache.commons.dbcp.BasicDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.defaults.DefaultSqlSessionFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

/**
 * 〈一句话功能简述〉<br>
 *
 *
 * @author zhuzhongji
 * @create 2020/2/10 16:08:46
 * @since 1.0.0
 */
public class MybatisDaoSuppo implements ApplicationContextAware {
    @Autowired
    private SqlSessionFactory sqlSessionFactory;

    public static DefaultSqlSessionFactory sessionFactory;

    @Override
    public void setApplicationContext(ApplicationContext context) throws BeansException {
//        BasicDataSource dataSource=(BasicDataSource)context.getBean("dataSource");
//        sessionFactory=(DefaultSqlSessionFactory)context.getBean("sqlSessionFactory");
        sessionFactory=(DefaultSqlSessionFactory) sqlSessionFactory;
    }
}
