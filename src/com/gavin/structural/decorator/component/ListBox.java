package com.gavin.structural.decorator.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author gavin
 * @date 2018/9/21
 * @decription 列表框
 */
public class ListBox extends Component {
    private static final Logger logger = LoggerFactory.getLogger(ListBox.class);

    @Override
    void display() {
        logger.info("显示列表框");
    }
}
