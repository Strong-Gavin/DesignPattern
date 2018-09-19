package com.gavin.structural.bridge.dataConvert.client;

import com.gavin.structural.bridge.dataConvert.convert.DataConvert;
import com.gavin.structural.bridge.dataConvert.obtainData.DatabaseObtainData;

/**
 * @author gf
 * @description 客户端测试类
 * @date 2018-09-19 22:57
 */
public class Client {
    public static void main(String[] args){
        DataConvert dataConvert = (DataConvert) XMLUtils.getBean("convert");
        DatabaseObtainData obtainData = (DatabaseObtainData) XMLUtils.getBean("database");

        dataConvert.setDatabaseObtainData(obtainData);

        dataConvert.convert();
    }

}
