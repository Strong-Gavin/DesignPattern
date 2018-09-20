package com.gavin.structural.composite.killVirus;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author gavin
 * @date 2018/9/20
 * @description Video文件
 */
public class VideoFile extends AbstractFile {

    private static final Logger logger = LoggerFactory.getLogger(VideoFile.class);

    private String name;


    public VideoFile(String name){
        this.name = name;
    }

    @Override
    void add(AbstractFile file) {
        logger.info("对不起，该类型不支持该方法");
    }

    @Override
    void remove(AbstractFile file) {
            logger.info("对不起，该类型不支持该方法");
    }

    @Override
    AbstractFile getChild(int i) {
        logger.info("对不起，该类型不支持该方法");
        return null;
    }

    @Override
    void killVirus() {
        //模拟杀毒
        logger.info("------对视频文件{}进行杀毒",name);
    }
}
