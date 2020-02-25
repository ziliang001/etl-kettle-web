/**
 * Copyright (C), 2019-2020, **有限公司
 * FileName: GetSQLProgress
 * Author:   zhuzj29042
 * Date:     2020/2/14 16:15::05
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.caixin.data.middle.etl.kettle.admin.util;

import org.pentaho.di.core.SQLStatement;
import org.pentaho.di.core.exception.KettleException;
import org.pentaho.di.i18n.BaseMessages;
import org.pentaho.di.trans.TransMeta;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 *
 *
 * @author zhuzhongji
 * @create 2020/2/14 16:15:05
 * @since 1.0.0
 */
public class GetSQLProgress {

    private static Class<?> PKG = GetSQLProgress.class;

    private TransMeta transMeta;

    public GetSQLProgress(TransMeta transMeta) {
        this.transMeta = transMeta;
    }

    public List<SQLStatement> run() throws InvocationTargetException, InterruptedException {
        try {
            return transMeta.getSQLStatements( null );
        } catch ( KettleException e ) {
            throw new InvocationTargetException( e, BaseMessages.getString(PKG, "GetSQLProgressDialog.RuntimeError.UnableToGenerateSQL.Exception", e.getMessage() ) );
        }
    }

}
