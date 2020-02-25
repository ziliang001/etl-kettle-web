/**
 * Copyright (C), 2019-2020, **有限公司
 * FileName: EtlKettleAdminApplication
 * Author:   zhuzj29042
 * Date:     2020/2/6 21:12::18
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.caixin.data.middle.etl.kettle.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * 〈一句话功能简述〉<br> 
 *
 *
 * @author zhuzhongji
 * @create 2020/2/6 21:12:18
 * @since 1.0.0
 */
@SpringBootApplication
//        (scanBasePackages = {"com.caixin.data.middle.etl.kettle.admin",
//                                            "com.caixin.data.middle.etl.kettle.ext",
//                                            "com.caixin.data.middle.etl.kettle.monitor"})
@ImportResource(locations={"classpath:container-task.xml"})
public class EtlKettleAdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(EtlKettleAdminApplication.class, args);
    }
}