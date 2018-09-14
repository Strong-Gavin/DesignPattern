package com.gavin.creational.factorymethod.picture.client;


import com.gavin.creational.factorymethod.picture.factory.PictureReaderFactory;
import com.gavin.creational.factorymethod.picture.product.PictureReader;
import com.gavin.creational.factorymethod.picture.utils.XMLUtils;

/**
 * @author gf
 * @date 2018-09-14 17:56
 * @description 客户端测试类
 */
public class Client {
    public static void main(String[] args){
        PictureReaderFactory readerFactory = (PictureReaderFactory) XMLUtils.getBean();
        PictureReader pictureReader = readerFactory.createPictureReader();
        pictureReader.read();
    }
}
