package com.gavin.creational.factorymethod.picture.factory;

import com.gavin.creational.factorymethod.picture.product.PictureReader;

/**
 * @author gf
 * @date 2018-09-14 17:10
 * @description 图片读取器工厂
 */
public interface PictureReaderFactory {
    PictureReader createPictureReader();
}
