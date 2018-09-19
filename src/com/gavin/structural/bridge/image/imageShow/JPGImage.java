package com.gavin.structural.bridge.image.imageShow;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author gf
 * @description JPG格式图像：扩充抽象类
 * @date 2018-09-19 21:47
 */
public class JPGImage extends Image {
    private static final Logger logger = LoggerFactory.getLogger(JPGImage.class);

    @Override
    public void parseFile(String fileName) {
        Matrix m = new Matrix();
        imageImpl.doPaint(m);
        logger.info("{}，格式为JPG",fileName);
    }
}
