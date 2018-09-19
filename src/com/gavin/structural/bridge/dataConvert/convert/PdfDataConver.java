package com.gavin.structural.bridge.dataConvert.convert;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author gf
 * @description PDF格式转换
 * @date 2018-09-19 22:56
 */
public class PdfDataConver extends DataConvert {
    private static final Logger logger = LoggerFactory.getLogger(PdfDataConver.class);

    @Override
    public void convert() {
        String s = databaseObtainData.obtainData();
        logger.info("{}转换为PDF",s);
    }
}
