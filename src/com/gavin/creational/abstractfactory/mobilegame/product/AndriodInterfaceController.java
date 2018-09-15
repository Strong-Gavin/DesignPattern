package com.gavin.creational.abstractfactory.mobilegame.product;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author gf
 * @date 2018-09-15 12:54
 * @description 安卓界面控制
 */
public class AndriodInterfaceController implements InterfaceController {
    private static final Logger logger  = LoggerFactory.getLogger(AndriodInterfaceController.class);

    @Override
    public void controlInterface() {
        logger.info("安卓控制界面");
    }
}
