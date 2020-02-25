/**
 * Copyright (C), 2019-2020, **有限公司
 * FileName: JobEntryCheckDbConnections
 * Author:   zhuzj29042
 * Date:     2020/2/14 16:36::17
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.caixin.data.middle.etl.kettle.admin.job.steps;

import com.caixin.data.middle.etl.kettle.ext.core.PropsUI;
import com.caixin.data.middle.etl.kettle.ext.job.step.AbstractJobEntry;
import com.caixin.data.middle.etl.kettle.ext.util.JSONArray;
import com.caixin.data.middle.etl.kettle.ext.util.JSONObject;
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
 * @create 2020/2/14 16:36:17
 * @since 1.0.0
 */
@Component("CHECK_DB_CONNECTIONS")
@Scope("prototype")
public class JobEntryCheckDbConnections extends AbstractJobEntry {

    @Override
    public void decode(JobEntryInterface jobEntry, mxCell cell, List<DatabaseMeta> databases, IMetaStore metaStore) throws Exception {
        org.pentaho.di.job.entries.checkdbconnection.JobEntryCheckDbConnections jobEntryCheckDbConnections = (org.pentaho.di.job.entries.checkdbconnection.JobEntryCheckDbConnections) jobEntry;

        String fields = cell.getAttribute("connections");
        JSONArray jsonArray = JSONArray.fromObject(fields);
        jobEntryCheckDbConnections.setConnections(new DatabaseMeta[jsonArray.size()]);
        jobEntryCheckDbConnections.setWaittimes(new int[jsonArray.size()]);
        jobEntryCheckDbConnections.setWaitfors(new String[jsonArray.size()]);
        for(int i=0; i<jsonArray.size(); i++) {
            JSONObject jsonObject = jsonArray.getJSONObject(i);
            jobEntryCheckDbConnections.getConnections()[i] = DatabaseMeta.findDatabase(databases, jsonObject.optString("name"));
            jobEntryCheckDbConnections.getWaittimes()[i] = jobEntryCheckDbConnections.getWaitTimeByDesc( Const.NVL(jsonObject.optString("waittime"), "" ) );
            jobEntryCheckDbConnections.getWaitfors()[i] = jsonObject.optString("waitfor");
        }
    }

    @Override
    public Element encode(JobEntryInterface jobEntry) throws Exception {
        Document doc = mxUtils.createDocument();
        Element e = doc.createElement(PropsUI.JOB_JOBENTRY_NAME);
        org.pentaho.di.job.entries.checkdbconnection.JobEntryCheckDbConnections jobEntryCheckDbConnections = (org.pentaho.di.job.entries.checkdbconnection.JobEntryCheckDbConnections) jobEntry;

        JSONArray jsonArray = new JSONArray();
        DatabaseMeta[] connections = jobEntryCheckDbConnections.getUsedDatabaseConnections();
        if(connections != null) {
            for(int j=0; j<connections.length; j++) {
                JSONObject jsonObject = new JSONObject();
                jsonObject.put("name", connections[j].getName());
                jsonObject.put("waittime", jobEntryCheckDbConnections.unitTimeCode[jobEntryCheckDbConnections.getWaittimes()[j]]);
                jsonObject.put("waitfor", jobEntryCheckDbConnections.getWaitfors()[j]);
                jsonArray.add(jsonObject);
            }
        }

        e.setAttribute("connections", jsonArray.toString());

        return e;
    }


}

