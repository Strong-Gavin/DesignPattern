package com.gavin.structural.composite.killVirus;

/**
 * @author gavin
 * @date 2018/9/20
 * @description 抽象文件类
 */
public abstract class AbstractFile {

    abstract void add(AbstractFile file);

    abstract void remove(AbstractFile file);

    abstract AbstractFile getChild(int i);

    abstract void killVirus();
}
