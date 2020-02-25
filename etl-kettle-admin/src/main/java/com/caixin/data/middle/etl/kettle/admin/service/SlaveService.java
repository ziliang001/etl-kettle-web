/**
 * Copyright (C), 2019-2020, **有限公司
 * FileName: SlaveService
 * Author:   zhuzj29042
 * Date:     2020/2/11 21:50::03
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.caixin.data.middle.etl.kettle.admin.service;

//import com.caixin.data.middle.etl.kettle.monitor.bean.PageforBean;
import com.caixin.data.middle.etl.kettle.admin.bean.PageforBean;
import com.caixin.data.middle.etl.kettle.admin.entity.SlaveEntity;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 *
 *
 * @author zhuzhongji
 * @create 2020/2/11 21:50:03
 * @since 1.0.0
 */
public interface SlaveService {
    public Integer getAllSlaveSize();

    public List<SlaveEntity> getAllSlave(String userGroupName) throws Exception;

    public SlaveEntity getSlaveByLoadAvg(List<SlaveEntity> slaves) throws Exception;

    public PageforBean findSlaveByPageInfo(Integer start, Integer limit, String userGroupName) throws Exception;

    public void deleteSlave(Integer slaveId) throws Exception;

    public String slaveTest(String hostName) throws Exception;

    public String allSlaveQuato(String userGroupName) throws Exception;

    public String slaveQuatoByCondition(String quatoType,String viewType,String maxOrAvg,String chooseDate,String userGroupName) throws Exception;

    public String slaveQuatoLineChart(String quatoType,String maxOrAvg,String chooseDate,String userGroupName) throws Exception;

    public String slaveQuatoColumnDiagram(String quatoType,String maxOrAvg,String chooseDate,String userGroupName) throws Exception;

    public String slaveQuatoHTMLText(String quatoType,String maxOrAvg,String chooseDate,String userGroupName) throws Exception;

    public String addSlave(HttpServletRequest request) throws Exception;

    public SlaveEntity getSlaveByHostName(Integer id) throws Exception;

    public String updateSlave(HttpServletRequest request) throws Exception;
}
