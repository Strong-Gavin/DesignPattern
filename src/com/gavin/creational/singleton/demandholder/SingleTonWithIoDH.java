package com.gavin.creational.singleton.demandholder;

/**
 * @author gf
 * @date 2018-09-14 10:58
 * @description 静态内部类 实现单例 (延迟加载 线程安全)
 */
public class SingleTonWithIoDH {
    private SingleTonWithIoDH(){}

    private static class HolderClass{
        private static final SingleTonWithIoDH instance = new SingleTonWithIoDH();
    }

    private static SingleTonWithIoDH getInstance(){
        return HolderClass.instance;
    }
}
