package com.gavin.creational.prototype.java;

/**
 * @author gf
 * @date 2018-09-10 11:10
 * @description java方式原型模式
 */
public class Client {

    public static void main(String args[]){
        ConcretePrototype concretePrototype = new ConcretePrototype();
        ConcretePrototype copy = concretePrototype.clone();
        System.out.println(concretePrototype==copy);
    }
}
