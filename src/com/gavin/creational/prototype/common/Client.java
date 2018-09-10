package com.gavin.creational.prototype.common;

/**
 * @author gf
 * @date 2018-09-10 11:00
 * @description 测试通用原型模式
 */
public class Client {
    public static void main(String args[]){
        ProtoType protoType = new ConcretePrototype();
        ((ConcretePrototype) protoType).setAttr("JAVA");
        ProtoType copy = protoType.clone();
        System.out.println(copy);
    }
}
