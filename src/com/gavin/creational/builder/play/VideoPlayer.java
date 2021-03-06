package com.gavin.creational.builder.play;

/**
 * @author gf
 * @description 视频播放器
 * @date 2018-09-16 22:26
 */
public class VideoPlayer {
    private String menu;
    private String playList;
    private String mainWindow;
    private String controlBar;

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public String getPlayList() {
        return playList;
    }

    public void setPlayList(String playList) {
        this.playList = playList;
    }

    public String getMainWindow() {
        return mainWindow;
    }

    public void setMainWindow(String mainWindow) {
        this.mainWindow = mainWindow;
    }

    public String getControlBar() {
        return controlBar;
    }

    public void setControlBar(String controlBar) {
        this.controlBar = controlBar;
    }
}
