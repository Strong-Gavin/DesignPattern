package com.gavin.creational.simplefactory.figure.product;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author gf
 * @date 2018-09-14 15:45
 * @description 方形
 */
public class Square implements Figure {
    private static Logger logger = LoggerFactory.getLogger(Square.class);
    public Square(){}

    @Override
    public void draw() {
        logger.info("绘制方形");
    }

    @Override
    public void erase() {
        logger.info("擦除方形");
    }
}
