package com.gavin.creational.abstractfactory.skin.product;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author gf
 * @date 2018-09-14 18:23
 * @description Spring风格的按钮
 */
public class SpringButton implements Button {
    private static Logger logger = LoggerFactory.getLogger(SpringButton.class);

    @Override
    public void display() {
        logger.info("显示浅绿色按钮");
    }
}
