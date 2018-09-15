package com.gavin.creational.abstractfactory.skin.factory;

import com.gavin.creational.abstractfactory.skin.product.Button;
import com.gavin.creational.abstractfactory.skin.product.ComboBox;
import com.gavin.creational.abstractfactory.skin.product.TextField;

/**
 * @author gf
 * @date 2018-09-15 09:06
 * @description 皮肤工厂接口
 */
public interface SkinFactory {
    Button createButton();

    ComboBox createComboBox();

    TextField createTextField();
}
