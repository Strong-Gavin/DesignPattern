package com.gavin.structural.composite.control;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author gavin
 * @date 2018/9/21
 * @decription 窗体控件
 */
public class Window extends InterfaceControl {

    private static final Logger logger = LoggerFactory.getLogger(Window.class);

    private List<InterfaceControl> controlList = new ArrayList<>();

    private String name;

    public Window(String name){
        this.name = name;
    }

    @Override
    void add(InterfaceControl interfaceControl) {
        controlList.add(interfaceControl);
    }

    @Override
    void remove(InterfaceControl interfaceControl) {
        controlList.remove(interfaceControl);
    }

    @Override
    void operation() {
        logger.info("{}进行操作",name);
        for (InterfaceControl control:controlList) {
            control.operation();
        }
    }

    @Override
    InterfaceControl getChild(int index) {

        return controlList.get(index);
    }
}
