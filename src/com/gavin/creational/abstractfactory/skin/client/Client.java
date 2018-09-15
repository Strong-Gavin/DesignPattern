package com.gavin.creational.abstractfactory.skin.client;

import com.gavin.creational.abstractfactory.skin.factory.SkinFactory;
import com.gavin.creational.abstractfactory.skin.product.Button;
import com.gavin.creational.abstractfactory.skin.product.ComboBox;
import com.gavin.creational.abstractfactory.skin.product.TextField;
import com.gavin.creational.abstractfactory.skin.utils.XMLUtils;

/**
 * @author gf
 * @date 2018-09-15 09:17
 * @description 客户端测试类
 */
public class Client {
    public static void main(String args[]){
        SkinFactory skinFactory = (SkinFactory) XMLUtils.getBean();
        Button button = skinFactory.createButton();
        ComboBox comboBox = skinFactory.createComboBox();
        TextField textField = skinFactory.createTextField();
        button.display();
        comboBox.display();
        textField.display();
    }
}
