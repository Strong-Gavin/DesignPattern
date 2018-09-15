package com.gavin.creational.abstractfactory.mobilegame.client;


import com.gavin.creational.abstractfactory.mobilegame.factory.GameFactory;
import com.gavin.creational.abstractfactory.mobilegame.product.InterfaceController;
import com.gavin.creational.abstractfactory.mobilegame.product.OperationController;
import com.gavin.creational.abstractfactory.mobilegame.utils.XMLUtils;

/**
 * @author gf
 * @date 2018-09-14 17:56
 * @description 客户端测试类
 */
public class Client {
    public static void main(String[] args){
        GameFactory gameFactory = (GameFactory) XMLUtils.getBean();
        InterfaceController interfaceController = gameFactory.createInterfaceController();
        OperationController operationController = gameFactory.createOperationController();
        interfaceController.controlInterface();
        operationController.controlOperation();
    }
}
