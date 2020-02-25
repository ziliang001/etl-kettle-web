/**
 * Copyright (C), 2019-2020, **有限公司
 * FileName: HistoryLogService
 * Author:   zhuzj29042
 * Date:     2020/2/12 07:50::54
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.caixin.data.middle.etl.kettle.admin.service;

/**
 * 〈一句话功能简述〉<br> 
 *
 *
 * @author zhuzhongji
 * @create 2020/2/12 07:50:54
 * @since 1.0.0
 */
public interface HistoryLogService {
    public String getAllHistoryLog(int start,int limit,String statu,String type,String startDate,String taskName,String userGroupName) throws Exception;

    public String getExecutionTraceById(Integer id) throws Exception;

}