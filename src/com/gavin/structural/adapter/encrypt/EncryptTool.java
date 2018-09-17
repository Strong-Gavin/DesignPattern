package com.gavin.structural.adapter.encrypt;

import sun.misc.BASE64Encoder;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @author gavin
 * @date 2018/9/17
 * @decription 加密工具类 已有的加密工具类
 */
public class EncryptTool {

    public String encryptWithMD5(String originStr){
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            byte[] b = messageDigest.digest(originStr.getBytes());
            BASE64Encoder base64Encoder = new BASE64Encoder();
            String str = base64Encoder.encode(b);
            return str;
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }
}
