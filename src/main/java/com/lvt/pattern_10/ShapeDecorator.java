package com.lvt.pattern_10;

/**
 * @Description: java类作用描述
 * @Author: LT
 * @CreateDate: 2019/11/24 10:14
 * @Version: 1.0.0
 */
public abstract class ShapeDecorator implements Shape {

    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    public void draw() {
        decoratedShape.draw();
    }
}
