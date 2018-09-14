package com.gavin.creational.abstractfactory.skin.product;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author gf
 * @date 2018-09-14 18:23
 * @description Summer风格的Button
 */
public class SummerButton implements Button {
    private static final Logger logger = LoggerFactory.getLogger(SummerButton.class);

    @Override
    public void display() {
        logger.info("显示浅蓝色按钮");
    }
}
