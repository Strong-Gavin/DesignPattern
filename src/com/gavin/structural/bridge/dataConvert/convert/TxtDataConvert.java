package com.gavin.structural.bridge.dataConvert.convert;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author gf
 * @description Txt数据转换类
 * @date 2018-09-19 22:46
 */
public class TxtDataConvert extends DataConvert {
    private static final Logger logger = LoggerFactory.getLogger(TxtDataConvert.class);

    @Override
    public void convert() {
        String s = databaseObtainData.obtainData();
        logger.info("{}转换为Txt",s);
    }
}
