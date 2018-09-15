package com.gavin.creational.abstractfactory.mobilegame.product;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author gf
 * @date 2018-09-15 11:48
 * @description 塞班界面控制实现
 */
public class SymbianInterfaceController implements InterfaceController {
    private static final Logger logger = LoggerFactory.getLogger(SymbianInterfaceController.class);

    @Override
    public void controlInterface() {
        logger.info("塞班控制界面");
    }
}
