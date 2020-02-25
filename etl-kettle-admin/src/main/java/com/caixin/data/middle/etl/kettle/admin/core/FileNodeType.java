/**
 * Copyright (C), 2019-2020, **有限公司
 * FileName: FileNodeType
 * Author:   zhuzj29042
 * Date:     2020/2/11 20:19::30
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.caixin.data.middle.etl.kettle.admin.core;

import org.springframework.util.LinkedCaseInsensitiveMap;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 *
 *
 * @author zhuzhongji
 * @create 2020/2/11 20:19:30
 * @since 1.0.0
 */
public enum FileNodeType {

    ALL(1, "所有文件", "*"), KJB(2, "作业文件", "kjb"), KTR(4, "转换文件", "ktr"), TXT(8, "文本文件", "txt"), CSV(16, "CSV文件", "csv");

    private int type;
    private String typeDesc;
    private String extension;

    private FileNodeType(int type, String typeDesc, String extension) {
        this.type = type;
        this.typeDesc = typeDesc;
        this.extension = extension;
    }

    public static boolean includeNone(int type) {
        return type == 0;
    }

    public static boolean match(String extension, int type) throws IllegalArgumentException, IllegalAccessException {
        if((FileNodeType.ALL.type & type) > 0)
            return true;

        for(Field field : FileNodeType.class.getDeclaredFields()) {
            if(field.getType().equals(FileNodeType.class)) {
                FileNodeType fnt = (FileNodeType) field.get(null);

                if((fnt.type & type) == 0)
                    continue;


                return fnt.extension.equalsIgnoreCase(extension);
            }
        }

        return false;
    }

    public static String getExtension(String fileName) {
        if(fileName == null || fileName.indexOf(".") < 0)
            return null;
        return fileName.substring(fileName.indexOf(".") + 1);
    }

    public static List toList(int type) throws IllegalArgumentException, IllegalAccessException {
        ArrayList list = new ArrayList();
        for(Field field : FileNodeType.class.getDeclaredFields()) {
            if(field.getType().equals(FileNodeType.class)) {
                FileNodeType fnt = (FileNodeType) field.get(null);

                if((fnt.type & type) > 0 || fnt.type == 1) {
                    LinkedCaseInsensitiveMap record = new LinkedCaseInsensitiveMap();
                    record.put("type", fnt.type);
                    record.put("desc", fnt.typeDesc);
                    list.add(record);
                }
            }
        }
        return list;
    }
}
