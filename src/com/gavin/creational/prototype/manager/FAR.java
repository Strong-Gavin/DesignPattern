package com.gavin.creational.prototype.manager;

/**
 * @author gf
 * @date 2018-09-13 14:45
 * @description 可行性分析报告
 */
public class FAR implements OfficialDocument {
    @Override
    public OfficialDocument clone() {
        OfficialDocument far = null;
        try {
            far = (OfficialDocument) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("不支持克隆");
        }
        return far;
    }

    @Override
    public void display() {
        System.out.println("<<可行性分析报告>>");
    }
}
