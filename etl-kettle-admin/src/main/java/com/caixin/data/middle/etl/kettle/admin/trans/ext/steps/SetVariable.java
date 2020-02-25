/**
 * Copyright (C), 2019-2020, **有限公司
 * FileName: SetVariable
 * Author:   zhuzj29042
 * Date:     2020/2/14 17:33::53
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
import org.pentaho.di.trans.steps.setvariable.SetVariableMeta;
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
 * @create 2020/2/14 17:33:53
 * @since 1.0.0
 */
@Component("SetVariable")
@Scope("prototype")
public class SetVariable extends AbstractStep {

    @Override
    public void decode(StepMetaInterface stepMetaInterface, mxCell cell, List<DatabaseMeta> databases, IMetaStore metaStore) throws Exception {
        SetVariableMeta setVariableMeta = (SetVariableMeta) stepMetaInterface;

        String fields = cell.getAttribute("fields");
        JSONArray jsonArray = JSONArray.fromObject(fields);
        String[] fieldName = new String[jsonArray.size()];
        String[] variableName = new String[jsonArray.size()];
        int[] variableType = new int[jsonArray.size()];
        String[] defaultValue = new String[jsonArray.size()];
        for(int i=0; i<jsonArray.size(); i++) {
            JSONObject jsonObject = jsonArray.getJSONObject(i);
            fieldName[i] = jsonObject.optString("field_name");
            variableName[i] = jsonObject.optString("variable_name");
            variableType[i] = SetVariableMeta.getVariableType(jsonObject.optString("variable_type"));
            defaultValue[i] = jsonObject.optString("default_value");
        }
        setVariableMeta.setFieldName(fieldName);
        setVariableMeta.setVariableName(variableName);
        setVariableMeta.setVariableType(variableType);
        setVariableMeta.setDefaultValue(defaultValue);
    }

    @Override
    public Element encode(StepMetaInterface stepMetaInterface) throws Exception {
        SetVariableMeta setVariableMeta = (SetVariableMeta) stepMetaInterface;
        Document doc = mxUtils.createDocument();
        Element e = doc.createElement(PropsUI.TRANS_STEP_NAME);

        JSONArray jsonArray = new JSONArray();
        String[] fieldName = setVariableMeta.getFieldName();
        if(fieldName != null) {
            for(int i=0; i<fieldName.length; i++) {
                JSONObject jsonObject = new JSONObject();
                jsonObject.put("field_name", fieldName[i]);
                jsonObject.put("variable_name", setVariableMeta.getVariableName()[i]);
                jsonObject.put("variable_type", SetVariableMeta.getVariableTypeCode(setVariableMeta.getVariableType()[i]));
                jsonObject.put("default_value", setVariableMeta.getDefaultValue()[i]);
                jsonArray.add(jsonObject);
            }
        }
        e.setAttribute("fields", jsonArray.toString());

        return e;
    }

}
