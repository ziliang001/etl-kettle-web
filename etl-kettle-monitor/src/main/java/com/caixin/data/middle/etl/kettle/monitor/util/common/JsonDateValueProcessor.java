/**
 * Copyright (C), 2019-2020, **有限公司
 * FileName: JsonDateValueProcessor
 * Author:   zhuzj29042
 * Date:     2020/2/10 16:46::14
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.caixin.data.middle.etl.kettle.monitor.util.common;

import net.sf.json.JsonConfig;
import net.sf.json.processors.JsonValueProcessor;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 〈一句话功能简述〉<br> 
 *  针对json-lib不认识的数据类型提供处理办法
 *
 * @author zhuzhongji
 * @create 2020/2/10 16:46:14
 * @since 1.0.0
 */
//public class JsonDateValueProcessor implements JsonValueProcessor {
//    private String format="yyyy-MM-dd HH:mm:ss";
//
//    public JsonDateValueProcessor(String format) {
//        this.format=format;
//    }
//
//    public JsonDateValueProcessor() {
//    }
//
//    public String getFormat() {
//        return format;
//    }
//
//    public void setFormat(String format) {
//        this.format = format;
//    }
//
//    @Override
//    public Object processArrayValue(Object o, JsonConfig jsonConfig) {
//        String[] obj={};
//        if (o instanceof Date[]){
//            SimpleDateFormat sf=new SimpleDateFormat(format);
//            Date[] dates=(Date[]) o;
//            obj=new String[dates.length];
//            for (int i=0;i<dates.length;i++){
//                obj[i]=sf.format(dates[i]);
//
//            }
//        }
//        return obj;
//    }
//
//    @Override
//    public Object processObjectValue(String key, Object value, JsonConfig jsonConfig) {
//        if(value instanceof Date){
//            String str=new SimpleDateFormat(format).format((Date)value);
//            return str;
//        }
//        return value==null?null:value.toString();
//    }
//}
