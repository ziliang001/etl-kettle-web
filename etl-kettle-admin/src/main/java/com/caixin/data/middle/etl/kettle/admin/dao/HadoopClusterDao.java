/**
 * Copyright (C), 2019-2020, **有限公司
 * FileName: HadoopClusterDao
 * Author:   zhuzj29042
 * Date:     2020/2/14 15:05::44
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.caixin.data.middle.etl.kettle.admin.dao;

import com.caixin.data.middle.etl.kettle.admin.entity.SlaveEntity;
import org.apache.ibatis.annotations.Mapper;
import org.pentaho.big.data.impl.cluster.NamedClusterImpl;

import java.util.List;
import java.util.Map;

/**
 * 〈一句话功能简述〉<br> 
 *
 *
 * @author zhuzhongji
 * @create 2020/2/14 15:05:44
 * @since 1.0.0
 */
@Mapper
public interface HadoopClusterDao {
    public void addCluster(Integer attrId,Integer elementId,Integer attrParId,String attrKey,String attrValue);

    public List<NamedClusterImpl> allCluster();

    public NamedClusterImpl getClusterByName(String clusterName);

    public List<SlaveEntity> getClusters();

    public void addClusterEle(Map<String,Object> map);

    public Integer getNextId(String tableName,String field);

    public void deleteEle(Integer elementId);

    public void deleteEleAttr(Integer elementId);

    public Integer getEleIdByClusterName(String clusterName);

    public void updateEle(Map<String,Object> element);

    public void updateEleAttr(Map<String,Object> eleAttr);
}
