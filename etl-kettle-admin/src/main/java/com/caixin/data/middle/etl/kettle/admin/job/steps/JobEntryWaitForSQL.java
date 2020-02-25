/**
 * Copyright (C), 2019-2020, **有限公司
 * FileName: JobEntryWaitForSQL
 * Author:   zhuzj29042
 * Date:     2020/2/14 17:07::31
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.caixin.data.middle.etl.kettle.admin.job.steps;

import com.caixin.data.middle.etl.kettle.ext.core.PropsUI;
import com.caixin.data.middle.etl.kettle.ext.job.step.AbstractJobEntry;
import com.caixin.data.middle.etl.kettle.ext.util.StringEscapeHelper;
import com.mxgraph.model.mxCell;
import com.mxgraph.util.mxUtils;
import org.pentaho.di.core.Const;
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
 * @create 2020/2/14 17:07:31
 * @since 1.0.0
 */
@Component("WAIT_FOR_SQL")
@Scope("prototype")
public class JobEntryWaitForSQL extends AbstractJobEntry {
    @Override
    public void decode(JobEntryInterface jobEntry, mxCell cell, List<DatabaseMeta> databases, IMetaStore metaStore) throws Exception {
        org.pentaho.di.job.entries.waitforsql.JobEntryWaitForSQL  jobEntryWaitForSQL = (org.pentaho.di.job.entries.waitforsql.JobEntryWaitForSQL) jobEntry;
        //一般---服务器设置
        jobEntryWaitForSQL.customSQL=(StringEscapeHelper.decode(cell.getAttribute("customSQL")));
        String con = cell.getAttribute( "connection" );
        jobEntryWaitForSQL.setDatabase(DatabaseMeta.findDatabase( databases, con ));
        jobEntryWaitForSQL.schemaname=cell.getAttribute("schemaname");
        jobEntryWaitForSQL.tablename=(cell.getAttribute("tablename"));
        jobEntryWaitForSQL.successCondition= jobEntryWaitForSQL.getSuccessConditionByDesc(cell.getAttribute( "successCondition" ));
        jobEntryWaitForSQL.rowsCountValue= Const.NVL(cell.getAttribute("rowsCountValue"), "0");
        jobEntryWaitForSQL.setMaximumTimeout(cell.getAttribute("maximumTimeout"));
        jobEntryWaitForSQL.setCheckCycleTime(cell.getAttribute("checkCycleTime"));
        jobEntryWaitForSQL.setSuccessOnTimeout("Y".equalsIgnoreCase(cell.getAttribute("successOnTimeout")));
        jobEntryWaitForSQL.iscustomSQL=("Y".equalsIgnoreCase(cell.getAttribute("iscustomSQL")));
        jobEntryWaitForSQL.isUseVars=("Y".equalsIgnoreCase(cell.getAttribute("isUseVars")));
        jobEntryWaitForSQL.isClearResultList=("Y".equalsIgnoreCase(cell.getAttribute("isClearResultList")));
        jobEntryWaitForSQL.isAddRowsResult=("Y".equalsIgnoreCase(cell.getAttribute("isAddRowsResult")));
    }

    @Override
    public Element encode(JobEntryInterface jobEntry) throws Exception    {
        org.pentaho.di.job.entries.waitforsql.JobEntryWaitForSQL  jobEntryWaitForSQL = (org.pentaho.di.job.entries.waitforsql.JobEntryWaitForSQL) jobEntry;
        String[] successConditionsCode = org.pentaho.di.job.entries.evaluatetablecontent.JobEntryEvalTableContent.successConditionsCode;

        Document doc = mxUtils.createDocument();
        Element e = doc.createElement(PropsUI.JOB_JOBENTRY_NAME);
        //一般---服务器设置
        e.setAttribute("customSQL", StringEscapeHelper.encode(jobEntryWaitForSQL.customSQL));
        e.setAttribute("connection",  jobEntryWaitForSQL.getDatabase() == null ? "" : jobEntryWaitForSQL.getDatabase().getName());
        e.setAttribute("schemaname", jobEntryWaitForSQL.schemaname );
        e.setAttribute("tablename", jobEntryWaitForSQL.tablename);
        e.setAttribute("successCondition", successConditionsCode[jobEntryWaitForSQL.getSuccessCondition()]);
        e.setAttribute("rowsCountValue", jobEntryWaitForSQL.rowsCountValue );
        e.setAttribute("maximumTimeout", jobEntryWaitForSQL.getMaximumTimeout() );
        e.setAttribute("checkCycleTime", jobEntryWaitForSQL.getCheckCycleTime() );

        e.setAttribute("successOnTimeout", jobEntryWaitForSQL.isSuccessOnTimeout() ? "Y" : "N");
        e.setAttribute("iscustomSQL", jobEntryWaitForSQL.iscustomSQL ? "Y" : "N");
        e.setAttribute("isUseVars", jobEntryWaitForSQL.isUseVars ? "Y" : "N");
        e.setAttribute("isClearResultList", jobEntryWaitForSQL.isClearResultList ? "Y" : "N");
        e.setAttribute("isAddRowsResult", jobEntryWaitForSQL.isAddRowsResult ? "Y" : "N");

        return e;
    }



}
