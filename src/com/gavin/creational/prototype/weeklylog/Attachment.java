package com.gavin.creational.prototype.weeklylog;

import java.io.Serializable;

/**
 * @author gf
 * @date 2018-09-10 11:26
 * @description 附件类(为了实现深克隆) 实现(cloneable serializable接口实现两种方式深拷贝)
 */
public class Attachment implements Cloneable,Serializable {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void download(){
        System.out.println("下载文件，文件名为"+name);
    }

    @Override
    public Attachment clone() {
        Object clone = null;
        try {
            clone= super.clone();
            return (Attachment) clone;
        } catch (CloneNotSupportedException e) {
            System.out.println("不支持复制");
            return null;
        }
    }
}
