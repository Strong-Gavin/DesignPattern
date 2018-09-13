package com.gavin.creational.prototype.manager;

/**
 * @author gf
 * @date 2018-09-13 14:40
 * @description 抽象原型接口(原型管理器Demo)
 */
public interface OfficialDocument extends Cloneable{

    /**
     * clone方法
     * @return
     */
     OfficialDocument clone();


     void display();
}
