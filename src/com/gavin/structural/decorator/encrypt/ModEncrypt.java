package com.gavin.structural.decorator.encrypt;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author gavin
 * @date 2018/9/21
 * @decription
 */
public class ModEncrypt extends EncryptBase {
    private static final Logger logger = LoggerFactory.getLogger(ModEncrypt.class);

    public ModEncrypt(Encrypt encrypt) {
        super(encrypt);
    }

    @Override
    String encryptData(String str) {
        String originStr =  super.encryptData(str);
        char[] charArr = originStr.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char c:charArr){
            sb.append(c%7);
        }
        String encryptStr = sb.toString();
        logger.info("对字符串:{}进行求模加密,加密后:{}",originStr,encryptStr);
        return encryptStr;
    }
}
