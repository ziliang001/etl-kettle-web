///**
// * Copyright (C), 2019-2020, **有限公司
// * FileName: SessionLis
// * Author:   zhuzj29042
// * Date:     2020/2/10 16:44::56
// * Description:
// * History:
// * <author>          <time>          <version>          <desc>
// * 作者姓名           修改时间           版本号              描述
// */
//package com.caixin.data.middle.etl.kettle.monitor.util.common;
//
//import javax.servlet.http.HttpSessionEvent;
//import javax.servlet.http.HttpSessionListener;
//import java.util.Set;
//
///**
// * 〈一句话功能简述〉<br>
// *
// *
// * @author zhuzhongji
// * @create 2020/2/10 16:44:56
// * @since 1.0.0
// */
//public class MySessionListener implements HttpSessionListener {
//    @Override
//    public void sessionCreated(HttpSessionEvent se) {
//
//    }
//
//    @Override
//    public void sessionDestroyed(HttpSessionEvent se) {
//        Set<String> set=StringDateUtil.allSession.keySet();
//        for(String sessionId:set){
//            if(sessionId.equals(se.getSession().getId())){
//                StringDateUtil.allSession.remove(sessionId);
//                break;
//            }
//        }
//    }
//}
