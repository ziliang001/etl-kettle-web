/**
 * Copyright (C), 2019-2020, **有限公司
 * FileName: TargetDataSource
 * Author:   zhuzj29042
 * Date:     2020/2/7 08:01::44
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.caixin.data.middle.etl.kettle.admin.annotation;

import com.caixin.data.middle.etl.kettle.admin.config.DataSourceKey;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 〈一句话功能简述〉<br> 
 *
 *
 * @author zhuzhongji
 * @create 2020/2/7 08:01:44
 * @since 1.0.0
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface TargetDataSource {
    String value() default DataSourceKey.DATA_SOURCE_DS1;
}