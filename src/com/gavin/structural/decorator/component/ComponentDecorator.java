package com.gavin.structural.decorator.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author gavin
 * @date 2018/9/21
 * @decription 抽象装饰类
 */
public abstract class ComponentDecorator extends Component {
    private static final Logger logger = LoggerFactory.getLogger(ComponentDecorator.class);

    private Component component; //维持对抽象构件类型对象的引用

    public ComponentDecorator(Component component){
        this.component = component;
    }

    @Override
    void display() {
        component.display();
    }
}
