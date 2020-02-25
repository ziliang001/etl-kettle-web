/**
 * Copyright (C), 2019-2020, **有限公司
 * FileName: MybatisGenerator
 * Author:   zhuzj29042
 * Date:     2020/2/6 21:44::39
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.caixin.data.middle.etl.kettle.mbg;

import com.caixin.framework.mybatis.generator.mbg.Generator;

/**
 * 〈一句话功能简述〉<br> 
 *  用于生产MBG的代码
 *
 * @author zhuzhongji
 * @create 2020/2/6 21:44:39
 * @since 1.0.0
 */
public class MybatisGenerator {
    public static void main(String[] args) throws Exception {
        Generator.generate("mysql");
    }
}