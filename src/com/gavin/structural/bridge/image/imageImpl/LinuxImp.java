package com.gavin.structural.bridge.image.imageImpl;

import com.gavin.structural.bridge.image.imageShow.Matrix;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author gf
 * @description Linux操作系统实现类
 * @date 2018-09-19 21:53
 */
public class LinuxImp implements ImageImpl {
    private static final Logger logger = LoggerFactory.getLogger(LinuxImp.class);

    @Override
    public void doPaint(Matrix matrix) {
        logger.info("在Linux操作系统中显示图像:");
    }
}
