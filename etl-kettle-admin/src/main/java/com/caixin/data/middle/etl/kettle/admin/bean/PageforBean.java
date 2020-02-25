/**
 * Copyright (C), 2019-2020, **有限公司
 * FileName: PageforBean
 * Author:   zhuzj29042
 * Date:     2020/2/14 08:31::55
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.caixin.data.middle.etl.kettle.admin.bean;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 *
 *
 * @author zhuzhongji
 * @create 2020/2/14 08:31:55
 * @since 1.0.0
 */
public class PageforBean {
    private int totalProperty;//分页的总记录条数
    private List root;//对象集合,表示本次的查询结果

    public int getTotalProperty() {
        return totalProperty;
    }

    public List getRoot() {
        return root;
    }

    public void setTotalProperty(int totalProperty) {
        this.totalProperty = totalProperty;
    }

    public void setRoot(List root) {
        this.root = root;
    }
}