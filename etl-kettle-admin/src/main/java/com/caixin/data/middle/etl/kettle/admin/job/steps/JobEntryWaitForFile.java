/**
 * Copyright (C), 2019-2020, **有限公司
 * FileName: JobEntryWaitForFile
 * Author:   zhuzj29042
 * Date:     2020/2/14 17:07::07
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
 * @create 2020/2/14 17:07:07
 * @since 1.0.0
 */
@Component("WAIT_FOR_FILE")
@Scope("prototype")
public class JobEntryWaitForFile extends AbstractJobEntry {

    @Override
    public void decode(JobEntryInterface jobEntry, mxCell cell, List<DatabaseMeta> databases, IMetaStore metaStore) throws Exception {
        org.pentaho.di.job.entries.waitforfile.JobEntryWaitForFile jobEntryWaitForFile = (org.pentaho.di.job.entries.waitforfile.JobEntryWaitForFile) jobEntry;

        jobEntryWaitForFile.setFilename(cell.getAttribute("filename"));
        jobEntryWaitForFile.setMaximumTimeout(cell.getAttribute("maximum_timeout"));
        jobEntryWaitForFile.setCheckCycleTime(cell.getAttribute("check_cycle_time"));
        jobEntryWaitForFile.setSuccessOnTimeout("Y".equalsIgnoreCase(cell.getAttribute("success_on_timeout")));
        jobEntryWaitForFile.setFileSizeCheck("Y".equalsIgnoreCase(cell.getAttribute("file_size_check")));
        jobEntryWaitForFile.setAddFilenameToResult("Y".equalsIgnoreCase(cell.getAttribute("add_filename_result")));
    }

    @Override
    public Element encode(JobEntryInterface jobEntry) throws Exception {
        Document doc = mxUtils.createDocument();
        Element e = doc.createElement(PropsUI.JOB_JOBENTRY_NAME);
        org.pentaho.di.job.entries.waitforfile.JobEntryWaitForFile jobEntryWaitForFile = (org.pentaho.di.job.entries.waitforfile.JobEntryWaitForFile) jobEntry;

        e.setAttribute("filename", jobEntryWaitForFile.getFilename());
        e.setAttribute("maximum_timeout", jobEntryWaitForFile.getMaximumTimeout());
        e.setAttribute("check_cycle_time", jobEntryWaitForFile.getCheckCycleTime());
        e.setAttribute("success_on_timeout", jobEntryWaitForFile.isSuccessOnTimeout() ? "Y" : "N");
        e.setAttribute("file_size_check", jobEntryWaitForFile.isFileSizeCheck() ? "Y" : "N");
        e.setAttribute("add_filename_result", jobEntryWaitForFile.isAddFilenameToResult() ? "Y" : "N");

        return e;
    }


}
