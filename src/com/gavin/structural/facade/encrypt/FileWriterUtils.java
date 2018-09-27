package com.gavin.structural.facade.encrypt;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;

/**
 * @author gavin
 * @date 2018/9/27
 * @description 文件保存类
 */
public class FileWriterUtils {

    private static final Logger logger = LoggerFactory.getLogger(FileWriterUtils.class);

    /**
     *
     * @param encryptStr 加密字符串
     * @param destFileName 输出文件名
     */
    public void write(String encryptStr,String destFileName){
        logger.info("保存密文，写入文件");
        FileOutputStream outputStream = null;
        OutputStreamWriter outputStreamWriter = null;
        BufferedWriter bufferedWriter = null;

        try {
            outputStream = new FileOutputStream(destFileName);
            outputStreamWriter = new OutputStreamWriter(outputStream,"utf-8");
            bufferedWriter = new BufferedWriter(outputStreamWriter);
            bufferedWriter.write(encryptStr);
            bufferedWriter.flush();
            bufferedWriter.close();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                if(bufferedWriter!=null){
                    bufferedWriter.close();
                }
                if(outputStreamWriter!=null){
                    outputStreamWriter.close();
                }
                if(outputStream!=null){
                    outputStream.close();
                }
            }catch (Exception e){

            }

        }
    }
}
