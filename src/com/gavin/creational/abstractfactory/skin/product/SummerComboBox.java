package com.gavin.creational.abstractfactory.skin.product;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author gf
 * @date 2018-09-15 08:42
 * @description Summer风格的组合框
 */
public class SummerComboBox implements ComboBox{
    private static final Logger logger  = LoggerFactory.getLogger(SummerComboBox.class);

    @Override
    public void display() {
        logger.info("显示蓝色边框组合框");
    }
}
