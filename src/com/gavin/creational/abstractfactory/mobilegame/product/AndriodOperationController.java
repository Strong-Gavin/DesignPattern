package com.gavin.creational.abstractfactory.mobilegame.product;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author gf
 * @date 2018-09-15 12:54
 * @description 安卓操作控制
 */
public class AndriodOperationController implements OperationController {
    private static final Logger logger = LoggerFactory.getLogger(AndriodOperationController.class);

    @Override
    public void controlOperation() {
        logger.info("安卓控制操作");
    }
}
