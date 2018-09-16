package com.gavin.creational.builder.play;

/**
 * @author gf
 * @description 抽象视频播放器类
 * @date 2018-09-16 22:25
 */
public abstract class VideoPlayerBuilder {
    protected VideoPlayer videoPlayer  = new VideoPlayer();

    public abstract void buildMenu();

    public abstract void buildPlayList();

    public abstract void buildMainWindow();

    public abstract void buildControlBar();

    public VideoPlayer createVideoPlayer(){
        return videoPlayer;
    }

}
