package com.gavin.creational.builder.play;

/**
 * @author gf
 * @description 精简模式建造者
 * @date 2018-09-16 22:49
 */
public class SimplifyModeBulder extends VideoPlayerBuilder {
    @Override
    public void buildMenu() {
        videoPlayer.setMenu("隐藏");
    }

    @Override
    public void buildPlayList() {
        videoPlayer.setPlayList("隐藏");
    }

    @Override
    public void buildMainWindow() {
        videoPlayer.setMainWindow("显示");
    }

    @Override
    public void buildControlBar() {
        videoPlayer.setControlBar("显示");
    }
}
