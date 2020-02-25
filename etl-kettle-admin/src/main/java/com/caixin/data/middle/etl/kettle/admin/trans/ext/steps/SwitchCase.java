/**
 * Copyright (C), 2019-2020, **有限公司
 * FileName: SwitchCase
 * Author:   zhuzj29042
 * Date:     2020/2/14 17:36::53
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
import org.pentaho.di.trans.step.StepMeta;
import org.pentaho.di.trans.step.StepMetaInterface;
import org.pentaho.di.trans.steps.switchcase.SwitchCaseMeta;
import org.pentaho.di.trans.steps.switchcase.SwitchCaseTarget;
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
 * @create 2020/2/14 17:36:53
 * @since 1.0.0
 */
@Component("SwitchCase")
@Scope("prototype")
public class SwitchCase extends AbstractStep {

    @Override
    public void decode(StepMetaInterface stepMetaInterface, mxCell cell, List<DatabaseMeta> databases, IMetaStore metaStore) throws Exception {
        SwitchCaseMeta switchCaseMeta = (SwitchCaseMeta) stepMetaInterface;

        switchCaseMeta.setFieldname(cell.getAttribute("fieldname"));
        switchCaseMeta.setContains("Y".equalsIgnoreCase(cell.getAttribute("use_contains")));
        switchCaseMeta.setCaseValueType(Integer.parseInt(cell.getAttribute("case_value_type")));
        switchCaseMeta.setCaseValueFormat(cell.getAttribute("case_value_format"));
        switchCaseMeta.setCaseValueDecimal(cell.getAttribute("case_value_decimal"));
        switchCaseMeta.setCaseValueGroup(cell.getAttribute("case_value_group"));
        switchCaseMeta.setDefaultTargetStepname(cell.getAttribute("default_target_step"));

        switchCaseMeta.allocate();

        JSONArray jsonArray = JSONArray.fromObject(cell.getAttribute("cases"));
        for(int i=0; i<jsonArray.size(); i++) {
            JSONObject jsonObject = jsonArray.getJSONObject(i);

            SwitchCaseTarget target = new SwitchCaseTarget();
            target.caseValue = jsonObject.optString("value");//XMLHandler.getTagValue( caseNode, "value" );
            target.caseTargetStepname = jsonObject.optString("target_step");//XMLHandler.getTagValue( caseNode, "target_step" );
            switchCaseMeta.getCaseTargets().add( target );
        }
    }

    @Override
    public Element encode(StepMetaInterface stepMetaInterface) throws Exception {
        SwitchCaseMeta switchCaseMeta = (SwitchCaseMeta) stepMetaInterface;

        Document doc = mxUtils.createDocument();
        Element e = doc.createElement(PropsUI.TRANS_STEP_NAME);

        e.setAttribute("fieldname", switchCaseMeta.getFieldname());
        e.setAttribute("use_contains", switchCaseMeta.isContains() ? "Y" : "N");
        e.setAttribute("case_value_type", switchCaseMeta.getCaseValueType() + "");
        e.setAttribute("case_value_format", switchCaseMeta.getCaseValueFormat());
        e.setAttribute("case_value_decimal", switchCaseMeta.getCaseValueDecimal());
        e.setAttribute("case_value_group", switchCaseMeta.getCaseValueGroup());

        StepMeta defaultTargetStep = switchCaseMeta.getDefaultTargetStep();
        String defaultTargetStepname = defaultTargetStep != null ?  defaultTargetStep.getName() : switchCaseMeta.getDefaultTargetStepname();
        e.setAttribute("default_target_step", defaultTargetStepname);

        JSONArray jsonArray = new JSONArray();
        for ( SwitchCaseTarget target : switchCaseMeta.getCaseTargets() ) {
            String value = target.caseValue != null ? target.caseValue : "";
            String caseTargetStep = target.caseTargetStep != null ? target.caseTargetStep.getName() : target.caseTargetStepname;
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("value", value);
            jsonObject.put("target_step", caseTargetStep);
            jsonArray.add(jsonObject);
        }
        e.setAttribute("cases", jsonArray.toString());

        return e;
    }

}
