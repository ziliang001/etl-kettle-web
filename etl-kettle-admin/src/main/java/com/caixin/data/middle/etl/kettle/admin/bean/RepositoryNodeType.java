/**
 * Copyright (C), 2019-2020, **有限公司
 * FileName: RepositoryNodeType
 * Author:   zhuzj29042
 * Date:     2020/2/14 14:50::42
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.caixin.data.middle.etl.kettle.admin.bean;

/**
 * 〈一句话功能简述〉<br> 
 *
 *
 * @author zhuzhongji
 * @create 2020/2/14 14:50:42
 * @since 1.0.0
 */
public class RepositoryNodeType {

    private static final int LOAD_TRANS = 0x0001;
    private static final int LOAD_JOB = 0x0002;

    public static boolean includeTrans(int loadElement) {
        return (loadElement & LOAD_TRANS) > 0;
    }

    public static boolean includeJob(int loadElement) {
        return (loadElement & LOAD_JOB) > 0;
    }

}