package com.gavin.creational.simplefactory.chart.factory;

import com.gavin.creational.simplefactory.chart.product.Chart;
import com.gavin.creational.simplefactory.chart.product.HistogramChart;
import com.gavin.creational.simplefactory.chart.product.LineChart;
import com.gavin.creational.simplefactory.chart.product.PieChart;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author gf
 * @date 2018-09-14 14:43
 * @description 图表工厂类
 */
public class ChartFactory {
    private static final Logger logger = LoggerFactory.getLogger(ChartFactory.class);

    public static Chart createChart(String type){
        Chart chart = null;
        if(type.equals("histogram")){
            chart = new HistogramChart();
            logger.info("初始化设置柱状图");
        }else if(type.equals("line")){
            chart = new LineChart();
            logger.info("初始化设置折线图");
        }else if(type.equals("pie")){
            chart = new PieChart();
            logger.info("初始化饼图");
        }else{
            logger.error("无{}类型图表",type);
        }
        return chart;
    }
}
