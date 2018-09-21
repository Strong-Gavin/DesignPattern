package com.gavin.structural.decorator.encrypt;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author gavin
 * @date 2018/9/21
 * @decription 逆向输出加密
 */
public class ReverseEncrypt extends EncryptBase {
    private static final Logger logger = LoggerFactory.getLogger(ReverseEncrypt.class);

    public ReverseEncrypt(Encrypt encrypt) {
        super(encrypt);
    }

    @Override
    String encryptData(String str) {
        String originEncryptStr = super.encryptData(str);
        String encryptStr = new StringBuffer(originEncryptStr).reverse().toString();
        logger.info("对字符串:{}进行逆向输出加密,加密后:{}",originEncryptStr,encryptStr);
        return encryptStr;
    }
}
