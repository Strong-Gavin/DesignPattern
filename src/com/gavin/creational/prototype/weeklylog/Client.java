package com.gavin.creational.prototype.weeklylog;

import java.io.IOException;

/**
 * @author gf
 * @date 2018-09-10 11:16
 * @description 客户端测试类
 */
public class Client {
    public static void main(String args[]) {
//        testPrototype();
//        testPrototypeWithShallowClone();
//        testPrototypeWithDeepClone();
        testPrototypeWithDeepCloneSerializable();
    }

    /**
     * 测试深拷贝 序列化
     */
    private static void testPrototypeWithDeepCloneSerializable() {
        WeeklyLog log_previous,log_new=null;
        log_previous = new WeeklyLog(); //创建原型对象
        Attachment attachment = new Attachment(); //创建附件对象
        log_previous.setAttachment(attachment);
        try {
            log_new = log_previous.deepClone(); //调用克隆方法创建克隆对象
        } catch (Exception e) {
            System.out.println("克隆失败");
        }
        //比较周报
        System.out.println("周报是否相同?"+(log_previous==log_new));
        System.out.println("附件是否相同?"+(log_previous.getAttachment()==log_new.getAttachment()));
    }

    /**
     * 测试深拷贝(clone接口方式)
     */
    private static void testPrototypeWithDeepClone() {
        WeeklyLog log_previous,log_new;
        log_previous = new WeeklyLog(); //创建原型对象
        Attachment attachment = new Attachment(); //创建附件对象
        log_previous.setAttachment(attachment);
        log_new = log_previous.clone(); //调用克隆方法创建克隆对象
        //比较周报
        System.out.println("周报是否相同?"+(log_previous==log_new));
        System.out.println("附件是否相同?"+(log_previous.getAttachment()==log_new.getAttachment()));
    }

    /**
     * 测试浅拷贝
     */
    private static void testPrototypeWithShallowClone() {
        WeeklyLog log_previous,log_new;
        log_previous = new WeeklyLog(); //创建原型对象
        Attachment attachment = new Attachment(); //创建附件对象
        log_previous.setAttachment(attachment);
        log_new = log_previous.clone(); //调用克隆方法创建克隆对象
        //比较周报
        System.out.println("周报是否相同?"+(log_previous==log_new));
        System.out.println("附件是否相同?"+(log_previous.getAttachment()==log_new.getAttachment()));
    }

    /**
     * 测试原型模式
     */
    private static void testPrototype() {
        WeeklyLog log_previous = new WeeklyLog(); //创建原型对象
        log_previous.setName("张无忌");
        log_previous.setDate("第12周");
        log_previous.setContent("这周工作很忙，每天加班！");
        System.out.println("****周报****");
        System.out.println("周次：" + log_previous.getDate());
        System.out.println("姓名：" + log_previous.getName());
        System.out.println("内容：" + log_previous.getContent());
        System.out.println("--------------------------------");
        WeeklyLog log_new;
        log_new = log_previous.clone(); //调用克隆方法创建克隆对象
        log_new.setDate("第13周");
        System.out.println("****周报****");
        System.out.println("周次：" + log_new.getDate());
        System.out.println("姓名：" + log_new.getName());
        System.out.println("内容：" + log_new.getContent());

        System.out.println(log_previous == log_new);
        System.out.println(log_previous.getDate() == log_new.getDate());
        System.out.println(log_previous.getName() == log_new.getName());
        System.out.println(log_previous.getContent() == log_new.getContent());
    }
}
