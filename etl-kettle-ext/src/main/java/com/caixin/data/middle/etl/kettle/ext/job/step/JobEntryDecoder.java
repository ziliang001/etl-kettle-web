/**
 * Copyright (C), 2019-2020, **有限公司
 * FileName: JobEntryDecoder
 * Author:   zhuzj29042
 * Date:     2020/2/14 16:32::05
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.caixin.data.middle.etl.kettle.ext.job.step;

import com.mxgraph.model.mxCell;
import org.pentaho.di.core.database.DatabaseMeta;
import org.pentaho.di.job.entry.JobEntryCopy;
import org.pentaho.metastore.api.IMetaStore;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 *
 *
 * @author zhuzhongji
 * @create 2020/2/14 16:32:05
 * @since 1.0.0
 */
public interface JobEntryDecoder {

    public JobEntryCopy decodeStep(mxCell cell, List<DatabaseMeta> databases, IMetaStore metaStore) throws Exception;

}