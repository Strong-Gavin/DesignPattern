package com.gavin.structural.composite.control;

/**
 * @author gavin
 * @date 2018/9/21
 * @decription 界面控件抽象类
 */
public abstract class InterfaceControl {

   abstract void add(InterfaceControl interfaceControl);

   abstract void remove(InterfaceControl interfaceControl);

   abstract void operation();

   abstract InterfaceControl getChild(int index);
}
