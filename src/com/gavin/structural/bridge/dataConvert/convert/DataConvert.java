package com.gavin.structural.bridge.dataConvert.convert;

import com.gavin.structural.bridge.dataConvert.obtainData.DatabaseObtainData;

/**
 * @author gf
 * @description 数据转换抽象类
 * @date 2018-09-19 22:44
 */
public abstract class DataConvert {

    protected DatabaseObtainData databaseObtainData;

    public DatabaseObtainData getDatabaseObtainData() {
        return databaseObtainData;
    }

    public void setDatabaseObtainData(DatabaseObtainData databaseObtainData) {
        this.databaseObtainData = databaseObtainData;
    }

    public abstract void convert();
}
