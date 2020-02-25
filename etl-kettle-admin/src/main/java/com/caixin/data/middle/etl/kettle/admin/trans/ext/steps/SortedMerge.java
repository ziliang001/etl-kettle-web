/**
 * Copyright (C), 2019-2020, **有限公司
 * FileName: SortedMerge
 * Author:   zhuzj29042
 * Date:     2020/2/14 17:34::29
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.caixin.data.middle.etl.kettle.admin.trans.ext.steps;

import com.caixin.data.middle.etl.kettle.admin.trans.ext.step.AbstractStep;
import com.caixin.data.middle.etl.kettle.ext.core.PropsUI;
import com.caixin.data.middle.etl.kettle.ext.util.JSONArray;
import com.caixin.data.middle.etl.kettle.ext.util.JSONObject;
import com.mxgraph.model.mxCell;
import com.mxgraph.util.mxUtils;
import org.pentaho.di.core.database.DatabaseMeta;
import org.pentaho.di.trans.step.StepMetaInterface;
import org.pentaho.di.trans.steps.sortedmerge.SortedMergeMeta;
import org.pentaho.metastore.api.IMetaStore;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 *
 *
 * @author zhuzhongji
 * @create 2020/2/14 17:34:29
 * @since 1.0.0
 */
@Component("SortedMerge")
@Scope("prototype")
public class SortedMerge extends AbstractStep {

    @Override
    public void decode(StepMetaInterface stepMetaInterface, mxCell cell, List<DatabaseMeta> databases, IMetaStore metaStore) throws Exception {
        SortedMergeMeta sortedMergeMeta = (SortedMergeMeta) stepMetaInterface;

        String fields = cell.getAttribute("fields");
        JSONArray jsonArray = JSONArray.fromObject(fields);
        String[] fieldName = new String[jsonArray.size()];
        boolean[] ascending = new boolean[jsonArray.size()];
        for(int i=0; i<jsonArray.size(); i++) {
            JSONObject jsonObject = jsonArray.getJSONObject(i);
            fieldName[i] = jsonObject.optString("name");
            ascending[i] = "Y".equalsIgnoreCase("ascending");
        }

        sortedMergeMeta.setFieldName(fieldName);
        sortedMergeMeta.setAscending(ascending);
    }

    @Override
    public Element encode(StepMetaInterface stepMetaInterface) throws Exception {
        Document doc = mxUtils.createDocument();
        Element e = doc.createElement(PropsUI.TRANS_STEP_NAME);
        SortedMergeMeta sortedMergeMeta = (SortedMergeMeta) stepMetaInterface;

        JSONArray jsonArray = new JSONArray();
        String[] fieldName = sortedMergeMeta.getFieldName();
        boolean[] ascending = sortedMergeMeta.getAscending();
        for(int j=0; j<fieldName.length; j++) {
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("name", fieldName[j]);
            jsonObject.put("ascending", ascending[j] ? "Y" : "N");
            jsonArray.add(jsonObject);
        }
        e.setAttribute("fields", jsonArray.toString());

        return e;
    }

}

