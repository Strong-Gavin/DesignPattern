package com.gavin.structural.decorator.encrypt;

/**
 * @author gavin
 * @date 2018/9/21
 * @decription 客户端测试类
 */
public class Client {
    public static void main(String args[]){
        Encrypt encrypt = new SimpleEncrypt();
        String str = "HelloWorld";

        Encrypt reverserEncrypt = new ReverseEncrypt(encrypt);
        Encrypt hashEncrypt = new HashEncrypt(reverserEncrypt);

        hashEncrypt.encryptData(str);
    }
}
