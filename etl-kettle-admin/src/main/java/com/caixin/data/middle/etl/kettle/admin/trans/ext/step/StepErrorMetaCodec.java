/**
 * Copyright (C), 2019-2020, **有限公司
 * FileName: StepErrorMetaCodec
 * Author:   zhuzj29042
 * Date:     2020/2/13 17:49::05
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.caixin.data.middle.etl.kettle.admin.trans.ext.step;

import com.caixin.data.middle.etl.kettle.ext.util.JSONObject;
import org.pentaho.di.core.exception.KettlePluginException;
import org.pentaho.di.trans.TransMeta;
import org.pentaho.di.trans.step.StepErrorMeta;
import org.pentaho.di.trans.step.StepMeta;

/**
 * 〈一句话功能简述〉<br> 
 *
 *
 * @author zhuzhongji
 * @create 2020/2/13 17:49:05
 * @since 1.0.0
 */
public class StepErrorMetaCodec {

    public static JSONObject encode(StepErrorMeta stepErrorMeta) {
        JSONObject jsonObject = new JSONObject();

        jsonObject.put("source_step", stepErrorMeta.getSourceStep() != null ? stepErrorMeta.getSourceStep().getName() : "");
        jsonObject.put("target_step", stepErrorMeta.getTargetStep() != null ? stepErrorMeta.getTargetStep().getName() : "" );
        jsonObject.put("is_enabled", stepErrorMeta.isEnabled() ? "Y" : "N");
        jsonObject.put("nr_valuename", stepErrorMeta.getNrErrorsValuename());
        jsonObject.put("descriptions_valuename", stepErrorMeta.getErrorDescriptionsValuename());
        jsonObject.put("fields_valuename", stepErrorMeta.getErrorFieldsValuename());
        jsonObject.put("codes_valuename", stepErrorMeta.getErrorCodesValuename());
        jsonObject.put("max_errors", stepErrorMeta.getMaxErrors());
        jsonObject.put("max_pct_errors", stepErrorMeta.getMaxPercentErrors());
        jsonObject.put("min_pct_rows", stepErrorMeta.getMinPercentRows());
        return jsonObject;
    }

    public static StepErrorMeta decode(TransMeta transMeta, JSONObject jsonObject ) throws KettlePluginException {
        String source_step = jsonObject.optString("source_step");
        String target_step = jsonObject.optString("target_step");

        StepMeta sourceStep = transMeta.findStep(source_step);
        StepMeta targetStep = transMeta.findStep(target_step);

        StepErrorMeta stepErrorMeta = new StepErrorMeta(transMeta, sourceStep, targetStep);
        stepErrorMeta.setEnabled("Y".equalsIgnoreCase(jsonObject.optString("is_enabled")));
        stepErrorMeta.setNrErrorsValuename(jsonObject.optString("nr_valuename"));
        stepErrorMeta.setErrorDescriptionsValuename(jsonObject.optString("descriptions_valuename"));
        stepErrorMeta.setErrorFieldsValuename(jsonObject.optString("fields_valuename"));
        stepErrorMeta.setErrorCodesValuename(jsonObject.optString("codes_valuename"));
        stepErrorMeta.setMaxErrors(jsonObject.optString("max_errors"));
        stepErrorMeta.setMaxPercentErrors(jsonObject.optString("max_pct_errors"));
        stepErrorMeta.setMinPercentRows(jsonObject.optString("min_pct_rows"));

        return stepErrorMeta;
    }

}

