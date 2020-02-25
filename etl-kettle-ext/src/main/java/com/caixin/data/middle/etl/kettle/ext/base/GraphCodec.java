/**
 * Copyright (C), 2019-2020, **有限公司
 * FileName: GraphCodec
 * Author:   zhuzj29042
 * Date:     2020/2/10 17:39::32
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.caixin.data.middle.etl.kettle.ext.base;

import org.pentaho.di.base.AbstractMeta;

/**
 * 〈一句话功能简述〉<br> 
 *
 *
 * @author zhuzhongji
 * @create 2020/2/10 17:39:32
 * @since 1.0.0
 */
public interface GraphCodec {

    public String encode(AbstractMeta meta) throws Exception;
    public AbstractMeta decode(String graphXml) throws Exception;

    public static final String TRANS_CODEC = "TransGraph";
    public static final String JOB_CODEC = "JobGraph";

}