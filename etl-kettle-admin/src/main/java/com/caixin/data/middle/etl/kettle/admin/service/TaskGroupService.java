/**
 * Copyright (C), 2019-2020, **有限公司
 * FileName: TaskGroupService
 * Author:   zhuzj29042
 * Date:     2020/2/12 08:11::49
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.caixin.data.middle.etl.kettle.admin.service;

import com.caixin.data.middle.etl.kettle.admin.entity.TaskGroupAttributeEntity;
import com.caixin.data.middle.etl.kettle.admin.entity.TaskGroupEntity;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 *
 *
 * @author zhuzhongji
 * @create 2020/2/12 08:11:49
 * @since 1.0.0
 */
public interface TaskGroupService {
    //TODO 获取当前登录用户的所有任务组信息 分页形式    用户模块暂无
    public String getAllTaskGroupByLogin(int start,int limit,String userGroupName,String taskGroupName,String createDate) throws Exception;

    public void addTaskGroup(HttpServletRequest request) throws Exception;

    public String getAllTaskBeforeAdd(String userGroupName) throws Exception;

    public boolean decideGroupNameExist(String name) throws Exception;

    public void updateTaskGroup(TaskGroupEntity taskGroup) throws Exception;

    public String selectTaskGroupAttributesByName(String name) throws Exception;

    public void deleteTaskGroupAndAttributes(String name) throws Exception;

    public List<TaskGroupEntity> isContainsTask(String taskName, String type, String userGroupName) throws Exception;

    public void assignedTaskGroup(List<TaskGroupAttributeEntity> items, String taskName, String type) throws Exception;

    public String getAllTaskGroupNoPage() throws Exception;

    public List<TaskGroupEntity> AllTaskGroupBeforeAdd(String userGroupName) throws Exception;
}