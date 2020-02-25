/**
 * Copyright (C), 2019-2020, **有限公司
 * FileName: DirectoryDao
 * Author:   zhuzj29042
 * Date:     2020/2/10 17:25::48
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.caixin.data.middle.etl.kettle.admin.dao;

import com.caixin.data.middle.etl.kettle.admin.entity.DirectoryEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 〈一句话功能简述〉<br> 
 *
 *
 * @author zhuzhongji
 * @create 2020/2/10 17:25:48
 * @since 1.0.0
 */
@Mapper
//@Repository
public interface DirectoryDao {
    public DirectoryEntity getDirectoryById(Integer id);
}