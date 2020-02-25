///**
// * Copyright (C), 2019-2020, **有限公司
// * FileName: JobEntryCreateFile
// * Author:   zhuzj29042
// * Date:     2020/2/14 16:38::01
// * Description:
// * History:
// * <author>          <time>          <version>          <desc>
// * 作者姓名           修改时间           版本号              描述
// */
//package com.caixin.data.middle.etl.kettle.ext.job.steps;
//
//import com.caixin.data.middle.etl.kettle.ext.core.PropsUI;
//import com.caixin.data.middle.etl.kettle.ext.job.step.AbstractJobEntry;
//import com.mxgraph.model.mxCell;
//import com.mxgraph.util.mxUtils;
//import org.pentaho.di.core.database.DatabaseMeta;
//import org.pentaho.di.job.entry.JobEntryInterface;
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
// * @create 2020/2/14 16:38:01
// * @since 1.0.0
// */
//@Component("CREATE_FILE")
//@Scope("prototype")
//public class JobEntryCreateFile extends AbstractJobEntry {
//
//    @Override
//    public void decode(JobEntryInterface jobEntry, mxCell cell, List<DatabaseMeta> databases, IMetaStore metaStore) throws Exception {
//        org.pentaho.di.job.entries.createfile.JobEntryCreateFile jobEntryCreateFile = (org.pentaho.di.job.entries.createfile.JobEntryCreateFile) jobEntry;
//        jobEntryCreateFile.setFilename(cell.getAttribute("filename"));
//        jobEntryCreateFile.setFailIfFileExists("Y".equalsIgnoreCase(cell.getAttribute("fail_if_file_exists")));
//        jobEntryCreateFile.setAddFilenameToResult("Y".equalsIgnoreCase(cell.getAttribute("addfilenameresult")));
//
//    }
//
//    @Override
//    public Element encode(JobEntryInterface jobEntry) throws Exception {
//        Document doc = mxUtils.createDocument();
//        Element e = doc.createElement(PropsUI.JOB_JOBENTRY_NAME);
//        org.pentaho.di.job.entries.createfile.JobEntryCreateFile jobEntryCreateFile = (org.pentaho.di.job.entries.createfile.JobEntryCreateFile) jobEntry;
//        e.setAttribute("filename", jobEntryCreateFile.getFilename());
//        e.setAttribute("fail_if_file_exists", jobEntryCreateFile.isFailIfFileExists() ? "Y" : "N");
//        e.setAttribute("addfilenameresult", jobEntryCreateFile.isAddFilenameToResult() ? "Y" : "N");
//
//        return e;
//    }
//
//
//}
