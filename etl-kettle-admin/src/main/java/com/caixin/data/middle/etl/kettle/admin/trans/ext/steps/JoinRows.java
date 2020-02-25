/**
 * Copyright (C), 2019-2020, **有限公司
 * FileName: JoinRows
 * Author:   zhuzj29042
 * Date:     2020/2/14 17:22::04
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
import org.pentaho.di.core.Const;
import org.pentaho.di.core.database.DatabaseMeta;
import org.pentaho.di.trans.step.StepMetaInterface;
import org.pentaho.di.trans.steps.joinrows.JoinRowsMeta;
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
 * @create 2020/2/14 17:22:04
 * @since 1.0.0
 */
@Component("JoinRows")
@Scope("prototype")
public class JoinRows extends AbstractStep {

    @Override
    public void decode(StepMetaInterface stepMetaInterface, mxCell cell, List<DatabaseMeta> databases, IMetaStore metaStore) throws Exception {
        JoinRowsMeta joinRowsMeta = (JoinRowsMeta) stepMetaInterface;

        joinRowsMeta.setDirectory(cell.getAttribute("directory"));
        joinRowsMeta.setPrefix(cell.getAttribute("prefix"));
        joinRowsMeta.setCacheSize(Const.toInt(cell.getAttribute("cache_size"), -1));
        joinRowsMeta.setMainStepname(cell.getAttribute("main"));

        String conditionString = cell.getAttribute("condition");
        JSONObject jsonObject = JSONObject.fromObject(conditionString);
        joinRowsMeta.setCondition(ConditionCodec.decode(jsonObject));
    }

    @Override
    public Element encode(StepMetaInterface stepMetaInterface) throws Exception {
        Document doc = mxUtils.createDocument();
        Element e = doc.createElement(PropsUI.TRANS_STEP_NAME);
        JoinRowsMeta joinRowsMeta = (JoinRowsMeta) stepMetaInterface;

        e.setAttribute("directory", joinRowsMeta.getDirectory());
        e.setAttribute("prefix", joinRowsMeta.getPrefix());
        e.setAttribute("cache_size", joinRowsMeta.getCacheSize() + "");
        e.setAttribute("main", joinRowsMeta.getLookupStepname());

        if(joinRowsMeta.getCondition() != null)
            e.setAttribute("condition", ConditionCodec.encode(joinRowsMeta.getCondition()).toString());

        return e;
    }

}
