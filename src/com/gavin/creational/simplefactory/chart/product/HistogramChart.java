package com.gavin.creational.simplefactory.chart.product;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author gf
 * @date 2018-09-14 13:58
 * @description 柱状图图表
 */
public class HistogramChart implements Chart {

    private static final Logger logger = LoggerFactory.getLogger(HistogramChart.class);

    public HistogramChart(){
       logger.info("创建柱状图");
    }

    @Override
    public void display() {
        logger.info("显示柱状图");
    }
}
