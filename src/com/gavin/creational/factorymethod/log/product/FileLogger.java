package com.gavin.creational.factorymethod.log.product;

import org.slf4j.LoggerFactory;

/**
 * @author gf
 * @date 2018-09-14 16:25
 * @description 文件记录器
 */
public class FileLogger implements Logger {
    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(FileLogger.class);

    @Override
    public void writeLog() {
        logger.info("文件记录日志");
    }
}
