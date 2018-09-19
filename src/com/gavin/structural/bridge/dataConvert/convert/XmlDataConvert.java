package com.gavin.structural.bridge.dataConvert.convert;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author gf
 * @description XML数据转换
 * @date 2018-09-19 22:54
 */
public class XmlDataConvert extends DataConvert {
    private static final Logger logger = LoggerFactory.getLogger(XmlDataConvert.class);

    @Override
    public void convert() {
        String s = databaseObtainData.obtainData();
        logger.info("{}转换为XML",s);
    }
}
