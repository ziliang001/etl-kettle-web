/**
 * Copyright (C), 2019-2020, **有限公司
 * FileName: RepositoryCheckNode
 * Author:   zhuzj29042
 * Date:     2020/2/14 07:42::52
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.caixin.data.middle.etl.kettle.admin.bean;

import org.pentaho.di.repository.RepositoryObjectType;

import java.util.ArrayList;
import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 *
 *
 * @author zhuzhongji
 * @create 2020/2/14 07:42:52
 * @since 1.0.0
 */
public class RepositoryCheckNode extends Ext3CheckableNode {

    public RepositoryCheckNode(String text) {
        super(text);
    }

    public RepositoryCheckNode(String text, boolean checked) {
        super(text);
        setChecked(checked);
    }

    private String path;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public static RepositoryCheckNode initNode(String text, String path) {
        return initNode(text, path, null, false, true, null, new ArrayList(0), true);
    }

    public static RepositoryCheckNode initNode(String text, String path, List children) {
        return initNode(text, path, null, false, false, null, children, false);
    }

    public static RepositoryCheckNode initNode(String text, String path, RepositoryObjectType type) {
        if(RepositoryObjectType.TRANSFORMATION.equals(type))
            return initNode(text, path, type, false);
        else if(RepositoryObjectType.JOB.equals(type))
            return initNode(text, path, type, false);
        return null;
    }

    public static RepositoryCheckNode initNode(String text, String path, RepositoryObjectType type, boolean checked) {
        if(RepositoryObjectType.TRANSFORMATION.equals(type))
            return initNode(text, path, "trans", true, false, type.getTypeDescription(), null, checked);
        else if(RepositoryObjectType.JOB.equals(type))
            return initNode(text, path, "job", true, false, type.getTypeDescription(), null, checked);
        return null;
    }

    public static RepositoryCheckNode initNode(String text, String path, String iconCls, boolean leaf, boolean expanded, String type, List children, boolean checked) {
        RepositoryCheckNode node = new RepositoryCheckNode(text);
        node.setPath(path);
        if(iconCls == null && !leaf)
            node.setIconCls("imageFolder");
        else
            node.setIconCls(iconCls);
        node.setLeaf(leaf);
        node.setExpanded(expanded);
        node.setType(type);
        node.setChildren(children);
        node.setChecked(checked);
        return node;
    }
}
