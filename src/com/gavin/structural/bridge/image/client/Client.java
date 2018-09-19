package com.gavin.structural.bridge.image.client;

import com.gavin.structural.bridge.image.imageImpl.ImageImpl;
import com.gavin.structural.bridge.image.imageShow.Image;

/**
 * @author gf
 * @description
 * @date 2018-09-19 22:23
 */
public class Client {

    public static void main(String[] args){
        Image image = (Image) XMLUtils.getBean("image");
        ImageImpl imageImpl = (ImageImpl) XMLUtils.getBean("imageImpl");

        image.setImage(imageImpl);
        image.parseFile("小龙女");
    }
}
