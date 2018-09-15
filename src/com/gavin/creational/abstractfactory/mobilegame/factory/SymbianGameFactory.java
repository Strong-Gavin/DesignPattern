package com.gavin.creational.abstractfactory.mobilegame.factory;

import com.gavin.creational.abstractfactory.mobilegame.product.InterfaceController;
import com.gavin.creational.abstractfactory.mobilegame.product.OperationController;
import com.gavin.creational.abstractfactory.mobilegame.product.SymbianInterfaceController;
import com.gavin.creational.abstractfactory.mobilegame.product.SymbianOperationController;

/**
 * @author gf
 * @date 2018-09-15 15:23
 * @description 塞班游戏工厂
 */
public class SymbianGameFactory implements GameFactory {
    @Override
    public OperationController createOperationController() {
        return new SymbianOperationController();
    }

    @Override
    public InterfaceController createInterfaceController() {
        return new SymbianInterfaceController();
    }
}
