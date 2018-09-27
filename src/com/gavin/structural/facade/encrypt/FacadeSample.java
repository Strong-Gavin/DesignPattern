package com.gavin.structural.facade.encrypt;

/**
 * @author gavin
 * @date 2018/9/27
 * @description 加密外观类 充当外观类
 */
public class FacadeSample {

    private FileWriterUtils fileWriterUtils;
    private FileReaderUtils fileReaderUtils;
    private CipherMachine cipherMachine;

    public FacadeSample(){
        fileReaderUtils = new FileReaderUtils();
        fileWriterUtils = new FileWriterUtils();
        cipherMachine = new CipherMachine();
    }

    public void fileEncrypt(String fileNameSrc,String fileNameDest){
        String plainStr = fileReaderUtils.readFile(fileNameSrc);
        String encryptStr = cipherMachine.encrypt(plainStr);
        fileWriterUtils.write(encryptStr,fileNameDest);
    }
}
