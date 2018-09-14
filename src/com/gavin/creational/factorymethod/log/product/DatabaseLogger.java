package com.gavin.creational.factorymethod.log.product;


import org.slf4j.LoggerFactory;


/**
 * @author gf
 * @date 2018-09-14 16:25
 * @description 数据库日志记录器
 */
public class DatabaseLogger implements Logger {
    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(DatabaseLogger.class);

    @Override
    public void writeLog() {
        logger.info("数据库记录日志");
    }
}
