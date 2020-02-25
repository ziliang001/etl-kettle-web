/**
 * Copyright (C), 2019-2020, **有限公司
 * FileName: Flattener
 * Author:   zhuzj29042
 * Date:     2020/2/14 17:18::15
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
import org.pentaho.di.trans.steps.flattener.FlattenerMeta;
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
 * @create 2020/2/14 17:18:15
 * @since 1.0.0
 */
@Component("Flattener")
@Scope("prototype")
public class Flattener extends AbstractStep {

    @Override
    public void decode(StepMetaInterface stepMetaInterface, mxCell cell, List<DatabaseMeta> databases, IMetaStore metaStore) throws Exception {
        FlattenerMeta flattenerMeta = (FlattenerMeta) stepMetaInterface;

        flattenerMeta.setFieldName(cell.getAttribute("field_name"));
        String fields = cell.getAttribute("fields");
        JSONArray jsonArray = JSONArray.fromObject(fields);
        String[] targetField = new String[jsonArray.size()];
        for(int i=0; i<jsonArray.size(); i++) {
            JSONObject jsonObject = jsonArray.getJSONObject(i);
            targetField[i] = jsonObject.optString("name");
        }
        flattenerMeta.setTargetField(targetField);
    }

    @Override
    public Element encode(StepMetaInterface stepMetaInterface) throws Exception {
        Document doc = mxUtils.createDocument();
        Element e = doc.createElement(PropsUI.TRANS_STEP_NAME);
        FlattenerMeta  flattenerMeta = (FlattenerMeta) stepMetaInterface;

        e.setAttribute("field_name", flattenerMeta.getFieldName());
        JSONArray jsonArray = new JSONArray();
        String[] targetField = flattenerMeta.getTargetField();
        for(int j=0; j<targetField.length; j++) {
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("name", targetField[j]);
            jsonArray.add(jsonObject);
        }
        e.setAttribute("fields", jsonArray.toString());

        return e;
    }

}

