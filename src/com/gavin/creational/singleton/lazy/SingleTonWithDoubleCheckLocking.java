package com.gavin.creational.singleton.lazy;

/**
 * @author gf
 * @date 2018-09-14 10:39
 * @description 懒汉式单例 第四种 双重检查锁定(线程安全)
 */
public class SingleTonWithDoubleCheckLocking {
    private volatile static SingleTonWithDoubleCheckLocking instance = null;

    private SingleTonWithDoubleCheckLocking(){}

    public static SingleTonWithDoubleCheckLocking getInstance(){
        //第一种判断
        if(instance==null){
            //锁定代码块
            synchronized (SingleTonWithDoubleCheckLocking.class){
                //第二重判断
                if(instance==null){
                    instance = new SingleTonWithDoubleCheckLocking();
                }
            }
        }
        return instance;
    }
}
