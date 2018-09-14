package com.gavin.creational.prototype.customer;

/**
 * @author gf
 * @date 2018-09-14 09:47
 * @description 客户端测试类
 */
public class Client {
    public static void main(String args[]){
        Customer origin = new Customer();
        origin.setName("gavin");
        Address address = new Address();
        address.setCountry("中国");
        address.setProvince("河北省");
        address.setCity("石家庄");
        origin.setAddress(address);

        /**
         * 浅克隆 只复制基本数据类型数值 不复制引用类型
         */
        Customer copy = origin.clone();
        System.out.println(origin==copy);
        System.out.println(origin.getAddress()==copy.getAddress());

        /**
         * 深克隆
         */
        Customer deepCopy = origin.deepClone();
        System.out.println(deepCopy==origin);
        System.out.println(origin.getAddress()==deepCopy.getAddress());
    }
}
