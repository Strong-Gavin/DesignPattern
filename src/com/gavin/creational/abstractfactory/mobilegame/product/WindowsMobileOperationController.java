package com.gavin.creational.abstractfactory.mobilegame.product;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author gf
 * @date 2018-09-15 14:52
 * @description Windows Mobile 操作控制
 */
public class WindowsMobileOperationController implements OperationController {
    private static final Logger logger  = LoggerFactory.getLogger(WindowsMobileInterfaceController.class);

    @Override
    public void controlOperation() {
        logger.info("Windows Mobile 控制操作");
    }
}
