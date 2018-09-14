package com.gavin.creational.singleton.lazy;

/**
 * @author gf
 * @date 2018-09-14 10:25
 * @description 懒汉式单例第二种 方法加锁
 */
public class SingleTonWithMethodLock {

    private static SingleTonWithMethodLock instance = null;

    private SingleTonWithMethodLock(){

    }

    //方法加锁实现线程安全 (线程安全 整个方法加锁 比较浪费资源)
    public synchronized static SingleTonWithMethodLock getInstance(){
        if(instance==null){
            instance  = new SingleTonWithMethodLock();
        }
        return instance;
    }
}
