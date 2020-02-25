/**
 * Copyright (C), 2019-2020, **有限公司
 * FileName: JobEntryEncoder
 * Author:   zhuzj29042
 * Date:     2020/2/14 16:32::23
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.caixin.data.middle.etl.kettle.ext.job.step;

import org.pentaho.di.job.entry.JobEntryCopy;
import org.w3c.dom.Element;

/**
 * 〈一句话功能简述〉<br> 
 *
 *
 * @author zhuzhongji
 * @create 2020/2/14 16:32:23
 * @since 1.0.0
 */
public interface JobEntryEncoder {

    public Element encodeStep(JobEntryCopy jobEntry) throws Exception;

}
