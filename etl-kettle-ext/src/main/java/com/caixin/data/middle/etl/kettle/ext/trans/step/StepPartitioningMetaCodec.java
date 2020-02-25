///**
// * Copyright (C), 2019-2020, **有限公司
// * FileName: StepPartitioningMetaCodec
// * Author:   zhuzj29042
// * Date:     2020/2/13 17:48::28
// * Description:
// * History:
// * <author>          <time>          <version>          <desc>
// * 作者姓名           修改时间           版本号              描述
// */
//package com.caixin.data.middle.etl.kettle.ext.trans.step;
//
//import com.caixin.data.middle.etl.kettle.ext.util.JSONObject;
//import org.pentaho.di.core.exception.KettlePluginException;
//import org.pentaho.di.partition.PartitionSchema;
//import org.pentaho.di.trans.ModPartitioner;
//import org.pentaho.di.trans.Partitioner;
//import org.pentaho.di.trans.step.StepPartitioningMeta;
//import org.springframework.util.StringUtils;
//
///**
// * 〈一句话功能简述〉<br>
// *
// *
// * @author zhuzhongji
// * @create 2020/2/13 17:48:28
// * @since 1.0.0
// */
//public class StepPartitioningMetaCodec {
//
//    public static JSONObject encode(StepPartitioningMeta stepPartitioningMeta) {
//        JSONObject jsonObject = new JSONObject();
//
//        jsonObject.put("method", stepPartitioningMeta.getMethodCode());
//        PartitionSchema partitionSchema = stepPartitioningMeta.getPartitionSchema();
//        jsonObject.put("schema_name", partitionSchema != null ? partitionSchema.getName() : "" );
//        Partitioner partitioner = stepPartitioningMeta.getPartitioner();
//        if(partitioner != null) {
//            if(partitioner instanceof ModPartitioner) {
//                ModPartitioner modPartitioner = (ModPartitioner) partitioner;
//                jsonObject.put("field_name", modPartitioner.getFieldName());
//            }
//        }
//        return jsonObject;
//    }
//
//    public static StepPartitioningMeta decode( JSONObject jsonObject ) throws KettlePluginException {
//        StepPartitioningMeta stepPartitioningMeta = new StepPartitioningMeta();
//        String method = jsonObject.optString("method");
//        if(StringUtils.hasText(method))
//            stepPartitioningMeta.setMethod(method);
//        stepPartitioningMeta.setPartitionSchemaName(jsonObject.optString("schema_name"));
//        Partitioner partitioner = stepPartitioningMeta.getPartitioner();
//        if(partitioner != null) {
//            if(partitioner instanceof ModPartitioner) {
//                ModPartitioner modPartitioner = (ModPartitioner) partitioner;
//                modPartitioner.setFieldName(jsonObject.optString("field_name"));
//            }
//        }
//        return stepPartitioningMeta;
//    }
//}
