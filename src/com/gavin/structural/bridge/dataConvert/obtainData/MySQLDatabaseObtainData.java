package com.gavin.structural.bridge.dataConvert.obtainData;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author gf
 * @description MySQL获取数据
 * @date 2018-09-19 22:50
 */
public class MySQLDatabaseObtainData implements DatabaseObtainData {
    private static final Logger logger = LoggerFactory.getLogger(MySQLDatabaseObtainData.class);

    @Override
    public String obtainData() {
        String data = "MySQL获取数据库数据";
        logger.info(data);
        return data;
    }
}
