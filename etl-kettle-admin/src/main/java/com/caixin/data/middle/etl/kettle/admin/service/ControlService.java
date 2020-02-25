/**
 * Copyright (C), 2019-2020, **有限公司
 * FileName: ControlService
 * Author:   zhuzj29042
 * Date:     2020/2/11 21:33::37
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.caixin.data.middle.etl.kettle.admin.service;

import com.caixin.data.middle.etl.kettle.admin.entity.TaskControlEntity;
import org.pentaho.di.trans.step.StepStatus;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 *
 *
 * @author zhuzhongji
 * @create 2020/2/11 21:33:37
 * @since 1.0.0
 */
public interface ControlService {
    public List<TaskControlEntity> getAllRunningJob(String userGroupName) throws Exception;

    public List<TaskControlEntity> getAllRunningTrans(String userGroupName) throws Exception;

    public String getLogDetailForJob(String id,String hostName) throws Exception;

    public String getLogDetailForTrans(String id,String hostName) throws Exception;

    public List<StepStatus> getTransDetail(String id, String hostName) throws Exception;

    public void stopTrans(String hostName,String id) throws Exception;

    public void stopJob(String hostName,String id) throws Exception;

    public void pauseOrStartTrans(String[] id,String[] hostName) throws Exception;
}