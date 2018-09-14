package com.gavin.creational.simplefactory.figure.customexception;

/**
 * @author gf
 * @date 2018-09-14 15:55
 * @description 不支持的形状
 */
public class UnSupportedShapeException extends Exception {

    public UnSupportedShapeException(String message){
        super(message);
    };
}
