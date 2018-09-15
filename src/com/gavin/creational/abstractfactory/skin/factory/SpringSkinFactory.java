package com.gavin.creational.abstractfactory.skin.factory;

import com.gavin.creational.abstractfactory.skin.product.*;

/**
 * @author gf
 * @date 2018-09-15 09:08
 * @description Spring风格皮肤工厂
 */
public class SpringSkinFactory implements SkinFactory {
    @Override
    public Button createButton() {
        return new SpringButton();
    }

    @Override
    public ComboBox createComboBox() {
        return new SpringComboBox();
    }

    @Override
    public TextField createTextField() {
        return new SpringTextField();
    }
}
