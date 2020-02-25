/**
 * Copyright (C), 2019-2020, **有限公司
 * FileName: ExecutionTraceDao
 * Author:   zhuzj29042
 * Date:     2020/2/12 07:53::01
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.caixin.data.middle.etl.kettle.admin.dao;

import com.caixin.data.middle.etl.kettle.ext.task.ExecutionTraceEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 *
 *
 * @author zhuzhongji
 * @create 2020/2/12 07:53:01
 * @since 1.0.0
 */
@Mapper
//@Repository("taskExecutionTraceDao")
public interface ExecutionTraceDao {
    public void addExecutionTrace(ExecutionTraceEntity trace);

    public List<ExecutionTraceEntity> getAllLogByPage(int start, int limit, String statu, String type, String startDate, String taskName, String userGroupName);

    public Integer getAllLogCount(String statu, String type, String startDate, String taskName, String userGroupName);

    public ExecutionTraceEntity getTraceById(Integer id);
}