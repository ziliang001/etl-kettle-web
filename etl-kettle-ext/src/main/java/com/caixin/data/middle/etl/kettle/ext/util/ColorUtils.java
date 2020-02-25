/**
 * Copyright (C), 2019-2020, **有限公司
 * FileName: ColorUtils
 * Author:   zhuzj29042
 * Date:     2020/2/13 17:38::29
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.caixin.data.middle.etl.kettle.ext.util;

/**
 * 〈一句话功能简述〉<br> 
 *
 *
 * @author zhuzhongji
 * @create 2020/2/13 17:38:29
 * @since 1.0.0
 */
public class ColorUtils {

    public static String toHex(int r, int g, int b) {
        String R = Integer.toHexString(r);
        R = R.length() < 2 ? ('0' + R) : R;
        String B = Integer.toHexString(g);
        B = B.length() < 2 ? ('0' + B) : B;
        String G = Integer.toHexString(b);
        G = G.length() < 2 ? ('0' + G) : G;
        return '#' + R + B + G;
    }
}