package com.gavin.creational.abstractfactory.mobilegame.factory;

import com.gavin.creational.abstractfactory.mobilegame.product.InterfaceController;
import com.gavin.creational.abstractfactory.mobilegame.product.OperationController;
import com.gavin.creational.abstractfactory.mobilegame.product.WindowsMobileInterfaceController;
import com.gavin.creational.abstractfactory.mobilegame.product.WindowsMobileOperationController;

/**
 * @author gf
 * @date 2018-09-15 15:32
 * @description WindowsMobile游戏工厂
 */
public class WindowsMobileGameFactory implements GameFactory {
    @Override
    public OperationController createOperationController() {
        return new WindowsMobileOperationController();
    }

    @Override
    public InterfaceController createInterfaceController() {
        return new WindowsMobileInterfaceController();
    }
}
