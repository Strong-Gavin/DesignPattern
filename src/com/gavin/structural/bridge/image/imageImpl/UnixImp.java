package com.gavin.structural.bridge.image.imageImpl;

import com.gavin.structural.bridge.image.imageShow.Matrix;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author gf
 * @description Unix操作系统实现类
 * @date 2018-09-19 22:04
 */
public class UnixImp implements ImageImpl {
    private static final Logger logger = LoggerFactory.getLogger(UnixImp.class);

    @Override
    public void doPaint(Matrix matrix) {
        logger.info("在Unix操作系统中显示图像:");
    }
}
