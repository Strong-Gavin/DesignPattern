package com.gavin.creational.builder.play;

/**
 * @author gf
 * @description 指挥者
 * @date 2018-09-16 22:53
 */
public class VideoPlayerController {
    private VideoPlayerBuilder videoPlayerBuilder;

    public VideoPlayerBuilder getVideoPlayerBuilder() {
        return videoPlayerBuilder;
    }

    public void setVideoPlayerBuilder(VideoPlayerBuilder videoPlayerBuilder) {
        this.videoPlayerBuilder = videoPlayerBuilder;
    }

    public VideoPlayer construct(){
        videoPlayerBuilder.buildMenu();
        videoPlayerBuilder.buildMainWindow();
        videoPlayerBuilder.buildControlBar();
        videoPlayerBuilder.buildPlayList();
        return videoPlayerBuilder.createVideoPlayer();
    }
}
