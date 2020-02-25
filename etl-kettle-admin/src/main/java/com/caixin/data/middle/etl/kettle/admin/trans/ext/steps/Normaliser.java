/**
 * Copyright (C), 2019-2020, **有限公司
 * FileName: Normaliser
 * Author:   zhuzj29042
 * Date:     2020/2/14 17:25::52
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.caixin.data.middle.etl.kettle.admin.trans.ext.steps;

import com.caixin.data.middle.etl.kettle.admin.trans.ext.step.AbstractStep;
import com.caixin.data.middle.etl.kettle.ext.core.PropsUI;
import com.mxgraph.model.mxCell;
import com.mxgraph.util.mxUtils;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.pentaho.di.core.database.DatabaseMeta;
import org.pentaho.di.trans.step.StepMetaInterface;
import org.pentaho.di.trans.steps.normaliser.NormaliserMeta;
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
 * @create 2020/2/14 17:25:52
 * @since 1.0.0
 */
@Component("Normaliser")
@Scope("prototype")
public class Normaliser extends AbstractStep {

    @Override
    public void decode(StepMetaInterface stepMetaInterface, mxCell cell, List<DatabaseMeta> databases, IMetaStore metaStore) throws Exception {
        NormaliserMeta denor=(NormaliserMeta)stepMetaInterface;
        denor.setTypeField(cell.getAttribute("typefield"));
        String fields=cell.getAttribute("fields");
        JSONArray fieldsJSONArray=JSONArray.fromObject(fields);
        if(fieldsJSONArray.size()>0){
            NormaliserMeta.NormaliserField[] normalisers=new  NormaliserMeta.NormaliserField[fieldsJSONArray.size()];
            for(int j=0;j<fieldsJSONArray.size();j++){
                JSONObject jsonOBJ=fieldsJSONArray.getJSONObject(j);
                NormaliserMeta.NormaliserField nor=new  NormaliserMeta.NormaliserField();
                nor.setName(jsonOBJ.optString("name"));
                nor.setValue(jsonOBJ.optString("value"));
                nor.setNorm(jsonOBJ.optString("norm"));
                normalisers[j]=nor;
            }
            denor.setNormaliserFields(normalisers);
        }
    }

    @Override
    public Element encode(StepMetaInterface stepMetaInterface) throws Exception {
        NormaliserMeta denor=(NormaliserMeta)stepMetaInterface;
        Document doc = mxUtils.createDocument();
        Element e = doc.createElement(PropsUI.TRANS_STEP_NAME);
        e.setAttribute("typefield",denor.getTypeField());
        JSONArray jsonArray2=new JSONArray();
        for(int i=0;i<denor.getNormaliserFields().length;i++){
            NormaliserMeta.NormaliserField normaliser=denor.getNormaliserFields()[i];
            JSONObject json=new JSONObject();
            json.put("name",normaliser.getName());
            json.put("value",normaliser.getValue());
            json.put("norm",normaliser.getNorm());
            jsonArray2.add(json);
        }
        e.setAttribute("fields",jsonArray2.toString());
        return e;
    }
}
