package com.gavin.structural.decorator.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author gavin
 * @date 2018/9/21
 * @decription 黑色边框装饰类
 */
public class BlackBorderDecorator extends ComponentDecorator {
    private static final Logger logger = LoggerFactory.getLogger(BlackBorderDecorator.class);

    public BlackBorderDecorator(Component component) {
        super(component);
    }

    @Override
    void display() {
        this.setBlackBorder();
        super.display();
    }

    public void setBlackBorder() {
        logger.info("为构件增加黑色边框");
    }
}
