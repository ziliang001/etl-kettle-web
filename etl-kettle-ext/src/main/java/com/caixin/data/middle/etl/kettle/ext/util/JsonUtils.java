/**
 * Copyright (C), 2019-2020, **有限公司
 * FileName: JsonUtils
 * Author:   zhuzj29042
 * Date:     2020/2/11 19:54::22
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.caixin.data.middle.etl.kettle.ext.util;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/**
 * 〈一句话功能简述〉<br> 
 *
 *
 * @author zhuzhongji
 * @create 2020/2/11 19:54:22
 * @since 1.0.0
 */
public class JsonUtils {

    public static void success(String message) throws IOException {
        success("系统提示", message);
    }

    public static void success(String title, String message) throws IOException {
        response(true, title, message);
    }

    public static void fail(String message) throws IOException {
        fail("系统提示", message);
    }

    public static void fail(String title, String message) throws IOException {
        response(false, title, message);
    }

    public static void response(boolean success, String title, String message) throws IOException {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("success", success);
        jsonObject.put("title", title);
        jsonObject.put("message", message);

        response(jsonObject);
    }

    public static void response(JSONObject jsonObject) throws IOException {
        HttpServletResponse response = tl.get();
        response.setContentType("text/html; charset=utf-8");
        response.getWriter().write(jsonObject.toString());
    }

    public static void response(JSONArray jsonArray) throws IOException {
        HttpServletResponse response = tl.get();
        response.setContentType("text/html; charset=utf-8");
        response.getWriter().write(jsonArray.toString());
    }

    public static void responseXml(String xml) throws IOException {
        HttpServletResponse response = tl.get();
        response.setContentType("text/xml; charset=utf-8");
        response.getWriter().write(xml);
    }

    public static void download(File file) throws IOException {
        HttpServletResponse response = tl.get();
        response.setContentType("multipart/form-data");
        response.setHeader("Content-Disposition", "attachment;fileName=" + file.getName());

        InputStream is = null;
        try {
            is = FileUtils.openInputStream(file);

            IOUtils.copy(is, response.getOutputStream());
        } finally {
            IOUtils.closeQuietly(is);
        }

    }

    private static ThreadLocal<HttpServletResponse> tl = new ThreadLocal<HttpServletResponse>();

    public static void putResponse(HttpServletResponse response) {
        tl.set(response);
    }

}
