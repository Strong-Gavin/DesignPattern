package com.gavin.structural.bridge.dataConvert.obtainData;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author gf
 * @description SqlServer获取数据
 * @date 2018-09-19 22:52
 */
public class SqlServerDatabaseObtainData implements DatabaseObtainData {
    private static final Logger logger = LoggerFactory.getLogger(SqlServerDatabaseObtainData.class);

    @Override
    public String obtainData() {
        String data = "SqlServer数据库获取数据";
        logger.info(data);
        return data;
    }
}
