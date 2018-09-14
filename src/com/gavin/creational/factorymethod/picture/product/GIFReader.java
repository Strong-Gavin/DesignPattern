package com.gavin.creational.factorymethod.picture.product;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author gf
 * @date 2018-09-14 17:12
 * @description GIF图片读取器
 */
public class GIFReader implements PictureReader {
    private static final Logger logger = LoggerFactory.getLogger(GIFReader.class);

    public GIFReader(){
        logger.info("新建gif阅读器");
    }

    @Override
    public void read() {
        logger.info("读取gif图片");
    }
}
