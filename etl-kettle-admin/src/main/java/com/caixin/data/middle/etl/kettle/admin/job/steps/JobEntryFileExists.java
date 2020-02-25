/**
 * Copyright (C), 2019-2020, **有限公司
 * FileName: JobEntryFileExists
 * Author:   zhuzj29042
 * Date:     2020/2/14 16:41::37
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.caixin.data.middle.etl.kettle.admin.job.steps;

import com.caixin.data.middle.etl.kettle.ext.core.PropsUI;
import com.caixin.data.middle.etl.kettle.ext.job.step.AbstractJobEntry;
import com.mxgraph.model.mxCell;
import com.mxgraph.util.mxUtils;
import org.pentaho.di.core.database.DatabaseMeta;
import org.pentaho.di.job.entry.JobEntryInterface;
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
 * @create 2020/2/14 16:41:37
 * @since 1.0.0
 */
@Component("FILE_EXISTS")
@Scope("prototype")
public class JobEntryFileExists extends AbstractJobEntry {

    @Override
    public void decode(JobEntryInterface jobEntry, mxCell cell, List<DatabaseMeta> databases, IMetaStore metaStore) throws Exception {
        org.pentaho.di.job.entries.fileexists.JobEntryFileExists jobEntryFileExists = (org.pentaho.di.job.entries.fileexists.JobEntryFileExists) jobEntry;
        jobEntryFileExists.setFilename(cell.getAttribute("filename"));
    }

    @Override
    public Element encode(JobEntryInterface jobEntry) throws Exception {
        Document doc = mxUtils.createDocument();
        Element e = doc.createElement(PropsUI.JOB_JOBENTRY_NAME);
        org.pentaho.di.job.entries.fileexists.JobEntryFileExists jobEntryFileExists = (org.pentaho.di.job.entries.fileexists.JobEntryFileExists) jobEntry;

        e.setAttribute("filename", jobEntryFileExists.getFilename());

        return e;
    }

}

