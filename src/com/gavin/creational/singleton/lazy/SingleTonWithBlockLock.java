package com.gavin.creational.singleton.lazy;

/**
 * @author gf
 * @date 2018-09-14 10:33
 * @description 懒汉式单例 第三种 代码块加锁
 */
public class SingleTonWithBlockLock {

    private static SingleTonWithBlockLock instance = null;

    private SingleTonWithBlockLock(){

    }

    public static SingleTonWithBlockLock getInstance(){
        if(instance==null){
            //代码块加锁 减少资源浪费 提高系统性能 但是同样存在线程安全问题(同懒汉式单例第一种一样 多个线程同时进入条件判定 会导致多个实例)
            synchronized (SingleTonWithBlockLock.class){
                instance = new SingleTonWithBlockLock();
            }
        }
        return instance;
    }
}
