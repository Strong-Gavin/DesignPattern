package com.gavin.creational.abstractfactory.mobilegame.product;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author gf
 * @date 2018-09-15 14:51
 * @description Windows Mobile界面控制
 */
public class WindowsMobileInterfaceController implements InterfaceController {
    private static final Logger logger = LoggerFactory.getLogger(WindowsMobileInterfaceController.class);

    @Override
    public void controlInterface() {
        logger.info("Windows Mobile控制界面");
    }
}
