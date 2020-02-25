/**
 * Copyright (C), 2019-2020, **有限公司
 * FileName: SampleRows
 * Author:   zhuzj29042
 * Date:     2020/2/14 17:31::07
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
import org.pentaho.di.trans.steps.samplerows.SampleRowsMeta;
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
 * @create 2020/2/14 17:31:07
 * @since 1.0.0
 */
@Component("SampleRows")
@Scope("prototype")
public class SampleRows extends AbstractStep {

    @Override
    public void decode(StepMetaInterface stepMetaInterface, mxCell cell, List<DatabaseMeta> databases, IMetaStore metaStore) throws Exception {
        SampleRowsMeta sampleRowsMeta = (SampleRowsMeta) stepMetaInterface;
        sampleRowsMeta.setLinesRange(cell.getAttribute("linesrange"));
        sampleRowsMeta.setLineNumberField(cell.getAttribute("linenumfield"));
    }

    @Override
    public Element encode(StepMetaInterface stepMetaInterface) throws Exception {
        SampleRowsMeta sampleRowsMeta = (SampleRowsMeta) stepMetaInterface;
        Document doc = mxUtils.createDocument();
        Element e = doc.createElement(PropsUI.TRANS_STEP_NAME);

        e.setAttribute("linesrange", sampleRowsMeta.getLinesRange());
        e.setAttribute("linenumfield", sampleRowsMeta.getLineNumberField());

        return e;
    }

}