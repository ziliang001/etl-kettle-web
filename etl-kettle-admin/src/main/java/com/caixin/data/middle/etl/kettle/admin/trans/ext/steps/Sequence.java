/**
 * Copyright (C), 2019-2020, **有限公司
 * FileName: Sequence
 * Author:   zhuzj29042
 * Date:     2020/2/14 17:33::28
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
import org.pentaho.di.core.database.DatabaseMeta;
import org.pentaho.di.trans.step.StepMetaInterface;
import org.pentaho.di.trans.steps.addsequence.AddSequenceMeta;
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
 * @create 2020/2/14 17:33:28
 * @since 1.0.0
 */
@Component("Sequence")
@Scope("prototype")
public class Sequence extends AbstractStep {

    @Override
    public void decode(StepMetaInterface stepMetaInterface, mxCell cell, List<DatabaseMeta> databases, IMetaStore metaStore) throws Exception {
        AddSequenceMeta addSequenceMeta = (AddSequenceMeta) stepMetaInterface;

        addSequenceMeta.setValuename(cell.getAttribute("valuename"));
        addSequenceMeta.setUseDatabase("Y".equalsIgnoreCase(cell.getAttribute("useDatabase")));
        addSequenceMeta.setDatabase(DatabaseMeta.findDatabase( databases, cell.getAttribute("connection")));
        addSequenceMeta.setSchemaName(cell.getAttribute("schema"));
        addSequenceMeta.setSequenceName(cell.getAttribute("seqname"));

        addSequenceMeta.setUseCounter("Y".equalsIgnoreCase(cell.getAttribute("use_counter")));
        addSequenceMeta.setCounterName(cell.getAttribute("counter_name"));
        addSequenceMeta.setStartAt(cell.getAttribute("start_at"));
        addSequenceMeta.setIncrementBy(cell.getAttribute("increment_by"));
        addSequenceMeta.setMaxValue(cell.getAttribute("max_value"));
    }

    @Override
    public Element encode(StepMetaInterface stepMetaInterface) throws Exception {
        AddSequenceMeta addSequenceMeta = (AddSequenceMeta) stepMetaInterface;

        Document doc = mxUtils.createDocument();
        Element e = doc.createElement(PropsUI.TRANS_STEP_NAME);

        e.setAttribute("valuename", addSequenceMeta.getValuename());
        e.setAttribute("use_database", addSequenceMeta.isDatabaseUsed() ? "Y" : "N");
        e.setAttribute("connection", addSequenceMeta.getDatabase() == null ? "" : addSequenceMeta.getDatabase().getName());
        e.setAttribute("schema", addSequenceMeta.getSchemaName());
        e.setAttribute("seqname", addSequenceMeta.getSequenceName());

        e.setAttribute("use_counter", addSequenceMeta.isCounterUsed() ? "Y" : "N");
        e.setAttribute("counter_name", addSequenceMeta.getCounterName());
        e.setAttribute("start_at", addSequenceMeta.getStartAt());
        e.setAttribute("increment_by", addSequenceMeta.getIncrementBy());
        e.setAttribute("max_value", addSequenceMeta.getMaxValue());

        return e;
    }

}
