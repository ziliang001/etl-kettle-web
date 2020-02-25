/**
 * Copyright (C), 2019-2020, **有限公司
 * FileName: Denormaliser
 * Author:   zhuzj29042
 * Date:     2020/2/14 17:12::58
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
import org.pentaho.di.core.Const;
import org.pentaho.di.core.database.DatabaseMeta;
import org.pentaho.di.trans.step.StepMetaInterface;
import org.pentaho.di.trans.steps.denormaliser.DenormaliserMeta;
import org.pentaho.di.trans.steps.denormaliser.DenormaliserTargetField;
import org.pentaho.metastore.api.IMetaStore;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 *  列转行
 *
 * @author zhuzhongji
 * @create 2020/2/14 17:12:58
 * @since 1.0.0
 */
@Component("Denormaliser")
@Scope("prototype")
public class Denormaliser extends AbstractStep {
    @Override
    public void decode(StepMetaInterface stepMetaInterface, mxCell cell, List<DatabaseMeta> databases, IMetaStore metaStore) throws Exception {
        DenormaliserMeta denor=(DenormaliserMeta)stepMetaInterface;
        denor.setKeyField(cell.getAttribute("key_field"));
        String group=cell.getAttribute("group");
        String fields=cell.getAttribute("fields");
        JSONArray groupJSONArray= JSONArray.fromObject(group);
        JSONArray fieldsJSONArray=JSONArray.fromObject(fields);

        if(groupJSONArray.size()>0){
            String[] groupField=new String[groupJSONArray.size()];
            for(int i=0;i<groupJSONArray.size();i++){
                JSONObject jsonObject = groupJSONArray.getJSONObject(i);
                groupField[i]=jsonObject.optString("name");
            }
            denor.setGroupField(groupField);
        }

        if(fieldsJSONArray.size()>0){
            DenormaliserTargetField[] denormaliserTargetField=new DenormaliserTargetField[fieldsJSONArray.size()];
            for(int j=0;j<fieldsJSONArray.size();j++){
                DenormaliserTargetField dtf=new DenormaliserTargetField();
                JSONObject jsonOBJ=fieldsJSONArray.getJSONObject(j);
                dtf.setFieldName(jsonOBJ.optString("field_name"));
                dtf.setKeyValue(jsonOBJ.optString("key_value"));

                dtf.setKeyValue(jsonOBJ.optString("key_value"));
                dtf.setTargetName(jsonOBJ.optString("target_name"));
                dtf.setTargetType(jsonOBJ.optString("target_type"));
                dtf.setTargetFormat(jsonOBJ.optString("target_format"));
                dtf.setTargetLength(Const.toInt(jsonOBJ.optString("target_length"), -1));
                dtf.setTargetPrecision(Const.toInt(jsonOBJ.optString("target_precision"), -1));
                dtf.setTargetDecimalSymbol(jsonOBJ.optString("target_decimal_symbol"));
                dtf.setTargetGroupingSymbol(jsonOBJ.optString("target_grouping_symbol"));
                dtf.setTargetCurrencySymbol(jsonOBJ.optString("target_currency_symbol"));
                dtf.setTargetNullString(jsonOBJ.optString("target_null_string"));
                dtf.setTargetAggregationType(jsonOBJ.optString("target_aggregation_type"));

                denormaliserTargetField[j]=dtf;
            }
            denor.setDenormaliserTargetField(denormaliserTargetField);
        }
    }

    @Override
    public Element encode(StepMetaInterface stepMetaInterface) throws Exception {
        DenormaliserMeta denor=(DenormaliserMeta)stepMetaInterface;
        Document doc = mxUtils.createDocument();
        Element e = doc.createElement(PropsUI.TRANS_STEP_NAME);
        e.setAttribute("key_field",denor.getKeyField());
        JSONArray jsonArray1=new JSONArray();
        for(int i=0;i<denor.getGroupField().length;i++){
            JSONObject jsonObj=new JSONObject();
            jsonObj.put("name",denor.getGroupField()[i]);
            jsonArray1.add(jsonObj);
        }
        e.setAttribute("group",jsonArray1.toString());

        JSONArray jsonArray2=new JSONArray();
        for(int j=0;j<denor.getDenormaliserTargetField().length;j++){
            DenormaliserTargetField field = denor.getDenormaliserTargetField()[j];
            JSONObject jsonOBJ=new JSONObject();
            jsonOBJ.put("field_name",field.getFieldName());
            jsonOBJ.put("key_value",field.getKeyValue());
            jsonOBJ.put("target_name",field.getTargetName());
            jsonOBJ.put("target_type",field.getTargetTypeDesc());
            jsonOBJ.put("target_format",field.getTargetFormat());
            jsonOBJ.put("target_length",field.getTargetLength());
            jsonOBJ.put("target_precision",field.getTargetPrecision());
            jsonOBJ.put("target_decimal_symbol",field.getTargetDecimalSymbol());
            jsonOBJ.put("target_grouping_symbol",field.getTargetGroupingSymbol());
            jsonOBJ.put("target_currency_symbol",field.getTargetCurrencySymbol());
            jsonOBJ.put("target_null_string",field.getTargetNullString());
            jsonOBJ.put("target_aggregation_type",field.getTargetAggregationTypeDesc());
            jsonArray2.add(jsonOBJ);
        }
        e.setAttribute("fields",jsonArray2.toString());

        return e;
    }
}
