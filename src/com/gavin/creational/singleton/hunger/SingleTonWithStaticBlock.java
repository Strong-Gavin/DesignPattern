package com.gavin.creational.singleton.hunger;

/**
 * @author gf
 * @date 2018-09-14 10:14
 * @description 饿汉式单例 第二种 静态代码块初始化 线程安全(加载类时初始化 耗费资源)
 */
public class SingleTonWithStaticBlock {
    private static SingleTonWithStaticBlock instance = null;

    static {
        instance = new SingleTonWithStaticBlock();
    }

    private SingleTonWithStaticBlock(){}

    public static SingleTonWithStaticBlock getInstance() {
        return instance;
    }

}
