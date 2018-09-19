package com.gavin.structural.bridge.image.imageShow;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author gf
 * @description PNG格式图像:扩充抽象类
 * @date 2018-09-19 22:06
 */
public class PNGImage extends Image {
    private static Logger logger = LoggerFactory.getLogger(PNGImage.class);

    @Override
    public void parseFile(String fileName) {
        Matrix m = new Matrix();
        imageImpl.doPaint(m);
        logger.info("{},格式为BMP",fileName);
    }
}
