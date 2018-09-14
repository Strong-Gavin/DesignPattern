package com.gavin.creational.factorymethod.log.factory;

import com.gavin.creational.factorymethod.log.product.Logger;

/**
 * @author gf
 * @date 2018-09-14 16:21
 * @description 日志工厂接口
 */
public interface LoggerFactory {

    /**
     * 创建日志记录器方法
     *
     * @return
     */
    Logger createLogger();
}
