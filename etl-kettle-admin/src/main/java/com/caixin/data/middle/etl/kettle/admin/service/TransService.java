/**
 * Copyright (C), 2019-2020, **有限公司
 * FileName: TransService
 * Author:   zhuzj29042
 * Date:     2020/2/12 07:30::25
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.caixin.data.middle.etl.kettle.admin.service;

import com.caixin.data.middle.etl.kettle.admin.entity.TransformationEntity;
import net.sf.json.JSONObject;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 *
 *
 * @author zhuzhongji
 * @create 2020/2/12 07:30:25
 * @since 1.0.0
 */
public interface TransService {
    public JSONObject findTrans(int start, int limit, String namme, String date, String userGroupName) throws Exception;

    public void deleteTransformation(String transPath,String flag) throws Exception;

    public void executeTransformation(String path,Integer slaveId) throws Exception;

    public List<TransformationEntity> getTransPath(List<TransformationEntity> items) throws Exception;

    public TransformationEntity getTransByName(String transName) throws Exception;

    public boolean updateTransName(String oldName,String newName);
}