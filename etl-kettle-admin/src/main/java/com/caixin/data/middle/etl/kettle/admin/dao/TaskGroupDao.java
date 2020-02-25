/**
 * Copyright (C), 2019-2020, **有限公司
 * FileName: TaskGroupDao
 * Author:   zhuzj29042
 * Date:     2020/2/10 17:28::20
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.caixin.data.middle.etl.kettle.admin.dao;

import com.caixin.data.middle.etl.kettle.admin.entity.JobEntity;
import com.caixin.data.middle.etl.kettle.admin.entity.TaskGroupAttributeEntity;
import com.caixin.data.middle.etl.kettle.admin.entity.TaskGroupEntity;
import com.caixin.data.middle.etl.kettle.admin.entity.TransformationEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 *
 *
 * @author zhuzhongji
 * @create 2020/2/10 17:28:20
 * @since 1.0.0
 */
//@Repository
@Mapper
public interface TaskGroupDao {
    public List<TaskGroupEntity> getAllTaskGroup(int start, int limit, String userGroupName, String taskGroupName, String createDate);

    public Integer getTotalCountTaskGroup(String userGroupName);

    public void addTaskGroup(TaskGroupEntity taskGroup);

    public void addTaskGroupAttribute(TaskGroupAttributeEntity taskGroupAttribute);

    public List<JobEntity> getAllJob(String userGroupName);

    public List<TransformationEntity> getAllTrans(String userGroupName);

    public List<TaskGroupEntity> getAllTaskGroupNoLimit();

    public void updateTaskGroup(TaskGroupEntity taskGroup);

    public void updateTaskGroupAttributes(String oldName, String newName);

    public void updateTaskNameforAttr(String oldName, String newName, String type, String dirName);

    public List<TaskGroupAttributeEntity> getTaskGroupAttributesByName(String name);

    public void deleteTaskGroupAttributesByName(String name);

    public void deleteTaskGroupByName(String name);

    public Integer isContainsTask(String taskName, String type, String groupName);

    public void deleteTaskGroupAttributesByTaskName(String taskName, String type);

    public List<TaskGroupAttributeEntity> getTaskGroupByTaskName(String taskName, String type);

    public TaskGroupEntity getTaskGroupById(Integer id);

    //修改用户组-任务组关系表中的任务组名
    public void updateTaskGroupForTaskRelation(String oldName, String newName);

    //删除用户组-任务组关系表中的某个任务组记录
    public void deleteUserTaskRelationByName(String taskGroupName);

    //查询当前用户组下的所有任务组
    public List<TaskGroupEntity> getTaskGroupByThisUser(String userGroupName);
}
