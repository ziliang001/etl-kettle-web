/**
 * Copyright (C), 2019-2020, **有限公司
 * FileName: ExecuteDataBaseRepTran
 * Author:   zhuzj29042
 * Date:     2020/2/13 16:21::39
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.caixin.data.middle.etl.kettle.admin;

import org.pentaho.di.core.KettleEnvironment;
import org.pentaho.di.core.database.DatabaseMeta;
import org.pentaho.di.core.exception.KettleException;
import org.pentaho.di.repository.Repository;
import org.pentaho.di.repository.RepositoryDirectoryInterface;
import org.pentaho.di.repository.kdr.KettleDatabaseRepository;
import org.pentaho.di.repository.kdr.KettleDatabaseRepositoryMeta;
import org.pentaho.di.trans.Trans;
import org.pentaho.di.trans.TransMeta;

/**
 * 〈一句话功能简述〉<br> 
 *
 *
 * @author zhuzhongji
 * @create 2020/2/13 16:21:39
 * @since 1.0.0
 */
public class ExecuteDataBaseRepTran {


    private static String transName = "test1";

    public static void main(String[] args) {

        try {
            //初始化kettle环境
            KettleEnvironment.init();
            //创建资源库对象，此时的对象还是一个空对象
            KettleDatabaseRepository repository = new KettleDatabaseRepository();
            //创建资源库数据库对象，类似我们在spoon里面创建资源库
            DatabaseMeta dataMeta =
                    new DatabaseMeta("kettle","MySQL","Native","localhost","kettle","3306","root","123456");
            //资源库元对象,名称参数，id参数，描述等可以随便定义
            KettleDatabaseRepositoryMeta kettleDatabaseMeta =
                    new KettleDatabaseRepositoryMeta("kettle", "kettle", "king description",dataMeta);
            //给资源库赋值
            repository.init(kettleDatabaseMeta);
            //连接资源库
            repository.connect("admin","admin");
            //根据变量查找到模型所在的目录对象,此步骤很重要。
            RepositoryDirectoryInterface directory = repository.findDirectory("/");
            //创建ktr元对象
            TransMeta transformationMeta = ((Repository) repository).loadTransformation(transName, directory, null, true, null ) ;
            //创建ktr
            Trans trans = new Trans(transformationMeta);
            //执行ktr
            trans.execute(null);
            //等待执行完毕
            trans.waitUntilFinished();

            if(trans.getErrors()>0)
            {
                System.err.println("Transformation run Failure!");
            }
            else
            {
                System.out.println("Transformation run successfully!");
            }
        } catch (KettleException e) {
            e.printStackTrace();
        }
    }

}