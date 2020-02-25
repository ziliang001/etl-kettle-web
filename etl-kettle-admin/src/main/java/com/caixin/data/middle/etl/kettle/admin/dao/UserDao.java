/**
 * Copyright (C), 2019-2020, **有限公司
 * FileName: UserDao
 * Author:   zhuzj29042
 * Date:     2020/2/10 17:24::47
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.caixin.data.middle.etl.kettle.admin.dao;

import com.caixin.data.middle.etl.kettle.admin.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 *
 *
 * @author zhuzhongji
 * @create 2020/2/10 17:24:47
 * @since 1.0.0
 */
@Mapper
//@Repository
public interface UserDao {

    public List<UserEntity> getUserbyName(String name);

    public List<UserEntity> getUsersLimit(int start, int limit, String userGroupName, String username, Integer userType);

    public void updateUser(UserEntity user);

    public void deleteUser(Integer userId);

    public void addUser(UserEntity user);

    public Integer getUserCount(String userGroupName);

    public List<UserEntity> getAllUsers();

    public Integer selectMaxId();

    public List<UserEntity> getUsers(String userGroupName);

}
