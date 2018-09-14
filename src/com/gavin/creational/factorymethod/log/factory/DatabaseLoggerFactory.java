package com.gavin.creational.factorymethod.log.factory;

import com.gavin.creational.factorymethod.log.product.DatabaseLogger;
import com.gavin.creational.factorymethod.log.product.Logger;

/**
 * @author gf
 * @date 2018-09-14 16:23
 * @description 数据库日志记录器工厂
 */
public class DatabaseLoggerFactory implements LoggerFactory {
    private static final org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(DatabaseLoggerFactory.class);
    @Override
    public Logger createLogger() {
        Logger log = new DatabaseLogger();
        logger.info("初始化数据库日志记录器");
        return log;
    }
}
