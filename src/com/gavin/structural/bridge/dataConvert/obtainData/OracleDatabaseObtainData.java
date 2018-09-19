package com.gavin.structural.bridge.dataConvert.obtainData;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author gf
 * @description Oracle获取数据
 * @date 2018-09-19 22:51
 */
public class OracleDatabaseObtainData implements DatabaseObtainData {
    private static final Logger logger = LoggerFactory.getLogger(OracleDatabaseObtainData.class);

    @Override
    public String obtainData() {
        String data = "Oracle获取数据库数据";
        logger.info(data);
        return data;
    }
}
