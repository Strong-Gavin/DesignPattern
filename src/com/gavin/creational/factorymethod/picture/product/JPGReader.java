package com.gavin.creational.factorymethod.picture.product;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author gf
 * @date 2018-09-14 17:17
 * @description JPG图片阅读器
 */
public class JPGReader implements PictureReader {
    private static final Logger logger = LoggerFactory.getLogger(JPGReader.class);

    public JPGReader(){
        logger.info("新建JPG图片读取器");
    }
    @Override
    public void read() {
        logger.info("读取jpg图片");
    }
}
