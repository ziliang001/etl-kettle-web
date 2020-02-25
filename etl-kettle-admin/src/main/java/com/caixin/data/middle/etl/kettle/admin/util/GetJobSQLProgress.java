/**
 * Copyright (C), 2019-2020, **有限公司
 * FileName: GetJobSQLProgress
 * Author:   zhuzj29042
 * Date:     2020/2/14 16:14::40
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.caixin.data.middle.etl.kettle.admin.util;

import org.pentaho.di.core.SQLStatement;
import org.pentaho.di.core.exception.KettleException;
import org.pentaho.di.i18n.BaseMessages;
import org.pentaho.di.job.JobMeta;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 *
 *
 * @author zhuzhongji
 * @create 2020/2/14 16:14:40
 * @since 1.0.0
 */
public class GetJobSQLProgress {

    private static Class<?> PKG = GetSQLProgress.class;

    private JobMeta jobMeta;

    public GetJobSQLProgress(JobMeta jobMeta) {
        this.jobMeta = jobMeta;
    }

    public List<SQLStatement> run() throws InvocationTargetException, InterruptedException {
        try {
            return jobMeta.getSQLStatements( App.getInstance().getRepository(), null );
        } catch ( KettleException e ) {
            throw new InvocationTargetException( e, BaseMessages.getString(PKG, "GetSQLProgressDialog.RuntimeError.UnableToGenerateSQL.Exception", e.getMessage() ) );
        }
    }

}
