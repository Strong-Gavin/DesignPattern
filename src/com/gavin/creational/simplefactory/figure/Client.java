package com.gavin.creational.simplefactory.figure;

import com.gavin.creational.simplefactory.figure.customexception.UnSupportedShapeException;
import com.gavin.creational.simplefactory.figure.factory.FigureFactory;
import com.gavin.creational.simplefactory.figure.product.Figure;
import com.gavin.creational.simplefactory.figure.utils.XMLUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author gf
 * @date 2018-09-14 16:06
 * @description 客户端测试类
 */
public class Client {
    private static final Logger logger = LoggerFactory.getLogger(Client.class);

    public static void main(String args[]){
        String type = XMLUtils.getFigureType();
        try {
            Figure figure = FigureFactory.createFigure(type);
            figure.draw();
            figure.draw();
        } catch (UnSupportedShapeException e) {
            logger.error("不支持的类型:{},原因",type,e);
        }

    }
}
