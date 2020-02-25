/**
 * Copyright (C), 2019-2020, **有限公司
 * FileName: HadoopService
 * Author:   zhuzj29042
 * Date:     2020/2/14 15:08::38
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.caixin.data.middle.etl.kettle.admin.service;

import org.pentaho.big.data.impl.cluster.NamedClusterImpl;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 *
 *
 * @author zhuzhongji
 * @create 2020/2/14 15:08:38
 * @since 1.0.0
 */
public interface HadoopService {
    public String addHadoopCluster(NamedClusterImpl cluster) throws Exception;

    public List<NamedClusterImpl> getAllCluster();

    public NamedClusterImpl getCluster(String name);

    public void deleteCluster(String clusterName);

    public Integer getEleIdByClusterName(String clusterName);

    public String updateHadoopCluster(HttpServletRequest request) throws Exception;
}
