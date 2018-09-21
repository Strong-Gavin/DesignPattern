package com.gavin.structural.composite.control;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author gavin
 * @date 2018/9/21
 * @decription 面板控件
 */
public class Panel extends InterfaceControl {

    private static final Logger logger = LoggerFactory.getLogger(Panel.class);

    private  List<InterfaceControl> controlList = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public Panel(String name){
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
