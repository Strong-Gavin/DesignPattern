package com.gavin.structural.adapter.encrypt;

/**
 * @author gavin
 * @date 2018/9/17
 * @decription 数据库操作适配器 复用已有的加密算法
 */
public class OperationAdapter implements DatabaseOperation {
    private static EncryptTool encryptTool;

    public OperationAdapter(){
        encryptTool = new EncryptTool();
    }

    @Override
    public String encryptStr(String str) {
        return encryptTool.encryptWithMD5(str);
    }
}
