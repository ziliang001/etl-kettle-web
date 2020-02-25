/**
 * Copyright (C), 2019-2020, **有限公司
 * FileName: ValueMapper
 * Author:   zhuzj29042
 * Date:     2020/2/14 17:41::52
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
import org.pentaho.di.trans.steps.valuemapper.ValueMapperMeta;
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
 * @create 2020/2/14 17:41:52
 * @since 1.0.0
 */
@Component("ValueMapper")
@Scope("prototype")
public class ValueMapper extends AbstractStep {

    @Override
    public void decode(StepMetaInterface stepMetaInterface, mxCell cell, List<DatabaseMeta> databases, IMetaStore metaStore) throws Exception {
        ValueMapperMeta valueMapperMeta = (ValueMapperMeta) stepMetaInterface;

        valueMapperMeta.setFieldToUse(cell.getAttribute("field_to_use"));
        valueMapperMeta.setTargetField(cell.getAttribute("target_field"));
        valueMapperMeta.setNonMatchDefault(cell.getAttribute("non_match_default"));

        String fields = cell.getAttribute("fields");
        JSONArray jsonArray = JSONArray.fromObject(fields);
        String[] sourceValue = new String[jsonArray.size()];
        String[] targetValue = new String[jsonArray.size()];
        for(int i=0; i<jsonArray.size(); i++) {
            JSONObject jsonObject = jsonArray.getJSONObject(i);
            sourceValue[i] = jsonObject.optString("source_value");
            targetValue[i] = jsonObject.optString("target_value");
        }
        valueMapperMeta.setSourceValue(sourceValue);
        valueMapperMeta.setTargetValue(targetValue);
    }

    @Override
    public Element encode(StepMetaInterface stepMetaInterface) throws Exception {
        Document doc = mxUtils.createDocument();
        Element e = doc.createElement(PropsUI.TRANS_STEP_NAME);
        ValueMapperMeta valueMapperMeta = (ValueMapperMeta) stepMetaInterface;

        e.setAttribute("field_to_use", valueMapperMeta.getFieldToUse());
        e.setAttribute("target_field", valueMapperMeta.getTargetField());
        e.setAttribute("non_match_default", valueMapperMeta.getNonMatchDefault());

        JSONArray jsonArray = new JSONArray();
        String[] sourceValue = valueMapperMeta.getSourceValue();
        String[] targetValue = valueMapperMeta.getTargetValue();
        for(int j=0; j<sourceValue.length; j++) {
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("source_value", sourceValue[j]);
            jsonObject.put("target_value", targetValue[j]);
            jsonArray.add(jsonObject);
        }
        e.setAttribute("fields", jsonArray.toString());

        return e;
    }

}
