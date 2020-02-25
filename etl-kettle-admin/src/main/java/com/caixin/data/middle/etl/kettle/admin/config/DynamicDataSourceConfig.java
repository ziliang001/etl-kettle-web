package com.caixin.data.middle.etl.kettle.admin.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

/**
 * @Description:
 * @Auther: zhuzhongji
 * @Date: 2019/10/14 09:37
 */
//@Configuration
public class DynamicDataSourceConfig {

    @Bean(name = DataSourceKey.DATA_SOURCE_DS1)
    @ConfigurationProperties(prefix = "datasource.ds1")
    public DataSource ds1DataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = DataSourceKey.DATA_SOURCE_DS2)
    @ConfigurationProperties(prefix = "datasource.ds2")
    public DataSource ds2DataSource() {
        return DataSourceBuilder.create().build();
    }

    @Primary
    @Bean(name = "dynamicDataSource")
    public DynamicDataSource dataSource() {
        DynamicDataSource dynamicDataSource = new DynamicDataSource();
        dynamicDataSource.setDefaultTargetDataSource(ds1DataSource());
        Map<Object, Object> dataSourceMap = new HashMap<>(4);
        dataSourceMap.put(DataSourceKey.DATA_SOURCE_DS1, ds1DataSource());
        dataSourceMap.put(DataSourceKey.DATA_SOURCE_DS2, ds2DataSource());
        dynamicDataSource.setTargetDataSources(dataSourceMap);
        return dynamicDataSource;
    }
}
