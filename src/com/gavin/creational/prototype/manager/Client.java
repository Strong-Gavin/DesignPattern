package com.gavin.creational.prototype.manager;

/**
 * @author gf
 * @date 2018-09-13 19:17
 * @description 客户端测试类
 */
public class Client {

    public static void main(String args[]){
        //获取原型管理器对象
        PrototypeManager prototypeManager = PrototypeManager.getInstance();

        OfficialDocument doc1,doc2,doc3,doc4;

        doc1 = prototypeManager.getOfficialDocument("far");
        doc1.display();
        doc2 = prototypeManager.getOfficialDocument("far");
        doc2.display();
        System.out.println(doc1==doc2);

        doc3 = prototypeManager.getOfficialDocument("srs");
        doc3.display();
        doc4 = prototypeManager.getOfficialDocument("srs");
        doc4.display();
        System.out.println(doc3==doc4);

    }
}
