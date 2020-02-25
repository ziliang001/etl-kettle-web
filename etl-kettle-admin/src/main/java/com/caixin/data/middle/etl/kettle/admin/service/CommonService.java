/**
 * Copyright (C), 2019-2020, **有限公司
 * FileName: CommonService
 * Author:   zhuzj29042
 * Date:     2020/2/14 14:58::01
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.caixin.data.middle.etl.kettle.admin.service;

import com.caixin.data.middle.etl.kettle.admin.entity.DatabaseConnEntity;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 *
 *
 * @author zhuzhongji
 * @create 2020/2/14 14:58:01
 * @since 1.0.0
 */
public interface CommonService {
    public List<DatabaseConnEntity> getDatabases();

    public void deleteDatabaseConn(Integer id);
}