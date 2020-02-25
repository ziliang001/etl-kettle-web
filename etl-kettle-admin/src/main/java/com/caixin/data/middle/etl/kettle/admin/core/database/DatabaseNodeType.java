/**
 * Copyright (C), 2019-2020, **有限公司
 * FileName: DatabaseNodeType
 * Author:   zhuzj29042
 * Date:     2020/2/11 21:22::40
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.caixin.data.middle.etl.kettle.admin.core.database;

/**
 * 〈一句话功能简述〉<br> 
 *
 *
 * @author zhuzhongji
 * @create 2020/2/11 21:22:40
 * @since 1.0.0
 */
public class DatabaseNodeType {

    private static final int SCHEMA = 0x0001;
    private static final int TABLE = 0x0002;
    private static final int VIEW = 0x0004;
    private static final int SYNONYM = 0x0008;

    public static boolean includeSchema(int type) {
        return (type & SCHEMA) > 0;
    }

    public static boolean includeTable(int type) {
        return (type & TABLE) > 0;
    }

    public static boolean includeView(int type) {
        return (type & VIEW) > 0;
    }

    public static boolean includeSynonym(int type) {
        return (type & SYNONYM) > 0;
    }
}