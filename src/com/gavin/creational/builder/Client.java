package com.gavin.creational.builder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author gf
 * @description 客户端测试
 * @date 2018-09-15 22:53
 */
public class Client {

    private static final Logger logger = LoggerFactory.getLogger(Client.class);


    public static void main(String args[]){

        ActorBuilder actorBuilder = (ActorBuilder) XMLUtils.getBean();
        ActorController actorController = new ActorController();
        Actor actor = actorController.construct(actorBuilder);
        String type = actor.getType();
        logger.info("{}的外观:",type);
        logger.info("性别:{}",actor.getSex());
        logger.info("面容:{}",actor.getFace());
        logger.info("服装:{}",actor.getConstume());
        logger.info("发型:{}",actor.getHairstyle());
    }
}
