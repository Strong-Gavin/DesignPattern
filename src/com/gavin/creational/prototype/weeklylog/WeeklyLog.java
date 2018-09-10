package com.gavin.creational.prototype.weeklylog;

import java.io.*;

/**
 * @author gf
 * @date 2018-09-10 11:12
 * @description 具体原型类(周报场景 每周周报类似 利用原型模式作为模板 创建新周报)
 */
public class WeeklyLog implements Cloneable,Serializable {
    private String name;
    private String date;
    private String content;

    /**
     * 附件类 深克隆和浅克隆区别
     */
    private Attachment attachment;

    public Attachment getAttachment() {
        return attachment;
    }

    public void setAttachment(Attachment attachment) {
        this.attachment = attachment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    /**
     * 深拷贝 一种方式 引用类型多层次调用clone
     */
    public WeeklyLog clone()  {
        WeeklyLog obj = null;
        try {
            Attachment attachment = this.attachment.clone();
            obj = (WeeklyLog) super.clone();
            obj.setAttachment(attachment);
            return  obj;
        } catch (CloneNotSupportedException e) {
            System.out.println("不支持复制");
            return null;
        }
    }

    public WeeklyLog deepClone() throws IOException, ClassNotFoundException {
        //将对象写入流里
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(this);

        //将对象从流中取出
        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        return (WeeklyLog) ois.readObject();
    }

}
