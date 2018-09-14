package com.gavin.creational.simplefactory.figure.product;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author gf
 * @date 2018-09-14 15:49
 * @description 三角形
 */
public class Triangle implements Figure {
    private static final Logger logger = LoggerFactory.getLogger(Triangle.class);

    @Override
    public void draw() {
        logger.info("绘制三角形");
    }

    @Override
    public void erase() {
        logger.info("擦除三角形");
    }
}
