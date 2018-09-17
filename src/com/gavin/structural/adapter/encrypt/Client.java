package com.gavin.structural.adapter.encrypt;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author gavin
 * @date 2018/9/17
 * @decription 客户端测试类
 */
public class Client {
    private static Logger logger = LoggerFactory.getLogger(Client.class);

    public static void main(String args[]){
        DatabaseOperation databaseOperation = (DatabaseOperation) XMLUtils.getBean();

        String str = "测试加密方法";
        String encryptStr = databaseOperation.encryptStr(str);

        logger.info("加密后数据:{}",encryptStr);
    }
}
