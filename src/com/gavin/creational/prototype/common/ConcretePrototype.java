package com.gavin.creational.prototype.common;

/**
 * @author gf
 * @date 2018-09-10 10:58
 * @description (通用方式的原型模式实现)具体原型类
 */
public class ConcretePrototype implements ProtoType {
    private String attr; //成员属性

    public String getAttr() {
        return attr;
    }

    public void setAttr(String attr) {
        this.attr = attr;
    }

    @Override
    public String toString() {
        return "ConcretePrototype{" +
                "attr='" + attr + '\'' +
                '}';
    }

    @Override
    public ProtoType clone() {
        ProtoType protoType = new ConcretePrototype(); //创建新对象
        ((ConcretePrototype) protoType).setAttr(attr);
        return protoType;
    }
}
