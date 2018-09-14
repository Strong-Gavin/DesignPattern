package com.gavin.creational.singleton.hunger;

/**
 * @author gf
 * @date 2018-09-14 10:11
 * @description 饿汉式单例第一种 定义时初始化  线程安全(加载类时就初始化 耗费资源)
 */
public class SingleTon {

    //自行实例化该实例
    private static final SingleTon instance = new SingleTon();

    //构造函数私有化 保证只有一个实例
    private SingleTon(){

    }

    //静态方法向系统提供这个实例
    public static SingleTon getInstance(){
        return instance;
    }
}
