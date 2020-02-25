/**
 * Copyright (C), 2019-2020, **有限公司
 * FileName: TaskGroupEntity
 * Author:   zhuzj29042
 * Date:     2020/2/10 17:28::57
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.caixin.data.middle.etl.kettle.admin.entity;

import java.util.Date;

/**
 * 〈一句话功能简述〉<br> 
 *
 *
 * @author zhuzhongji
 * @create 2020/2/10 17:28:57
 * @since 1.0.0
 */
public class TaskGroupEntity {
    private Integer taskGroupId;
    private String taskGroupName;
    private String taskGroupDesc;
    private Date createDate;
    private String isContainsTask;  //标识是否包含某个任务  不参与数据的持久化

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getIsContainsTask() {
        return isContainsTask;
    }

    public void setIsContainsTask(String isContainsTask) {
        this.isContainsTask = isContainsTask;
    }

    public Integer getTaskGroupId() {
        return taskGroupId;
    }

    public String getTaskGroupName() {
        return taskGroupName;
    }

    public void setTaskGroupDesc(String taskGroupDesc) {
        this.taskGroupDesc = taskGroupDesc;
    }

    public String getTaskGroupDesc() {
        return taskGroupDesc;
    }

    public void setTaskGroupId(Integer taskGroupId) {
        this.taskGroupId = taskGroupId;
    }

    public void setTaskGroupName(String taskGroupName) {
        this.taskGroupName = taskGroupName;
    }

}
