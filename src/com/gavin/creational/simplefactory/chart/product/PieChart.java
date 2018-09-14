package com.gavin.creational.simplefactory.chart.product;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author gf
 * @date 2018-09-14 14:41
 * @description 饼图
 */
public class PieChart implements Chart {

    private static Logger logger = LoggerFactory.getLogger(PieChart.class);

    public PieChart(){
        logger.info("创建饼图");
    }

    @Override
    public void display() {
        logger.info("显示饼图");
    }
}
