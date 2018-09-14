package com.gavin.creational.simplefactory.chart.client;

import com.gavin.creational.simplefactory.chart.factory.ChartFactory;
import com.gavin.creational.simplefactory.chart.product.Chart;
import com.gavin.creational.simplefactory.chart.utils.XMLUtils;

/**
 * @author gf
 * @date 2018-09-14 15:02
 * @description 客户端测试类
 */
public class Client {

    public static void main(String[] args){
//        testWithFactoryMethod();
        testWithConfig();
    }

    private static void testWithConfig() {
        String type = XMLUtils.getChartType();
        Chart chart = ChartFactory.createChart(type);
        chart.display();
    }

    private static void testWithFactoryMethod() {
        Chart chart = ChartFactory.createChart("histogram");
        chart.display();
    }
}
