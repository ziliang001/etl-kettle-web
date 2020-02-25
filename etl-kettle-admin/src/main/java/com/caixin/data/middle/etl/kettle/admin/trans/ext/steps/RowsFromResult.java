/**
 * Copyright (C), 2019-2020, **有限公司
 * FileName: RowsFromResult
 * Author:   zhuzj29042
 * Date:     2020/2/14 17:29::31
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
import org.pentaho.di.core.row.ValueMeta;
import org.pentaho.di.trans.step.StepMetaInterface;
import org.pentaho.di.trans.steps.rowsfromresult.RowsFromResultMeta;
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
 * @create 2020/2/14 17:29:31
 * @since 1.0.0
 */
@Component("RowsFromResult")
@Scope("prototype")
public class RowsFromResult extends AbstractStep {

    @Override
    public void decode(StepMetaInterface stepMetaInterface, mxCell cell, List<DatabaseMeta> databases, IMetaStore metaStore) throws Exception {
        RowsFromResultMeta rowsFromResultMeta = (RowsFromResultMeta) stepMetaInterface;

        String fields = cell.getAttribute("fields");
        JSONArray jsonArray = JSONArray.fromObject(fields);
        String[] fieldname = new String[jsonArray.size()];
        int[] type = new int[jsonArray.size()];
        int[] length = new int[jsonArray.size()];
        int[] precision = new int[jsonArray.size()];
        for(int i=0; i<jsonArray.size(); i++) {
            JSONObject jsonObject = jsonArray.getJSONObject(i);
            fieldname[i] = jsonObject.optString("name");
            type[i] = ValueMeta.getType(jsonObject.optString("type"));
            length[i] = jsonObject.optInt("length", -1);
            precision[i] = jsonObject.optInt("precision", -1);
        }
        rowsFromResultMeta.setFieldname(fieldname);
        rowsFromResultMeta.setType(type);
        rowsFromResultMeta.setLength(length);
        rowsFromResultMeta.setPrecision(precision);
    }

    @Override
    public Element encode(StepMetaInterface stepMetaInterface) throws Exception {
        Document doc = mxUtils.createDocument();
        Element e = doc.createElement(PropsUI.TRANS_STEP_NAME);
        RowsFromResultMeta rowsFromResultMeta = (RowsFromResultMeta) stepMetaInterface;

        JSONArray jsonArray = new JSONArray();
        String[] fieldname = rowsFromResultMeta.getFieldname();
        int[] type = rowsFromResultMeta.getType();
        int[] length = rowsFromResultMeta.getLength();
        int[] precision = rowsFromResultMeta.getPrecision();
        for(int j=0; j<fieldname.length; j++) {
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("name", fieldname[j]);
            jsonObject.put("type", ValueMeta.getTypeDesc(type[j]));
            jsonObject.put("length", length[j]);
            jsonObject.put("precision", precision[j]);
            jsonArray.add(jsonObject);
        }
        e.setAttribute("fields", jsonArray.toString());

        return e;
    }

}
