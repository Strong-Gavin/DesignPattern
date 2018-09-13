package com.gavin.creational.prototype.manager;

/**
 * @author gf
 * @date 2018-09-13 19:02
 * @description 软件需求规格说明书
 */
public class SRS implements OfficialDocument {

    @Override
    public OfficialDocument clone() {
        OfficialDocument srs = null;
        try {
            srs = (OfficialDocument) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("不支持克隆");
        }
        return srs;
    }

    @Override
    public void display() {
        System.out.println("<<可行性分析报告>>");
    }
}
