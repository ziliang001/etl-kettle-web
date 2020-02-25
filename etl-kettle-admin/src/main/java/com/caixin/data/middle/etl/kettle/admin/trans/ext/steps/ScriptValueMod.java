/**
 * Copyright (C), 2019-2020, **有限公司
 * FileName: ScriptValueMod
 * Author:   zhuzj29042
 * Date:     2020/2/14 17:31::52
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
import com.caixin.data.middle.etl.kettle.ext.util.StringEscapeHelper;
import com.mxgraph.model.mxCell;
import com.mxgraph.util.mxUtils;
import org.pentaho.di.core.Const;
import org.pentaho.di.core.database.DatabaseMeta;
import org.pentaho.di.core.row.ValueMeta;
import org.pentaho.di.trans.step.StepMetaInterface;
import org.pentaho.di.trans.steps.scriptvalues_mod.ScriptValuesMetaMod;
import org.pentaho.di.trans.steps.scriptvalues_mod.ScriptValuesScript;
import org.pentaho.metastore.api.IMetaStore;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 *
 *
 * @author zhuzhongji
 * @create 2020/2/14 17:31:52
 * @since 1.0.0
 */
@Component("ScriptValueMod")
@Scope("prototype")
public class ScriptValueMod extends AbstractStep {

    @Override
    public void decode(StepMetaInterface stepMetaInterface, mxCell cell, List<DatabaseMeta> databases, IMetaStore metaStore) throws Exception {
        ScriptValuesMetaMod scriptValuesMetaMod = (ScriptValuesMetaMod) stepMetaInterface;

        scriptValuesMetaMod.setCompatible("Y".equalsIgnoreCase(cell.getAttribute("compatible")));
        scriptValuesMetaMod.setOptimizationLevel(cell.getAttribute("optimizationLevel"));

        String str = cell.getAttribute("jsScripts");
        if(StringUtils.hasText(str)) {
            JSONArray jsonArray = JSONArray.fromObject(str);
            ScriptValuesScript[] jsScripts = new ScriptValuesScript[jsonArray.size()];
            for (int i = 0; i < jsonArray.size(); i++) {
                JSONObject jsonObject = jsonArray.getJSONObject(i);
                int iScriptType = jsonObject.optInt("type");
                String sScriptName = jsonObject.optString("name");
                String sScript = StringEscapeHelper.decode(jsonObject.optString("value"));

                jsScripts[i] = new ScriptValuesScript(iScriptType, sScriptName, sScript);
            }
            scriptValuesMetaMod.setJSScripts(jsScripts);
        }

        str = cell.getAttribute("fields");
        if(StringUtils.hasText(str)) {
            JSONArray jsonArray = JSONArray.fromObject(str);
            String[] fieldname = new String[jsonArray.size()];
            String[] rename = new String[jsonArray.size()];
            int[] type = new int[jsonArray.size()];
            int[] length = new int[jsonArray.size()];
            int[] precision = new int[jsonArray.size()];
            boolean[] replace = new boolean[jsonArray.size()];
            for (int i = 0; i < jsonArray.size(); i++) {
                JSONObject jsonObject = jsonArray.getJSONObject(i);
                fieldname[i] = jsonObject.optString("name");
                rename[i] = jsonObject.optString("rename");
                type[i] = ValueMeta.getType(jsonObject.optString("type"));
                length[i] = Const.toInt(jsonObject.optString("type"), -1);
                precision[i] = Const.toInt(jsonObject.optString("type"), -1);
                replace[i] = "Y".equalsIgnoreCase("replace");
            }

            scriptValuesMetaMod.setFieldname(fieldname);
            scriptValuesMetaMod.setRename(rename);
            scriptValuesMetaMod.setType(type);
            scriptValuesMetaMod.setLength(length);
            scriptValuesMetaMod.setPrecision(precision);
            scriptValuesMetaMod.setReplace(replace);
        }
    }

    @Override
    public Element encode(StepMetaInterface stepMetaInterface) throws Exception {
        ScriptValuesMetaMod scriptValuesMetaMod = (ScriptValuesMetaMod) stepMetaInterface;
        Document doc = mxUtils.createDocument();
        Element e = doc.createElement(PropsUI.TRANS_STEP_NAME);

        e.setAttribute("compatible", scriptValuesMetaMod.isCompatible() ? "Y" : "N");
        e.setAttribute("optimizationLevel", scriptValuesMetaMod.getOptimizationLevel());

        JSONArray jsonArray = new JSONArray();
        ScriptValuesScript[] jsScripts = scriptValuesMetaMod.getJSScripts();
        for(ScriptValuesScript script : jsScripts) {
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("name", script.getScriptName());
            jsonObject.put("type", script.getScriptType());
            jsonObject.put("value", StringEscapeHelper.encode( script.getScript() ));
            jsonArray.add(jsonObject);
        }
        e.setAttribute("jsScripts", jsonArray.toString());

        jsonArray = new JSONArray();
        String[] fieldName = scriptValuesMetaMod.getFieldname();
        if(fieldName != null) {
            for(int i=0; i<fieldName.length; i++) {
                JSONObject jsonObject = new JSONObject();
                jsonObject.put("name", fieldName[i]);
                jsonObject.put("rename", scriptValuesMetaMod.getRename()[i]);
                jsonObject.put("type", ValueMeta.getTypeDesc(scriptValuesMetaMod.getType()[i]));
                jsonObject.put("length", scriptValuesMetaMod.getLength()[i]);
                jsonObject.put("precision", scriptValuesMetaMod.getPrecision()[i]);
                jsonObject.put("replace", scriptValuesMetaMod.getReplace()[i] ? "Y" : "N");

                jsonArray.add(jsonObject);
            }
        }
        e.setAttribute("fields", jsonArray.toString());

        return e;
    }

}
