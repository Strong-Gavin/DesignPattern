package com.gavin.structural.bridge.image.imageShow;

import com.gavin.structural.bridge.image.imageImpl.ImageImpl;

/**
 * @author gf
 * @description 图像抽象类
 * @date 2018-09-19 21:44
 */
public abstract class Image {
    protected ImageImpl imageImpl;

    public ImageImpl getImage() {
        return imageImpl;
    }

    public void setImage(ImageImpl imageImpl) {
        this.imageImpl = imageImpl;
    }

    public abstract void  parseFile(String fileName);
}
