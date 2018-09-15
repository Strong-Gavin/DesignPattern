package com.gavin.creational.abstractfactory.skin.product;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author gf
 * @date 2018-09-15 08:49
 * @description Spring风格的文本框
 */
public class SummerTextField implements TextField {
    private static final Logger logger = LoggerFactory.getLogger(SummerTextField.class);

    @Override
    public void display() {
        logger.info("显示蓝色边框文本框");
    }
}
