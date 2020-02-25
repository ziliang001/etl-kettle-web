///**
// * Copyright (C), 2019-2020, **有限公司
// * FileName: Append
// * Author:   zhuzj29042
// * Date:     2020/2/13 17:46::11
// * Description:
// * History:
// * <author>          <time>          <version>          <desc>
// * 作者姓名           修改时间           版本号              描述
// */
//package com.caixin.data.middle.etl.kettle.ext.trans.steps;
//
//import com.caixin.data.middle.etl.kettle.ext.core.PropsUI;
//import com.caixin.data.middle.etl.kettle.ext.trans.step.AbstractStep;
//import com.mxgraph.model.mxCell;
//import com.mxgraph.util.mxUtils;
//import org.pentaho.di.core.database.DatabaseMeta;
//import org.pentaho.di.trans.step.StepMetaInterface;
//import org.pentaho.di.trans.step.errorhandling.StreamInterface;
//import org.pentaho.di.trans.steps.append.AppendMeta;
//import org.pentaho.metastore.api.IMetaStore;
//import org.springframework.context.annotation.Scope;
//import org.springframework.stereotype.Component;
//import org.w3c.dom.Document;
//import org.w3c.dom.Element;
//
//import java.util.List;
//
///**
// * 〈一句话功能简述〉<br>
// *
// *
// * @author zhuzhongji
// * @create 2020/2/13 17:46:11
// * @since 1.0.0
// */
//@Component("Append")
//@Scope("prototype")
//public class Append extends AbstractStep {
//
//    @Override
//    public void decode(StepMetaInterface stepMetaInterface, mxCell cell, List<DatabaseMeta> databases, IMetaStore metaStore) throws Exception {
//        AppendMeta appendMeta = (AppendMeta) stepMetaInterface;
//
//        List<StreamInterface> infoStreams = appendMeta.getStepIOMeta().getInfoStreams();
//        StreamInterface headStream = infoStreams.get(0);
//        StreamInterface tailStream = infoStreams.get(1);
//
//        headStream.setSubject(cell.getAttribute("head_name"));
//        tailStream.setSubject(cell.getAttribute("tail_name"));
//    }
//
//    @Override
//    public Element encode(StepMetaInterface stepMetaInterface) throws Exception {
//        Document doc = mxUtils.createDocument();
//        Element e = doc.createElement(PropsUI.TRANS_STEP_NAME);
//        AppendMeta appendMeta = (AppendMeta) stepMetaInterface;
//
//        List<StreamInterface> infoStreams = appendMeta.getStepIOMeta().getInfoStreams();
//        e.setAttribute("head_name", infoStreams.get(0).getStepname());
//        e.setAttribute("tail_name", infoStreams.get(1).getStepname());
//
//        return e;
//    }
//
//}
