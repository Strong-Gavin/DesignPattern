package com.gavin.creational.builder.game;

/**
 * @author gf
 * @description 建造者模式 角色类
 * @date 2018-09-15 22:34
 */
public class Actor {
    private String type;
    private String sex;
    private String face;
    private String constume;
    private String hairstyle;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face;
    }

    public String getConstume() {
        return constume;
    }

    public void setConstume(String constume) {
        this.constume = constume;
    }

    public String getHairstyle() {
        return hairstyle;
    }

    public void setHairstyle(String hairstyle) {
        this.hairstyle = hairstyle;
    }
}
