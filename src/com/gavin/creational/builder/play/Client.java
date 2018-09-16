package com.gavin.creational.builder.play;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author gf
 * @description 客户端测试类
 * @date 2018-09-16 22:58
 */
public class Client {
    private static Logger logger = LoggerFactory.getLogger(Client.class);

    public static void main(String[] args){
        VideoPlayerBuilder builder = (VideoPlayerBuilder) XMLUtils.getBean();
        VideoPlayerController controller = new VideoPlayerController();
        controller.setVideoPlayerBuilder(builder);
        VideoPlayer videoPlayer = controller.construct();

        logger.info("播放器菜单:{}",videoPlayer.getMenu());
        logger.info("播放器控制条:{}",videoPlayer.getControlBar());
        logger.info("播放器主窗口:{}",videoPlayer.getMainWindow());
        logger.info("播放器播放列表:{}",videoPlayer.getPlayList());
    }
}
