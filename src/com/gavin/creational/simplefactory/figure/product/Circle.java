package com.gavin.creational.simplefactory.figure.product;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author gf
 * @date 2018-09-14 15:43
 * @description 圆形
 */
public class Circle implements Figure {
    private static final Logger logger = LoggerFactory.getLogger(Circle.class);

    public Circle(){}

    @Override
    public void draw() {
        logger.info("绘制圆形");
    }

    @Override
    public void erase() {
        logger.info("擦除圆形");
    }
}
