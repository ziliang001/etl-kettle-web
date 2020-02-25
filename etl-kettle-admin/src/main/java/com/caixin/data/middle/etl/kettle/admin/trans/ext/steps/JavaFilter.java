/**
 * Copyright (C), 2019-2020, **有限公司
 * FileName: JavaFilter
 * Author:   zhuzj29042
 * Date:     2020/2/14 17:21::34
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.caixin.data.middle.etl.kettle.admin.trans.ext.steps;

import com.caixin.data.middle.etl.kettle.admin.trans.ext.step.AbstractStep;
import com.caixin.data.middle.etl.kettle.ext.core.PropsUI;
import com.caixin.data.middle.etl.kettle.ext.util.StringEscapeHelper;
import com.mxgraph.model.mxCell;
import com.mxgraph.util.mxUtils;
import org.pentaho.di.core.database.DatabaseMeta;
import org.pentaho.di.trans.step.StepMetaInterface;
import org.pentaho.di.trans.step.errorhandling.StreamInterface;
import org.pentaho.di.trans.steps.javafilter.JavaFilterMeta;
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
 * @create 2020/2/14 17:21:34
 * @since 1.0.0
 */
@Component("JavaFilter")
@Scope("prototype")
public class JavaFilter extends AbstractStep {

    @Override
    public void decode(StepMetaInterface stepMetaInterface, mxCell cell, List<DatabaseMeta> databases, IMetaStore metaStore) throws Exception {
        JavaFilterMeta javaFilterMeta = (JavaFilterMeta) stepMetaInterface;

        List<StreamInterface> targetStreams = javaFilterMeta.getStepIOMeta().getTargetStreams();
        targetStreams.get( 0 ).setSubject( cell.getAttribute( "send_true_to" ) );
        targetStreams.get( 1 ).setSubject( cell.getAttribute( "send_false_to" ) );
        javaFilterMeta.setCondition(StringEscapeHelper.decode(cell.getAttribute("condition")));
    }

    @Override
    public Element encode(StepMetaInterface stepMetaInterface) throws Exception {
        Document doc = mxUtils.createDocument();
        Element e = doc.createElement(PropsUI.TRANS_STEP_NAME);
        JavaFilterMeta javaFilterMeta = (JavaFilterMeta) stepMetaInterface;

        List<StreamInterface> targetStreams = javaFilterMeta.getStepIOMeta().getTargetStreams();
        e.setAttribute("send_true_to", targetStreams.get(0).getStepname());
        e.setAttribute("send_false_to", targetStreams.get(1).getStepname());
        e.setAttribute("condition", StringEscapeHelper.encode(javaFilterMeta.getCondition()));

        return e;
    }

}