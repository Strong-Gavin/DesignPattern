package com.gavin.structural.decorator.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author gavin
 * @date 2018/9/21
 * @decription 具体构建类
 */
public class Window extends Component {

    private static final Logger logger = LoggerFactory.getLogger(Window.class);

    @Override
    void display() {
        logger.info("显示窗体");
    }
}
