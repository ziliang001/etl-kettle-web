/**
 * Copyright (C), 2019-2020, **有限公司
 * FileName: TransDao
 * Author:   zhuzj29042
 * Date:     2020/2/12 07:33::06
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.caixin.data.middle.etl.kettle.admin.dao;

import com.caixin.data.middle.etl.kettle.admin.entity.TransformationEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 *
 *
 * @author zhuzhongji
 * @create 2020/2/12 07:33:06
 * @since 1.0.0
 */
@Mapper
//@Repository
public interface TransDao {
    public List<TransformationEntity> getThisPageTrans(int start,int limit,String userGroupName); //获取当页的记录

    public Integer getTotalSize(String userGroupName);  //获取总记录数

    public List<TransformationEntity> conditionFindTrans(int start,int limit,String namme,String date,String userGroupName);//带条件的查询

    public Integer conditionFindTransCount(String name,String date,String userGroupName);//带条件查询总记录数u

    public TransformationEntity getTransByName(String transName);

    public void updateTransNameforTrans(String oldName,String newName);

}