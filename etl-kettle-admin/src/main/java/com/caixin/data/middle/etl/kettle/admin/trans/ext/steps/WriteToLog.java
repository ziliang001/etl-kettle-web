/**
 * Copyright (C), 2019-2020, **有限公司
 * FileName: WriteToLog
 * Author:   zhuzj29042
 * Date:     2020/2/14 17:42::23
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.caixin.data.middle.etl.kettle.admin.trans.ext.steps;

import com.caixin.data.middle.etl.kettle.admin.trans.ext.step.AbstractStep;
import com.caixin.data.middle.etl.kettle.ext.core.PropsUI;
import com.caixin.data.middle.etl.kettle.ext.util.JSONArray;
import com.caixin.data.middle.etl.kettle.ext.util.JSONObject;
import com.caixin.data.middle.etl.kettle.ext.util.StringEscapeHelper;
import com.mxgraph.model.mxCell;
import com.mxgraph.util.mxUtils;
import org.pentaho.di.core.Const;
import org.pentaho.di.core.database.DatabaseMeta;
import org.pentaho.di.core.logging.LogLevel;
import org.pentaho.di.trans.step.StepMetaInterface;
import org.pentaho.di.trans.steps.writetolog.WriteToLogMeta;
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
 * @create 2020/2/14 17:42:23
 * @since 1.0.0
 */
@Component("WriteToLog")
@Scope("prototype")
public class WriteToLog extends AbstractStep {

    @Override
    public void decode(StepMetaInterface stepMetaInterface, mxCell cell, List<DatabaseMeta> databases, IMetaStore metaStore) throws Exception {
        WriteToLogMeta writeToLogMeta = (WriteToLogMeta) stepMetaInterface;

        writeToLogMeta.setLogLevel(LogLevel.getLogLevelForCode(cell.getAttribute("loglevel")).getLevel());
        writeToLogMeta.setdisplayHeader("Y".equalsIgnoreCase(cell.getAttribute("displayHeader")));
        writeToLogMeta.setLimitRows("Y".equalsIgnoreCase(cell.getAttribute("limitRows")));
        writeToLogMeta.setLimitRowsNumber(Const.toInt(cell.getAttribute("limitRowsNumber"), 5));
        writeToLogMeta.setLogMessage(StringEscapeHelper.decode(cell.getAttribute("logmessage")));

        String fields = cell.getAttribute("fields");
        JSONArray jsonArray = JSONArray.fromObject(fields);
        String[] fieldName = new String[jsonArray.size()];
        for(int i=0; i<jsonArray.size(); i++) {
            JSONObject jsonObject = jsonArray.getJSONObject(i);
            fieldName[i] = jsonObject.optString("name");
        }
        writeToLogMeta.setFieldName(fieldName);
    }

    @Override
    public Element encode(StepMetaInterface stepMetaInterface) throws Exception {
        Document doc = mxUtils.createDocument();
        Element e = doc.createElement(PropsUI.TRANS_STEP_NAME);
        WriteToLogMeta writeToLogMeta = (WriteToLogMeta) stepMetaInterface;

        e.setAttribute("loglevel", writeToLogMeta.getLogLevelByDesc().getCode());
        e.setAttribute("displayHeader", writeToLogMeta.isdisplayHeader() ? "Y" : "N");
        e.setAttribute("limitRows", writeToLogMeta.isLimitRows() ? "Y" : "N");
        e.setAttribute("limitRowsNumber", writeToLogMeta.getLimitRowsNumber() + "");
        e.setAttribute("logmessage", StringEscapeHelper.encode(writeToLogMeta.getLogMessage()));

        JSONArray jsonArray = new JSONArray();
        String[] fieldName = writeToLogMeta.getFieldName();
        for(int j=0; j<fieldName.length; j++) {
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("name", fieldName[j]);
            jsonArray.add(jsonObject);
        }
        e.setAttribute("fields", jsonArray.toString());

        return e;
    }

}
