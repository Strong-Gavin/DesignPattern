package com.gavin.creational.builder;

/**
 * @author gf
 * @description 指挥者
 * @date 2018-09-15 22:49
 */
public class ActorController {

    public Actor construct(ActorBuilder actorBuilder){
        actorBuilder.buildType();
        actorBuilder.buildSex();
        actorBuilder.buildFace();
        actorBuilder.buildCostume();
        actorBuilder.buildHairstyle();
        Actor actor = actorBuilder.createActor();
        return actor;
    }
}
