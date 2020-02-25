/**
 * Copyright (C), 2019-2020, **有限公司
 * FileName: CommonDao
 * Author:   zhuzj29042
 * Date:     2020/2/14 15:00::31
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.caixin.data.middle.etl.kettle.admin.dao;

import com.caixin.data.middle.etl.kettle.admin.entity.DatabaseConnEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 *
 *
 * @author zhuzhongji
 * @create 2020/2/14 15:00:31
 * @since 1.0.0
 */
@Mapper
public interface CommonDao {
    public List<DatabaseConnEntity> getDababasesConn();

    public void deleteDatabaseAttr(Integer id);

    public void deleteDatabaseMeta(Integer id);

    public void deleteJobDatabase(Integer id);

    public void deleteTransDatabase(Integer id);
}