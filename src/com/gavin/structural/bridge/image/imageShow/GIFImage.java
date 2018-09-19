package com.gavin.structural.bridge.image.imageShow;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author gf
 * @description GIF格式图像：扩充抽象类
 * @date 2018-09-19 22:08
 */
public class GIFImage extends Image {
    private static final Logger logger = LoggerFactory.getLogger(GIFImage.class);

    @Override
    public void parseFile(String fileName) {
        Matrix m = new Matrix();
        imageImpl.doPaint(m);
        logger.info("{},格式为GIF");
    }
}
