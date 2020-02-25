/**
 * Copyright (C), 2019-2020, **有限公司
 * FileName: Unique
 * Author:   zhuzj29042
 * Date:     2020/2/14 17:40::40
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
import org.pentaho.di.trans.steps.uniquerows.UniqueRowsMeta;
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
 * @create 2020/2/14 17:40:40
 * @since 1.0.0
 */
@Component("Unique")
@Scope("prototype")
public class Unique extends AbstractStep {

    @Override
    public void decode(StepMetaInterface stepMetaInterface, mxCell cell, List<DatabaseMeta> databases, IMetaStore metaStore) throws Exception {
        UniqueRowsMeta uniqueRowsMeta = (UniqueRowsMeta) stepMetaInterface;

        uniqueRowsMeta.setCountRows("Y".equalsIgnoreCase(cell.getAttribute("count_rows")));
        uniqueRowsMeta.setCountField(cell.getAttribute("count_field"));
        uniqueRowsMeta.setRejectDuplicateRow("Y".equalsIgnoreCase(cell.getAttribute("reject_duplicate_row")));
        uniqueRowsMeta.setErrorDescription(cell.getAttribute("error_description"));

        JSONArray jsonArray = JSONArray.fromObject(cell.getAttribute("fields"));
        String[] compareFields = new String[jsonArray.size()];
        boolean[] caseInsensitive = new boolean[jsonArray.size()];
        for (int i = 0; i < jsonArray.size(); i++) {
            JSONObject jsonObject = jsonArray.getJSONObject(i);

            compareFields[i] = jsonObject.optString("name");
            caseInsensitive[i] = "Y".equalsIgnoreCase(jsonObject.optString("case_insensitive"));
        }

        uniqueRowsMeta.setCompareFields(compareFields);
        uniqueRowsMeta.setCaseInsensitive(caseInsensitive);
    }

    @Override
    public Element encode(StepMetaInterface stepMetaInterface) throws Exception {
        Document doc = mxUtils.createDocument();
        Element e = doc.createElement(PropsUI.TRANS_STEP_NAME);
        UniqueRowsMeta uniqueRowsMeta = (UniqueRowsMeta) stepMetaInterface;

        e.setAttribute("count_rows", uniqueRowsMeta.isCountRows() ? "Y" : "N");
        e.setAttribute("count_field", uniqueRowsMeta.getCountField());
        e.setAttribute("reject_duplicate_row", uniqueRowsMeta.isRejectDuplicateRow() ? "Y" : "N");
        e.setAttribute("error_description", uniqueRowsMeta.getErrorDescription());

        JSONArray jsonArray = new JSONArray();
        String[] compareFields = uniqueRowsMeta.getCompareFields();
        boolean[] caseInsensitive = uniqueRowsMeta.getCaseInsensitive();

        if(compareFields != null) {
            for(int j=0; j<compareFields.length; j++) {
                JSONObject jsonObject = new JSONObject();
                jsonObject.put("name", compareFields[j]);
                jsonObject.put("case_insensitive",caseInsensitive[j] ? "Y" : "N");
                jsonArray.add(jsonObject);
            }
        }
        e.setAttribute("fields", jsonArray.toString());

        return e;
    }

}
