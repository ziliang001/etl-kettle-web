/**
 * Copyright (C), 2019-2020, **有限公司
 * FileName: Ext3CheckableNode
 * Author:   zhuzj29042
 * Date:     2020/2/14 07:43::27
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.caixin.data.middle.etl.kettle.admin.bean;

import java.util.ArrayList;
import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 *
 *
 * @author zhuzhongji
 * @create 2020/2/14 07:43:27
 * @since 1.0.0
 */
public class Ext3CheckableNode extends Ext3Node {

    private boolean checked = false;
    private List children = new ArrayList(0);

    public Ext3CheckableNode(String text) {
        super(text);
    }

    public Ext3CheckableNode(String id, String text) {
        super(id, text);
    }

    public boolean getChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    public List getChildren() {
        return children;
    }

    public void setChildren(List children) {
        this.children = children;
    }

}
