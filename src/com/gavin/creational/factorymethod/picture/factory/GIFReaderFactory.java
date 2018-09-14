package com.gavin.creational.factorymethod.picture.factory;

import com.gavin.creational.factorymethod.picture.product.GIFReader;
import com.gavin.creational.factorymethod.picture.product.PictureReader;

/**
 * @author gf
 * @date 2018-09-14 17:19
 * @description GIF图片阅读器工厂
 */
public class GIFReaderFactory implements PictureReaderFactory {
    @Override
    public PictureReader createPictureReader() {
        GIFReader gifReader = new GIFReader();
        return gifReader;
    }
}
