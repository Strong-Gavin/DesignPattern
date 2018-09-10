package com.gavin.creational.prototype.java;

/**
 * @author gf
 * @date 2018-09-10 11:04
 * @description 具体原型类
 */
public class ConcretePrototype implements Cloneable {

    @Override
    public ConcretePrototype clone(){
        Object object = null;
        try {
            object = super.clone();
        }catch (CloneNotSupportedException e){
            System.out.println("不支持克隆");
        }
        return (ConcretePrototype) object;
    }
}
