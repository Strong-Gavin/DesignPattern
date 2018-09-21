package com.gavin.structural.decorator.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author gavin
 * @date 2018/9/21
 * @decription 具体装饰类 滚动条装饰
 */
public class ScorllBarDecorator extends ComponentDecorator {

    private static final Logger logger = LoggerFactory.getLogger(ScorllBarDecorator.class);

    public ScorllBarDecorator(Component component) {
        super(component);
    }

    @Override
    void display() {
        this.setScrollBar();
        super.display();
    }

    public void setScrollBar() {
        logger.info("为构件增加滚动条");
    }
}
