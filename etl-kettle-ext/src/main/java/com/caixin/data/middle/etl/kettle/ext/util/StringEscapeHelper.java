/**
 * Copyright (C), 2019-2020, **有限公司
 * FileName: StringEscapeHelper
 * Author:   zhuzj29042
 * Date:     2020/2/10 16:11::12
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.caixin.data.middle.etl.kettle.ext.util;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

/**
 * 〈一句话功能简述〉<br> 
 *
 *
 * @author zhuzhongji
 * @create 2020/2/10 16:11:12
 * @since 1.0.0
 */
public class StringEscapeHelper {

    public static String charset = "utf-8";

    public static String encode(String string) {
        if(string == null || string.length() == 0)
            return string;
        try {
            String tmp = URLEncoder.encode(string, charset);
            return tmp.replaceAll("\\+", "%20");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return string;
        }
    }

    public static String decode(String string) {
        if(string == null || string.length() == 0)
            return string;
        try {
            return URLDecoder.decode(string, charset);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return string;
        }
    }
}
