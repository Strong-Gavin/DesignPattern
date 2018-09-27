package com.gavin.structural.decorator.encrypt;

/**
 * @author gavin
 * @date 2018/9/21
 * @decription 加密装饰类
 */
public  abstract class EncryptBase extends Encrypt {
    private Encrypt encrypt;

    public EncryptBase(Encrypt encrypt){
        this.encrypt = encrypt;
    }

    @Override
    String encryptData(String str) {
        return encrypt.encryptData(str);
    }
}
