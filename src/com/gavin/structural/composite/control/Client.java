package com.gavin.structural.composite.control;

/**
 * @author gavin
 * @date 2018/9/21
 * @decription 客户端测试类
 */
public class Client {

    public static void main(String args[]){
        InterfaceControl window = new Window("主窗口");

        InterfaceControl firstPanel = new Panel("第一个面板");
        InterfaceControl firstButton = new ButtonControl("第一个面板按钮");
        InterfaceControl firstText = new TextControl("第一个面板文本框");
        firstPanel.add(firstButton);
        firstPanel.add(firstText);

        InterfaceControl secondPanel = new Panel("第二个面板");
        InterfaceControl secondButton = new ButtonControl("第二个面板按钮");
        InterfaceControl secondText = new TextControl("第二个面板文本框");
        secondPanel.add(secondButton);
        secondPanel.add(secondText);

        InterfaceControl mainText = new TextControl("主页文本框");
        InterfaceControl mainButton = new ButtonControl("主页按钮");

        window.add(firstPanel);
        window.add(secondPanel);
        window.add(mainText);
        window.add(mainButton);

        window.operation();

    }
}
