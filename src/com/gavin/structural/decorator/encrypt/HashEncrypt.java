package com.gavin.structural.decorator.encrypt;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author gavin
 * @date 2018/9/21
 * @decription
 */
public class HashEncrypt extends EncryptBase {
    private static final Logger logger = LoggerFactory.getLogger(HashEncrypt.class);

    public HashEncrypt(Encrypt encrypt) {
        super(encrypt);
    }

    @Override
    String encryptData(String str) {
        String originStr =  super.encryptData(str);
        String encryptStr = originStr.hashCode()+"";
        logger.info("对字符串:{}进行hash加密,加密后:{}",originStr,encryptStr);
        return encryptStr;
    }
}
