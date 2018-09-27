package com.gavin.structural.facade.encrypt;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author gavin
 * @date 2018/9/27
 * @description 数据加密类
 */
public class CipherMachine {
    private static final Logger logger = LoggerFactory.getLogger(CipherMachine.class);

    public String encrypt(String plainText){
        logger.info("数据加密,明文转换为密文: ");
        StringBuilder stringBuilder = new StringBuilder();
        char[] charArr = plainText.toCharArray();
        for(char ch:charArr){
            String c = String.valueOf((ch % 7));
            stringBuilder.append(c);
        }
        logger.info("数据加密后结果:{}",stringBuilder.toString());
        return stringBuilder.toString();
    }
}
