package com.gavin.creational.abstractfactory.skin.product;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author gf
 * @date 2018-09-15 08:41
 * @description Spring风格的下拉菜单
 */
public class SpringComboBox implements ComboBox {
    private static final Logger logger = LoggerFactory.getLogger(SpringComboBox.class);

    @Override
    public void display() {
        logger.info("显示绿色边框组合框");
    }
}
