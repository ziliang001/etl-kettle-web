/**
 * Copyright (C), 2019-2020, **有限公司
 * FileName: RepositoryNode
 * Author:   zhuzj29042
 * Date:     2020/2/14 07:52::53
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.caixin.data.middle.etl.kettle.admin.bean;

import org.pentaho.di.repository.RepositoryObjectType;

/**
 * 〈一句话功能简述〉<br> 
 *
 *
 * @author zhuzhongji
 * @create 2020/2/14 07:52:53
 * @since 1.0.0
 */
public class RepositoryNode extends Ext3Node {

    public RepositoryNode(String text) {
        super(text);
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

    public static RepositoryNode initNode(String text, String path) {
        return initNode(text, path, null, false, false, null);
    }

    public static RepositoryNode initNode(String text, String path, RepositoryObjectType type) {
        if(RepositoryObjectType.TRANSFORMATION.equals(type))
            return initNode(text, path, "trans", true, false, type.getTypeDescription());
        else if(RepositoryObjectType.JOB.equals(type))
            return initNode(text, path, "job", true, false, type.getTypeDescription());
        return null;
    }

    public static RepositoryNode initNode(String text, String path, String iconCls, boolean leaf, boolean expanded, String type) {
        RepositoryNode node = new RepositoryNode(text);
        node.setPath(path);
        if(iconCls == null && !leaf)
            node.setIconCls("imageFolder");
        else
            node.setIconCls(iconCls);
        node.setLeaf(leaf);
        node.setExpanded(expanded);
        node.setType(type);
        return node;
    }

}
