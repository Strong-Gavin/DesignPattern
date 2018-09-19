package com.gavin.structural.bridge.image.imageImpl;

import com.gavin.structural.bridge.image.imageShow.Matrix;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author gf
 * @description Windows操作系统实现类
 * @date 2018-09-19 21:51
 */
public class WindowsImp implements ImageImpl {
    private static final Logger logger = LoggerFactory.getLogger(WindowsImp.class);

    @Override
    public void doPaint(Matrix matrix) {
        logger.info("在Windows操作系统中显示图像");
    }
}
