package com.gavin.structural.decorator.encrypt;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author gavin
 * @date 2018/9/21
 * @decription 简单加密类(具体构件)
 */
public class SimpleEncrypt extends Encrypt {
    private static final Logger logger = LoggerFactory.getLogger(SimpleEncrypt.class);

    @Override
    String encryptData(String str) {
        char[] charArr = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char c:charArr) {
            char resultChar = (char) (c + 8);
            sb.append(resultChar);
        }
        String result  = sb.toString();
        logger.info("对字符串{}进行简单加密,加密后:{}",str,result);
        return result;
    }
}
