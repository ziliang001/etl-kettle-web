/**
 * Copyright (C), 2019-2020, **有限公司
 * FileName: DatabaseNode
 * Author:   zhuzj29042
 * Date:     2020/2/11 21:21::21
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
 * @create 2020/2/11 21:21:21
 * @since 1.0.0
 */
public class DatabaseNode extends Ext3Node {

    public DatabaseNode(String text) {
        super(text);
    }

    private String nodeId;

    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    private String schema;

    public String getSchema() {
        return schema;
    }

    public void setSchema(String schema) {
        this.schema = schema;
    }

    public static DatabaseNode initNode(String text, String nodeId) {
        return initNode(text, nodeId, false);
    }

    public static DatabaseNode initNode(String text, String nodeId, String iconCls) {
        return initNode(text, iconCls, nodeId, true);
    }

    public static DatabaseNode initNode(String text, String nodeId, String iconCls, boolean leaf) {
        return initNode(text, iconCls, nodeId, leaf, false);
    }

    public static DatabaseNode initNode(String text, String nodeId, boolean expanded) {
        return initNode(text, null, nodeId, false, expanded);
    }

    public static DatabaseNode initNode(String text, String iconCls, String nodeId, boolean leaf, boolean expanded) {
        DatabaseNode node = new DatabaseNode(text);
        node.setLeaf(leaf);
        if(iconCls == null && !leaf)
            node.setIconCls("imageFolder");
        else
            node.setIconCls(iconCls);
        node.setExpanded(expanded);
        node.setNodeId(nodeId);
        return node;
    }

}
