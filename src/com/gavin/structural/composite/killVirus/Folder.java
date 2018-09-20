package com.gavin.structural.composite.killVirus;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author gavin
 * @date 2018/9/20
 * @description 文件夹类
 */
public class Folder extends AbstractFile {
    private static final Logger logger = LoggerFactory.getLogger(Folder.class);

    private List<AbstractFile> fileList = new ArrayList<AbstractFile>();
    private String name;

    public Folder(String name){
        this.name = name;
    }

    @Override
    void add(AbstractFile file) {
        fileList.add(file);
    }

    @Override
    void remove(AbstractFile file) {
        fileList.remove(file);
    }

    @Override
    AbstractFile getChild(int i) {
        return fileList.get(i);
    }

    @Override
    void killVirus() {
        logger.info("对文件夹{}进行杀毒",name);
        for(AbstractFile file:fileList){
            file.killVirus();
        }
    }
}
