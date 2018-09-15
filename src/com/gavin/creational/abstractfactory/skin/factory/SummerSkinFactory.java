package com.gavin.creational.abstractfactory.skin.factory;

import com.gavin.creational.abstractfactory.skin.product.*;
import javafx.scene.control.Skin;

/**
 * @author gf
 * @date 2018-09-15 09:09
 * @description Summer风格的皮肤工厂
 */
public class SummerSkinFactory implements SkinFactory {
    @Override
    public Button createButton() {
        return new SummerButton();
    }

    @Override
    public ComboBox createComboBox() {
        return new SummerComboBox();
    }

    @Override
    public TextField createTextField() {
        return new SummerTextField();
    }
}
