/**
 * Copyright (C), 2019-2020, **有限公司
 * FileName: ConditionCodec
 * Author:   zhuzj29042
 * Date:     2020/2/14 16:26::17
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.caixin.data.middle.etl.kettle.ext.core;

import com.caixin.data.middle.etl.kettle.ext.core.row.ValueMetaAndDataCodec;
import com.caixin.data.middle.etl.kettle.ext.util.JSONArray;
import com.caixin.data.middle.etl.kettle.ext.util.JSONObject;
import org.pentaho.di.core.Condition;
import org.pentaho.di.core.exception.KettleValueException;
import org.pentaho.di.core.row.ValueMetaAndData;

/**
 * 〈一句话功能简述〉<br> 
 *
 *
 * @author zhuzhongji
 * @create 2020/2/14 16:26:17
 * @since 1.0.0
 */
public class ConditionCodec {

    public static JSONObject encode(Condition condition) throws KettleValueException {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("negated", condition.isNegated());
        jsonObject.put("operator", condition.getOperator());

        if ( condition.isAtomic() ) {
            jsonObject.put("left_valuename", condition.getLeftValuename());
            jsonObject.put("func", condition.getFunction());
            jsonObject.put("right_valuename", condition.getRightValuename());

            if ( condition.getRightExact() != null ) {
                ValueMetaAndData rightExact = condition.getRightExact();
                jsonObject.put("right_exact", ValueMetaAndDataCodec.encode(rightExact));
            }
        } else {
            JSONArray conditions = new JSONArray();
            for (int i = 0; i < condition.nrConditions(); i++) {
                Condition child = condition.getCondition(i);
                conditions.add(encode(child));
            }

            jsonObject.put("conditions", conditions);
        }

        return jsonObject;
    }

    public static Condition decode(JSONObject jsonObject) throws KettleValueException {
        Condition condition = new Condition();
        condition.setNegated(jsonObject.optBoolean("negated"));
        condition.setOperator(jsonObject.optInt("operator"));

        JSONArray conditions = jsonObject.optJSONArray("conditions");
        if (conditions == null || conditions.size() == 0) {
            condition.setLeftValuename(jsonObject.optString("left_valuename"));
            condition.setFunction(jsonObject.optInt("func"));
            condition.setRightValuename(jsonObject.optString("right_valuename"));
            JSONObject right_exact = jsonObject.optJSONObject("right_exact");
            if (right_exact != null) {
                ValueMetaAndData exact = ValueMetaAndDataCodec.decode(right_exact);
                condition.setRightExact(exact);
            }
        } else {
            for (int i = 0; i < conditions.size(); i++) {
                JSONObject child = conditions.getJSONObject(i);
                condition.addCondition(decode(child));
            }
        }

        return condition;
    }

}
