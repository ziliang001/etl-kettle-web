/**
 * Copyright (C), 2019-2020, **有限公司
 * FileName: UserService
 * Author:   zhuzj29042
 * Date:     2020/2/11 17:06::51
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.caixin.data.middle.etl.kettle.admin.service;

import com.caixin.data.middle.etl.kettle.admin.entity.UserEntity;
import com.caixin.data.middle.etl.kettle.admin.entity.UserGroupAttributeEntity;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 *
 *
 * @author zhuzhongji
 * @create 2020/2/11 17:06:51
 * @since 1.0.0
 */
public interface UserService {
    public void deleteUser(Integer id, String username) throws Exception;

    public void updateUser(UserEntity user, UserGroupAttributeEntity attr) throws Exception;

    public  boolean addUser(UserEntity user, UserGroupAttributeEntity attribute) throws Exception;

    public String getUsersLimit(int start, int limit, HttpServletRequest request) throws Exception;

    public List<UserEntity> getUserByName(String login) throws Exception;

    public String login(String userName, String password, HttpServletRequest request) throws Exception;

    public void allotUserGroup(UserGroupAttributeEntity attr) throws Exception;

    public List<UserEntity> getUsers(String userGroupName) throws Exception;

    public void updatePassword(UserEntity user) throws Exception;
}