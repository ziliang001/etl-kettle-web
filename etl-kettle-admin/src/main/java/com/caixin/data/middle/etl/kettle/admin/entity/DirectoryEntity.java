/**
 * Copyright (C), 2019-2020, **有限公司
 * FileName: DirectoryEntity
 * Author:   zhuzj29042
 * Date:     2020/2/10 17:26::22
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.caixin.data.middle.etl.kettle.admin.entity;

/**
 * 〈一句话功能简述〉<br> 
 *  资源库存放的层级目录
 *
 * @author zhuzhongji
 * @create 2020/2/10 17:26:22
 * @since 1.0.0
 */
public class DirectoryEntity {
    private Integer directoryId;    //目录Id
    private Integer parentDirectoryId;  //该目录的直接父级目录的id
    private String directoryName;   //该目录的名称

    public Integer getDirectoryId() {
        return directoryId;
    }

    public Integer getParentDirectoryId() {
        return parentDirectoryId;
    }

    public String getDirectoryName() {
        return directoryName;
    }

    public void setDirectoryId(Integer directoryId) {
        this.directoryId = directoryId;
    }

    public void setParentDirectoryId(Integer parentDirectoryId) {
        this.parentDirectoryId = parentDirectoryId;
    }

    public void setDirectoryName(String directoryName) {
        this.directoryName = directoryName;
    }
}