package com.gavin.creational.factorymethod.picture.factory;

import com.gavin.creational.factorymethod.picture.product.JPGReader;
import com.gavin.creational.factorymethod.picture.product.PictureReader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author gf
 * @date 2018-09-14 17:22
 * @description JPG图片阅读器工厂
 */
public class JPGReaderFactory implements PictureReaderFactory {
    private static final Logger logger = LoggerFactory.getLogger(JPGReaderFactory.class);


    @Override
    public PictureReader createPictureReader() {
        PictureReader pictureReader  = new JPGReader();
        return pictureReader;
    }
}
