/**
 * Copyright (C), 2019-2020, **有限公司
 * FileName: SortRows
 * Author:   zhuzj29042
 * Date:     2020/2/14 17:35::00
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
import com.mxgraph.model.mxCell;
import com.mxgraph.util.mxUtils;
import org.pentaho.di.core.database.DatabaseMeta;
import org.pentaho.di.trans.step.StepMetaInterface;
import org.pentaho.di.trans.steps.sort.SortRowsMeta;
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
 * @create 2020/2/14 17:35:00
 * @since 1.0.0
 */
@Component("SortRows")
@Scope("prototype")
public class SortRows extends AbstractStep {

    @Override
    public void decode(StepMetaInterface stepMetaInterface, mxCell cell, List<DatabaseMeta> databases, IMetaStore metaStore) throws Exception {
        SortRowsMeta sortRowsMeta = (SortRowsMeta) stepMetaInterface;

        sortRowsMeta.setDirectory(cell.getAttribute("directory"));
        sortRowsMeta.setPrefix(cell.getAttribute("prefix"));
        sortRowsMeta.setSortSize(cell.getAttribute("sort_size"));
        sortRowsMeta.setFreeMemoryLimit(cell.getAttribute("free_memory"));
        sortRowsMeta.setCompressFiles("Y".equalsIgnoreCase(cell.getAttribute("compress")));
        sortRowsMeta.setCompressFilesVariable(cell.getAttribute("compress_variable"));
        sortRowsMeta.setOnlyPassingUniqueRows("Y".equalsIgnoreCase(cell.getAttribute("unique_rows")));

        JSONArray jsonArray = JSONArray.fromObject(cell.getAttribute("fields"));
        String[] fieldName = new String[jsonArray.size()];
        boolean[] ascending = new boolean[jsonArray.size()];
        boolean[] caseSensitive = new boolean[jsonArray.size()];
        boolean[] preSortedField = new boolean[jsonArray.size()];
        for (int i = 0; i < jsonArray.size(); i++) {
            JSONObject jsonObject = jsonArray.getJSONObject(i);

            fieldName[i] = jsonObject.optString("name");
            ascending[i] = "Y".equalsIgnoreCase(jsonObject.optString("ascending"));
            caseSensitive[i] = "Y".equalsIgnoreCase(jsonObject.optString("case_sensitive"));
            preSortedField[i] = "Y".equalsIgnoreCase(jsonObject.optString("presorted"));
        }

        sortRowsMeta.setFieldName(fieldName);
        sortRowsMeta.setAscending(ascending);
        sortRowsMeta.setCaseSensitive(caseSensitive);
        sortRowsMeta.setPreSortedField(preSortedField);
    }

    @Override
    public Element encode(StepMetaInterface stepMetaInterface) throws Exception {
        Document doc = mxUtils.createDocument();
        Element e = doc.createElement(PropsUI.TRANS_STEP_NAME);
        SortRowsMeta sortRowsMeta = (SortRowsMeta) stepMetaInterface;

        e.setAttribute("directory", sortRowsMeta.getDirectory());
        e.setAttribute("prefix", sortRowsMeta.getPrefix());
        e.setAttribute("sort_size", sortRowsMeta.getSortSize());
        e.setAttribute("free_memory", sortRowsMeta.getFreeMemoryLimit());
        e.setAttribute("compress", sortRowsMeta.getCompressFiles() ? "Y" : "N");
        e.setAttribute("compress_variable", sortRowsMeta.getCompressFilesVariable());
        e.setAttribute("unique_rows", sortRowsMeta.isOnlyPassingUniqueRows() ? "Y" : "N");

        JSONArray jsonArray = new JSONArray();
        String[] fieldName = sortRowsMeta.getFieldName();
        boolean[] ascending = sortRowsMeta.getAscending();
        boolean[] caseSensitive = sortRowsMeta.getCaseSensitive();
        boolean[] preSortedField = sortRowsMeta.getPreSortedField();

        if(fieldName != null) {
            for(int j=0; j<fieldName.length; j++) {
                JSONObject jsonObject = new JSONObject();
                jsonObject.put("name", fieldName[j]);
                jsonObject.put("ascending",ascending[j] ? "Y" : "N");
                jsonObject.put("case_sensitive",caseSensitive[j] ? "Y" : "N");
                jsonObject.put("presorted",preSortedField[j] ? "Y" : "N");
                jsonArray.add(jsonObject);
            }
        }
        e.setAttribute("fields", jsonArray.toString());

        return e;
    }

}
