package com.gavin.creational.abstractfactory.mobilegame.factory;

import com.gavin.creational.abstractfactory.mobilegame.product.InterfaceController;
import com.gavin.creational.abstractfactory.mobilegame.product.OperationController;

/**
 * @author gf
 * @date 2018-09-15 15:20
 * @description 游戏工厂
 */
public interface GameFactory {

    OperationController createOperationController();

    InterfaceController createInterfaceController();
}
