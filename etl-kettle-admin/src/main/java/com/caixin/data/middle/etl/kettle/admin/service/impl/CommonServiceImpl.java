/**
 * Copyright (C), 2019-2020, **有限公司
 * FileName: CommonServiceImpl
 * Author:   zhuzj29042
 * Date:     2020/2/14 14:59::46
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.caixin.data.middle.etl.kettle.admin.service.impl;

import com.caixin.data.middle.etl.kettle.admin.dao.CommonDao;
import com.caixin.data.middle.etl.kettle.admin.service.CommonService;
import com.caixin.data.middle.etl.kettle.admin.entity.DatabaseConnEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 *
 *
 * @author zhuzhongji
 * @create 2020/2/14 14:59:46
 * @since 1.0.0
 */
@Service
public class CommonServiceImpl implements CommonService {
    @Autowired
    protected CommonDao cDao;

    @Override
    public List<DatabaseConnEntity> getDatabases() {
        return cDao.getDababasesConn();
    }

    @Override
    public void deleteDatabaseConn(Integer id) {
        cDao.deleteDatabaseAttr(id);
        cDao.deleteDatabaseMeta(id);
        cDao.deleteJobDatabase(id);
        cDao.deleteTransDatabase(id);
    }
}