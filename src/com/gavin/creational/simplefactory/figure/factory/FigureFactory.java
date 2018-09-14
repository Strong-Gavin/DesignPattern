package com.gavin.creational.simplefactory.figure.factory;

import com.gavin.creational.simplefactory.figure.customexception.UnSupportedShapeException;
import com.gavin.creational.simplefactory.figure.product.Circle;
import com.gavin.creational.simplefactory.figure.product.Figure;
import com.gavin.creational.simplefactory.figure.product.Square;
import com.gavin.creational.simplefactory.figure.product.Triangle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author gf
 * @date 2018-09-14 15:52
 * @description 图形工厂
 */
public class FigureFactory {
    private static final Logger logger = LoggerFactory.getLogger(FigureFactory.class);

    public static Figure createFigure(String figureType) throws UnSupportedShapeException {
        Figure figure = null;
        if(figureType.equals("triangle")){
            figure = new Triangle();
            logger.info("初始化设置三角形");
        }else if(figureType.equals("square")){
            figure = new Square();
            logger.info("初始化设置方形");
        }else if(figureType.equals("circle")){
            figure = new Circle();
            logger.info("初始化设置圆形");
        }else{
            throw new UnSupportedShapeException("不支持"+figureType+"类型");
        }
        return figure;
    }
}
