package com.gavin.creational.abstractfactory.mobilegame.product;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author gf
 * @date 2018-09-15 11:49
 * @description 塞班操作控制实现
 */
public class SymbianOperationController implements OperationController {
    private static final Logger logger = LoggerFactory.getLogger(SymbianInterfaceController.class);

    @Override
    public void controlOperation() {
        logger.info("塞班控制操作");
    }
}
