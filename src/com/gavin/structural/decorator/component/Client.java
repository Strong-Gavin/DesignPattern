package com.gavin.structural.decorator.component;

/**
 * @author gavin
 * @date 2018/9/21
 * @decription 客户端测试类
 */
public class Client {
    public static void main(String[] args){
        Component window = new Window();
        Component componentSB = new ScorllBarDecorator(window);
        Component componentBB = new BlackBorderDecorator(componentSB);

        componentBB.display();
    }
}
