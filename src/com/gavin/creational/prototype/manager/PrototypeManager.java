package com.gavin.creational.prototype.manager;

import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.Hashtable;

/**
 * @author gf
 * @date 2018-09-13 19:07
 * @description 原型管理器(饿汉式单例模式实现)
 */
public class PrototypeManager {

    //定义一个HashTable 用于存储原型对象
    private Hashtable<String,OfficialDocument> prototypeTable = new Hashtable<>();

    //实例
    private static PrototypeManager instance = new PrototypeManager();

    private PrototypeManager() {
        prototypeTable.put("far",new FAR());
        prototypeTable.put("srs",new SRS());
    }

    public static PrototypeManager getInstance(){
        return instance;
    }

    /**
     * 增加新的公文对象
     *
     * @param key
     * @param officialDocument
     */
    public void addOfficialDocument(String key,OfficialDocument officialDocument){
        prototypeTable.put(key,officialDocument);
    }

    /**
     * 通过浅克隆获取新的公文对象
     *
     * @param key
     * @return
     */
    public OfficialDocument getOfficialDocument(String key){
        return prototypeTable.get(key).clone();
    }

}
