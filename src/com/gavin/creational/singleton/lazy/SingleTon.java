package com.gavin.creational.singleton.lazy;

/**
 * @author gf
 * @date 2018-09-14 10:21
 * @description 懒汉式单例第一种
 */
public class SingleTon {
    // 不直接初始化 使用时才初始化 延迟加载
    private static SingleTon instance = null;

    private SingleTon(){

    }

    public static SingleTon getInstance(){
        //使用时 进行初始化 但是有线程安全问题 多个线程同时 进入判断代码块 会创建多个实例
        if(instance==null){
            instance = new SingleTon();
        }
        return instance;
    }
}
