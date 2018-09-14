package com.gavin.creational.factorymethod.log.factory;

import com.gavin.creational.factorymethod.log.product.FileLogger;
import com.gavin.creational.factorymethod.log.product.Logger;

/**
 * @author gf
 * @date 2018-09-14 16:24
 * @description 文件日志记录器工厂
 */
public class FileLoggerFactory implements LoggerFactory {
    private static org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(FileLoggerFactory.class);
    @Override
    public Logger createLogger() {
        Logger log = new FileLogger();
        logger.info("初始化文件日志记录器");
        return log;
    }
}
