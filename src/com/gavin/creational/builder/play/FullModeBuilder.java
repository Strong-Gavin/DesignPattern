package com.gavin.creational.builder.play;

/**
 * @author gf
 * @description 完整模式建造者
 * @date 2018-09-16 22:46
 */
public class FullModeBuilder extends VideoPlayerBuilder {
    @Override
    public void buildMenu() {
        videoPlayer.setMenu("显示");
    }

    @Override
    public void buildPlayList() {
        videoPlayer.setPlayList("显示");
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
