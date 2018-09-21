package com.gavin.structural.composite.control;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author gavin
 * @date 2018/9/21
 * @decription 按钮控件
 */
public class ButtonControl extends InterfaceControl {
    private static final Logger logger = LoggerFactory.getLogger(ButtonControl.class);

    private String name;

    public ButtonControl(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    void add(InterfaceControl interfaceControl) {
        logger.info("该类型不支持该方法");
    }

    @Override
    void remove(InterfaceControl interfaceControl) {
        logger.info("该类型不支持该方法");
    }

    @Override
    void operation() {
        logger.info("----{}进行操作",name);
    }

    @Override
    InterfaceControl getChild(int index) {
        logger.info("该类型不支持该方法");
        return null;
    }
}
