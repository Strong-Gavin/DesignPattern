package com.gavin.structural.composite.killVirus;

/**
 * @author gavin
 * @date 2018/9/20
 * @description 客户端测试类
 */
public class Client {

    public static void main(String[] args){
        AbstractFile sunnyFolder = new Folder("Sunny的资料");
        AbstractFile imageFolder = new Folder("图像文件");
        AbstractFile textFolder = new Folder("文本文件");
        AbstractFile videoFolder = new Folder("视频文件");

        AbstractFile jpgFile = new ImageFile("小龙女.jpg");
        AbstractFile gifFile = new ImageFile("张无忌.gif");

        AbstractFile textFile = new TextFile("九阴真经.txt");
        AbstractFile docFile = new TextFile("葵花宝典.doc");

        AbstractFile rmvbFile = new VideoFile("笑傲江湖.rmvb");

        imageFolder.add(jpgFile);
        imageFolder.add(gifFile);

        textFolder.add(textFile);
        textFolder.add(docFile);

        videoFolder.add(rmvbFile);

        sunnyFolder.add(imageFolder);
        sunnyFolder.add(textFolder);
        sunnyFolder.add(videoFolder);

        sunnyFolder.killVirus();
    }
}
