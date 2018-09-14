package com.gavin.creational.factorymethod.log.client;


import com.gavin.creational.factorymethod.log.factory.LoggerFactory;
import com.gavin.creational.factorymethod.log.product.Logger;
import com.gavin.creational.factorymethod.log.utils.XMLUtils;

/**
 * @author gf
 * @date 2018-09-14 16:55
 * @description 客户端测试类
 */
public class Client {
    public static void main(String[] args){
        LoggerFactory loggerFactory = (LoggerFactory) XMLUtils.getBean();
        Logger log = loggerFactory.createLogger();
        log.writeLog();
    }
}
