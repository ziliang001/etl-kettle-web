package com.caixin.data.middle.etl.kettle.admin.component;

import com.caixin.data.middle.etl.kettle.admin.annotation.TargetDataSource;
import com.caixin.data.middle.etl.kettle.admin.config.DynamicDataSource;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


/**
 * @Description:
 * @Auther: zhuzhongji
 * @Date: 2019/10/14 09:37
 */
@Slf4j
@Aspect
@Order(-1)
@Component
public class DynamicDataSourceAspect {

    @Pointcut("execution(* com.caixin.data.middle.etl.kettle.admin.service.*.*(..))")
    public void pointCut() {
    }

    /**
     * 执行方法前更换数据源
     * @param targetDataSource 动态数据源
     */
    @Before("@annotation(targetDataSource)")
    public void beforeSwitchDataSource(TargetDataSource targetDataSource) {
        log.info(String.format("设置数据源为  %s", targetDataSource.value()));
        DynamicDataSource.changeDataSource(targetDataSource.value());
    }

    /**
     * 执行方法后清除数据源设置
     *
     * @param joinPoint        切点
     * @param targetDataSource 动态数据源
     */
    @After("@annotation(targetDataSource)")
    public void afterSwitchDataSource(JoinPoint joinPoint, TargetDataSource targetDataSource) {
        log.info(String.format("当前数据源  %s  执行清理方法", targetDataSource.value()));
        DynamicDataSource.clearDataSource();
    }
}
