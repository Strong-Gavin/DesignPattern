package com.gavin.creational.prototype.customer;

import com.sun.xml.internal.messaging.saaj.util.ByteInputStream;

import java.io.*;

/**
 * @author gf
 * @date 2018-09-14 09:40
 * @description 客户类(原型模式练习)
 */
public class Customer implements Cloneable,Serializable {
    private String name; //客户姓名
    private Address address; //地址

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    /**
     * 默认是浅克隆
     */
    public Customer clone() {
        Customer copy = null;
        try {
            copy = (Customer) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("不支持复制");
        }
        return copy;
    }


    /**
     * 序列化 实现深克隆 需实现Serializable 引用类型成员变量也需实现Serializable接口
     * @return
     */
    public Customer deepClone(){
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(this);

            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
             Customer copy = (Customer) objectInputStream.readObject();
             return copy;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

}
