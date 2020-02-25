/**
 * Copyright (C), 2019-2020, **有限公司
 * FileName: ExceptionUtils
 * Author:   zhuzj29042
 * Date:     2020/2/10 16:10::29
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.caixin.data.middle.etl.kettle.ext.util;

import java.io.PrintWriter;
import java.io.StringWriter;

/**
 * 〈一句话功能简述〉<br> 
 *
 *
 * @author zhuzhongji
 * @create 2020/2/10 16:10:29
 * @since 1.0.0
 */
public class ExceptionUtils {

    public static String toString(Exception e) {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        e.printStackTrace(pw);
        return sw.toString();
    }

}