package com.lvt.pattern_10;

import org.junit.Test;

/**
 * @Description: java类作用描述
 * @Author: LT
 * @CreateDate: 2019/11/24 10:19
 * @Version: 1.0.0
 */
public class DecoratorPatternTest {

    @Test
    public void decoratorPatternTest() {
        Shape circle = new Cirle();
        ShapeDecorator redCircle = new RedShapeDecorator(new Cirle());
        ShapeDecorator redRectange = new RedShapeDecorator(new Rectangle());

        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("Circle of red border");
        redCircle.draw();

        System.out.println("Rectangle of border");
        redRectange.draw();
    }
}
