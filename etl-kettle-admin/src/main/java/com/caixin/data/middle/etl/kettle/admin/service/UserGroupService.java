/**
 * Copyright (C), 2019-2020, **有限公司
 * FileName: UserGroupService
 * Author:   zhuzj29042
 * Date:     2020/2/12 08:04::33
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.caixin.data.middle.etl.kettle.admin.service;

import com.caixin.data.middle.etl.kettle.admin.entity.UserGroupEntity;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 *
 *
 * @author zhuzhongji
 * @create 2020/2/12 08:04:33
 * @since 1.0.0
 */
public interface UserGroupService {
    public String getUserGroupByPage(int start,int limit,String userGroupName) throws Exception;

    public String decideGroupNameExist(String name) throws Exception;

    public void addUserGroup(String[] taskGroupNameArray,String[] slaveIdArray,String userGroupName,String userGroupDesc) throws Exception;

    public String[] beforeAssignedTaskGroup(String userGroupName) throws Exception;

    public String[] beforeAssignedSlave(String userGroupName) throws Exception;

    public void assignedSlave(String[] slaveIdArray,String userGroupName) throws Exception;

    public void assignedTaskGroup(String[] taskGroupNameArray,String userGroupName) throws Exception;

    public String updateUserGroup(Integer userGroupId,String userGroupName,String userGroupDesc) throws Exception;

    public void deleteUserGroup(String userGroupName) throws Exception;

    public List<UserGroupEntity> getAllUserGroup() throws Exception;

}