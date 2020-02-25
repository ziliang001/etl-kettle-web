/**
 * Copyright (C), 2019-2020, **有限公司
 * FileName: SlaveDao
 * Author:   zhuzj29042
 * Date:     2020/2/10 17:25::19
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.caixin.data.middle.etl.kettle.admin.dao;

import com.caixin.data.middle.etl.kettle.admin.entity.SlaveEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 *
 *
 * @author zhuzhongji
 * @create 2020/2/10 17:25:19
 * @since 1.0.0
 */
@Mapper
//@Repository
public interface SlaveDao {

    public Integer getSlaveTotalCount();

    public SlaveEntity getSlaveById(Integer id);

    public List<SlaveEntity> getAllSlave(String userGroupName);

    public SlaveEntity getSlaveByHostName(String hostName);

    public List<SlaveEntity> findSlaveByPageInfo(Integer start, Integer limit, String userGroupName);

    public void addSlave(SlaveEntity slave);

    public Integer selectMaxId();

    public void deleteTransSlave(Integer slaveId);

    public void deleteSlaveUserGroup(Integer slaveId);

    public void deleteSlaveServer(Integer slaveId);

    public void updateSlaveServer(SlaveEntity slave);
}
