package com.gavin.creational.abstractfactory.mobilegame.factory;

import com.gavin.creational.abstractfactory.mobilegame.product.AndriodInterfaceController;
import com.gavin.creational.abstractfactory.mobilegame.product.AndriodOperationController;
import com.gavin.creational.abstractfactory.mobilegame.product.InterfaceController;
import com.gavin.creational.abstractfactory.mobilegame.product.OperationController;

/**
 * @author gf
 * @date 2018-09-15 15:31
 * @description 安卓游戏工厂
 */
public class AndriodGameFactory implements GameFactory {
    @Override
    public OperationController createOperationController() {
        return new AndriodOperationController();
    }

    @Override
    public InterfaceController createInterfaceController() {
        return new AndriodInterfaceController();
    }
}
