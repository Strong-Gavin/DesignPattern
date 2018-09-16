package com.gavin.creational.builder.game;

/**
 * @author gf
 * @description 天使角色建造者类
 * @date 2018-09-15 22:43
 */
public class AngleBuilder extends ActorBuilder {
    @Override
    public void buildType() {
        actor.setType("天使");
    }

    @Override
    public void buildSex() {
        actor.setSex("女");
    }

    @Override
    public void buildFace() {
        actor.setFace("漂亮");
    }

    @Override
    public void buildCostume() {
        actor.setConstume("白裙");
    }

    @Override
    public void buildHairstyle() {
        actor.setHairstyle("披肩长发");
    }
}
