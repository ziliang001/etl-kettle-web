/**
 * Copyright (C), 2019-2020, **有限公司
 * FileName: FilterRows
 * Author:   zhuzj29042
 * Date:     2020/2/14 17:17::41
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.caixin.data.middle.etl.kettle.admin.trans.ext.steps;

import com.caixin.data.middle.etl.kettle.admin.trans.ext.step.AbstractStep;
import com.caixin.data.middle.etl.kettle.ext.core.ConditionCodec;
import com.caixin.data.middle.etl.kettle.ext.core.PropsUI;
import com.caixin.data.middle.etl.kettle.ext.util.JSONObject;
import com.mxgraph.model.mxCell;
import com.mxgraph.util.mxUtils;
import org.pentaho.di.core.Condition;
import org.pentaho.di.core.database.DatabaseMeta;
import org.pentaho.di.trans.step.StepMetaInterface;
import org.pentaho.di.trans.step.errorhandling.StreamInterface;
import org.pentaho.di.trans.steps.filterrows.FilterRowsMeta;
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
 * @create 2020/2/14 17:17:41
 * @since 1.0.0
 */
@Component("FilterRows")
@Scope("prototype")
public class FilterRows extends AbstractStep {

    @Override
    public void decode(StepMetaInterface stepMetaInterface, mxCell cell, List<DatabaseMeta> databases, IMetaStore metaStore) throws Exception {
        FilterRowsMeta filterRowsMeta = (FilterRowsMeta) stepMetaInterface;

        List<StreamInterface> targetStreams = filterRowsMeta.getStepIOMeta().getTargetStreams();

        targetStreams.get(0).setSubject(cell.getAttribute("send_true_to"));
        targetStreams.get(1).setSubject(cell.getAttribute("send_false_to"));

        String conditionString = cell.getAttribute("condition");
        JSONObject jsonObject = JSONObject.fromObject(conditionString);
        filterRowsMeta.setCondition(ConditionCodec.decode(jsonObject));
    }

    @Override
    public Element encode(StepMetaInterface stepMetaInterface) throws Exception {
        FilterRowsMeta filterRowsMeta = (FilterRowsMeta) stepMetaInterface;

        Document doc = mxUtils.createDocument();
        Element e = doc.createElement(PropsUI.TRANS_STEP_NAME);

        List<StreamInterface> targetStreams = stepMetaInterface.getStepIOMeta().getTargetStreams();
        e.setAttribute("send_true_to", targetStreams.get( 0 ).getStepname() );
        e.setAttribute("send_false_to", targetStreams.get( 1 ).getStepname() );

        Condition condition = filterRowsMeta.getCondition();
        if(condition != null) {
            e.setAttribute("condition", ConditionCodec.encode(condition).toString());
        }

        return e;
    }
}
