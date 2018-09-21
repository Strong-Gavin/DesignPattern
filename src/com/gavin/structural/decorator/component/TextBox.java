package com.gavin.structural.decorator.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author gavin
 * @date 2018/9/21
 * @decription
 */
public class TextBox extends Component {

    private static final Logger logger = LoggerFactory.getLogger(TextBox.class);

    @Override
    void display() {
        logger.info("显示文本框");
    }
}
