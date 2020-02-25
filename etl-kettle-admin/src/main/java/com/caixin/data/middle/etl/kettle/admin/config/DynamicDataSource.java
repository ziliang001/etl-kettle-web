package com.caixin.data.middle.etl.kettle.admin.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.Map;

/**
 * @Description:
 * @Auther: zhuzhongji
 * @Date: 2019/10/14 09:32
 */
@Slf4j
public class DynamicDataSource extends AbstractRoutingDataSource {
    private static final ThreadLocal<String> DATA_SOURCE_KEY = new ThreadLocal<>();

    public static void changeDataSource(String dataSourceKey) {
        DATA_SOURCE_KEY.set(dataSourceKey);
    }

    public static void clearDataSource() {
        DATA_SOURCE_KEY.remove();
    }

    private Map<Object, Object> targetDataSources;

    @Override
    protected Object determineCurrentLookupKey() {
        String key = DATA_SOURCE_KEY.get();
        log.info("current data-source is {}", key);
        return key;
    }

}
