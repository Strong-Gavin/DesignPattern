package com.gavin.creational.builder;

/**
 * @author gf
 * @description 角色建造者抽象类
 * @date 2018-09-15 22:36
 */
public abstract class ActorBuilder {
    Actor actor = new Actor();

    public abstract void buildType();

    public abstract void buildSex();

    public abstract void buildFace();

    public abstract void buildCostume();

    public abstract void buildHairstyle();

    public  Actor createActor(){
        return actor;
    }

}
