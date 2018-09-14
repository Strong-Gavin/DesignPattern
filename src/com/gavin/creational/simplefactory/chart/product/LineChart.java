package com.gavin.creational.simplefactory.chart.product;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author gf
 * @date 2018-09-14 14:40
 * @description 折线图
 */
public class LineChart implements Chart {
    private static final Logger logger = LoggerFactory.getLogger(LineChart.class);

    public LineChart(){
        logger.info("初始化折线图");
    }
    @Override
    public void display() {
        logger.info("显示折线图");
    }
}
